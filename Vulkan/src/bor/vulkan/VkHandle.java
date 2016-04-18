/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Hashtable;
import java.util.Map;

import static bor.util.Utils.*;

import bor.util.Utils;
import bor.vulkan.khr.ANativeWindow;
import bor.vulkan.khr.MirConnection;
import bor.vulkan.khr.MirSurface;
import bor.vulkan.khr.VkDisplayKHR;
import bor.vulkan.khr.VkDisplayModeKHR;
import bor.vulkan.khr.VkSurfaceKHR;
import bor.vulkan.khr.VkSwapchainKHR;
import bor.vulkan.khr.Win32HINSTANCE;
import bor.vulkan.khr.Win32HWND;
import bor.vulkan.khr.WlDisplay;
import bor.vulkan.khr.WlSurface;
import bor.vulkan.khr.XCBVisualID;
import bor.vulkan.khr.XCBconnection;
import bor.vulkan.khr.XCBwindow;
import bor.vulkan.khr.XlibDisplay;
import bor.vulkan.khr.XlibWindow;

/**
 * Non public class implementing Vulkan handlers.<br>
 * It implements VkHandle super interface and all sub interfaces listed below.<br>
 * In a typical use of this class, it will be created from a native pointer and then <B>(cast)</B>
 * to proper type.<br>
 * 
 * Example use case:
 * <pre>  
 *  private VkInstance vkCreateInstance(...){
 *     ByteBuffer ptr = nativeCreateInstance(...);
 *     VkHandle handler = new VkHandle(ptr);
 *     return (VkInstance) handler;
 *  }  
 * </pre>
 * 
 * After proper usage, you can dispose this handler 
 * by calling {@link #free()} method.<br>
 * Keep in mind that after calling free() 
 * it will release native pointer and be ready to be garbage collected any time. 
 * 
 *
 * @author Alessandro Borges
 * 
 * @see VkHandle
 * @see VkInstance
 * @see VkPhysicalDevice
 * @see VkDevice
 * @see VkQueue
 * @see VkCommandBuffer
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
public class VkHandle implements VkHandleInterface, VkBuffer, VkBufferView, VkCommandBuffer, VkCommandPool,
        VkDebugReportCallbackEXT, VkDescriptorPool, VkDescriptorSet, VkDescriptorSetLayout, VkDevice, VkDeviceMemory,
        VkDisplayKHR, VkDisplayModeKHR, VkEvent, VkFence, VkFramebuffer, VkImage, VkImageView, VkInstance,
        VkPhysicalDevice, VkPipeline, VkPipelineCache, VkPipelineLayout, VkQueryPool, VkQueue, VkRenderPass, VkSampler,
        VkSemaphore, VkShaderModule, VkSurfaceKHR, VkSwapchainKHR, ANativeWindow, MirConnection, MirSurface, Win32HINSTANCE, 
        Win32HWND, WlDisplay, WlSurface, XCBconnection, XCBwindow, XCBVisualID, XlibDisplay,XlibWindow {

  
    
    /**
     * This static map holds handlers and avoid GC on handlers and pointers.
     * It is a synchornized Hashtable
     */
    private static 
    Map<VkHandleInterface,ByteBuffer> mapHandlers =  
                                  new Hashtable<VkHandleInterface, ByteBuffer>(); 
    
    /**
     * The handler itself
     */
    private ByteBuffer ptr=null;
    private long nativeHandle = 0;
    
    private static int sizeOfPtr = 8;
    
    static{
      try {
          sizeOfPtr = sizeOfPtr();
      } catch (Exception e) {
           e.printStackTrace();
      }    
    }//static
    
    /**
     * Wrapping P instance, for this object
     */
    private P<VkHandle> p;
    
    /**
     * Creates a empty VkHandle.
     * The pointer to native side will be created later.
     * @see VkHandle#getNullHandler()
     */
    protected VkHandle(){ 
        //TODO - get correct ptr size at runtime
        this(ByteBuffer.allocateDirect(8));
    }

    /**
     * 
     * To be called by native side or from a package level class.
     * 
     * @param nativePtr - ByteBuffer wrapping a native Vulkan handler 
     * 
     * @throws IllegalArgumentException if nativePtr is null or non direct.
     */
     public VkHandle(ByteBuffer nativePtr) {
       prepareHandler(nativePtr);
     }
     
     
     public VkHandle(long nativeHandle) {        
         prepareHandler(nativeHandle);
       }
     
     /**
      * Prepare handler from native address
      * @param address - native address
      */
     private void prepareHandler(long address){
         if(this.nativeHandle==address){
             // same object
             return;
         }         
         this.nativeHandle = address;
         prepareHandler(wrapPointer(address, sizeOfPtr));
     }
     
     /**
      * Prepare handler to be used 
      * @param nativePtr
      */
    private void prepareHandler(ByteBuffer nativePtr) {
        if(null==nativePtr || !nativePtr.isDirect()){
            throw 
            new IllegalArgumentException("ByteBuffer nativePtr must "
                                       + "be Direct and not null.");
        }
        this.ptr = nativePtr.isReadOnly() ? nativePtr : nativePtr.asReadOnlyBuffer();
        this.ptr.order(ByteOrder.nativeOrder());
        this.ptr.rewind();
        this.nativeHandle = getNativeAddress(ptr);
        
        mapHandlers.put(this, ptr);
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
    public void setHandle(ByteBuffer nativeHandle){
        long handleAddr = getNativeAddress(nativeHandle);
        if(handleAddr == this.nativeHandle){
            return;
        }
        prepareHandler(nativeHandle);        
    }
    
    /**
     * set 
     * @param address
     */
    public void setHandle(long address){  
        if(address==nativeHandle){
            return;
        }
        prepareHandler(nativeHandle);        
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
    public ByteBuffer getPointer(){              
        return this.ptr;
    }
    
    /**
     * Get native address.
     * @return long value holding native address.
     */
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
        if(null==ptr) 
            return false;        
        ptr = null;
        nativeHandle = 0;
        mapHandlers.remove(this);
        return true;
    }
     
     /**
      * Check if handler is null.
      * 
      * @return true if wrapped handler is null.
      */
     @Override
    public boolean isNull(){
       return (null==this.ptr);       
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof VkHandle)) {
            return false;
        }
        VkHandle other = (VkHandle) obj;
        if (ptr == null) {
            if (other.ptr != null) {
                return false;
            }
        } else if (!ptr.equals(other.ptr)) {
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {        
        return "VkHandle [" + (ptr != null ? "ptr=" + ptr : "") + "]";
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
         prepareHandler(directBuff);        
    }
     
     /*
      * (non-Javadoc)
      * @see bor.vulkan.VkObject#setPointer(long)
      */
     public void setPointer(long nativeHand){
         if(nativeHand==nativeHandle){
             return;
         }
        prepareHandler(nativeHand); 
     }

     /*
      * (non-Javadoc)
      * @see bor.vulkan.VkObject#getP()
      */
    @Override
    public P<VkHandle> getP() {
       if(p == null ){
           p = new P<VkHandle>(this);
       }
        return p;
    }

    
    
}
