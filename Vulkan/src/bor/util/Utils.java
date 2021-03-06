/**
 * 
 */
package bor.util;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import bor.vulkan.Vk10;
import bor.vulkan.VkHandle;
import bor.vulkan.VkHandleDispatchable;
import bor.vulkan.structs.VkStruct;

/**
 * Class with some utility functions.
 * 
 * @author Alessandro Borges
 *
 */
public class Utils {

    //@formatter:off
    /*JNI
     
         
      #include <stdio.h>
      #include <stdlib.h>      
      #include <vulkan/vulkan.h>
     
     */
    /**
     * 
     */
    private Utils() {      
    }
    
       
    
    /**
     * Get native size of pointer void* in bytes
     * @return 4 or 8;
     */
    public static final native int sizeOfPtr();/*      
      return (jint) sizeof(void*);      
    */
    
    /**
     * Check if a buffer points to same address of 
     * @param buffer - direct ByteBuffer
     * @param address - native address
     * @return true if native buffer address is equals address parameter
     */
    public static final native boolean equals(Buffer buffer, long address);/*
      
      void* a = (void*) buffer;
      void* b = (void*) reinterpret_cast<void*>(address);      
      return (jboolean) (a==b);    
    */
    
    /**
     * Get native Address of Buffer and its offset, using buffer.position().
     * @param buffer - Bytebuffer to query
     * @return long value with native address + offset.
     */
    public static long getNativeAddressAndOffset(ByteBuffer buffer){
           long address = getNativeAddress(buffer);
           int pos = buffer.position();
           return address + pos;
    }
    
    
    
    
    
    /**
     * get Native address of Buffer
     * @param buffer - 
     * @return
     */
    public static native long getNativeAddress(Buffer buffer);/*      
      return (jlong) reinterpret_cast<jlong>(buffer);
    */
    
    /**
     * Wrap a pointer using a ByteBuffer. 
     * @param address - native buffer address, created with malloc or calloc.
     * @param size - size in bytes of native buffer pointed by address; 
     * 
     * @return Direct ByteBuffer wrapping "address" with capacity "size".
     */
    public static final native ByteBuffer wrapPointer(long address, int size);/*
     void* buffer =  reinterpret_cast<void*>(address);
     jobject directBuffer = env->NewDirectByteBuffer(buffer, size);
     return directBuffer;
    */
    
    
    /**
     * Alocate a Byte Buffer on native side.
     * This Buffer is not Garbage Collected. You must free it using {@link #deleteDirectBuffer(ByteBuffer)}
     *  
     * @param size - size in bytes
     * @return native byteBuffer
     */
    public static final native ByteBuffer createNativeDirectBuffer(int size);/*
     void* pbuffer = calloc((size_t) 1, (size_t)size);
     jobject directBuffer = env->NewDirectByteBuffer(pbuffer, size);
     return directBuffer;
    */
    
    /**
     * Delete byte buffer
     * @param ptr
     * @return
     */
    public static final native boolean deleteDirectBuffer(ByteBuffer ptr);/*
       void* pbuffer = (void*)ptr;
       if(pbuffer)
              free(pbuffer);
       return JNI_TRUE;
    */
      
    /**
     * Used on VkStructs, only ! <br>
     * Slice a buffer into small buffers of equal size
     * @param bigBuffer - large buffer with many elements
     * @param count - elements count
     * @return array of Bytebuffers
     */
    public static ByteBuffer[] splitBuffer(ByteBuffer bigBuffer, int count){
        if(bigBuffer==null || count == 0)
            return null;
        
        bigBuffer.rewind();
        int size = bigBuffer.capacity() / count;
        ByteBuffer[] buff = new ByteBuffer[count];
        // bigBuffer is the head
        bigBuffer.limit(size);
        buff[0] = bigBuffer;
        if(count==1){            
            return buff;
        }
        // put remaining buffers
        for (int i = 1; i < buff.length; i++) {
            int pos = size*i;            
            bigBuffer.limit(pos + size);
            bigBuffer.position(pos);
            ByteBuffer bb = bigBuffer.slice();            
            buff[i] = bb;
        }
        bigBuffer.rewind();
        bigBuffer.limit(size);
        return buff;
    }
    
    
    /**
     * Populate a VkStruct array with count[0] instances. 
     * @param pArray - array to be populated
     * @param bigBuffer - ByteBuffer with native data, it will be splited internally
     * @param count - array with number of objects to handle, at [0];
     * @param tagId - VkStruct tag ID - a internal number for VkStructs
     */
   public static void populate(VkStruct[] pArray,
                                ByteBuffer bigBuffer,
                                int[] count,
                                int tagId) {
        if( pArray == null || bigBuffer == null || count==null || count[0]==0){
            return;
        }
        ByteBuffer[] split = Utils.splitBuffer(bigBuffer, count[0]);   
        int max = Math.min(pArray.length, count[0]);
        for (int i = 0; i < max; i++) {
            pArray[i] = VkStruct.createInstance(tagId, split[i]);
            split[i] = null;
        }        
    }
    
    /**
     * Populate a VkStruct array with count[0] instances. 
     * @param pArray - array to be populated
     * @param buffers - array of ByteBuffer with native handle
     * @param count - array with number of handles, at [0];
     * 
     */
   public static void populateHandlers(Object[] pArray,
                                       ByteBuffer[] buffers,
                                       int[] count) {
        if( pArray == null || buffers == null || count==null || count[0]==0){
            return;
        }           
        int max = Math.min(count[0], buffers.length);
        for (int i = 0; i < max; i++) {
            pArray[i] = new VkHandle(buffers[i]);
            buffers[i] = null;
        }        
    }
   
   /**
    * Populate a VkStruct array with count[0] instances. 
    * @param pArray - array to be populated
    * @param buffers - ByteBuffer with native handle
    * @param count - array with number of handles, at [0];
    * 
    */
  public static void populateDHandlers(Object[] pArray,
                                      ByteBuffer buffer,
                                      int[] count) {
       if( pArray == null || buffer == null || count==null || count[0]==0){
           return;
       }   
       int sizePtr = Vk10.sizeOfDispatchableHandle();
       buffer.rewind();
       int max = Math.min(count[0], buffer.capacity() / sizePtr);
       for (int i = 0; i < max; i++) {
           long ptr = readDispatchableHandlerPTR(buffer);
           if(pArray[i] == null){
               pArray[i] = new VkHandleDispatchable(ptr);    
           }else{
               VkHandleDispatchable h = (VkHandleDispatchable)pArray[i];
               h.setPointer(ptr);   
           }
       }        
   }
  
  /**
   * Read a pointer castED to long
   * @param buffer = buffer to read at current position.
   * @return
   */
  public static long readDispatchableHandlerPTR(ByteBuffer buffer){
      int sz = Vk10.sizeOfDispatchableHandle();
      if(sz==8){
          return buffer.getLong();
      }else{
          int ptr32 = buffer.getInt();
          long ptr64 = ptr32 & 0xFFffFFffL;
          return ptr64;
      }
  }

}
