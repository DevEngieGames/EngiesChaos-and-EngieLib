package net.engiegames.reallaboutengie.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
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
import net.engiegames.reallaboutengie.procedures.SharkoChanceForLayOnSideProcedure;
import net.engiegames.reallaboutengie.init.AllaboutengieModEntities;

public class ExoticSharkoLayEntity extends PathfinderMob {
	public final AnimationState animationState0 = new AnimationState();

	public ExoticSharkoLayEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(AllaboutengieModEntities.EXOTIC_SHARKO_LAY.get(), world);
	}

	public ExoticSharkoLayEntity(EntityType<ExoticSharkoLayEntity> type, Level world) {
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
		this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, (float) 6));
		this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(3, new FloatGoal(this));
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
		SharkoChanceForLayOnSideProcedure.execute(this.level, this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 900);
		builder = builder.add(Attributes.ARMOR, 17.5);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 17);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}