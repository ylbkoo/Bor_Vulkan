package bor.vulkan;

import com.badlogic.gdx.jnigen.JniGenSharedLibraryLoader;

import bor.enumerable.IntEnum;
import bor.vulkan.enumerations.VkResult;
import sun.rmi.runtime.Log;

/**
 * Wrapper for Vulkan api
 * 
 * @author Livia
 *
 */
public class Vulkan {
    
    private static final String TAG = "bor.vulkan.Vulkan";
    
    /**
     * int value with packed value of Vulkan API Versions.
     * @see #VK_API_VERSION_STRING
     * @see #VK_MAKE_VERSION(int, int, int)
     * @see #VK_VERSION_MAJOR(int)
     * @see #VK_VERSION_MINOR(int)
     * @see #VK_VERSION_PATCH(int)
     */
    public static final int     VK_API_VERSION                          = VK_MAKE_VERSION(1, 0, 24);
    /**
     * String with value of supported Vulkan SDK 
     */
    public static final String  VK_API_VERSION_STRING                   = getAPIVersionString(VK_API_VERSION);
    public static final int     VK_HEADER_VERSION = 24;
    
    public static final float   VK_LOD_CLAMP_NONE                       = 1000.0f;
    public static final int     VK_REMAINING_MIP_LEVELS                 = Integer.MAX_VALUE;         // (~0);
    public static final int     VK_REMAINING_ARRAY_LAYERS               = Integer.MAX_VALUE;         // (~0);
    public static final long    VK_WHOLE_SIZE                           = Long.MAX_VALUE;            // (~0ULL);
    public static final int     VK_ATTACHMENT_UNUSED                    = Integer.MAX_VALUE;         // (~0U);
    public static final boolean VK_TRUE                                 = true;
    public static final boolean VK_FALSE                                = false;
    public static final int     VK_QUEUE_FAMILY_IGNORED                 = Integer.MAX_VALUE;         // (~0U);
    public static final int     VK_SUBPASS_EXTERNAL                     = Integer.MAX_VALUE;         // (~0U);
    public static final int     VK_MAX_PHYSICAL_DEVICE_NAME_SIZE        = 256;
    public static final int     VK_UUID_SIZE                            = 16;
    public static final int     VK_MAX_MEMORY_TYPES                     = 32;
    public static final int     VK_MAX_MEMORY_HEAPS                     = 16;
    public static final int     VK_MAX_EXTENSION_NAME_SIZE              = 256;
    public static final int     VK_MAX_DESCRIPTION_SIZE                 = 256;
    public static final int     VK_KHR_surface                          = 1;
    public static final int     VK_KHR_SURFACE_SPEC_VERSION             = 25;
    public static final String  VK_KHR_SURFACE_EXTENSION_NAME           = "VK_KHR_surface";
    public static final int     VK_KHR_swapchain                        = 1;
    public static final int     VK_KHR_SWAPCHAIN_SPEC_VERSION           = 67;
    public static final String  VK_KHR_SWAPCHAIN_EXTENSION_NAME         = "VK_KHR_swapchain";
    public static final int     VK_KHR_display                          = 1;
    public static final int     VK_KHR_DISPLAY_SPEC_VERSION             = 21;
    public static final String  VK_KHR_DISPLAY_EXTENSION_NAME           = "VK_KHR_display";
    public static final int     VK_KHR_display_swapchain                = 1;
    public static final int     VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION   = 9;
    public static final String  VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";
    public static final int     VK_KHR_xlib_surface                     = 1;
    public static final int     VK_KHR_XLIB_SURFACE_SPEC_VERSION        = 6;
    public static final String  VK_KHR_XLIB_SURFACE_EXTENSION_NAME      = "VK_KHR_xlib_surface";
    public static final int     VK_KHR_xcb_surface                      = 1;
    public static final int     VK_KHR_XCB_SURFACE_SPEC_VERSION         = 6;
    public static final String  VK_KHR_XCB_SURFACE_EXTENSION_NAME       = "VK_KHR_xcb_surface";
    public static final int     VK_KHR_wayland_surface                  = 1;
    public static final int     VK_KHR_WAYLAND_SURFACE_SPEC_VERSION     = 5;
    public static final String  VK_KHR_WAYLAND_SURFACE_EXTENSION_NAME   = "VK_KHR_wayland_surface";
    public static final int     VK_KHR_mir_surface                      = 1;
    public static final int     VK_KHR_MIR_SURFACE_SPEC_VERSION         = 4;
    public static final String  VK_KHR_MIR_SURFACE_EXTENSION_NAME       = "VK_KHR_mir_surface";
    public static final int     VK_KHR_android_surface                  = 1;
    public static final int     VK_KHR_ANDROID_SURFACE_SPEC_VERSION     = 6;
    public static final String  VK_KHR_ANDROID_SURFACE_EXTENSION_NAME   = "VK_KHR_android_surface";
    public static final int     VK_KHR_win32_surface                    = 1;
    public static final int     VK_KHR_WIN32_SURFACE_SPEC_VERSION       = 5;
    public static final String  VK_KHR_WIN32_SURFACE_EXTENSION_NAME     = "VK_KHR_win32_surface";
    public static final int     VK_EXT_debug_report                     = 1;
    public static final int     VK_EXT_DEBUG_REPORT_SPEC_VERSION        = 3;
    public static final String  VK_EXT_DEBUG_REPORT_EXTENSION_NAME      = "VK_EXT_debug_report";
    
