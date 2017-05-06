package com.DynamicOribtals;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = DynamicOrbitals.MODID, version = DynamicOrbitals.VERSION)
public class DynamicOrbitals
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static Block dynamicOrbital;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
        dynamicOrbital = new BlockDynamicOrbital(Material.ROCK).setCreativeTab(CreativeTabs.TOOLS).setRegistryName("dynamicorbital").setUnlocalizedName("dynamicorbital");

        GameRegistry.register(dynamicOrbital);
        GameRegistry.register(new ItemBlock(dynamicOrbital).setRegistryName(dynamicOrbital.getRegistryName()));
    }
}
