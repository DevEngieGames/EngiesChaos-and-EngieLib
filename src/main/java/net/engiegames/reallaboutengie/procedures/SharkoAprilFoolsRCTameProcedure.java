package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModEntities;
import net.engiegames.reallaboutengie.entity.SharkoTamedAprilFoolsEntity;

public class SharkoAprilFoolsRCTameProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!world.isClientSide()) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKIE) {
				if (Math.random() >= 0.8) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.HEART, x, y, z, 15, 1, 1, 1, 1);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new SharkoTamedAprilFoolsEntity(AllaboutengieModEntities.SHARKO_TAMED_APRIL_FOOLS.get(), _level);
						entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.COOKIE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.COOKIE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
				if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoRetryState == true) {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You're currently on cooldown for the sharkos."), true);
				} else if ((sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoRetryState == false) {
					if (Math.random() < 0.05) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.HEART, x, y, z, 15, 1, 1, 1, 1);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new SharkoTamedAprilFoolsEntity(AllaboutengieModEntities.SHARKO_TAMED_APRIL_FOOLS.get(), _level);
							entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
						if (!entity.level.isClientSide())
							entity.discard();
					} else {
						{
							boolean _setval = true;
							sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SharkoRetryState = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
			}
		}
	}
}