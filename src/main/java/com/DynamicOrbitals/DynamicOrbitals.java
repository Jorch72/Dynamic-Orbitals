package com.DynamicOrbitals;

import com.DynamicOribtals.Proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = DynamicOrbitals.MODID, version = DynamicOrbitals.VERSION)
public class DynamicOrbitals
{
	@SidedProxy(clientSide="com.DynamicOribtals.Proxy.ClientProxy", serverSide="com.DynamicOrbitals.Proxy.CommonProxy")
	public static CommonProxy proxy;

    public static final String MODID = "dynamic_orbitals";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        ModBlocks.createBlocks();
        ModBlocks.registerTileEntities();

    	proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
