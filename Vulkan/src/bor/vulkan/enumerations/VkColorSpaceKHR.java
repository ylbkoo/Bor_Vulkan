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
 * Class to wrap Vulkan enumeration VkColorSpaceKHR
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkColorSpaceKHR {
 *     VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = 0,
 *     VK_COLOR_SPACE_BEGIN_RANGE_KHR = VK_COLOR_SPACE_SRGB_NONLINEAR_KHR,
 *     VK_COLOR_SPACE_END_RANGE_KHR = VK_COLOR_SPACE_SRGB_NONLINEAR_KHR,
 *     VK_COLOR_SPACE_RANGE_SIZE_KHR = (VK_COLOR_SPACE_SRGB_NONLINEAR_KHR - VK_COLOR_SPACE_SRGB_NONLINEAR_KHR + 1),
 *     VK_COLOR_SPACE_MAX_ENUM_KHR = 0x7FFFFFFF
 * } VkColorSpaceKHR;
 * </pre>
 * @author Alessandro Borges
 */
public class VkColorSpaceKHR extends IntEnum<VkColorSpaceKHR> {


   /** class */
   private static final Class<VkColorSpaceKHR> myClass = VkColorSpaceKHR.class;

   /** values */
   private static VkColorSpaceKHR[] values = new VkColorSpaceKHR[1];

   public static final VkColorSpaceKHR VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = new VkColorSpaceKHR("VK_COLOR_SPACE_SRGB_NONLINEAR_KHR", 0, 0);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkColorSpaceKHR[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkColorSpaceKHR> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkColorSpaceKHR or(VkColorSpaceKHR...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkColorSpaceKHR item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkColorSpaceKHR ored = new VkColorSpaceKHR(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkColorSpaceKHR from value. NULL if it is invalid value.
     */
    public static VkColorSpaceKHR fromValue(int value){
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
        VkColorSpaceKHR flag = new VkColorSpaceKHR(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkColorSpaceKHR from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkColorSpaceKHR array with matching values
     */
    public static VkColorSpaceKHR[] fromValues(VkColorSpaceKHR[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkColorSpaceKHR[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkColorSpaceKHR.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkColorSpaceKHR flagA, VkColorSpaceKHR flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkColorSpaceKHR(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkColorSpaceKHR
