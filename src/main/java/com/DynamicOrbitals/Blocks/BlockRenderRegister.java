package com.DynamicOrbitals.Blocks;

import com.DynamicOrbitals.DynamicOrbitals;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {

	public static void registerBlockRenderer() {
		reg(ModBlocks.dynamicOrbital);
	}

	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(DynamicOrbitals.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

}
