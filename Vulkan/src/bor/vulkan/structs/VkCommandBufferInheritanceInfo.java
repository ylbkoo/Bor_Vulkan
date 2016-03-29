/**
 * Class wrapping Vulkan's VkCommandBufferInheritanceInfo struct.
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
 *  This class is a Java front end for struct VkCommandBufferInheritanceInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkCommandBufferInheritanceInfo {
 *     VkStructureType                  sType;
 *     const void*                      pNext;
 *     VkRenderPass                     renderPass;
 *     uint32_t                         subpass;
 *     VkFramebuffer                    framebuffer;
 *     VkBool32                         occlusionQueryEnable;
 *     VkQueryControlFlags              queryFlags;
 *     VkQueryPipelineStatisticFlags    pipelineStatistics;
 * } VkCommandBufferInheritanceInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkCommandBufferInheritanceInfo extends VkStruct {
	/** TAG of this structure [88]  */
	 private static final String TAG = "VkCommandBufferInheritanceInfo";

	/** ID of this structure [88]  */
	 public static final int TAG_ID = VKCOMMANDBUFFERINHERITANCEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkCommandBufferInheritanceInfo> p;

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
	 *  VkRenderPass 	renderPass	[vkhandle]
	 */ 
	 VkRenderPass 	renderPass;

	/**
	 *  uint32_t 	subpass	[int]
	 */ 
	 int 	subpass;

	/**
	 *  VkFramebuffer 	framebuffer	[vkhandle]
	 */ 
	 VkFramebuffer 	framebuffer;

	/**
	 *  VkBool32 	occlusionQueryEnable	[boolean]
	 */ 
	 boolean 	occlusionQueryEnable;

	/**
	 *  VkQueryControlFlags 	queryFlags	[int]
	 */ 
	 int 	queryFlags;

	/**
	 *  VkQueryPipelineStatisticFlags 	pipelineStatistics	[int]
	 */ 
	 int 	pipelineStatistics;

	/**
	 * Ctor
	 */
	public VkCommandBufferInheritanceInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkCommandBufferInheritanceInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkCommandBufferInheritanceInfo(long address, int memSize){ 
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
	 public static P<VkCommandBufferInheritanceInfo> createNullPointer(){
	        P<VkCommandBufferInheritanceInfo> p = new  P<VkCommandBufferInheritanceInfo>(new VkCommandBufferInheritanceInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkCommandBufferInheritanceInfo> getP() {
	       if(p == null ){
	           p = new P<VkCommandBufferInheritanceInfo> (this);
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
	 * Set method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public void renderPass(VkRenderPass renderPass){
		 this.renderPass = renderPass;
		 ByteBuffer buff = (renderPass==null) ? null : renderPass.getHandle();
		 renderPass0(this.ptr, buff);
	 }

	/**
	 * Get method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public VkRenderPass renderPass(){

		 ByteBuffer handle = renderPass0(super.ptr);
		 if(handle == null){
		    this.renderPass = null;
		    return null;
		  } else 
 		 if(this.renderPass == null){
		    this.renderPass = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.renderPass).setHandle(handle);
		  }
		 return this.renderPass;
	 }

	/**
	 * Set method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 public void subpass(int subpass){
		 this.subpass = subpass;
		 subpass0(this.ptr,  subpass);
	 }

	/**
	 * Get method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 public int subpass(){
		 int var = subpass0(super.ptr);
		 this.subpass = var;
		 return this.subpass;
	 }

	/**
	 * Set method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 public void framebuffer(VkFramebuffer framebuffer){
		 this.framebuffer = framebuffer;
		 ByteBuffer buff = (framebuffer==null) ? null : framebuffer.getHandle();
		 framebuffer0(this.ptr, buff);
	 }

	/**
	 * Get method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 public VkFramebuffer framebuffer(){

		 ByteBuffer handle = framebuffer0(super.ptr);
		 if(handle == null){
		    this.framebuffer = null;
		    return null;
		  } else 
 		 if(this.framebuffer == null){
		    this.framebuffer = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.framebuffer).setHandle(handle);
		  }
		 return this.framebuffer;
	 }

	/**
	 * Set method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 public void occlusionQueryEnable(boolean occlusionQueryEnable){
		 this.occlusionQueryEnable = occlusionQueryEnable;
		 occlusionQueryEnable0(this.ptr,  occlusionQueryEnable);
	 }

	/**
	 * Get method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 public boolean occlusionQueryEnable(){
		 boolean var = occlusionQueryEnable0(super.ptr);
		 this.occlusionQueryEnable = var;
		 return this.occlusionQueryEnable;
	 }

	/**
	 * Set method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 public void queryFlags(int queryFlags){
		 this.queryFlags = queryFlags;
		 queryFlags0(this.ptr,  queryFlags);
	 }

	/**
	 * Get method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 public int queryFlags(){
		 int var = queryFlags0(super.ptr);
		 this.queryFlags = var;
		 return this.queryFlags;
	 }

	/**
	 * Set method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 public void pipelineStatistics(int pipelineStatistics){
		 this.pipelineStatistics = pipelineStatistics;
		 pipelineStatistics0(this.ptr,  pipelineStatistics);
	 }

	/**
	 * Get method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 public int pipelineStatistics(){
		 int var = pipelineStatistics0(super.ptr);
		 this.pipelineStatistics = var;
		 return this.pipelineStatistics;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void renderPass0(Buffer ptr, java.nio.ByteBuffer  _renderPass);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * native GET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native java.nio.ByteBuffer  renderPass0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (VkRenderPass) (vkObj->renderPass);
	 */

	/**
	 * native SET method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native void subpass0(Buffer ptr, int _subpass);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  vkObj->subpass = (uint32_t) (_subpass);
	  */

	/**
	 * native GET method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native int subpass0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jint) (vkObj->subpass);
	 */

	/**
	 * native SET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native void framebuffer0(Buffer ptr, java.nio.ByteBuffer  _framebuffer);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  vkObj->framebuffer = (VkFramebuffer) (_framebuffer);
	  */

	/**
	 * native GET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native java.nio.ByteBuffer  framebuffer0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (VkFramebuffer) (vkObj->framebuffer);
	 */

	/**
	 * native SET method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 private static native void occlusionQueryEnable0(Buffer ptr, boolean _occlusionQueryEnable);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  vkObj->occlusionQueryEnable = (VkBool32) (_occlusionQueryEnable);
	  */

	/**
	 * native GET method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 private static native boolean occlusionQueryEnable0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jboolean) (vkObj->occlusionQueryEnable);
	 */

	/**
	 * native SET method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 private static native void queryFlags0(Buffer ptr, int _queryFlags);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  vkObj->queryFlags = (VkQueryControlFlags) (_queryFlags);
	  */

	/**
	 * native GET method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 private static native int queryFlags0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jint) (vkObj->queryFlags);
	 */

	/**
	 * native SET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native void pipelineStatistics0(Buffer ptr, int _pipelineStatistics);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  vkObj->pipelineStatistics = (VkQueryPipelineStatisticFlags) (_pipelineStatistics);
	  */

	/**
	 * native GET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native int pipelineStatistics0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jint) (vkObj->pipelineStatistics);
	 */



} // end of class VkCommandBufferInheritanceInfo
