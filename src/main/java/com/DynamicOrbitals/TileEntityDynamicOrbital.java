package com.DynamicOrbitals;

import ValkyrienWarfareBase.ValkyrienWarfareMod;
import ValkyrienWarfareBase.API.Vector;
import ValkyrienWarfareBase.Physics.PhysicsCalculationsOrbital;
import ValkyrienWarfareBase.PhysicsManagement.PhysicsWrapperEntity;
import ValkyrienWarfareBase.PhysicsManagement.ShipType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.world.World;

public class TileEntityDynamicOrbital extends TileEntity implements ITickable {

	public TileEntityDynamicOrbital(World world, int meta){
		this();
		this.setWorldObj(world);
	}

	public TileEntityDynamicOrbital(){
		super();
	}

	@Override
    public void update(){
		if(!worldObj.isRemote){
			PhysicsWrapperEntity wrapper = ValkyrienWarfareMod.physicsManager.getObjectManagingPos(getWorld(), getPos());

			if(wrapper != null){
//				System.out.println("test");

				if(wrapper.wrapping.shipType == ShipType.Oribtal){
					PhysicsCalculationsOrbital orbitalPhysics = (PhysicsCalculationsOrbital) wrapper.wrapping.physicsProcessor;

//					orbitalPhysics.setLinearVel(new Vector(1.5,0,0));

//					System.out.println(wrapper.yaw);

//					wrapper.yaw++;
//					orbitalPhysics.setAngularVel(new Vector(0, 100, 50));

//					wrapper.wrapping.coordTransform.updateAllTransforms();
				}
			}
		}
    }

}
