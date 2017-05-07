package com.DynamicOrbitals;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

    public static Block dynamicOrbital;

	public static void createBlocks(){
        dynamicOrbital = new BlockDynamicOrbital(Material.ROCK).setCreativeTab(CreativeTabs.TOOLS).setRegistryName("dynamicorbital").setUnlocalizedName("dynamicorbital");

        GameRegistry.register(dynamicOrbital);
        GameRegistry.register(new ItemBlock(dynamicOrbital).setRegistryName(dynamicOrbital.getRegistryName()));
	}

	public static void registerTileEntities(){
		TileEntity.addMapping(TileEntityDynamicOrbital.class, "dynamicorbitaltileentity");
	}
}
