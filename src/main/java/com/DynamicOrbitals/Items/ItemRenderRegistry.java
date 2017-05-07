package com.DynamicOrbitals.Items;

import com.DynamicOrbitals.DynamicOrbitals;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegistry {

	public static void registerItemRenderer() {
		reg(ModItems.orbitalcontrollermatrix);
	}

	private static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(DynamicOrbitals.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
