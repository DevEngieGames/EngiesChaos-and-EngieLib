package engiegames.engies_chaos.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;

import javax.annotation.Nullable;

import engiegames.engies_chaos.procedures.NegativeDifficultyAICheckProcedure;
import engiegames.engies_chaos.procedures.MobHitboxScalingProcedure;
import engiegames.engies_chaos.procedures.HostileEngieSpawningConditionProcedure;
import engiegames.engies_chaos.procedures.EnragedEngieTickProcedure;
import engiegames.engies_chaos.procedures.EnragedEngieOnInitialEntitySpawnProcedure;
import engiegames.engies_chaos.procedures.DoomsDayMobsFightEachotherToggleProcedure;
import engiegames.engies_chaos.procedures.AnyEngieDiesAddCountProcedure;
import engiegames.engies_chaos.init.EngiesChaosModEntities;

public class EnragedEngieEntity extends Monster {
	public static final EntityDataAccessor<Boolean> DATA_coldseasoned = SynchedEntityData.defineId(EnragedEngieEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_holloweened = SynchedEntityData.defineId(EnragedEngieEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_style = SynchedEntityData.defineId(EnragedEngieEntity.class, EntityDataSerializers.INT);

	public EnragedEngieEntity(EntityType<EnragedEngieEntity> type, Level world) {
		super(type, world);
		xpReward = 25;
		setNoAi(false);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_coldseasoned, false);
		builder.define(DATA_holloweened, false);
		builder.define(DATA_style, 1);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.95, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, true, false) {
			@Override
			public boolean canUse() {
				double x = EnragedEngieEntity.this.getX();
				double y = EnragedEngieEntity.this.getY();
				double z = EnragedEngieEntity.this.getZ();
				Entity entity = EnragedEngieEntity.this;
				Level world = EnragedEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EnragedEngieEntity.this.getX();
				double y = EnragedEngieEntity.this.getY();
				double z = EnragedEngieEntity.this.getZ();
				Entity entity = EnragedEngieEntity.this;
				Level world = EnragedEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, false) {
			@Override
			public boolean canUse() {
				double x = EnragedEngieEntity.this.getX();
				double y = EnragedEngieEntity.this.getY();
				double z = EnragedEngieEntity.this.getZ();
				Entity entity = EnragedEngieEntity.this;
				Level world = EnragedEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EnragedEngieEntity.this.getX();
				double y = EnragedEngieEntity.this.getY();
				double z = EnragedEngieEntity.this.getZ();
				Entity entity = EnragedEngieEntity.this;
				Level world = EnragedEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Monster.class, true, false) {
			@Override
			public boolean canUse() {
				double x = EnragedEngieEntity.this.getX();
				double y = EnragedEngieEntity.this.getY();
				double z = EnragedEngieEntity.this.getZ();
				Entity entity = EnragedEngieEntity.this;
				Level world = EnragedEngieEntity.this.level();
				return super.canUse() && DoomsDayMobsFightEachotherToggleProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EnragedEngieEntity.this.getX();
				double y = EnragedEngieEntity.this.getY();
				double z = EnragedEngieEntity.this.getZ();
				Entity entity = EnragedEngieEntity.this;
				Level world = EnragedEngieEntity.this.level();
				return super.canContinueToUse() && DoomsDayMobsFightEachotherToggleProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = EnragedEngieEntity.this.getX();
				double y = EnragedEngieEntity.this.getY();
				double z = EnragedEngieEntity.this.getZ();
				Entity entity = EnragedEngieEntity.this;
				Level world = EnragedEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EnragedEngieEntity.this.getX();
				double y = EnragedEngieEntity.this.getY();
				double z = EnragedEngieEntity.this.getZ();
				Entity entity = EnragedEngieEntity.this;
				Level world = EnragedEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = EnragedEngieEntity.this.getX();
				double y = EnragedEngieEntity.this.getY();
				double z = EnragedEngieEntity.this.getZ();
				Entity entity = EnragedEngieEntity.this;
				Level world = EnragedEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EnragedEngieEntity.this.getX();
				double y = EnragedEngieEntity.this.getY();
				double z = EnragedEngieEntity.this.getZ();
				Entity entity = EnragedEngieEntity.this;
				Level world = EnragedEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(8, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(10, new FloatGoal(this));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		AnyEngieDiesAddCountProcedure.execute(this, source.getEntity());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, EntitySpawnReason reason, @Nullable SpawnGroupData livingdata) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
		EnragedEngieOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Datacoldseasoned", this.entityData.get(DATA_coldseasoned));
		compound.putBoolean("Dataholloweened", this.entityData.get(DATA_holloweened));
		compound.putInt("Datastyle", this.entityData.get(DATA_style));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datacoldseasoned"))
			this.entityData.set(DATA_coldseasoned, compound.getBoolean("Datacoldseasoned"));
		if (compound.contains("Dataholloweened"))
			this.entityData.set(DATA_holloweened, compound.getBoolean("Dataholloweened"));
		if (compound.contains("Datastyle"))
			this.entityData.set(DATA_style, compound.getInt("Datastyle"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		EnragedEngieTickProcedure.execute(this.level(), this);
		this.refreshDimensions();
	}

	@Override
	public EntityDimensions getDefaultDimensions(Pose pose) {
		Entity entity = this;
		Level world = this.level();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		return super.getDefaultDimensions(pose).scale((float) MobHitboxScalingProcedure.execute());
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(EngiesChaosModEntities.ENRAGED_ENGIE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return HostileEngieSpawningConditionProcedure.execute(world);
		}, RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 300);
		builder = builder.add(Attributes.ARMOR, 5);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 25);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}