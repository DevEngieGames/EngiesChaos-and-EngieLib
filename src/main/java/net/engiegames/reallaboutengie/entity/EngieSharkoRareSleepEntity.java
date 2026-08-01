package net.engiegames.reallaboutengie.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.engiegames.reallaboutengie.procedures.SharkoKilledByPlayersCountUpProcedure;
import net.engiegames.reallaboutengie.procedures.SharkoChanceForLayOnSide2Procedure;
import net.engiegames.reallaboutengie.init.AllaboutengieModEntities;

public class EngieSharkoRareSleepEntity extends PathfinderMob {
	public final AnimationState animationState0 = new AnimationState();

	public EngieSharkoRareSleepEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(AllaboutengieModEntities.ENGIE_SHARKO_RARE_SLEEP.get(), world);
	}

	public EngieSharkoRareSleepEntity(EntityType<EngieSharkoRareSleepEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new FloatGoal(this));
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
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.panda.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.panda.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource == DamageSource.FALL)
			return false;
		if (damagesource == DamageSource.CACTUS)
			return false;
		if (damagesource == DamageSource.DROWN)
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		SharkoKilledByPlayersCountUpProcedure.execute(this.level, source.getEntity());
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
		SharkoChanceForLayOnSide2Procedure.execute(this.level, this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
		builder = builder.add(Attributes.MAX_HEALTH, 1024);
		builder = builder.add(Attributes.ARMOR, 22.5);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 22);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}