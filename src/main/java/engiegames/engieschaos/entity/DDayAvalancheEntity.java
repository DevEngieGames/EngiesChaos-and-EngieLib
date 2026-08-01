package engiegames.engieschaos.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import javax.annotation.Nullable;

import engiegames.engieschaos.procedures.ReturnAvaSizeProcedure;
import engiegames.engieschaos.procedures.DDayAvalanchePlayerCollidesWithThisEntityProcedure;
import engiegames.engieschaos.procedures.DDayAvalancheOnInitialEntitySpawnProcedure;
import engiegames.engieschaos.procedures.DDayAvalancheOnEntityTickUpdateProcedure;
import engiegames.engieschaos.init.EngiesChaosModEntities;

public class DDayAvalancheEntity extends PathfinderMob {
	public static final EntityDataAccessor<Integer> DATA_scale = SynchedEntityData.defineId(DDayAvalancheEntity.class, EntityDataSerializers.INT);

	public DDayAvalancheEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EngiesChaosModEntities.D_DAY_AVALANCHE.get(), world);
	}

	public DDayAvalancheEntity(EntityType<DDayAvalancheEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (DDayAvalancheEntity.this.isInWater())
					DDayAvalancheEntity.this.setDeltaMovement(DDayAvalancheEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !DDayAvalancheEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - DDayAvalancheEntity.this.getX();
					double dy = this.wantedY - DDayAvalancheEntity.this.getY();
					double dz = this.wantedZ - DDayAvalancheEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * DDayAvalancheEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					DDayAvalancheEntity.this.setYRot(this.rotlerp(DDayAvalancheEntity.this.getYRot(), f, 10));
					DDayAvalancheEntity.this.yBodyRot = DDayAvalancheEntity.this.getYRot();
					DDayAvalancheEntity.this.yHeadRot = DDayAvalancheEntity.this.getYRot();
					if (DDayAvalancheEntity.this.isInWater()) {
						DDayAvalancheEntity.this.setSpeed((float) DDayAvalancheEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						DDayAvalancheEntity.this.setXRot(this.rotlerp(DDayAvalancheEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(DDayAvalancheEntity.this.getXRot() * (float) (Math.PI / 180.0));
						DDayAvalancheEntity.this.setZza(f3 * f1);
						DDayAvalancheEntity.this.setYya((float) (f1 * dy));
					} else {
						DDayAvalancheEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					DDayAvalancheEntity.this.setSpeed(0);
					DDayAvalancheEntity.this.setYya(0);
					DDayAvalancheEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_scale, 3);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (damagesource.getDirectEntity() instanceof Player)
			return false;
		if (damagesource.getDirectEntity() instanceof ThrownPotion || damagesource.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (damagesource == DamageSource.FALL)
			return false;
		if (damagesource == DamageSource.CACTUS)
			return false;
		if (damagesource == DamageSource.DROWN)
			return false;
		if (damagesource == DamageSource.LIGHTNING_BOLT)
			return false;
		if (damagesource.isExplosion())
			return false;
		if (damagesource.getMsgId().equals("trident"))
			return false;
		if (damagesource == DamageSource.ANVIL)
			return false;
		if (damagesource == DamageSource.DRAGON_BREATH)
			return false;
		if (damagesource == DamageSource.WITHER || damagesource.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion() {
		return true;
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		DDayAvalancheOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Datascale", this.entityData.get(DATA_scale));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datascale"))
			this.entityData.set(DATA_scale, compound.getInt("Datascale"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		DDayAvalancheOnEntityTickUpdateProcedure.execute(this.level, this);
		this.refreshDimensions();
	}

	@Override
	public void playerTouch(Player sourceentity) {
		super.playerTouch(sourceentity);
		DDayAvalanchePlayerCollidesWithThisEntityProcedure.execute(this.level, sourceentity);
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity entity = this;
		return true;
	}

	@Override
	public boolean isPushedByFluid() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity entity = this;
		return false;
	}

	@Override
	public boolean canCollideWith(Entity entity) {
		return true;
	}

	@Override
	public boolean canBeCollidedWith() {
		return true;
	}

	@Override
	public EntityDimensions getDimensions(Pose pose) {
		Entity entity = this;
		Level world = this.level;
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		return super.getDimensions(pose).scale((float) ReturnAvaSizeProcedure.execute(entity));
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 1024);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0);
		return builder;
	}
}