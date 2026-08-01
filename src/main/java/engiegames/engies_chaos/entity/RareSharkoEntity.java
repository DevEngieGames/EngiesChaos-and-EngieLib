package engiegames.engies_chaos.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.EventHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
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
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageTypes;
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
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;

import engiegames.engies_chaos.procedures.RareSharkoSleepCheckProcedure;
import engiegames.engies_chaos.procedures.RareSharkoRightClickedOnEntityProcedure;
import engiegames.engies_chaos.procedures.RareSharkoOnEntityTickUpdateProcedure;
import engiegames.engies_chaos.procedures.RareSharkoMoveAroundCheckProcedure;
import engiegames.engies_chaos.procedures.AprilFoolsDespawningProcedure;
import engiegames.engies_chaos.init.EngiesChaosModEntities;

public class RareSharkoEntity extends TamableAnimal {
	public static final EntityDataAccessor<Integer> DATA_SharkoState = SynchedEntityData.defineId(RareSharkoEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_AlternateState = SynchedEntityData.defineId(RareSharkoEntity.class, EntityDataSerializers.BOOLEAN);

	public RareSharkoEntity(EntityType<RareSharkoEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_SharkoState, 0);
		builder.define(DATA_AlternateState, false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new OwnerHurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canContinueToUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canContinueToUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canContinueToUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}

			@Override
			public boolean canUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canContinueToUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1, (float) 10, (float) 2) {
			@Override
			public boolean canUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canContinueToUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canContinueToUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(7, new BreedGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canUse() && RareSharkoMoveAroundCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, (float) 12) {
			@Override
			public boolean canUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canUse() && RareSharkoSleepCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canContinueToUse() && RareSharkoSleepCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 12) {
			@Override
			public boolean canUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canUse() && RareSharkoSleepCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canContinueToUse() && RareSharkoSleepCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(10, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canUse() && RareSharkoSleepCheckProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RareSharkoEntity.this.getX();
				double y = RareSharkoEntity.this.getY();
				double z = RareSharkoEntity.this.getZ();
				Entity entity = RareSharkoEntity.this;
				Level world = RareSharkoEntity.this.level();
				return super.canContinueToUse() && RareSharkoSleepCheckProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(11, new FloatGoal(this));
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.panda.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.panda.death"));
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		return super.hurtServer(level, damagesource, amount);
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
		InteractionResult retval = InteractionResult.SUCCESS;
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level().isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack)) ? InteractionResult.SUCCESS : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						FoodProperties foodproperties = itemstack.get(DataComponents.FOOD);
						float nutrition = foodproperties != null ? (float) foodproperties.nutrition() : 1;
						this.heal(nutrition);
						retval = InteractionResult.SUCCESS;
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.SUCCESS;
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !EventHooks.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level().broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level().broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.SUCCESS;
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
		Level world = this.level();

		RareSharkoRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		RareSharkoOnEntityTickUpdateProcedure.execute(this.level(), this);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		RareSharkoEntity retval = EngiesChaosModEntities.RARE_SHARKO.get().create(serverWorld, EntitySpawnReason.BREEDING);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), EntitySpawnReason.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(Items.COOKIE).test(stack);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(EngiesChaosModEntities.RARE_SHARKO.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return AprilFoolsDespawningProcedure.execute(world, x, y, z);
		}, RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
		builder = builder.add(Attributes.MAX_HEALTH, 350);
		builder = builder.add(Attributes.ARMOR, 15);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 15);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}