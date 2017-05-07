package com.DynamicOrbitals.Items;

import com.DynamicOrbitals.DynamicOrbitals;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemOrbitalControllerMatrix extends Item {

	public ItemOrbitalControllerMatrix(String unlocalizedName){
		super();
		this.setUnlocalizedName(unlocalizedName);
	    this.setCreativeTab(CreativeTabs.TOOLS);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		DynamicOrbitals.proxy.openOrbitalControllerGui();
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
    }

}
