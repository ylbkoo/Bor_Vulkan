/**
 * Class wrapping Vulkan's VkDisplayPresentInfoKHR struct.
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

 import java.util.*;
 import java.nio.*;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDisplayPresentInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplayPresentInfoKHR {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkRect2D           srcRect;
 *     VkRect2D           dstRect;
 *     VkBool32           persistent;
 * } VkDisplayPresentInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDisplayPresentInfoKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [117]  */
	 private static final String TAG = "VkDisplayPresentInfoKHR";

	/** ID of this structure [117]  */
	 public static final int TAG_ID = VKDISPLAYPRESENTINFOKHR_ID;

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
	 *  VkRect2D 	srcRect	[vkstruct]
	 */ 
	VkRect2D 	srcRect;
	
	/**
	 *  VkRect2D 	dstRect	[vkstruct]
	 */ 
	VkRect2D 	dstRect;
	
	/**
	 *  VkBool32 	persistent	[boolean]
	 */ 
	boolean 	persistent;
	/**
	 * Ctor
	 */
	public VkDisplayPresentInfoKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayPresentInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDisplayPresentInfoKHR(long address){ 
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

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkDisplayPresentInfoKHR> createVkArray(int size){ 
		 VkDisplayPresentInfoKHR[] array = new VkDisplayPresentInfoKHR[size]; 
		 VkArrayStruct<VkDisplayPresentInfoKHR> vkArray = new VkArrayStruct<VkDisplayPresentInfoKHR>(array, TAG_ID);
		 return vkArray; 
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
	 public VkDisplayPresentInfoKHR sType(VkStructureType sType){
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
	 public VkDisplayPresentInfoKHR pNext(VkObject pNext){
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
	 * Set method for field srcRect	[vkstruct]<br>
	 * Prototype: VkRect2D  srcRect
	 * 
	 * @param srcRect - a instance of VkRect2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPresentInfoKHR srcRect(VkRect2D srcRect){
		 this.srcRect = srcRect;
		 ByteBuffer buff = (srcRect==null) ? null : srcRect.getPointer();
		 setSrcRect0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field srcRect	[vkstruct]<br>
	 * Prototype: VkRect2D  srcRect
	 */ 
	 public VkRect2D srcRect(){
		 long pointer = getSrcRect0(super.ptr);
		 if(pointer == 0){
		    this.srcRect = null;
		    return null;
		  } 

		 if(this.srcRect == null){
		    this.srcRect = new VkRect2D(pointer);
		 }else{
		    this.srcRect.setPointer(pointer);
		  }
		 return this.srcRect;
	 }

	/**
	 * Set method for field dstRect	[vkstruct]<br>
	 * Prototype: VkRect2D  dstRect
	 * 
	 * @param dstRect - a instance of VkRect2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPresentInfoKHR dstRect(VkRect2D dstRect){
		 this.dstRect = dstRect;
		 ByteBuffer buff = (dstRect==null) ? null : dstRect.getPointer();
		 setDstRect0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field dstRect	[vkstruct]<br>
	 * Prototype: VkRect2D  dstRect
	 */ 
	 public VkRect2D dstRect(){
		 long pointer = getDstRect0(super.ptr);
		 if(pointer == 0){
		    this.dstRect = null;
		    return null;
		  } 

		 if(this.dstRect == null){
		    this.dstRect = new VkRect2D(pointer);
		 }else{
		    this.dstRect.setPointer(pointer);
		  }
		 return this.dstRect;
	 }

	/**
	 * Set method for field persistent	[boolean]<br>
	 * Prototype: VkBool32  persistent
	 * 
	 * @param persistent - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPresentInfoKHR persistent(boolean persistent){
		 this.persistent = persistent;
		 setPersistent0(this.ptr,  persistent);
		 return this;
	 }

	/**
	 * Get method for field persistent	[boolean]<br>
	 * Prototype: VkBool32  persistent
	 */ 
	 public boolean persistent(){
		 boolean var = getPersistent0(super.ptr);
		 this.persistent = var;
		 return this.persistent;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDisplayPresentInfoKHR [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n srcRect: ")
				.append(srcRect() )
				.append(",\n dstRect: ")
				.append(dstRect() )
				.append(",\n persistent: ")
				.append(persistent() )
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
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field srcRect	[vkstruct]<br>
	 * Prototype: VkRect2D  srcRect
	 */ 
	 private static native void setSrcRect0(Buffer ptr, java.nio.ByteBuffer  _srcRect);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkRect2D* p_srcRect = (VkRect2D*) _srcRect; 
		 vkObj->srcRect = (*p_srcRect); 
	  */

	/**
	 * Native GET method for field srcRect	[vkstruct]<br>
	 * Prototype: VkRect2D  srcRect
	 */ 
	 private static native long getSrcRect0(Buffer ptr);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcRect);
	 */

	/**
	 * Native SET method for field dstRect	[vkstruct]<br>
	 * Prototype: VkRect2D  dstRect
	 */ 
	 private static native void setDstRect0(Buffer ptr, java.nio.ByteBuffer  _dstRect);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkRect2D* p_dstRect = (VkRect2D*) _dstRect; 
		 vkObj->dstRect = (*p_dstRect); 
	  */

	/**
	 * Native GET method for field dstRect	[vkstruct]<br>
	 * Prototype: VkRect2D  dstRect
	 */ 
	 private static native long getDstRect0(Buffer ptr);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstRect);
	 */

	/**
	 * Native SET method for field persistent	[boolean]<br>
	 * Prototype: VkBool32  persistent
	 */ 
	 private static native void setPersistent0(Buffer ptr, boolean  _persistent);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->persistent = (VkBool32) (_persistent);
	  */

	/**
	 * Native GET method for field persistent	[boolean]<br>
	 * Prototype: VkBool32  persistent
	 */ 
	 private static native boolean  getPersistent0(Buffer ptr);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  return (jboolean) (vkObj->persistent);
	 */



} // end of class VkDisplayPresentInfoKHR
