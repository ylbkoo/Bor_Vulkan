/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkHandleInterface;
import bor.vulkan.VkHandler;

/**
 * @author Alessandro Borges
 *
 */
public class WlDisplay extends VkHandler implements VkHandleInterface {

    private WlDisplay() {
        super();
    }

    /**
     * @param nativePtr
     */
    public WlDisplay(ByteBuffer nativePtr) {
        super(nativePtr);
    }

    /**
     * Create a pointer P to contains a instance of this,
     * with unset native pointer.
     * Use {@link VkStruct#setPointer(ByteBuffer)} to set
     * valid native pointer.
     * 
     * @return An instance of P for this VkStruct with null pointer
     */
    public static P<WlDisplay> createNullPointer() {
        P<WlDisplay> p = new P<WlDisplay>(new WlDisplay());
        return p;
    }

}
