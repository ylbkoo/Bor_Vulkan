/**
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkCommandBufferLevel
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCommandBufferLevel {
 *     VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0,
 *     VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1,
 *     VK_COMMAND_BUFFER_LEVEL_BEGIN_RANGE = VK_COMMAND_BUFFER_LEVEL_PRIMARY,
 *     VK_COMMAND_BUFFER_LEVEL_END_RANGE = VK_COMMAND_BUFFER_LEVEL_SECONDARY,
 *     VK_COMMAND_BUFFER_LEVEL_RANGE_SIZE = (VK_COMMAND_BUFFER_LEVEL_SECONDARY - VK_COMMAND_BUFFER_LEVEL_PRIMARY + 1),
 *     VK_COMMAND_BUFFER_LEVEL_MAX_ENUM = 0x7FFFFFFF
 * } VkCommandBufferLevel;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCommandBufferLevel extends IntEnum<VkCommandBufferLevel> {


   /** class */
   private static final Class<VkCommandBufferLevel> myClass = VkCommandBufferLevel.class;

   /** values */
   private static VkCommandBufferLevel[] values = new VkCommandBufferLevel[2];

   public static final VkCommandBufferLevel VK_COMMAND_BUFFER_LEVEL_PRIMARY = new VkCommandBufferLevel("VK_COMMAND_BUFFER_LEVEL_PRIMARY", 0, 0);
   public static final VkCommandBufferLevel VK_COMMAND_BUFFER_LEVEL_SECONDARY = new VkCommandBufferLevel("VK_COMMAND_BUFFER_LEVEL_SECONDARY", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkCommandBufferLevel[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkCommandBufferLevel> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkCommandBufferLevel or(VkCommandBufferLevel...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkCommandBufferLevel item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkCommandBufferLevel ored = new VkCommandBufferLevel(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkCommandBufferLevel from value. NULL if it is invalid value.
     */
    public static VkCommandBufferLevel fromValue(int value){
        //simple case
        for (int i = 0; i < values.length; i++) {
            if(value==values[i].getValue()){
                return values[i];
            }
        }
        //ORed values        
        int test = value;
        for (int i = 0; i < values.length; i++) {
            int v = values[i].getValue();
            if((test & v) != v){
                return null;
            }
        }
        String name = myGetClass().getSimpleName() + " from value [" + value +"]";
        VkCommandBufferLevel flag = new VkCommandBufferLevel(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkCommandBufferLevel from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkCommandBufferLevel array with matching values
     */
    public static VkCommandBufferLevel[] fromValues(VkCommandBufferLevel[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkCommandBufferLevel[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkCommandBufferLevel.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkCommandBufferLevel flagA, VkCommandBufferLevel flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkCommandBufferLevel(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkCommandBufferLevel
