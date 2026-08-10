package engiegames.engies_chaos.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
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
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import engiegames.engies_chaos.procedures.NegativeDifficultyAICheckProcedure;
import engiegames.engies_chaos.procedures.MobHitboxScalingProcedure;
import engiegames.engies_chaos.procedures.InsanityHostileEngieSpawningConditionProcedure;
import engiegames.engies_chaos.procedures.AnyEngieDiesAddCountProcedure;
import engiegames.engies_chaos.init.EngiesChaosModEntities;

public class InsanityMonstrosityEngieEntity extends Monster {
	public InsanityMonstrosityEngieEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), world);
	}

	public InsanityMonstrosityEngieEntity(EntityType<InsanityMonstrosityEngieEntity> type, Level world) {
		super(type, world);
		maxUpStep = 1f;
		xpReward = 55;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2.4, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, true, false) {
			@Override
			public boolean canUse() {
				double x = InsanityMonstrosityEngieEntity.this.getX();
				double y = InsanityMonstrosityEngieEntity.this.getY();
				double z = InsanityMonstrosityEngieEntity.this.getZ();
				Entity entity = InsanityMonstrosityEngieEntity.this;
				Level world = InsanityMonstrosityEngieEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = InsanityMonstrosityEngieEntity.this.getX();
				double y = InsanityMonstrosityEngieEntity.this.getY();
				double z = InsanityMonstrosityEngieEntity.this.getZ();
				Entity entity = InsanityMonstrosityEngieEntity.this;
				Level world = InsanityMonstrosityEngieEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, false) {
			@Override
			public boolean canUse() {
				double x = InsanityMonstrosityEngieEntity.this.getX();
				double y = InsanityMonstrosityEngieEntity.this.getY();
				double z = InsanityMonstrosityEngieEntity.this.getZ();
				Entity entity = InsanityMonstrosityEngieEntity.this;
				Level world = InsanityMonstrosityEngieEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = InsanityMonstrosityEngieEntity.this.getX();
				double y = InsanityMonstrosityEngieEntity.this.getY();
				double z = InsanityMonstrosityEngieEntity.this.getZ();
				Entity entity = InsanityMonstrosityEngieEntity.this;
				Level world = InsanityMonstrosityEngieEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = InsanityMonstrosityEngieEntity.this.getX();
				double y = InsanityMonstrosityEngieEntity.this.getY();
				double z = InsanityMonstrosityEngieEntity.this.getZ();
				Entity entity = InsanityMonstrosityEngieEntity.this;
				Level world = InsanityMonstrosityEngieEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = InsanityMonstrosityEngieEntity.this.getX();
				double y = InsanityMonstrosityEngieEntity.this.getY();
				double z = InsanityMonstrosityEngieEntity.this.getZ();
				Entity entity = InsanityMonstrosityEngieEntity.this;
				Level world = InsanityMonstrosityEngieEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 6) {
			@Override
			public boolean canUse() {
				double x = InsanityMonstrosityEngieEntity.this.getX();
				double y = InsanityMonstrosityEngieEntity.this.getY();
				double z = InsanityMonstrosityEngieEntity.this.getZ();
				Entity entity = InsanityMonstrosityEngieEntity.this;
				Level world = InsanityMonstrosityEngieEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = InsanityMonstrosityEngieEntity.this.getX();
				double y = InsanityMonstrosityEngieEntity.this.getY();
				double z = InsanityMonstrosityEngieEntity.this.getZ();
				Entity entity = InsanityMonstrosityEngieEntity.this;
				Level world = InsanityMonstrosityEngieEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(7, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:nightmare_footstep")), 0.15f, 1);
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
		if (damagesource == DamageSource.CACTUS)
			return false;
		if (damagesource == DamageSource.LIGHTNING_BOLT)
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
	public EntityDimensions getDimensions(Pose pose) {
		Entity entity = this;
		Level world = this.level;
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		return super.getDimensions(pose).scale((float) MobHitboxScalingProcedure.execute());
	}

	public static void init() {
		SpawnPlacements.register(EngiesChaosModEntities.INSANITY_MONSTROSITY_ENGIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return InsanityHostileEngieSpawningConditionProcedure.execute(world, x, y, z);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 750);
		builder = builder.add(Attributes.ARMOR, 35);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 55);
		builder = builder.add(Attributes.FOLLOW_RANGE, 48);
		return builder;
	}
}