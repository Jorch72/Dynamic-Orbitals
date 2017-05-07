package com.DynamicOribtals.Proxy;

import com.DynamicOrbitals.BlockRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
    }

    public void init(FMLInitializationEvent e) {
    	super.init(e);
    	BlockRenderRegister.registerBlockRenderer();
    }

    public void postInit(FMLPostInitializationEvent e) {
    	super.postInit(e);
    }

}
