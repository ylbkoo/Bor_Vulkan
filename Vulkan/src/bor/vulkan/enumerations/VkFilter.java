/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkFilter
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkFilter {
 *     VK_FILTER_NEAREST = 0,
 *     VK_FILTER_LINEAR = 1,
 *     VK_FILTER_BEGIN_RANGE = VK_FILTER_NEAREST,
 *     VK_FILTER_END_RANGE = VK_FILTER_LINEAR,
 *     VK_FILTER_RANGE_SIZE = (VK_FILTER_LINEAR - VK_FILTER_NEAREST + 1),
 *     VK_FILTER_MAX_ENUM = 0x7FFFFFFF
 * } VkFilter;
 * </pre>
 * @author Alessandro Borges
 */
public class VkFilter extends IntEnum<VkFilter> {
	public static final VkFilter VK_FILTER_NEAREST = new VkFilter("VK_FILTER_NEAREST", 0, 0);
	public static final VkFilter VK_FILTER_LINEAR = new VkFilter("VK_FILTER_LINEAR", 1, 1);
	public static final VkFilter VK_FILTER_BEGIN_RANGE = new VkFilter("VK_FILTER_BEGIN_RANGE", 2, VK_FILTER_NEAREST.getValue() );
	public static final VkFilter VK_FILTER_END_RANGE = new VkFilter("VK_FILTER_END_RANGE", 3, VK_FILTER_LINEAR.getValue() );
	public static final VkFilter VK_FILTER_RANGE_SIZE = new VkFilter("VK_FILTER_RANGE_SIZE", 4, (VK_FILTER_END_RANGE.getValue() - VK_FILTER_BEGIN_RANGE.getValue() + 1));
	public static final VkFilter VK_FILTER_MAX_ENUM = new VkFilter("VK_FILTER_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkFilter(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkFilter
