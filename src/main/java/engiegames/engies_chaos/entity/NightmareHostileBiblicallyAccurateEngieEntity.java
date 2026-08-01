package engiegames.engies_chaos.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
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
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import engiegames.engies_chaos.procedures.NightmareHostileEngieySpawningConditionProcedure;
import engiegames.engies_chaos.procedures.NegativeDifficultyAICheckProcedure;
import engiegames.engies_chaos.procedures.MobHitboxScalingProcedure;
import engiegames.engies_chaos.procedures.AnyEngieDiesAddCountProcedure;
import engiegames.engies_chaos.init.EngiesChaosModEntities;

public class NightmareHostileBiblicallyAccurateEngieEntity extends Monster {
	public NightmareHostileBiblicallyAccurateEngieEntity(EntityType<NightmareHostileBiblicallyAccurateEngieEntity> type, Level world) {
		super(type, world);
		xpReward = 60;
		setNoAi(false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2.25, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, true, false) {
			@Override
			public boolean canUse() {
				double x = NightmareHostileBiblicallyAccurateEngieEntity.this.getX();
				double y = NightmareHostileBiblicallyAccurateEngieEntity.this.getY();
				double z = NightmareHostileBiblicallyAccurateEngieEntity.this.getZ();
				Entity entity = NightmareHostileBiblicallyAccurateEngieEntity.this;
				Level world = NightmareHostileBiblicallyAccurateEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = NightmareHostileBiblicallyAccurateEngieEntity.this.getX();
				double y = NightmareHostileBiblicallyAccurateEngieEntity.this.getY();
				double z = NightmareHostileBiblicallyAccurateEngieEntity.this.getZ();
				Entity entity = NightmareHostileBiblicallyAccurateEngieEntity.this;
				Level world = NightmareHostileBiblicallyAccurateEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, false) {
			@Override
			public boolean canUse() {
				double x = NightmareHostileBiblicallyAccurateEngieEntity.this.getX();
				double y = NightmareHostileBiblicallyAccurateEngieEntity.this.getY();
				double z = NightmareHostileBiblicallyAccurateEngieEntity.this.getZ();
				Entity entity = NightmareHostileBiblicallyAccurateEngieEntity.this;
				Level world = NightmareHostileBiblicallyAccurateEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = NightmareHostileBiblicallyAccurateEngieEntity.this.getX();
				double y = NightmareHostileBiblicallyAccurateEngieEntity.this.getY();
				double z = NightmareHostileBiblicallyAccurateEngieEntity.this.getZ();
				Entity entity = NightmareHostileBiblicallyAccurateEngieEntity.this;
				Level world = NightmareHostileBiblicallyAccurateEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = NightmareHostileBiblicallyAccurateEngieEntity.this.getX();
				double y = NightmareHostileBiblicallyAccurateEngieEntity.this.getY();
				double z = NightmareHostileBiblicallyAccurateEngieEntity.this.getZ();
				Entity entity = NightmareHostileBiblicallyAccurateEngieEntity.this;
				Level world = NightmareHostileBiblicallyAccurateEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = NightmareHostileBiblicallyAccurateEngieEntity.this.getX();
				double y = NightmareHostileBiblicallyAccurateEngieEntity.this.getY();
				double z = NightmareHostileBiblicallyAccurateEngieEntity.this.getZ();
				Entity entity = NightmareHostileBiblicallyAccurateEngieEntity.this;
				Level world = NightmareHostileBiblicallyAccurateEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = NightmareHostileBiblicallyAccurateEngieEntity.this.getX();
				double y = NightmareHostileBiblicallyAccurateEngieEntity.this.getY();
				double z = NightmareHostileBiblicallyAccurateEngieEntity.this.getZ();
				Entity entity = NightmareHostileBiblicallyAccurateEngieEntity.this;
				Level world = NightmareHostileBiblicallyAccurateEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = NightmareHostileBiblicallyAccurateEngieEntity.this.getX();
				double y = NightmareHostileBiblicallyAccurateEngieEntity.this.getY();
				double z = NightmareHostileBiblicallyAccurateEngieEntity.this.getZ();
				Entity entity = NightmareHostileBiblicallyAccurateEngieEntity.this;
				Level world = NightmareHostileBiblicallyAccurateEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(7, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("engies_chaos:nightmare_footstep")), 0.15f, 1);
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
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion(Explosion explosion) {
		return true;
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		AnyEngieDiesAddCountProcedure.execute(this, source.getEntity());
	}

	@Override
	public void baseTick() {
		super.baseTick();
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
		event.register(EngiesChaosModEntities.NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return NightmareHostileEngieySpawningConditionProcedure.execute(world);
		}, RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 600);
		builder = builder.add(Attributes.ARMOR, 25);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 45);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}