    public static final int VK_KHR_sampler_mirror_clamp_to_edge = 1;
    public static final int VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION = 1;
    public static final String VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME = "VK_KHR_sampler_mirror_clamp_to_edge";

    public static final int VK_NV_glsl_shader = 1;
    public static final int VK_NV_GLSL_SHADER_SPEC_VERSION =   1;
    public static final String VK_NV_GLSL_SHADER_EXTENSION_NAME = "VK_NV_glsl_shader";
    
    public static final int VK_IMG_filter_cubic = 1;
    public static final int VK_IMG_FILTER_CUBIC_SPEC_VERSION =  1;
    public static final String VK_IMG_FILTER_CUBIC_EXTENSION_NAME = "VK_IMG_filter_cubic";

    public static final int VK_AMD_shader_trinary_minmax = 1;
    public static final int VK_AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION =1;
    public static final String VK_AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME = "VK_AMD_shader_trinary_minmax";

    public static final int VK_AMD_shader_explicit_vertex_parameter = 1;
    public static final int VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION = 1;
    public static final String VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME = "VK_AMD_shader_explicit_vertex_parameter";

    public static final int VK_AMD_gcn_shader = 1;
    public static final int VK_AMD_GCN_SHADER_SPEC_VERSION   =  1;
    public static final String VK_AMD_GCN_SHADER_EXTENSION_NAME = "VK_AMD_gcn_shader";

    public static final int VK_NV_dedicated_allocation  = 1;
    public static final int VK_NV_DEDICATED_ALLOCATION_SPEC_VERSION = 1;
    public static final String VK_NV_DEDICATED_ALLOCATION_EXTENSION_NAME = "VK_NV_dedicated_allocation";    
    
    public static VkHandle  VK_NULL_HANDLE = new VkHandle(0); 
    
    /**
     * Loading native libraries
     */
    static{
        new JniGenSharedLibraryLoader("libs/BorVulkan-natives.jar").load("BorVulkan");
    }
    
    /**
     * Calculates a packed integer value for major-minor-patch Vulkan version.
     * 
     * 
     * @param major - major release version value
     * @param minor - minor release version value
     * @param patch - patch release versions value
     * @return  packed integer value with coded major, minar and patch value
     */
    public static final int VK_MAKE_VERSION(int major, int minor, int patch) {
        return (((major) << 22) | ((minor) << 12) | (patch));
    }

    /**
     * Get the major version value from a packed API version.
     * @param packedAPIversion - packed API value.
     * @return major value, as coded in packedAPIversion.
     */
    public static final int VK_VERSION_MAJOR(int packedAPIversion) {
        return packedAPIversion >> 22;
    }

    /**
     * Get the minor version value from a packed API version.
     * @param packedAPIversion - packed API value.
     * @return minor value, as coded in packedAPIversion. 
     */
    public static final int VK_VERSION_MINOR(int packedAPIversion) {
        return (packedAPIversion >> 12) & 0x3ff;
    }

