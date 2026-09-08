package net.kconlac.extraindeco.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import net.kconlac.extraindeco.block.StationbenchBlock;

public class SeatEntity extends Entity {
	public SeatEntity(EntityType<? extends SeatEntity> type, Level level) {
		super(type, level);
		this.noPhysics = true;
		this.setNoGravity(true);
	}

	public SeatEntity(Level level, BlockPos pos, double seatHeight, float yaw) {
		this(ExtraindecoModEntities.SEAT, level);
		this.setPos(pos.getX() + 0.5, pos.getY() + seatHeight, pos.getZ() + 0.5);
		this.setYRot(yaw);
		this.yRotO = yaw;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide())
			return;
		if (this.getPassengers().isEmpty() || !(this.level().getBlockState(this.blockPosition()).getBlock() instanceof StationbenchBlock))
			this.discard();
	}

	@Override
	protected Vec3 getPassengerAttachmentPoint(Entity passenger, EntityDimensions dimensions, float scale) {
		return Vec3.ZERO;
	}

	@Override
	public boolean isPickable() {
		return false;
	}

	@Override
	public boolean canBeCollidedWith() {
		return false;
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
	}

	@Override
	protected void readAdditionalSaveData(CompoundTag tag) {
	}

	@Override
	protected void addAdditionalSaveData(CompoundTag tag) {
	}
}
