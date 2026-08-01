package engiegames.engieschaos.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
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
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import engiegames.engieschaos.procedures.XEngieGamesRightClickedOnEntityTradeProcedure;
import engiegames.engieschaos.procedures.NegativeDifficultyAICheckProcedure;
import engiegames.engieschaos.procedures.MobHitboxScalingProcedure;
import engiegames.engieschaos.init.EngiesChaosModItems;
import engiegames.engieschaos.init.EngiesChaosModEntities;

public class XEngieGamesEntity extends PathfinderMob {
	public XEngieGamesEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EngiesChaosModEntities.X_ENGIE_GAMES.get(), world);
	}

	public XEngieGamesEntity(EntityType<XEngieGamesEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()));
		this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(EngiesChaosModItems.TRUE_X_ENGIE_CRUCIFIX.get()));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EngiesChaosModItems.X_ENGIE_GAMESS_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(EngiesChaosModItems.X_ENGIE_GAMESS_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(EngiesChaosModItems.X_ENGIE_GAMESS_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(EngiesChaosModItems.X_ENGIE_GAMESS_BOOTS.get()));
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.25, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, (float) 12) {
			@Override
			public boolean canUse() {
				double x = XEngieGamesEntity.this.getX();
				double y = XEngieGamesEntity.this.getY();
				double z = XEngieGamesEntity.this.getZ();
				Entity entity = XEngieGamesEntity.this;
				Level world = XEngieGamesEntity.this.level;
				return super.canUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = XEngieGamesEntity.this.getX();
				double y = XEngieGamesEntity.this.getY();
				double z = XEngieGamesEntity.this.getZ();
				Entity entity = XEngieGamesEntity.this;
				Level world = XEngieGamesEntity.this.level;
				return super.canContinueToUse() && NegativeDifficultyAICheckProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Monster.class, true, true));
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(7, new FloatGoal(this));
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
	public double getMyRidingOffset() {
		return -0.35D;
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
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		XEngieGamesRightClickedOnEntityTradeProcedure.execute(world, x, y, z, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		this.refreshDimensions();
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
	public EntityDimensions getDimensions(Pose pose) {
		Entity entity = this;
		Level world = this.level;
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		return super.getDimensions(pose).scale((float) MobHitboxScalingProcedure.execute());
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 525);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		return builder;
	}
}