/**
 * Class wrapping Vulkan's VkSwapchainCreateInfoKHR struct.
 * 
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import bor.vulkan.khr.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSwapchainCreateInfoKHR 
 *  <h3>ProtoType:</h3>
 * <pre>
 * typedef struct VkSwapchainCreateInfoKHR {
 *     VkStructureType                  sType;
 *     const void*                      pNext;
 *     VkSwapchainCreateFlagsKHR        flags;
 *     VkSurfaceKHR                     surface;
 *     uint32_t                         minImageCount;
 *     VkFormat                         imageFormat;
 *     VkColorSpaceKHR                  imageColorSpace;
 *     VkExtent2D                       imageExtent;
 *     uint32_t                         imageArrayLayers;
 *     VkImageUsageFlags                imageUsage;
 *     VkSharingMode                    imageSharingMode;
 *     uint32_t                         queueFamilyIndexCount;
 *     const uint32_t*                  pQueueFamilyIndices;
 *     VkSurfaceTransformFlagBitsKHR    preTransform;
 *     VkCompositeAlphaFlagBitsKHR      compositeAlpha;
 *     VkPresentModeKHR                 presentMode;
 *     VkBool32                         clipped;
 *     VkSwapchainKHR                   oldSwapchain;
 * } VkSwapchainCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version 0.8.01
 */
public class VkSwapchainCreateInfoKHR extends VkStruct {
	/** TAG of this structure [232]  */
	 private static final String TAG = "VkSwapchainCreateInfoKHR";

	/** ID of this structure [232]  */
	 public static final int TAG_ID = VKSWAPCHAINCREATEINFOKHR_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkSwapchainCreateFlagsKHR 	flags 
	 */ 
	int 	flags;

	/**
	 *  VkSurfaceKHR 	surface 
	 */ 
	VkSurfaceKHR 	surface;

	/**
	 *  uint32_t 	minImageCount 
	 */ 
	int 	minImageCount;

	/**
	 *  VkFormat 	imageFormat 
	 */ 
	VkFormat 	imageFormat;

	/**
	 *  VkColorSpaceKHR 	imageColorSpace 
	 */ 
	VkColorSpaceKHR 	imageColorSpace;

	/**
	 *  VkExtent2D 	imageExtent 
	 */ 
	VkExtent2D 	imageExtent;

	/**
	 *  uint32_t 	imageArrayLayers 
	 */ 
	int 	imageArrayLayers;

	/**
	 *  VkImageUsageFlags 	imageUsage 
	 */ 
	int 	imageUsage;

	/**
	 *  VkSharingMode 	imageSharingMode 
	 */ 
	VkSharingMode 	imageSharingMode;

	/**
	 *  uint32_t 	queueFamilyIndexCount 
	 */ 
	int 	queueFamilyIndexCount;

	/**
	 *  const uint32_t* 	pQueueFamilyIndices 
	 */ 
	int[] 	pQueueFamilyIndices;

	/**
	 *  VkSurfaceTransformFlagBitsKHR 	preTransform 
	 */ 
	VkSurfaceTransformFlagBitsKHR 	preTransform;

	/**
	 *  VkCompositeAlphaFlagBitsKHR 	compositeAlpha 
	 */ 
	VkCompositeAlphaFlagBitsKHR 	compositeAlpha;

	/**
	 *  VkPresentModeKHR 	presentMode 
	 */ 
	VkPresentModeKHR 	presentMode;

	/**
	 *  VkBool32 	clipped 
	 */ 
	boolean 	clipped;

	/**
	 *  VkSwapchainKHR 	oldSwapchain 
	 */ 
	VkSwapchainKHR 	oldSwapchain;

