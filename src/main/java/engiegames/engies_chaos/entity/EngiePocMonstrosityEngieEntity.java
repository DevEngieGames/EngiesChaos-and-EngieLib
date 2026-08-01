package engiegames.engies_chaos.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.levelgen.Heightmap;
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

import engiegames.engies_chaos.procedures.NegativeDifficultyAICheckProcedure;
import engiegames.engies_chaos.procedures.MobHitboxScalingProcedure;
import engiegames.engies_chaos.procedures.EngiePocHostileEngieSpawningConditionProcedure;
import engiegames.engies_chaos.procedures.AnyEngieDiesAddCountProcedure;
import engiegames.engies_chaos.init.EngiesChaosModEntities;

public class EngiePocMonstrosityEngieEntity extends Monster {
	public EngiePocMonstrosityEngieEntity(EntityType<EngiePocMonstrosityEngieEntity> type, Level world) {
		super(type, world);
		xpReward = 55;
		setNoAi(false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2.4, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, true, false) {
			@Override
			public boolean canUse() {
				double x = EngiePocMonstrosityEngieEntity.this.getX();
				double y = EngiePocMonstrosityEngieEntity.this.getY();
				double z = EngiePocMonstrosityEngieEntity.this.getZ();
				Entity entity = EngiePocMonstrosityEngieEntity.this;
				Level world = EngiePocMonstrosityEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EngiePocMonstrosityEngieEntity.this.getX();
				double y = EngiePocMonstrosityEngieEntity.this.getY();
				double z = EngiePocMonstrosityEngieEntity.this.getZ();
				Entity entity = EngiePocMonstrosityEngieEntity.this;
				Level world = EngiePocMonstrosityEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, false) {
			@Override
			public boolean canUse() {
				double x = EngiePocMonstrosityEngieEntity.this.getX();
				double y = EngiePocMonstrosityEngieEntity.this.getY();
				double z = EngiePocMonstrosityEngieEntity.this.getZ();
				Entity entity = EngiePocMonstrosityEngieEntity.this;
				Level world = EngiePocMonstrosityEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EngiePocMonstrosityEngieEntity.this.getX();
				double y = EngiePocMonstrosityEngieEntity.this.getY();
				double z = EngiePocMonstrosityEngieEntity.this.getZ();
				Entity entity = EngiePocMonstrosityEngieEntity.this;
				Level world = EngiePocMonstrosityEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = EngiePocMonstrosityEngieEntity.this.getX();
				double y = EngiePocMonstrosityEngieEntity.this.getY();
				double z = EngiePocMonstrosityEngieEntity.this.getZ();
				Entity entity = EngiePocMonstrosityEngieEntity.this;
				Level world = EngiePocMonstrosityEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EngiePocMonstrosityEngieEntity.this.getX();
				double y = EngiePocMonstrosityEngieEntity.this.getY();
				double z = EngiePocMonstrosityEngieEntity.this.getZ();
				Entity entity = EngiePocMonstrosityEngieEntity.this;
				Level world = EngiePocMonstrosityEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = EngiePocMonstrosityEngieEntity.this.getX();
				double y = EngiePocMonstrosityEngieEntity.this.getY();
				double z = EngiePocMonstrosityEngieEntity.this.getZ();
				Entity entity = EngiePocMonstrosityEngieEntity.this;
				Level world = EngiePocMonstrosityEngieEntity.this.level();
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EngiePocMonstrosityEngieEntity.this.getX();
				double y = EngiePocMonstrosityEngieEntity.this.getY();
				double z = EngiePocMonstrosityEngieEntity.this.getZ();
				Entity entity = EngiePocMonstrosityEngieEntity.this;
				Level world = EngiePocMonstrosityEngieEntity.this.level();
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(7, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
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
		if (damagesource.is(DamageTypes.IN_FIRE))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		if (damagesource.is(DamageTypes.FALLING_ANVIL))
			return false;
		if (damagesource.is(DamageTypes.DRAGON_BREATH))
			return false;
		if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public boolean fireImmune() {
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
		event.register(EngiesChaosModEntities.ENGIE_POC_MONSTROSITY_ENGIE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return EngiePocHostileEngieSpawningConditionProcedure.execute(world);
		}, RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 750);
		builder = builder.add(Attributes.ARMOR, 35);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 55);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.STEP_HEIGHT, 1);
		return builder;
	}
}