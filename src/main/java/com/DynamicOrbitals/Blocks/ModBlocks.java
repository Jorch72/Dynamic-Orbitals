package com.DynamicOrbitals.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

    public static Block dynamicOrbital;

	public static void createBlocks(){
		registerBlock(dynamicOrbital = new BlockDynamicOrbital(Material.ROCK).setCreativeTab(CreativeTabs.TOOLS).setRegistryName("dynamicorbital").setUnlocalizedName("dynamicorbital") );

	}

	private static void registerBlock(Block block){
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
}
