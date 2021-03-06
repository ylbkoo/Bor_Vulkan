/**
 * 
 */
package bor.vulkan;

import static bor.util.Utils.getNativeAddress;
import static bor.util.Utils.sizeOfPtr;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

import bor.util.BigBuffer;
import bor.util.Utils;



/**
 * Class implementing Vulkan NON_DISPATCHABLE_HANDLEs.<br>
 * It implements VkHandleInterface for NON_DISPATCHABLE_HANDLEs, and all sub interfaces listed below.<br>
 * In a typical use of this class, it will be created from a native pointer and then <B>(cast)</B>
 * to proper type.<br>
 * 
 * Example use case:
 * <pre>  
 *  private VkFence vkCreateFence(...){
 *     ByteBuffer ptr = nativeCreateFence(...);
 *     VkHandle handler = new VkHandle(ptr);
 *     return (VkFence) handler;
 *  }  
 * </pre>
 * 
 * After proper usage, you can dispose this handler 
 * by calling {@link #free()} method.<br>
 * Keep in mind that after calling #free() 
 * it will release native pointer and be ready to be garbage collected any time. 
 * 
 * <h2>Note</h2>
 * <p> The following handles belongs to a different type of VkHandles: <b>the dispatchable handles.<b>
 *  <li>  {@link VkInstance},
 *  <li>  {@link VkPhysicalDevice}, 
 *  <li>  {@link VkDevice},
 *  <li>  {@link VkCommandBuffer},
 *  <li>  {@link VkQueue}
 * 
 *
 * @author Alessandro Borges
 * 
 * @see #free()
 * 
 * @see VkHandleDispatchable
 * 
 * @see VkHandle 
 * @see VkSemaphore
 * @see VkFence
 * @see VkDeviceMemory
 * @see VkBuffer
 * @see VkImage
 * @see VkEvent
 * @see VkQueryPool
 * @see VkBufferView
 * @see VkImageView
 * @see VkShaderModule
 * @see VkPipelineCache
 * @see VkPipelineLayout
 * @see VkRenderPass
 * @see VkPipeline
 * @see VkDescriptorSetLayout
 * @see VkSampler
 * @see VkDescriptorPool
 * @see VkDescriptorSet
 * @see VkFramebuffer
 * @see VkCommandPool
 * @see VkSurfaceKHR
 * @see VkSwapchainKHR
 * @see VkDisplayKHR
 * @see VkDisplayModeKHR
 * @see VkDebugReportCallbackEXT
 * 
 * 
 *
 */
public class VkHandle implements VkHandleInterface, 
        VkBuffer, VkBufferView, VkCommandPool,
        VkDebugReportCallbackEXT, VkDescriptorPool, VkDescriptorSet, VkDescriptorSetLayout, VkDeviceMemory,
        VkDisplayKHR, VkDisplayModeKHR, VkEvent, VkFence, VkFramebuffer, VkImage, VkImageView, 
        VkPipeline, VkPipelineCache, VkPipelineLayout, VkQueryPool,  VkRenderPass, VkSampler,
        VkSemaphore, VkShaderModule, VkSurfaceKHR, VkSwapchainKHR, ANativeWindow, MirConnection, MirSurface, Win32HINSTANCE, 
        Win32HWND, WlDisplay, WlSurface, XCBconnection, XCBwindow, XCBVisualID, XlibDisplay,XlibWindow      
        {
    
    
    
    /**
     * This static map holds handlers and avoid GC on handlers and pointers.
     * It is a synchronized Hashtable
     */
//    private static 
//    Map<VkHandleInterface,ByteBuffer> mapHandlers =  
//                                  new Hashtable<VkHandleInterface, ByteBuffer>(); 
//    
    /**
     * The handler itself
     */
 //   private ByteBuffer ptr=null;
    private long nativeHandle = 0;
      
        
    /**
     * Creates a empty VkHandle.
     * The pointer to native side will be created later.
     * @see VkHandle#getNullHandler()
     */
    protected VkHandle(){      
        this(0);
    }

    /**
     * 
     * To be called by native side or from a package level class.
     * 
     * @param nativePtr - ByteBuffer wrapping a native Vulkan handler 
     * 
     * @throws IllegalArgumentException if nativePtr is null or non direct.
     */
     public VkHandle(ByteBuffer nativePtr) throws UnsupportedOperationException {
       setHandle(nativePtr);
     }
     
     /**
      * Create a VkHandle from a native address
      * @param nativeHandle
      */
     public VkHandle(long nativeHandle) {        
        this.nativeHandle = nativeHandle;
       }   
     
     /**
      * Remove static references of handles 
      * @param handles - instances to be free'd
      */
     public static void remove(VkObject ...handles){
         if(handles == null) return;
         for (VkObject vkHandle : handles) {
             if(vkHandle != null)
                 vkHandle.free();
        }
     }
     
     /**
      * Get native pointers from a collection of VkObjects
      * @param dst - optional destination, if null a new array is created
      * @param handles - array of VkObjects to query native address
      * @return dst - array to hold native addresses
      */
     public static long[] getNativeHandlers(long[] dst, VkObject ...handles){
         int count = handles.length;
         if(dst == null || dst.length < count){
             dst = new long[count];
         }
         Arrays.fill(dst, 0L);         
         for (int i=0; i<count; i++) {
             if(handles[i] != null)
              dst[i] =  handles[i].getNativeHandle();
        }
         return dst;         
     }
     
      
    
     /**
      * Implements {@link VkObject#getType()}
      * Always return {@link VkObject#TYPE_HANDLER}
      */
     @Override
     public int getType(){
         return TYPE_HANDLER;
     }

    
    
    /**
     * Set a native ptr.
     * @param hnd - native created ptr
     */
    public void setHandle(ByteBuffer nativeBuffer){
        long handleAddr = getNativeAddress(nativeBuffer);
        if(handleAddr == this.nativeHandle){
            return;
        }
        nativeHandle = handleAddr;
    }
    
    /**
     * set native handle
     * @param address
     */
    public void setNativeHandle(long address){  
        if(address==nativeHandle){
            return;
        }          
    }
    
    /**
     * Implementation of {@link VkObject#getPointer()}
     * Same think as {@link #getHandle()}
     * 
     * @see VkObject#getPointer()
     * 
     * @return native pointer wrapped by a ByteBuffer. 
     */
    @Override
    @Deprecated
    public ByteBuffer getPointer() throws UnsupportedOperationException{
        return null;
    }
    
    /**
     * Get native address.
     * @return long value holding native address.
     */
    @Override
    public long getNativeHandle(){
        return nativeHandle;
    }
    
    /**
     * Release internal handler wrapper to be GC'ed <br>
     * <b>Note :</b><p> 
     * Instead of forcing freeing  native resources,<br>
     * let Vulkan API free theirs resources by itself, at vkDestroyXXXX() methods.
     * </p><p>
     * <b><i>This method just break references from Java to native pointers</i></b><br> 
     * Otherwise it would crash application.</p>
     * 
     * Lets evaluate this and may change if necessary.
     * 
     * @Todo - Move this method to VkObject <or it would mess with VkHandlers ?>
     * 
     * @see bor.vulkan.VkObject#free()
     * 
     * @return true if handler was released, false it was already released. 
     */
     @Override
    public boolean free(){
        nativeHandle = 0;
        return true;
    }
     
     /**
      * Check if handler is null.
      * 
      * @return true if wrapped handler is null.
      */
     @Override
    public boolean isNull(){
       return (this.nativeHandle == 0L);       
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)  return true;        
        if (obj == null)  return false;        
        if (!(obj instanceof VkHandle))  return false;        
        VkHandle other = (VkHandle) obj;
        if(this.nativeHandle == other.nativeHandle)  return true;
        
        return false;
    }

        
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("VkHandle [nativeHandle: 0x").append(Long.toHexString(nativeHandle)).append("]");
        return builder.toString();
    }

    /**
     * Release all handlers.
     * Call it when you are about to close your application.
     * 
     */
    public static void releaseAllHandlers(){
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Create a pointer P to contain a instance of this,
     * with unset native pointer.
     * The 
     *    
     * @return A instance of P with null pointer 
     */
    public static VkHandle getNullHandler(){ 
        return VK_NULL_HANDLE.getNullHandle();
    }
    
    
    
    /*
     * (non-Javadoc)
     * @see bor.vulkan.VkObject#setPointer(java.nio.ByteBuffer)
     */
     public void setPointer(ByteBuffer directBuff){ 
         // TODO remove this check
         long handleAddr = getNativeAddress(directBuff);
         if(handleAddr == this.nativeHandle){
             return;
         }      
    }
     
     /*
      * (non-Javadoc)
      * @see bor.vulkan.VkObject#setPointer(long)
      */
     public void setPointer(long nativeHandle){
        this.nativeHandle = nativeHandle;
     }

    
    /**
     * Size of this handle, in bytes.
     */
    @Override
    public int sizeof() {        
        return Vk10.SIZE_OF_NON__DISPATCHABLE_HANDLE;
    }
    
    /**
     * Creates a immutable list of VkArrayHandle.
     * 
     * @param size - size of list
     * @return immutable list of VkArray handles
     */
    public static VkArrayHandle<VkHandle> createVkArray(int size){
        VkHandle[] array = new VkHandle[size];        
        VkArrayHandle<VkHandle> vkArray = new VkArrayHandle<VkHandle>(array);
        return vkArray;
    }
    
    
    
}
