package com.DynamicOribtals.Proxy;

import com.DynamicOrbitals.Blocks.BlockRenderRegister;
import com.DynamicOrbitals.GUI.GuiControllerMatrix;
import com.DynamicOrbitals.Items.ItemRenderRegistry;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
    }

	@Override
    public void init(FMLInitializationEvent e) {
    	super.init(e);
    	BlockRenderRegister.registerBlockRenderer();
    	ItemRenderRegistry.registerItemRenderer();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
    	super.postInit(e);
    }

    @Override
    public void openOrbitalControllerGui(){
    	Minecraft.getMinecraft().displayGuiScreen(new GuiControllerMatrix());
    }

}
