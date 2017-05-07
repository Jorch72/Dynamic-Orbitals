package com.DynamicOrbitals.TileEntities;

import net.minecraft.tileentity.TileEntity;

public class ModTileEntities {

	public static void registerTileEntities(){
		TileEntity.addMapping(TileEntityDynamicOrbital.class, "dynamicorbitaltileentity");
	}

}
