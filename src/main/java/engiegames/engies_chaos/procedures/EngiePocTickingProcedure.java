package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.XEngieGamesEntity;

@Mod.EventBusSubscriber
public class EngiePocTickingProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
			if (!world.isClientSide()) {
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
					if (EngiesChaosModVariables.MapVariables.get(world).engiepocgraceperiod <= 6000) {
						EngiesChaosModVariables.MapVariables.get(world).engiepocgraceperiod = EngiesChaosModVariables.MapVariables.get(world).engiepocgraceperiod + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.AMBIENCE_MODE).set(true, world.getServer());
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									"execute as @a run EngiesChaos Lives Set2 @s 999999");
					} else if (EngiesChaosModVariables.MapVariables.get(world).engiepocgraceperiod >= 6000) {
						world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.AMBIENCE_MODE).set(false, world.getServer());
						EngiesChaosModVariables.MapVariables.get(world).difficultytoggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.TRUE_HARDCORE).set(true, world.getServer());
					world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.DOOMSDAY_TOGGLE).set(true, world.getServer());
					world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.ENGIES_WRATH_TOGGLE).set(true, world.getServer());
					world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE).set(true, world.getServer());
					if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525000) {
						world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, world.getServer());
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
									Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), ("time set " + EngiesChaosModVariables.MapVariables.get(world).engiepoctime));
						if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == false) {
							EngiesChaosModVariables.MapVariables.get(world).engiepoctruehardest20mincount = EngiesChaosModVariables.MapVariables.get(world).engiepoctruehardest20mincount + 0.05;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (EngiesChaosModVariables.MapVariables.get(world).engiepoctruehardest20mincount >= 1200) {
								EngiesChaosModVariables.MapVariables.get(world).engiepoctruehardest20mincount = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).engiepoctime = EngiesChaosModVariables.MapVariables.get(world).engiepoctime + 24000;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiePocDoomsdayTriggerProcedure.execute(world);
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).EngiePocSpawnedHelper == false) {
						EngiesChaosModVariables.MapVariables.get(world).EngiePocSpawnedHelper = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, new ItemStack(Items.LEAD));
							entityToSpawn.setPickUpDelay(10);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new XEngieGamesEntity(EngiesChaosModEntities.X_ENGIE_GAMES.get(), _level);
							entityToSpawn.moveTo(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									"tellraw @a [\"\",{\"text\":\"It's highly recommended to take that entity at 0, 0 with you at all times. Getting Doomsday, Super Doomsday, and The End Crucifixes was impossible originally so... that entity makes it possible to get those. Not just that as well, you can trade for any gear with that entity. \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"DO NOT LOSE THAT ENTITY.\",\"bold\":true,\"underlined\":true,\"color\":\"red\"}]");
					}
				}
			}
		}
	}
}