	/**
	 * Ctor
	 */
	public VkSwapchainCreateInfoKHR(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field surface
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 public void surface(VkSurfaceKHR surface){
		 this.surface = surface;
		surface0(super.ptr, surface);
	 }

	/**
	 * get method for field surface
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 public VkSurfaceKHR surface(){
		 // return  this.surface;
		 return surface0(super.ptr);
	 }

	/**
	 * Set method for field minImageCount
	 * Prototype: uint32_t  minImageCount
	 */ 
	 public void minImageCount(int minImageCount){
		 this.minImageCount = minImageCount;
		minImageCount0(super.ptr, minImageCount);
	 }

	/**
	 * get method for field minImageCount
	 * Prototype: uint32_t  minImageCount
	 */ 
	 public int minImageCount(){
		 // return  this.minImageCount;
		 return minImageCount0(super.ptr);
	 }

	/**
	 * Set method for field imageFormat
	 * Prototype: VkFormat  imageFormat
	 */ 
	 public void imageFormat(VkFormat imageFormat){
		 this.imageFormat = imageFormat;
		imageFormat0(super.ptr, imageFormat);
	 }

	/**
	 * get method for field imageFormat
	 * Prototype: VkFormat  imageFormat
	 */ 
	 public VkFormat imageFormat(){
		 // return  this.imageFormat;
		 return imageFormat0(super.ptr);
	 }

	/**
	 * Set method for field imageColorSpace
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 public void imageColorSpace(VkColorSpaceKHR imageColorSpace){
		 this.imageColorSpace = imageColorSpace;
		imageColorSpace0(super.ptr, imageColorSpace);
	 }

	/**
	 * get method for field imageColorSpace
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 public VkColorSpaceKHR imageColorSpace(){
		 // return  this.imageColorSpace;
		 return imageColorSpace0(super.ptr);
	 }

	/**
	 * Set method for field imageExtent
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 public void imageExtent(VkExtent2D imageExtent){
		 this.imageExtent = imageExtent;
		imageExtent0(super.ptr, imageExtent);
	 }

	/**
	 * get method for field imageExtent
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 public VkExtent2D imageExtent(){
		 // return  this.imageExtent;
		 return imageExtent0(super.ptr);
	 }

	/**
	 * Set method for field imageArrayLayers
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 public void imageArrayLayers(int imageArrayLayers){
		 this.imageArrayLayers = imageArrayLayers;
		imageArrayLayers0(super.ptr, imageArrayLayers);
	 }

	/**
	 * get method for field imageArrayLayers
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 public int imageArrayLayers(){
		 // return  this.imageArrayLayers;
		 return imageArrayLayers0(super.ptr);
	 }

	/**
	 * Set method for field imageUsage
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 public void imageUsage(int imageUsage){
		 this.imageUsage = imageUsage;
		imageUsage0(super.ptr, imageUsage);
	 }

	/**
	 * get method for field imageUsage
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 public int imageUsage(){
		 // return  this.imageUsage;
		 return imageUsage0(super.ptr);
	 }

	/**
	 * Set method for field imageSharingMode
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 public void imageSharingMode(VkSharingMode imageSharingMode){
		 this.imageSharingMode = imageSharingMode;
		imageSharingMode0(super.ptr, imageSharingMode);
	 }

	/**
	 * get method for field imageSharingMode
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 public VkSharingMode imageSharingMode(){
		 // return  this.imageSharingMode;
		 return imageSharingMode0(super.ptr);
	 }

	/**
	 * Set method for field queueFamilyIndexCount
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public void queueFamilyIndexCount(int queueFamilyIndexCount){
		 this.queueFamilyIndexCount = queueFamilyIndexCount;
		queueFamilyIndexCount0(super.ptr, queueFamilyIndexCount);
	 }

	/**
	 * get method for field queueFamilyIndexCount
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public int queueFamilyIndexCount(){
		 // return  this.queueFamilyIndexCount;
		 return queueFamilyIndexCount0(super.ptr);
	 }

	/**
	 * Set method for field pQueueFamilyIndices
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public void pQueueFamilyIndices(int[] pQueueFamilyIndices){
		 this.pQueueFamilyIndices = pQueueFamilyIndices;
		pQueueFamilyIndices0(super.ptr, pQueueFamilyIndices);
	 }

	/**
	 * get method for field pQueueFamilyIndices
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public int[] pQueueFamilyIndices(){
		 // return  this.pQueueFamilyIndices;
		 return pQueueFamilyIndices0(super.ptr);
	 }

	/**
	 * Set method for field preTransform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 public void preTransform(VkSurfaceTransformFlagBitsKHR preTransform){
		 this.preTransform = preTransform;
		preTransform0(super.ptr, preTransform);
	 }

	/**
	 * get method for field preTransform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 public VkSurfaceTransformFlagBitsKHR preTransform(){
		 // return  this.preTransform;
		 return preTransform0(super.ptr);
	 }

	/**
	 * Set method for field compositeAlpha
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 public void compositeAlpha(VkCompositeAlphaFlagBitsKHR compositeAlpha){
		 this.compositeAlpha = compositeAlpha;
		compositeAlpha0(super.ptr, compositeAlpha);
	 }

	/**
	 * get method for field compositeAlpha
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 public VkCompositeAlphaFlagBitsKHR compositeAlpha(){
		 // return  this.compositeAlpha;
		 return compositeAlpha0(super.ptr);
	 }

	/**
	 * Set method for field presentMode
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 public void presentMode(VkPresentModeKHR presentMode){
		 this.presentMode = presentMode;
		presentMode0(super.ptr, presentMode);
	 }

	/**
	 * get method for field presentMode
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 public VkPresentModeKHR presentMode(){
		 // return  this.presentMode;
		 return presentMode0(super.ptr);
	 }

	/**
	 * Set method for field clipped
	 * Prototype: VkBool32  clipped
	 */ 
	 public void clipped(boolean clipped){
		 this.clipped = clipped;
		clipped0(super.ptr, clipped);
	 }

	/**
	 * get method for field clipped
	 * Prototype: VkBool32  clipped
	 */ 
	 public boolean clipped(){
		 // return  this.clipped;
		 return clipped0(super.ptr);
	 }

	/**
	 * Set method for field oldSwapchain
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 public void oldSwapchain(VkSwapchainKHR oldSwapchain){
		 this.oldSwapchain = oldSwapchain;
		oldSwapchain0(super.ptr, oldSwapchain);
	 }

	/**
	 * get method for field oldSwapchain
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 public VkSwapchainKHR oldSwapchain(){
		 // return  this.oldSwapchain;
		 return oldSwapchain0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.flags = (VkSwapchainCreateFlagsKHR) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkSwapchainCreateFlagsKHR);
	 */

	/**
	 * native Set method for field surface
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 private static native void surface0(ByteBuffer ptr, VkSurfaceKHR _surface);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.surface = (VkSurfaceKHR) (_surface);
	  */

	/**
	 * get method for field surface
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 private static native VkSurfaceKHR surface0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkSurfaceKHR) (_obj.VkSurfaceKHR);
	 */

	/**
	 * native Set method for field minImageCount
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native void minImageCount0(ByteBuffer ptr, int _minImageCount);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.minImageCount = (uint32_t) (_minImageCount);
	  */

	/**
	 * get method for field minImageCount
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native int minImageCount0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field imageFormat
	 * Prototype: VkFormat  imageFormat
	 */ 
	 private static native void imageFormat0(ByteBuffer ptr, VkFormat _imageFormat);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageFormat = (VkFormat) (_imageFormat);
	  */

	/**
	 * get method for field imageFormat
	 * Prototype: VkFormat  imageFormat
	 */ 
	 private static native VkFormat imageFormat0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native Set method for field imageColorSpace
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 private static native void imageColorSpace0(ByteBuffer ptr, VkColorSpaceKHR _imageColorSpace);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageColorSpace = (VkColorSpaceKHR) (_imageColorSpace);
	  */

	/**
	 * get method for field imageColorSpace
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 private static native VkColorSpaceKHR imageColorSpace0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkColorSpaceKHR) (_obj.VkColorSpaceKHR);
	 */

	/**
	 * native Set method for field imageExtent
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native void imageExtent0(ByteBuffer ptr, VkExtent2D _imageExtent);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageExtent = (VkExtent2D) (_imageExtent);
	  */

	/**
	 * get method for field imageExtent
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native VkExtent2D imageExtent0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native Set method for field imageArrayLayers
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 private static native void imageArrayLayers0(ByteBuffer ptr, int _imageArrayLayers);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageArrayLayers = (uint32_t) (_imageArrayLayers);
	  */

	/**
	 * get method for field imageArrayLayers
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 private static native int imageArrayLayers0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field imageUsage
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 private static native void imageUsage0(ByteBuffer ptr, int _imageUsage);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageUsage = (VkImageUsageFlags) (_imageUsage);
	  */

	/**
	 * get method for field imageUsage
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 private static native int imageUsage0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkImageUsageFlags);
	 */

	/**
	 * native Set method for field imageSharingMode
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 private static native void imageSharingMode0(ByteBuffer ptr, VkSharingMode _imageSharingMode);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageSharingMode = (VkSharingMode) (_imageSharingMode);
	  */

	/**
	 * get method for field imageSharingMode
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 private static native VkSharingMode imageSharingMode0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkSharingMode) (_obj.VkSharingMode);
	 */

	/**
	 * native Set method for field queueFamilyIndexCount
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native void queueFamilyIndexCount0(ByteBuffer ptr, int _queueFamilyIndexCount);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  */

	/**
	 * get method for field queueFamilyIndexCount
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native int queueFamilyIndexCount0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pQueueFamilyIndices
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native void pQueueFamilyIndices0(ByteBuffer ptr, int[] _pQueueFamilyIndices);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.pQueueFamilyIndices = (const uint32_t*) (_pQueueFamilyIndices);
	  */

	/**
	 * get method for field pQueueFamilyIndices
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native int[] pQueueFamilyIndices0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (int[]) (_obj.const uint32_t*);
	 */

	/**
	 * native Set method for field preTransform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 private static native void preTransform0(ByteBuffer ptr, VkSurfaceTransformFlagBitsKHR _preTransform);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.preTransform = (VkSurfaceTransformFlagBitsKHR) (_preTransform);
	  */

	/**
	 * get method for field preTransform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 private static native VkSurfaceTransformFlagBitsKHR preTransform0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkSurfaceTransformFlagBitsKHR) (_obj.VkSurfaceTransformFlagBitsKHR);
	 */

	/**
	 * native Set method for field compositeAlpha
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 private static native void compositeAlpha0(ByteBuffer ptr, VkCompositeAlphaFlagBitsKHR _compositeAlpha);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.compositeAlpha = (VkCompositeAlphaFlagBitsKHR) (_compositeAlpha);
	  */

	/**
	 * get method for field compositeAlpha
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 private static native VkCompositeAlphaFlagBitsKHR compositeAlpha0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkCompositeAlphaFlagBitsKHR) (_obj.VkCompositeAlphaFlagBitsKHR);
	 */

	/**
	 * native Set method for field presentMode
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 private static native void presentMode0(ByteBuffer ptr, VkPresentModeKHR _presentMode);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.presentMode = (VkPresentModeKHR) (_presentMode);
	  */

	/**
	 * get method for field presentMode
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 private static native VkPresentModeKHR presentMode0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkPresentModeKHR) (_obj.VkPresentModeKHR);
	 */

	/**
	 * native Set method for field clipped
	 * Prototype: VkBool32  clipped
	 */ 
	 private static native void clipped0(ByteBuffer ptr, boolean _clipped);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.clipped = (VkBool32) (_clipped);
	  */

	/**
	 * get method for field clipped
	 * Prototype: VkBool32  clipped
	 */ 
	 private static native boolean clipped0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field oldSwapchain
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 private static native void oldSwapchain0(ByteBuffer ptr, VkSwapchainKHR _oldSwapchain);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.oldSwapchain = (VkSwapchainKHR) (_oldSwapchain);
	  */

	/**
	 * get method for field oldSwapchain
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 private static native VkSwapchainKHR oldSwapchain0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkSwapchainKHR) (_obj.VkSwapchainKHR);
	 */



} // end of class VkSwapchainCreateInfoKHR
