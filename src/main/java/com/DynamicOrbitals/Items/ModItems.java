package com.DynamicOrbitals.Items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item orbitalcontrollermatrix;

	public static void createItems(){
		registerItem(orbitalcontrollermatrix = new ItemOrbitalControllerMatrix("orbitalcontrollermatrix"), "orbitalcontrollermatrix");

	}

	private static void registerItem(Item item, String registryName){
		item.setRegistryName(registryName);
		GameRegistry.register(item);
	}

}
