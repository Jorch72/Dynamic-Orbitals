package com.DynamicOribtals.Proxy;

import com.DynamicOrbitals.DynamicOrbitals;
import com.DynamicOrbitals.Blocks.ModBlocks;
import com.DynamicOrbitals.GUI.ModGuiHandler;
import com.DynamicOrbitals.Items.ModItems;
import com.DynamicOrbitals.TileEntities.ModTileEntities;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModBlocks.createBlocks();
		ModItems.createItems();
		ModTileEntities.registerTileEntities();
    }

    public void init(FMLInitializationEvent e) {
    	NetworkRegistry.INSTANCE.registerGuiHandler(DynamicOrbitals.instance, new ModGuiHandler());
    }

    public void postInit(FMLPostInitializationEvent e) {

    }

    public void openOrbitalControllerGui(){

    }

}
