/**
 * Class wrapping Vulkan's VkBufferViewCreateInfo struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkBufferViewCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkBufferViewCreateInfo {
 *     VkStructureType            sType;
 *     const void*                pNext;
 *     VkBufferViewCreateFlags    flags;
 *     VkBuffer                   buffer;
 *     VkFormat                   format;
 *     VkDeviceSize               offset;
 *     VkDeviceSize               range;
 * } VkBufferViewCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkBufferViewCreateInfo extends VkStruct {
	/** TAG of this structure [38]  */
	 private static final String TAG = "VkBufferViewCreateInfo";

	/** ID of this structure [38]  */
	 public static final int TAG_ID = VKBUFFERVIEWCREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkBufferViewCreateFlags 	flags	[int]
	 */ 
	int 	flags;

	/**
	 *  VkBuffer 	buffer	[vkhandle]
	 */ 
	VkBuffer 	buffer;

	/**
	 *  VkFormat 	format	[vkenum]
	 */ 
	VkFormat 	format;

	/**
	 *  VkDeviceSize 	offset	[long]
	 */ 
	long 	offset;

	/**
	 *  VkDeviceSize 	range	[long]
	 */ 
	long 	range;

	/**
	 * Ctor
	 */
	public VkBufferViewCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkBufferViewCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkBufferViewCreateInfo(long address, int memSize){ 
		 super(address, memSize); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	/**
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkBufferViewCreateInfo> createNullPointer(){
	        P<VkBufferViewCreateInfo> p = new  P<VkBufferViewCreateInfo>(new VkBufferViewCreateInfo());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public void buffer(VkBuffer buffer){
		 this.buffer = buffer;
		buffer0(super.ptr, buffer);
	 }

	/**
	 * get method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public VkBuffer buffer(){
		 // return  this.buffer;
		 return buffer0(super.ptr);
	 }

	/**
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		format0(super.ptr, format);
	 }

	/**
	 * get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 // return  this.format;
		 return format0(super.ptr);
	 }

	/**
	 * Set method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public void offset(long offset){
		 this.offset = offset;
		offset0(super.ptr, offset);
	 }

	/**
	 * get method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public long offset(){
		 // return  this.offset;
		 return offset0(super.ptr);
	 }

	/**
	 * Set method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 public void range(long range){
		 this.range = range;
		range0(super.ptr, range);
	 }

	/**
	 * get method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 public long range(){
		 // return  this.range;
		 return range0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.flags = (VkBufferViewCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (jint) (_obj.VkBufferViewCreateFlags);
	 */

	/**
	 * native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void buffer0(ByteBuffer ptr, VkBuffer _buffer);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native VkBuffer buffer0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (VkBuffer) (_obj.VkBuffer);
	 */

	/**
	 * native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(ByteBuffer ptr, VkFormat _format);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.format = (VkFormat) (_format);
	  */

	/**
	 * native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native VkFormat format0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, long _offset);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long offset0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native void range0(ByteBuffer ptr, long _range);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.range = (VkDeviceSize) (_range);
	  */

	/**
	 * native GET method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native long range0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkBufferViewCreateInfo
