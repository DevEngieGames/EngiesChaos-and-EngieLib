package net.engiegames.reallaboutengie.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

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
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.engiegames.reallaboutengie.procedures.EntitySpawnsProcedure;
import net.engiegames.reallaboutengie.procedures.EntityNameDisplayUpdateTickProcedure;
import net.engiegames.reallaboutengie.procedures.DoomsDayMobsFightEachotherToggleProcedure;
import net.engiegames.reallaboutengie.procedures.AnyEngieDiesAddCountProcedure;
import net.engiegames.reallaboutengie.init.AllaboutengieModEntities;

import javax.annotation.Nullable;

public class AngryEngieColdSeasonEntity extends Monster {
	public final AnimationState animationState0 = new AnimationState();

	public AngryEngieColdSeasonEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(AllaboutengieModEntities.ANGRY_ENGIE_COLD_SEASON.get(), world);
	}

	public AngryEngieColdSeasonEntity(EntityType<AngryEngieColdSeasonEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 15;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, true, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Monster.class, true, false) {
			@Override
			public boolean canUse() {
				double x = AngryEngieColdSeasonEntity.this.getX();
				double y = AngryEngieColdSeasonEntity.this.getY();
				double z = AngryEngieColdSeasonEntity.this.getZ();
				Entity entity = AngryEngieColdSeasonEntity.this;
				Level world = AngryEngieColdSeasonEntity.this.level;
				return super.canUse() && DoomsDayMobsFightEachotherToggleProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = AngryEngieColdSeasonEntity.this.getX();
				double y = AngryEngieColdSeasonEntity.this.getY();
				double z = AngryEngieColdSeasonEntity.this.getZ();
				Entity entity = AngryEngieColdSeasonEntity.this;
				Level world = AngryEngieColdSeasonEntity.this.level;
				return super.canContinueToUse() && DoomsDayMobsFightEachotherToggleProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, (float) 6));
		this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 6));
		this.targetSelector.addGoal(8, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(10, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
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
	public void die(DamageSource source) {
		super.die(source);
		AnyEngieDiesAddCountProcedure.execute(this, source.getEntity());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		EntitySpawnsProcedure.execute(world, this);
		return retval;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level.isClientSide()) {
			this.animationState0.startIfStopped(this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		EntityNameDisplayUpdateTickProcedure.execute(this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
		builder = builder.add(Attributes.MAX_HEALTH, 200);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 15);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}