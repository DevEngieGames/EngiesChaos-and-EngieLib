package engiegames.engieschaos.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import engiegames.engieschaos.procedures.SharkoMoveAroundCheckProcedure;
import engiegames.engieschaos.procedures.RareEngieSharkoSleepCheckProcedure;
import engiegames.engieschaos.procedures.RareEngieSharkoRightClickedOnEntityProcedure;
import engiegames.engieschaos.procedures.RareEngieSharkoOnEntityTickUpdateProcedure;
import engiegames.engieschaos.procedures.RareEngieSharkoMoveAroundCheckProcedure;
import engiegames.engieschaos.procedures.AprilFoolsDespawningProcedure;
import engiegames.engieschaos.init.EngiesChaosModItems;
import engiegames.engieschaos.init.EngiesChaosModEntities;

public class RareEngieSharkoEntity extends TamableAnimal {
	public static final EntityDataAccessor<Integer> DATA_SharkoState = SynchedEntityData.defineId(RareEngieSharkoEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_AlternateState = SynchedEntityData.defineId(RareEngieSharkoEntity.class, EntityDataSerializers.BOOLEAN);

	public RareEngieSharkoEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EngiesChaosModEntities.RARE_ENGIE_SHARKO.get(), world);
	}

	public RareEngieSharkoEntity(EntityType<RareEngieSharkoEntity> type, Level world) {
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
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_SharkoState, 0);
		this.entityData.define(DATA_AlternateState, false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new OwnerHurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canContinueToUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canContinueToUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canContinueToUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

			@Override
			public boolean canUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canContinueToUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1, (float) 10, (float) 2, false) {
			@Override
			public boolean canUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canContinueToUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canContinueToUse() && RareEngieSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(7, new BreedGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canUse() && SharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, (float) 12) {
			@Override
			public boolean canUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canUse() && RareEngieSharkoSleepCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canContinueToUse() && RareEngieSharkoSleepCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 12) {
			@Override
			public boolean canUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canUse() && RareEngieSharkoSleepCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canContinueToUse() && RareEngieSharkoSleepCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(10, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canUse() && RareEngieSharkoSleepCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareEngieSharkoEntity.this.getX();
				double y = RareEngieSharkoEntity.this.getY();
				double z = RareEngieSharkoEntity.this.getZ();
				Entity entity = RareEngieSharkoEntity.this;
				Level world = RareEngieSharkoEntity.this.level;
				return super.canContinueToUse() && RareEngieSharkoSleepCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(11, new FloatGoal(this));
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
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("DataSharkoState", this.entityData.get(DATA_SharkoState));
		compound.putBoolean("DataAlternateState", this.entityData.get(DATA_AlternateState));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataSharkoState"))
			this.entityData.set(DATA_SharkoState, compound.getInt("DataSharkoState"));
		if (compound.contains("DataAlternateState"))
			this.entityData.set(DATA_AlternateState, compound.getBoolean("DataAlternateState"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level.isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (item.isEdible() && this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal((float) item.getFoodProperties().getNutrition());
						retval = InteractionResult.sidedSuccess(this.level.isClientSide());
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.sidedSuccess(this.level.isClientSide());
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level.broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level.broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.sidedSuccess(this.level.isClientSide());
			} else {
				retval = super.mobInteract(sourceentity, hand);
				if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME)
					this.setPersistenceRequired();
			}
		}
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		RareEngieSharkoRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		RareEngieSharkoOnEntityTickUpdateProcedure.execute(this.level, this);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		RareEngieSharkoEntity retval = EngiesChaosModEntities.RARE_ENGIE_SHARKO.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(new ItemStack(EngiesChaosModItems.ENGIE_COOKIE.get())).test(stack);
	}

	public static void init() {
		SpawnPlacements.register(EngiesChaosModEntities.RARE_ENGIE_SHARKO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return AprilFoolsDespawningProcedure.execute(world);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
		builder = builder.add(Attributes.MAX_HEALTH, 950);
		builder = builder.add(Attributes.ARMOR, 45);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 45);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}