/**
 * Class wrapping Vulkan's VkPresentInfoKHR struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import bor.vulkan.khr.*;
 import java.util.*;
 import java.nio.*;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPresentInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPresentInfoKHR {
 *     VkStructureType          sType;
 *     const void*              pNext;
 *     uint32_t                 waitSemaphoreCount;
 *     const VkSemaphore*       pWaitSemaphores;
 *     uint32_t                 swapchainCount;
 *     const VkSwapchainKHR*    pSwapchains;
 *     const uint32_t*          pImageIndices;
 *     VkResult*                pResults;
 * } VkPresentInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPresentInfoKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [109]  */
	 private static final String TAG = "VkPresentInfoKHR";

	/** ID of this structure [109]  */
	 public static final int TAG_ID = VKPRESENTINFOKHR_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;
	
	/**
	 *  const void* 	pNext	[vkobject]
	 */ 
	VkObject 	pNext;
	
	/**
	 *  uint32_t 	waitSemaphoreCount	[int]
	 */ 
	int 	waitSemaphoreCount;
	
	/**
	 *  const VkSemaphore* 	pWaitSemaphores	[vkhandle_array_array]
	 */ 
	  VkSemaphore[]  	pWaitSemaphores;
	 private BigBuffer 	 pWaitSemaphoresBUFFER;
	
	/**
	 *  uint32_t 	swapchainCount	[int]
	 */ 
	int 	swapchainCount;
	
	/**
	 *  const VkSwapchainKHR* 	pSwapchains	[vkhandle_array_array]
	 */ 
	  VkSwapchainKHR[]  	pSwapchains;
	 private BigBuffer 	 pSwapchainsBUFFER;
	
	/**
	 *  const uint32_t* 	pImageIndices	[int_array]
	 */ 
	int[] 	pImageIndices;
	
	/**
	 *  VkResult* 	pResults	[vkenum_array_array]
	 */ 
	VkResult[] 	pResults;
	/**
	 * Ctor
	 */
	public VkPresentInfoKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPresentInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPresentInfoKHR(long address){ 
		 super(address); 
	 }

	/** 
	 * Static Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}

	/** 
	 * Method to get native size of this structure 
	 */
	 @Override
	 public int getSizeBytes(){ 
		 return sizeOf(); 
	}

	/** 
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkPresentInfoKHR sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkPresentInfoKHR pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
		    this.pNext = null;
		    return null;
		  } else 
		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 * 
	 * @param waitSemaphoreCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPresentInfoKHR waitSemaphoreCount(int waitSemaphoreCount){
		 this.waitSemaphoreCount = waitSemaphoreCount;
		 setWaitSemaphoreCount0(this.ptr,  waitSemaphoreCount);
		 return this;
	 }

	/**
	 * Get method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public int waitSemaphoreCount(){
		 int var = getWaitSemaphoreCount0(super.ptr);
		 this.waitSemaphoreCount = var;
		 return this.waitSemaphoreCount;
	 }

	/**
	 * Set method for field pWaitSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 * 
	 * @param pWaitSemaphores - a instance of VkSemaphore[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPresentInfoKHR pWaitSemaphores(VkSemaphore[] pWaitSemaphores){
		 this.pWaitSemaphores = pWaitSemaphores;
		 this.pWaitSemaphoresBUFFER = new BigBuffer(pWaitSemaphores, false);
		 setPWaitSemaphores0(this.ptr, pWaitSemaphoresBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pWaitSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public VkSemaphore[] pWaitSemaphores(){
		 long ptr = getPWaitSemaphores0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pWaitSemaphoresBUFFER != null && ptr == pWaitSemaphoresBUFFER.getBufferAddress()){ //same buffer 
		    pWaitSemaphoresBUFFER.update();
		    return pWaitSemaphores;
		  }else{
		     (new UnsupportedOperationException("There is no VKHandle[] for backup.")).printStackTrace();
		   }
		 return this.pWaitSemaphores;
	 }

	/**
	 * Set method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 * 
	 * @param swapchainCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPresentInfoKHR swapchainCount(int swapchainCount){
		 this.swapchainCount = swapchainCount;
		 setSwapchainCount0(this.ptr,  swapchainCount);
		 return this;
	 }

	/**
	 * Get method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 public int swapchainCount(){
		 int var = getSwapchainCount0(super.ptr);
		 this.swapchainCount = var;
		 return this.swapchainCount;
	 }

	/**
	 * Set method for field pSwapchains	[vkhandle_array]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 * 
	 * @param pSwapchains - a instance of VkSwapchainKHR[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPresentInfoKHR pSwapchains(VkSwapchainKHR[] pSwapchains){
		 this.pSwapchains = pSwapchains;
		 this.pSwapchainsBUFFER = new BigBuffer(pSwapchains, false);
		 setPSwapchains0(this.ptr, pSwapchainsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pSwapchains	[vkhandle_array]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 public VkSwapchainKHR[] pSwapchains(){
		 long ptr = getPSwapchains0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pSwapchainsBUFFER != null && ptr == pSwapchainsBUFFER.getBufferAddress()){ //same buffer 
		    pSwapchainsBUFFER.update();
		    return pSwapchains;
		  }else{
		     (new UnsupportedOperationException("There is no VKHandle[] for backup.")).printStackTrace();
		   }
		 return this.pSwapchains;
	 }

	/**
	 * Set method for field pImageIndices	[int]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 * 
	 * @param pImageIndices - a instance of int[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPresentInfoKHR pImageIndices(int[] pImageIndices){
		 this.pImageIndices = pImageIndices;
		 setPImageIndices0(this.ptr,  pImageIndices);
		 return this;
	 }

	/**
	 * Get method for field pImageIndices	[int]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 public int[] pImageIndices(){
		 int[] var = getPImageIndices0(super.ptr, pImageIndices);
		 this.pImageIndices = var;
		 return this.pImageIndices;
	 }

	/**
	 * Set method for field pResults	[vkenum_array]<br>
	 * Prototype: VkResult*  pResults
	 * 
	 * @param pResults - a instance of VkResult[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPresentInfoKHR pResults(VkResult[] pResults){
		 this.pResults = pResults;
		 setPResults0(this.ptr,  pResults);
		 return this;
	 }

	/**
	 * Get method for field pResults	[vkenum_array]<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 public VkResult[] pResults(){
		 VkResult[] var = getPResults0(super.ptr, pResults);
		 this.pResults = var;
		 return this.pResults;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPresentInfoKHR [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n waitSemaphoreCount: ")
				.append(waitSemaphoreCount() )
				.append(",\n pWaitSemaphores: ")
				.append(Arrays.toString(pWaitSemaphores()) )
				.append(",\n swapchainCount: ")
				.append(swapchainCount() )
				.append(",\n pSwapchains: ")
				.append(Arrays.toString(pSwapchains()) )
				.append(",\n pImageIndices: ")
				.append(Arrays.toString(pImageIndices()) )
				.append(",\n pResults: ")
				.append(Arrays.toString(pResults()) )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void setWaitSemaphoreCount0(Buffer ptr, int _waitSemaphoreCount);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * Native GET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int getWaitSemaphoreCount0(Buffer ptr);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jint) (vkObj->waitSemaphoreCount);
	 */

	/**
	 * Native SET method for field pWaitSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void setPWaitSemaphores0(Buffer ptr, ByteBuffer  _pWaitSemaphores);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  */

	/**
	 * Native GET method for field pWaitSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native long getPWaitSemaphores0(Buffer ptr);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pWaitSemaphores);
	 */

	/**
	 * Native SET method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 private static native void setSwapchainCount0(Buffer ptr, int _swapchainCount);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->swapchainCount = (uint32_t) (_swapchainCount);
	  */

	/**
	 * Native GET method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 private static native int getSwapchainCount0(Buffer ptr);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jint) (vkObj->swapchainCount);
	 */

	/**
	 * Native SET method for field pSwapchains	[vkhandle_array]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 private static native void setPSwapchains0(Buffer ptr, ByteBuffer  _pSwapchains);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->pSwapchains = (const VkSwapchainKHR*) (_pSwapchains);
	  */

	/**
	 * Native GET method for field pSwapchains	[vkhandle_array]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 private static native long getPSwapchains0(Buffer ptr);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pSwapchains);
	 */

	/**
	 * Native SET method for field pImageIndices	[int]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 private static native void setPImageIndices0(Buffer ptr, int[] _pImageIndices);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->pImageIndices = (const uint32_t*) (_pImageIndices);
	  */

	/**
	 * Native GET method for field pImageIndices	[int]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 private static native int[] getPImageIndices0(Buffer ptr);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  return (int[]) (vkObj->pImageIndices);
	 */

	/**
	 * Native SET method for field pResults	[vkenum_array]<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 private static native void setPResults0(Buffer ptr, int[]  _pResults);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->pResults = (VkResult*) (_pResults);
	  */

	/**
	 * Native GET method for field pResults	[vkenum_array]<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 private static native int[]  getPResults0(Buffer ptr);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  return (VkResult[]) (vkObj->pResults);
	 */



} // end of class VkPresentInfoKHR