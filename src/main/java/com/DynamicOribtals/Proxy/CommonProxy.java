package com.DynamicOribtals.Proxy;

import com.DynamicOrbitals.Blocks.ModBlocks;
import com.DynamicOrbitals.Items.ModItems;
import com.DynamicOrbitals.TileEntities.ModTileEntities;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModBlocks.createBlocks();
		ModItems.createItems();
		ModTileEntities.registerTileEntities();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

}
