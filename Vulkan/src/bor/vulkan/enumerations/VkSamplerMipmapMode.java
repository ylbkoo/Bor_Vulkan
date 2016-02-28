/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkSamplerMipmapMode
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSamplerMipmapMode {
 *     VK_SAMPLER_MIPMAP_MODE_NEAREST = 0,
 *     VK_SAMPLER_MIPMAP_MODE_LINEAR = 1,
 *     VK_SAMPLER_MIPMAP_MODE_BEGIN_RANGE = VK_SAMPLER_MIPMAP_MODE_NEAREST,
 *     VK_SAMPLER_MIPMAP_MODE_END_RANGE = VK_SAMPLER_MIPMAP_MODE_LINEAR,
 *     VK_SAMPLER_MIPMAP_MODE_RANGE_SIZE = (VK_SAMPLER_MIPMAP_MODE_LINEAR - VK_SAMPLER_MIPMAP_MODE_NEAREST + 1),
 *     VK_SAMPLER_MIPMAP_MODE_MAX_ENUM = 0x7FFFFFFF
 * } VkSamplerMipmapMode;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSamplerMipmapMode extends IntEnum<VkSamplerMipmapMode> {
	public static final VkSamplerMipmapMode VK_SAMPLER_MIPMAP_MODE_NEAREST = new VkSamplerMipmapMode("VK_SAMPLER_MIPMAP_MODE_NEAREST", 0, 0);
	public static final VkSamplerMipmapMode VK_SAMPLER_MIPMAP_MODE_LINEAR = new VkSamplerMipmapMode("VK_SAMPLER_MIPMAP_MODE_LINEAR", 1, 1);
	public static final VkSamplerMipmapMode VK_SAMPLER_MIPMAP_MODE_BEGIN_RANGE = new VkSamplerMipmapMode("VK_SAMPLER_MIPMAP_MODE_BEGIN_RANGE", 2, VK_SAMPLER_MIPMAP_MODE_NEAREST.getValue() );
	public static final VkSamplerMipmapMode VK_SAMPLER_MIPMAP_MODE_END_RANGE = new VkSamplerMipmapMode("VK_SAMPLER_MIPMAP_MODE_END_RANGE", 3, VK_SAMPLER_MIPMAP_MODE_LINEAR.getValue() );
	public static final VkSamplerMipmapMode VK_SAMPLER_MIPMAP_MODE_RANGE_SIZE = new VkSamplerMipmapMode("VK_SAMPLER_MIPMAP_MODE_RANGE_SIZE", 4, (VK_SAMPLER_MIPMAP_MODE_END_RANGE.getValue() - VK_SAMPLER_MIPMAP_MODE_BEGIN_RANGE.getValue() + 1));
	public static final VkSamplerMipmapMode VK_SAMPLER_MIPMAP_MODE_MAX_ENUM = new VkSamplerMipmapMode("VK_SAMPLER_MIPMAP_MODE_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkSamplerMipmapMode(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSamplerMipmapMode
