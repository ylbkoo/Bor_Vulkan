/**
 * Class wrapping Vulkan's VkInstanceCreateInfo struct.
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
 *  This class is a Java front end for struct VkInstanceCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkInstanceCreateInfo {
 *     VkStructureType             sType;
 *     const void*                 pNext;
 *     VkInstanceCreateFlags       flags;
 *     const VkApplicationInfo*    pApplicationInfo;
 *     uint32_t                    enabledLayerCount;
 *     const char* const*          ppEnabledLayerNames;
 *     uint32_t                    enabledExtensionCount;
 *     const char* const*          ppEnabledExtensionNames;
 * } VkInstanceCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkInstanceCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [2]  */
	 private static final String TAG = "VkInstanceCreateInfo";

	/** ID of this structure [2]  */
	 public static final int TAG_ID = VKINSTANCECREATEINFO_ID;

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
	 *  VkInstanceCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  const VkApplicationInfo* 	pApplicationInfo	[vkstruct]
	 */ 
	VkApplicationInfo  	pApplicationInfo;
	
	/**
	 *  uint32_t 	enabledLayerCount	[int]
	 */ 
	int 	enabledLayerCount;
	
	/**
	 *  const char* const* 	ppEnabledLayerNames	[string]
	 */ 
	String[] 	ppEnabledLayerNames;
	
	/**
	 *  uint32_t 	enabledExtensionCount	[int]
	 */ 
	int 	enabledExtensionCount;
	
	/**
	 *  const char* const* 	ppEnabledExtensionNames	[string]
	 */ 
	String[] 	ppEnabledExtensionNames;
	/**
	 * Ctor
	 */
	public VkInstanceCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkInstanceCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkInstanceCreateInfo(long address){ 
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
	 public static VkArray<VkInstanceCreateInfo> createVkArray(int size){ 
		 VkInstanceCreateInfo[] array = new VkInstanceCreateInfo[size]; 
		 VkArrayStruct<VkInstanceCreateInfo> vkArray = new VkArrayStruct<VkInstanceCreateInfo>(array, TAG_ID);
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
	 public VkInstanceCreateInfo sType(VkStructureType sType){
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
	 public VkInstanceCreateInfo pNext(VkObject pNext){
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkInstanceCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 * 
	 * @param pApplicationInfo - a instance of VkApplicationInfo.
	 * @return this VkStruct instance.
	 */ 
	 public VkInstanceCreateInfo pApplicationInfo(VkApplicationInfo pApplicationInfo){
		 this.pApplicationInfo = pApplicationInfo;
		 ByteBuffer buff = (pApplicationInfo==null) ? null : pApplicationInfo.getPointer();
		 setPApplicationInfo0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 public VkApplicationInfo pApplicationInfo(){
		 long pointer = getPApplicationInfo0(super.ptr);
		 if(pointer == 0){
		    this.pApplicationInfo = null;
		    return null;
		  } 

		 if(this.pApplicationInfo == null){
		    this.pApplicationInfo = new VkApplicationInfo(pointer);
		 }else{
		    this.pApplicationInfo.setPointer(pointer);
		  }
		 return this.pApplicationInfo;
	 }

	/**
	 * Set method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 * 
	 * @param enabledLayerCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkInstanceCreateInfo enabledLayerCount(int enabledLayerCount){
		 this.enabledLayerCount = enabledLayerCount;
		 setEnabledLayerCount0(this.ptr,  enabledLayerCount);
		 return this;
	 }

	/**
	 * Get method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public int enabledLayerCount(){
		 int var = getEnabledLayerCount0(super.ptr);
		 this.enabledLayerCount = var;
		 return this.enabledLayerCount;
	 }

// #Included setPpEnabledLayerNames
    /**
     * Set method for field ppEnabledLayerNames [string]<br>
     * Prototype: const char* const*  ppEnabledLayerNames
     * 
     * @param ppEnabledLayerNames - a instance of String[].
     * @return this VkStruct instance.
     */ 
     public VkInstanceCreateInfo ppEnabledLayerNames(String[] ppEnabledLayerNames){
         this.ppEnabledLayerNames = ppEnabledLayerNames == null ? null
                                    : ppEnabledLayerNames.clone();
         setPpEnabledLayerNames0(this.ptr,  ppEnabledLayerNames);
         return this;
     }


//#END Set Included

// #Included getPpEnabledLayerNames0
    /**
     * Get method for field ppEnabledLayerNames [string]<br>
     * Prototype: const char* const*  ppEnabledLayerNames
     */ 
     public String[] ppEnabledLayerNames(){
             int size = getEnabledLayerCount0(ptr);
             if(ppEnabledLayerNames==null || ppEnabledLayerNames.length != size){
                 ppEnabledLayerNames = new String[size];
             }
         getPpEnabledLayerNames0(super.ptr, ppEnabledLayerNames);        
         return this.ppEnabledLayerNames;
     }


//#END get

	/**
	 * Set method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 * 
	 * @param enabledExtensionCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkInstanceCreateInfo enabledExtensionCount(int enabledExtensionCount){
		 this.enabledExtensionCount = enabledExtensionCount;
		 setEnabledExtensionCount0(this.ptr,  enabledExtensionCount);
		 return this;
	 }

	/**
	 * Get method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public int enabledExtensionCount(){
		 int var = getEnabledExtensionCount0(super.ptr);
		 this.enabledExtensionCount = var;
		 return this.enabledExtensionCount;
	 }

// #Included setPpEnabledExtensionNames
    /**
     * Set method for field ppEnabledExtensionNames [string_arr]<br>
     * Prototype: const char* const*  ppEnabledExtensionNames
     */ 
     public VkInstanceCreateInfo ppEnabledExtensionNames(String[] ppEnabledExtensionNames){
         this.ppEnabledExtensionNames = ppEnabledExtensionNames == null ?  null 
                                        : ppEnabledExtensionNames.clone();
         setPpEnabledExtensionNames0(this.ptr,  this.ppEnabledExtensionNames);
         return this;
     }


//#END Set Included

// #Included getPpEnabledExtensionNames0
  /**
   * Get method for field ppEnabledExtensionNames [string_arr]<br>
   * Prototype: const char* const*  ppEnabledExtensionNames
   */ 
     public String[] ppEnabledExtensionNames(){
            int size = getEnabledExtensionCount0(ptr);
            if(size==0){
                ppEnabledExtensionNames = null;
                return null;
            }
            if(ppEnabledExtensionNames==null || ppEnabledExtensionNames.length != size){
                ppEnabledExtensionNames = new String[size];
            }
        getPpEnabledExtensionNames0(super.ptr, ppEnabledExtensionNames);        
        return this.ppEnabledExtensionNames;
     }  
        

//#END get


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkInstanceCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n pApplicationInfo: ")
				.append(pApplicationInfo() )
				.append(",\n enabledLayerCount: ")
				.append(enabledLayerCount() )
				.append(",\n ppEnabledLayerNames: ")
				.append(Arrays.toString(ppEnabledLayerNames()) )
				.append(",\n enabledExtensionCount: ")
				.append(enabledExtensionCount() )
				.append(",\n ppEnabledExtensionNames: ")
				.append(Arrays.toString(ppEnabledExtensionNames()) )
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
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkInstanceCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 private static native void setPApplicationInfo0(Buffer ptr, java.nio.ByteBuffer  _pApplicationInfo);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkApplicationInfo* p_pApplicationInfo = ( VkApplicationInfo*) _pApplicationInfo; 
		 vkObj->pApplicationInfo = p_pApplicationInfo; 
	  */

	/**
	 * Native GET method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 private static native long getPApplicationInfo0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pApplicationInfo);
	 */

	/**
	 * Native SET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native void setEnabledLayerCount0(Buffer ptr, int _enabledLayerCount);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  */

	/**
	 * Native GET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native int getEnabledLayerCount0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 */

    /**
     * native SET method for field ppEnabledLayerNames  [string_arr]<br>
     * Prototype: const char* const*  ppEnabledLayerNames
     */ 
     private static native void setPpEnabledLayerNames0(Buffer ptr, String[] enabledLayerNames);/*
              VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
              if(enabledLayerNames==NULL){
                 vkObj->enabledLayerCount = 0;
                 vkObj->ppEnabledLayerNames = NULL;
                 return;
              }
              int stringCount =  env->GetArrayLength(enabledLayerNames);
              const char** enabledLayers = CALLOC(stringCount, const char*);
                  
              for (int i=0; i<stringCount; i++) {
                   jstring string = (jstring) env->GetObjectArrayElement(enabledLayerNames, i);
                   const char* rawString = env->GetStringUTFChars(string, 0);                          
                   enabledLayers[i] = cloneStr(rawString);
                   env->ReleaseStringUTFChars(string, rawString);
               }                   
              vkObj->enabledLayerCount = stringCount;
              vkObj->ppEnabledLayerNames = enabledLayers;        
      */

   /**
     * native GET method for field ppEnabledLayerNames  [string_arr]<br>
     * Prototype: const char* const*  ppEnabledLayerNames
     */ 
     private static native void getPpEnabledLayerNames0(Buffer ptr, String[] names);/*
          if(names == NULL) 
                    return;              
          VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);                 
          int count = MIN((int)vkObj->enabledLayerCount, env->GetArrayLength(names)) ;
          if(count > 0){
            for(int i = 0; i<count; i++){
                env->SetObjectArrayElement(names, 
                                           i,
                                           env->NewStringUTF(vkObj->ppEnabledLayerNames[i]));
             }//for                      
           }//if count
           
           return; 
     */

	/**
	 * Native SET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native void setEnabledExtensionCount0(Buffer ptr, int _enabledExtensionCount);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  */

	/**
	 * Native GET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native int getEnabledExtensionCount0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 */

    /**
     * native SET method for field ppEnabledExtensionNames  [string_arr]<br>
     * Prototype: const char* const*  ppEnabledExtensionNames
     */ 
     private static native void setPpEnabledExtensionNames0(Buffer ptr, String[] enabledExtensionNames);/*
          VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
          if(enabledExtensionNames == NULL){
            vkObj->ppEnabledExtensionNames = NULL;
            vkObj->enabledExtensionCount = 0;
            return;
          }          
          
          int stringCount = env->GetArrayLength(enabledExtensionNames);                   
          const char** enabledExtensions =  CALLOC(stringCount, const char*);
                            
          for (int i=0; i<stringCount; i++) {
               jstring string = (jstring) env->GetObjectArrayElement(enabledExtensionNames, i);
               const char* rawString = env->GetStringUTFChars(string, 0); 
               enabledExtensions[i] = cloneStr(rawString);                          
               env->ReleaseStringUTFChars(string, rawString);
           }
           vkObj->ppEnabledExtensionNames = enabledExtensions;  
           vkObj->enabledExtensionCount = (uint32_t)stringCount;              
      */

    /**
     * native GET method for field ppEnabledExtensionNames  [string_arr]<br>
     * Prototype: const char* const*  ppEnabledExtensionNames
     */ 
     private static native void getPpEnabledExtensionNames0(Buffer ptr, String[] ext);/*
        if(ext==NULL){
          return ;
         }   
         VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
         int count = MIN((int) vkObj->enabledExtensionCount, env->GetArrayLength(ext)); 
            
         for(int i = 0; i < count; i++){
             const char* extName =  vkObj->ppEnabledExtensionNames[i];
             env->SetObjectArrayElement(ext, 
                                      i,
                                      env->NewStringUTF(extName));                                    
          }//for
        
    */             





} // end of class VkInstanceCreateInfo
