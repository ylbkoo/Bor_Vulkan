/**
 * Class wrapping Vulkan's VkImageCreateInfo struct.
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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkImageCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageCreateInfo {
 *     VkStructureType          sType;
 *     const void*              pNext;
 *     VkImageCreateFlags       flags;
 *     VkImageType              imageType;
 *     VkFormat                 format;
 *     VkExtent3D               extent;
 *     uint32_t                 mipLevels;
 *     uint32_t                 arrayLayers;
 *     VkSampleCountFlagBits    samples;
 *     VkImageTiling            tiling;
 *     VkImageUsageFlags        usage;
 *     VkSharingMode            sharingMode;
 *     uint32_t                 queueFamilyIndexCount;
 *     const uint32_t*          pQueueFamilyIndices;
 *     VkImageLayout            initialLayout;
 * } VkImageCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageCreateInfo extends VkStruct {
	/** TAG of this structure [39]  */
	 private static final String TAG = "VkImageCreateInfo";

	/** ID of this structure [39]  */
	 public static final int TAG_ID = VKIMAGECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkImageCreateInfo> p;

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
	 *  VkImageCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  VkImageType 	imageType	[vkenum]
	 */ 
	 VkImageType 	imageType;

	/**
	 *  VkFormat 	format	[vkenum]
	 */ 
	 VkFormat 	format;

	/**
	 *  VkExtent3D 	extent	[vkstruct]
	 */ 
	 VkExtent3D 	extent;

	/**
	 *  uint32_t 	mipLevels	[int]
	 */ 
	 int 	mipLevels;

	/**
	 *  uint32_t 	arrayLayers	[int]
	 */ 
	 int 	arrayLayers;

	/**
	 *  VkSampleCountFlagBits 	samples	[vkenum]
	 */ 
	 VkSampleCountFlagBits 	samples;

	/**
	 *  VkImageTiling 	tiling	[vkenum]
	 */ 
	 VkImageTiling 	tiling;

	/**
	 *  VkImageUsageFlags 	usage	[int]
	 */ 
	 int 	usage;

	/**
	 *  VkSharingMode 	sharingMode	[vkenum]
	 */ 
	 VkSharingMode 	sharingMode;

	/**
	 *  uint32_t 	queueFamilyIndexCount	[int]
	 */ 
	 int 	queueFamilyIndexCount;

	/**
	 *  const uint32_t* 	pQueueFamilyIndices	[int_array]
	 */ 
	 int[] 	pQueueFamilyIndices;

	/**
	 *  VkImageLayout 	initialLayout	[vkenum]
	 */ 
	 VkImageLayout 	initialLayout;

	/**
	 * Ctor
	 */
	public VkImageCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkImageCreateInfo(long address, int memSize){ 
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
	 public static P<VkImageCreateInfo> createNullPointer(){
	        P<VkImageCreateInfo> p = new  P<VkImageCreateInfo>(new VkImageCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkImageCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkImageCreateInfo> (this);
	       }
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
		 int enumVal = sType.getValue();
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkImageCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkImageCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field imageType	[vkenum]<br>
	 * Prototype: VkImageType  imageType
	 */ 
	 public void imageType(VkImageType imageType){
		 this.imageType = imageType;
		 int enumVal = imageType.getValue();
		 imageType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field imageType	[vkenum]<br>
	 * Prototype: VkImageType  imageType
	 */ 
	 public VkImageType imageType(){
		 int nativeVal = imageType0(super.ptr);
		 this.imageType = VkImageType.fromValue(nativeVal); 
		 return this.imageType;
	 }

	/**
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		 int enumVal = format.getValue();
		 format0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 int nativeVal = format0(super.ptr);
		 this.format = VkFormat.fromValue(nativeVal); 
		 return this.format;
	 }

	/**
	 * Set method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public void extent(VkExtent3D extent){
		 this.extent = extent;
		 ByteBuffer buff = (extent==null) ? null : extent.getPointerStruct();
		 extent0(this.ptr, buff);
	 }

	/**
	 * Get method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public VkExtent3D extent(){
		 ByteBuffer pointer = extent0(super.ptr);
		 if(pointer == null){
		    this.extent = null;
		    return null;
		  } else 
 		 if(this.extent == null){
		    this.extent = new VkExtent3D(pointer);
		 }else{
		    this.extent.setPointer(pointer);
		  }
		 return this.extent;
	 }

	/**
	 * Set method for field mipLevels	[int]<br>
	 * Prototype: uint32_t  mipLevels
	 */ 
	 public void mipLevels(int mipLevels){
		 this.mipLevels = mipLevels;
		 mipLevels0(this.ptr,  mipLevels);
	 }

	/**
	 * Get method for field mipLevels	[int]<br>
	 * Prototype: uint32_t  mipLevels
	 */ 
	 public int mipLevels(){
		 int var = mipLevels0(super.ptr);
		 this.mipLevels = var;
		 return this.mipLevels;
	 }

	/**
	 * Set method for field arrayLayers	[int]<br>
	 * Prototype: uint32_t  arrayLayers
	 */ 
	 public void arrayLayers(int arrayLayers){
		 this.arrayLayers = arrayLayers;
		 arrayLayers0(this.ptr,  arrayLayers);
	 }

	/**
	 * Get method for field arrayLayers	[int]<br>
	 * Prototype: uint32_t  arrayLayers
	 */ 
	 public int arrayLayers(){
		 int var = arrayLayers0(super.ptr);
		 this.arrayLayers = var;
		 return this.arrayLayers;
	 }

	/**
	 * Set method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 public void samples(VkSampleCountFlagBits samples){
		 this.samples = samples;
		 int enumVal = samples.getValue();
		 samples0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 public VkSampleCountFlagBits samples(){
		 int nativeVal = samples0(super.ptr);
		 this.samples = VkSampleCountFlagBits.fromValue(nativeVal); 
		 return this.samples;
	 }

	/**
	 * Set method for field tiling	[vkenum]<br>
	 * Prototype: VkImageTiling  tiling
	 */ 
	 public void tiling(VkImageTiling tiling){
		 this.tiling = tiling;
		 int enumVal = tiling.getValue();
		 tiling0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field tiling	[vkenum]<br>
	 * Prototype: VkImageTiling  tiling
	 */ 
	 public VkImageTiling tiling(){
		 int nativeVal = tiling0(super.ptr);
		 this.tiling = VkImageTiling.fromValue(nativeVal); 
		 return this.tiling;
	 }

	/**
	 * Set method for field usage	[int]<br>
	 * Prototype: VkImageUsageFlags  usage
	 */ 
	 public void usage(int usage){
		 this.usage = usage;
		 usage0(this.ptr,  usage);
	 }

	/**
	 * Get method for field usage	[int]<br>
	 * Prototype: VkImageUsageFlags  usage
	 */ 
	 public int usage(){
		 int var = usage0(super.ptr);
		 this.usage = var;
		 return this.usage;
	 }

	/**
	 * Set method for field sharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 public void sharingMode(VkSharingMode sharingMode){
		 this.sharingMode = sharingMode;
		 int enumVal = sharingMode.getValue();
		 sharingMode0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 public VkSharingMode sharingMode(){
		 int nativeVal = sharingMode0(super.ptr);
		 this.sharingMode = VkSharingMode.fromValue(nativeVal); 
		 return this.sharingMode;
	 }

	/**
	 * Set method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public void queueFamilyIndexCount(int queueFamilyIndexCount){
		 this.queueFamilyIndexCount = queueFamilyIndexCount;
		 queueFamilyIndexCount0(this.ptr,  queueFamilyIndexCount);
	 }

	/**
	 * Get method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public int queueFamilyIndexCount(){
		 int var = queueFamilyIndexCount0(super.ptr);
		 this.queueFamilyIndexCount = var;
		 return this.queueFamilyIndexCount;
	 }

	/**
	 * Set method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public void pQueueFamilyIndices(int[] pQueueFamilyIndices){
		 this.pQueueFamilyIndices = pQueueFamilyIndices;
		 pQueueFamilyIndices0(this.ptr,  pQueueFamilyIndices);
	 }

	/**
	 * Get method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public int[] pQueueFamilyIndices(){
		 int[] var = pQueueFamilyIndices0(super.ptr);
		 this.pQueueFamilyIndices = var;
		 return this.pQueueFamilyIndices;
	 }

	/**
	 * Set method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 public void initialLayout(VkImageLayout initialLayout){
		 this.initialLayout = initialLayout;
		 int enumVal = initialLayout.getValue();
		 initialLayout0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 public VkImageLayout initialLayout(){
		 int nativeVal = initialLayout0(super.ptr);
		 this.initialLayout = VkImageLayout.fromValue(nativeVal); 
		 return this.initialLayout;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkImageCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->flags = (VkImageCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkImageCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field imageType	[vkenum]<br>
	 * Prototype: VkImageType  imageType
	 */ 
	 private static native void imageType0(Buffer ptr, int  _imageType);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->imageType = (VkImageType) (_imageType);
	  */

	/**
	 * native GET method for field imageType	[vkenum]<br>
	 * Prototype: VkImageType  imageType
	 */ 
	 private static native int  imageType0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkImageType) (vkObj->imageType);
	 */

	/**
	 * native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(Buffer ptr, int  _format);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->format = (VkFormat) (_format);
	  */

	/**
	 * native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native int  format0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkFormat) (vkObj->format);
	 */

	/**
	 * native SET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native void extent0(Buffer ptr, java.nio.ByteBuffer  _extent);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->extent = (VkExtent3D) (_extent);
	  */

	/**
	 * native GET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native java.nio.ByteBuffer  extent0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkExtent3D) (vkObj->extent);
	 */

	/**
	 * native SET method for field mipLevels	[int]<br>
	 * Prototype: uint32_t  mipLevels
	 */ 
	 private static native void mipLevels0(Buffer ptr, int _mipLevels);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->mipLevels = (uint32_t) (_mipLevels);
	  */

	/**
	 * native GET method for field mipLevels	[int]<br>
	 * Prototype: uint32_t  mipLevels
	 */ 
	 private static native int mipLevels0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (jint) (vkObj->mipLevels);
	 */

	/**
	 * native SET method for field arrayLayers	[int]<br>
	 * Prototype: uint32_t  arrayLayers
	 */ 
	 private static native void arrayLayers0(Buffer ptr, int _arrayLayers);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->arrayLayers = (uint32_t) (_arrayLayers);
	  */

	/**
	 * native GET method for field arrayLayers	[int]<br>
	 * Prototype: uint32_t  arrayLayers
	 */ 
	 private static native int arrayLayers0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (jint) (vkObj->arrayLayers);
	 */

	/**
	 * native SET method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 private static native void samples0(Buffer ptr, int  _samples);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->samples = (VkSampleCountFlagBits) (_samples);
	  */

	/**
	 * native GET method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 private static native int  samples0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkSampleCountFlagBits) (vkObj->samples);
	 */

	/**
	 * native SET method for field tiling	[vkenum]<br>
	 * Prototype: VkImageTiling  tiling
	 */ 
	 private static native void tiling0(Buffer ptr, int  _tiling);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->tiling = (VkImageTiling) (_tiling);
	  */

	/**
	 * native GET method for field tiling	[vkenum]<br>
	 * Prototype: VkImageTiling  tiling
	 */ 
	 private static native int  tiling0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkImageTiling) (vkObj->tiling);
	 */

	/**
	 * native SET method for field usage	[int]<br>
	 * Prototype: VkImageUsageFlags  usage
	 */ 
	 private static native void usage0(Buffer ptr, int _usage);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->usage = (VkImageUsageFlags) (_usage);
	  */

	/**
	 * native GET method for field usage	[int]<br>
	 * Prototype: VkImageUsageFlags  usage
	 */ 
	 private static native int usage0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (jint) (vkObj->usage);
	 */

	/**
	 * native SET method for field sharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 private static native void sharingMode0(Buffer ptr, int  _sharingMode);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->sharingMode = (VkSharingMode) (_sharingMode);
	  */

	/**
	 * native GET method for field sharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 private static native int  sharingMode0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkSharingMode) (vkObj->sharingMode);
	 */

	/**
	 * native SET method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native void queueFamilyIndexCount0(Buffer ptr, int _queueFamilyIndexCount);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  */

	/**
	 * native GET method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native int queueFamilyIndexCount0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (jint) (vkObj->queueFamilyIndexCount);
	 */

	/**
	 * native SET method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native void pQueueFamilyIndices0(Buffer ptr, int[] _pQueueFamilyIndices);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->pQueueFamilyIndices = (const uint32_t*) (_pQueueFamilyIndices);
	  */

	/**
	 * native GET method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native int[] pQueueFamilyIndices0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (int[]) (vkObj->pQueueFamilyIndices);
	 */

	/**
	 * native SET method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 private static native void initialLayout0(Buffer ptr, int  _initialLayout);/*
		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  vkObj->initialLayout = (VkImageLayout) (_initialLayout);
	  */

	/**
	 * native GET method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 private static native int  initialLayout0(Buffer ptr);/*
		  VkImageCreateInfo vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkImageLayout) (vkObj->initialLayout);
	 */



} // end of class VkImageCreateInfo
