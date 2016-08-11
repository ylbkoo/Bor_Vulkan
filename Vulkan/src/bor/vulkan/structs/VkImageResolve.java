/**
 * Class wrapping Vulkan's VkImageResolve struct.
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
 *  This class is a Java front end for struct VkImageResolve. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageResolve {
 *     VkImageSubresourceLayers    srcSubresource;
 *     VkOffset3D                  srcOffset;
 *     VkImageSubresourceLayers    dstSubresource;
 *     VkOffset3D                  dstOffset;
 *     VkExtent3D                  extent;
 * } VkImageResolve;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkImageResolve extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [98]  */
	 private static final String TAG = "VkImageResolve";

	/** ID of this structure [98]  */
	 public static final int TAG_ID = VKIMAGERESOLVE_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkImageSubresourceLayers 	srcSubresource	[vkstruct]
	 */ 
	VkImageSubresourceLayers 	srcSubresource;
	
	/**
	 *  VkOffset3D 	srcOffset	[vkstruct]
	 */ 
	VkOffset3D 	srcOffset;
	
	/**
	 *  VkImageSubresourceLayers 	dstSubresource	[vkstruct]
	 */ 
	VkImageSubresourceLayers 	dstSubresource;
	
	/**
	 *  VkOffset3D 	dstOffset	[vkstruct]
	 */ 
	VkOffset3D 	dstOffset;
	
	/**
	 *  VkExtent3D 	extent	[vkstruct]
	 */ 
	VkExtent3D 	extent;
	/**
	 * Ctor
	 */
	public VkImageResolve(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageResolve(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkImageResolve(long address){ 
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
	 * Set method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 * 
	 * @param srcSubresource - a instance of VkImageSubresourceLayers.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageResolve srcSubresource(VkImageSubresourceLayers srcSubresource){
		 this.srcSubresource = srcSubresource;
		 ByteBuffer buff = (srcSubresource==null) ? null : srcSubresource.getPointer();
		 setSrcSubresource0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 public VkImageSubresourceLayers srcSubresource(){
		 long pointer = getSrcSubresource0(super.ptr);
		 if(pointer == 0){
		    this.srcSubresource = null;
		    return null;
		  } 

		 if(this.srcSubresource == null){
		    this.srcSubresource = new VkImageSubresourceLayers(pointer);
		 }else{
		    this.srcSubresource.setPointer(pointer);
		  }
		 return this.srcSubresource;
	 }

	/**
	 * Set method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 * 
	 * @param srcOffset - a instance of VkOffset3D.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageResolve srcOffset(VkOffset3D srcOffset){
		 this.srcOffset = srcOffset;
		 ByteBuffer buff = (srcOffset==null) ? null : srcOffset.getPointer();
		 setSrcOffset0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 public VkOffset3D srcOffset(){
		 long pointer = getSrcOffset0(super.ptr);
		 if(pointer == 0){
		    this.srcOffset = null;
		    return null;
		  } 

		 if(this.srcOffset == null){
		    this.srcOffset = new VkOffset3D(pointer);
		 }else{
		    this.srcOffset.setPointer(pointer);
		  }
		 return this.srcOffset;
	 }

	/**
	 * Set method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 * 
	 * @param dstSubresource - a instance of VkImageSubresourceLayers.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageResolve dstSubresource(VkImageSubresourceLayers dstSubresource){
		 this.dstSubresource = dstSubresource;
		 ByteBuffer buff = (dstSubresource==null) ? null : dstSubresource.getPointer();
		 setDstSubresource0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 public VkImageSubresourceLayers dstSubresource(){
		 long pointer = getDstSubresource0(super.ptr);
		 if(pointer == 0){
		    this.dstSubresource = null;
		    return null;
		  } 

		 if(this.dstSubresource == null){
		    this.dstSubresource = new VkImageSubresourceLayers(pointer);
		 }else{
		    this.dstSubresource.setPointer(pointer);
		  }
		 return this.dstSubresource;
	 }

	/**
	 * Set method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 * 
	 * @param dstOffset - a instance of VkOffset3D.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageResolve dstOffset(VkOffset3D dstOffset){
		 this.dstOffset = dstOffset;
		 ByteBuffer buff = (dstOffset==null) ? null : dstOffset.getPointer();
		 setDstOffset0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 public VkOffset3D dstOffset(){
		 long pointer = getDstOffset0(super.ptr);
		 if(pointer == 0){
		    this.dstOffset = null;
		    return null;
		  } 

		 if(this.dstOffset == null){
		    this.dstOffset = new VkOffset3D(pointer);
		 }else{
		    this.dstOffset.setPointer(pointer);
		  }
		 return this.dstOffset;
	 }

	/**
	 * Set method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 * 
	 * @param extent - a instance of VkExtent3D.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageResolve extent(VkExtent3D extent){
		 this.extent = extent;
		 ByteBuffer buff = (extent==null) ? null : extent.getPointer();
		 setExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public VkExtent3D extent(){
		 long pointer = getExtent0(super.ptr);
		 if(pointer == 0){
		    this.extent = null;
		    return null;
		  } 

		 if(this.extent == null){
		    this.extent = new VkExtent3D(pointer);
		 }else{
		    this.extent.setPointer(pointer);
		  }
		 return this.extent;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkImageResolve [ ")
				.append("srcSubresource: ").append(srcSubresource() )
				.append(",\n srcOffset: ")
				.append(srcOffset() )
				.append(",\n dstSubresource: ")
				.append(dstSubresource() )
				.append(",\n dstOffset: ")
				.append(dstOffset() )
				.append(",\n extent: ")
				.append(extent() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native void setSrcSubresource0(Buffer ptr, java.nio.ByteBuffer  _srcSubresource);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->srcSubresource = (VkImageSubresourceLayers) (_srcSubresource);
	  */

	/**
	 * Native GET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native long getSrcSubresource0(Buffer ptr);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcSubresource);
	 */

	/**
	 * Native SET method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 private static native void setSrcOffset0(Buffer ptr, java.nio.ByteBuffer  _srcOffset);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->srcOffset = (VkOffset3D) (_srcOffset);
	  */

	/**
	 * Native GET method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 private static native long getSrcOffset0(Buffer ptr);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcOffset);
	 */

	/**
	 * Native SET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native void setDstSubresource0(Buffer ptr, java.nio.ByteBuffer  _dstSubresource);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->dstSubresource = (VkImageSubresourceLayers) (_dstSubresource);
	  */

	/**
	 * Native GET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native long getDstSubresource0(Buffer ptr);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstSubresource);
	 */

	/**
	 * Native SET method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 private static native void setDstOffset0(Buffer ptr, java.nio.ByteBuffer  _dstOffset);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->dstOffset = (VkOffset3D) (_dstOffset);
	  */

	/**
	 * Native GET method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 private static native long getDstOffset0(Buffer ptr);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstOffset);
	 */

	/**
	 * Native SET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native void setExtent0(Buffer ptr, java.nio.ByteBuffer  _extent);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->extent = (VkExtent3D) (_extent);
	  */

	/**
	 * Native GET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native long getExtent0(Buffer ptr);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->extent);
	 */



} // end of class VkImageResolve