    /**
     * Get the patch version value from a packed API version.
     * @param packedAPIversion - packed API value.
     * @return patch value, as coded in packedAPIversion.
     */
    public static final int VK_VERSION_PATCH(int packedAPIversion) {
        return ((int) (packedAPIversion) & 0xfff);
    }
    
    /**
     * Get string version of Vulkan, as packed in packedAPIversion parameter.
     * @see #VK_MAKE_VERSION(int, int, int)
     * 
     * @param packedAPIversion - packed Vulkan versions, as given by {@link #VK_MAKE_VERSION(int, int, int)} 
     * @return string value of packedAPIversion as "1.0.3"
     */
    public static final String getAPIVersionString(int packedAPIversion){
        int major = VK_VERSION_MAJOR(packedAPIversion);
        int minor = VK_VERSION_MINOR(packedAPIversion);
        int patch = VK_VERSION_PATCH(packedAPIversion);
        return "" + major+"."+minor+"."+patch;
    }
    
    /**
     * Constant value for checkError.<br>
     * This value tells to ignore errors by not throwing VulkanExceptions
     */
    public static final int IGNORE_VULKAN_ERRORS = 1;
    /**
     * Constant value for checkError.<br>
     * This value tells to throw a VulkanException in any VkResult error.
     */
    public static final int THROW_EXCEPTION_ON_ALL_ERRORS = 2;
    /**
     * Constant value for checkError.<br>
     * This value tells to throw a VulkanException on VkDevice lost.
     */
    public static final int THROW_EXCEPTION_ON_DEVICE_LOST = 4;
    /**
     * Constant value for checkError.<br>
     * This value tells to throw a VulkanException on Surface lost.
     */
    public static final int THROW_EXCEPTION_ON_SURFACE_LOST = 8;
    /**
     * Constant value for checkError.<br>
     * This value tells to Log all errors.
     */
    public static final int LOG_ERRORS = 16;
    
    
    private static int sCheckError = THROW_EXCEPTION_ON_DEVICE_LOST | THROW_EXCEPTION_ON_SURFACE_LOST | LOG_ERRORS;
    private static boolean logErrors = ored(sCheckError, LOG_ERRORS);
    private static boolean allErrors = ored(sCheckError, THROW_EXCEPTION_ON_ALL_ERRORS);
    private static boolean deviceLostyErrors = ored(sCheckError, THROW_EXCEPTION_ON_ALL_ERRORS);
    private static boolean surfaceErrors = ored(sCheckError, THROW_EXCEPTION_ON_SURFACE_LOST);
    
    /**
     * Set bitmaked ORed value for error checking.
     * 
     * @see Vulkan#IGNORE_VULKAN_ERRORS
     * @see Vulkan#THROW_EXCEPTION_ON_ALL_ERRORS
     * @see Vulkan#THROW_EXCEPTION_ON_DEVICE_LOST
     * @see Vulkan#THROW_EXCEPTION_ON_SURFACE_LOST
     * @param mask
     */
    public static void setErrorCheckingMode(int mask){
        sCheckError = mask;
        logErrors = ored(mask, LOG_ERRORS);    
        allErrors = ored(mask, LOG_ERRORS);
        deviceLostyErrors = ored(mask, THROW_EXCEPTION_ON_ALL_ERRORS);
        surfaceErrors = ored(mask, THROW_EXCEPTION_ON_SURFACE_LOST);
    }
    
    /**
     * Get the ORed value for error checking 
     * @return
     */
    public static int getErrorCheckingMode(){
        return sCheckError;
    }
    
    /**
     * Check Errors on VkResult
     * @param result
     * @return - true is there is a error, false otherwise.
     */
    public static boolean checkError(VkResult result) throws VulkanException{
        if(result.getValue()>=0) 
            return false;
                
        if(!ored(sCheckError, IGNORE_VULKAN_ERRORS)){
            VulkanException vkExc = new VulkanException(result.toString());            
            if(logErrors) bor.util.Log.e(TAG, "VkResult error.", vkExc);
            throw vkExc;
        }            
         return true;
    }
    
