package com.DynamicOrbitals;

import javax.annotation.Nullable;

import ValkyrienWarfareBase.ValkyrienWarfareMod;
import ValkyrienWarfareBase.PhysicsManagement.PhysicsWrapperEntity;
import ValkyrienWarfareBase.PhysicsManagement.ShipType;
import ValkyrienWarfareBase.Relocation.DetectorManager;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDynamicOrbital extends Block implements ITileEntityProvider{

	public BlockDynamicOrbital(Material materialIn) {
		super(materialIn);
	}

	@Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		PhysicsWrapperEntity shipOn = ValkyrienWarfareMod.physicsManager.getObjectManagingPos(worldIn, pos);
		if(shipOn != null){
			//Or open the GUI
			return false;
		}

		if(!worldIn.isRemote){
			PhysicsWrapperEntity newShip = new PhysicsWrapperEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn, DetectorManager.DetectorIDs.SingleBlockPosFinder.ordinal(), ShipType.Oribtal);
			worldIn.spawnEntityInWorld(newShip);
			return true;
		}

		return false;
    }

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityDynamicOrbital(worldIn, meta);
	}

}