    /**
     * Check if thow values are ored
     * @param oredValue - ORed value
     * @param mask - constant mask value.
     * @Return true - if oredValue has mask bit on. 
     */
    private static final boolean ored(int oredValue, int mask){
        return (oredValue & mask) == mask;   
     }
    
    /**
     * Prepare enumeration for Native side
     * @param vkEnum
     * @return
     */
    protected static int[] prepare(IntEnum<?>[] vkEnum){
        if(vkEnum == null)
            return null;
        int size = vkEnum.length;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            IntEnum<?> e = vkEnum[i];
            array[i] = e==null ? 0 : e.getValue();
        }
        return array;
    }
    
    /**
     * Restore enumerations from 
     * @param vkEnum
     * @param values
     * @param enume
     */
    protected static void restore(IntEnum<?>[] vkEnum, int[] values, IntEnum enume){ 
        int size = vkEnum.length;
        for (int i = 0; i < size; i++) {
            int val = values[i]; 
            vkEnum[i] = (IntEnum<?>) enume.getEnumByValue(val);
        }
    }
    
    /////////////////////////////////////////////////////
    /**
     * <b>Internal use only.<b><br>
     * Prepares a single VKHandle to read/write from native side.
     *   
     * @param aHandle - a instance of VkHandleInterface
     * @return a long array with aHandle's nativeHandle
     */
    protected long[] prepare(VkHandleInterface aHandle){
        long[] array = new long[1];
        array[0] = (aHandle==null) ? 0L : aHandle.getNativeHandle();
        return array;
    }
    
    /**
     * <b>Internal use only.<b><br>
     * Prepares a array of VKHandle to read/write from native side.
     *   
     * @param aHandle - an array or multiple instances of VkHandleInterface
     * @return a long array with handles' nativeHandle values. Returns null if
     * handles are null. 
     */
    protected long[] prepare(VkHandleInterface... handles){
        if(handles==null) 
            return null;
        long[] array = new long[handles.length];
        for (int i = 0; i < array.length; i++) {
            VkHandleInterface item = handles[i];
            array[i]  = (item==null) ? 0L : item.getNativeHandle();
        }
        return array;
    }
    
    /**
     * Copy native ptrValue to VkHandle
     * @param ptrValue - native value of pointer
     * @param theHandle - VkHandle instance to update
     * @return theHandle value.
     */
    protected VkHandleInterface restoreHandles(long[] ptrValue, VkHandleInterface theHandle){
        if(ptrValue!=null && theHandle!=null){
            theHandle.setPointer(ptrValue[0]); 
        }
       return theHandle;
    }
    
    /**
     * Copy native ptrValue to VkHandle
     * @param ptrValue - native value of pointer
     * @param handles - VkHandle instance to update
     * @return handles array.
     */
    protected VkHandleInterface[] restoreHandles(long[] ptrValue, VkHandle[] handles){
        if(ptrValue!=null && handles!=null){
            int length = Math.min(ptrValue.length, handles.length); 
            for (int i = 0; i < length; i++) {
                VkHandle hand = handles[i];
                hand.setPointer(ptrValue[i]);
            }
            // nullify extra handles
            for (int i = length; i < handles.length; i++) {
                VkHandle hand = handles[i];
                hand.setPointer(0L);
            }             
        }
       return handles;
    }
    
    /**
     * Copy native ptrValue to VkHandleDispatchable
     * @param ptrValue - native value of pointer
     * @param handles - VkHandleDispatchable instance to update
     * @return handles array.
     */
    protected VkHandleInterface[] restoreHandles(long[] ptrValue, VkHandleDispatchable[] handles){
        if(ptrValue!=null && handles!=null){
            int length = Math.min(ptrValue.length, handles.length); 
            for (int i = 0; i < length; i++) {
                VkHandleDispatchable hand = handles[i];
                hand.setPointer(ptrValue[i]);
            }
            // nullify extra handles
            for (int i = length; i < handles.length; i++) {
                VkHandleDispatchable hand = handles[i];
                hand.setPointer(0L);
            }             
        }
       return handles;
    }

}
