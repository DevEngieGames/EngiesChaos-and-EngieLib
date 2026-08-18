package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class DoomsdayCleanupProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup == true) {
			EngiesChaosMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "execute as @a run EChaos EngieLib DoomsdayCleanupPlayer");
			});
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=#engies_chaos:doomsday/entitycleanup]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=item]");
			EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).superdoomsdaymaxtime = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).theendmaxtime = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).engieswrathmaxtime = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).superdoomsdaytimer = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).theendtimer = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).engieswrathtimer = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).sddaytimerminutes = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).TimeUntilNight = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DialogueCooldownStart = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			{
				double _setval = 0;
				entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lightningflashnum = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "weather clear");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect clear @a");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "stopsound @a");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect give @p instant_health 1 28 true");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "worldborder set 59999962");
			EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).playlightningsound = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).playriftsound = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).playlightningsound2 = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).playlightningsound4 = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).playlightningsound5 = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ddaystart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).sddaystart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).thestart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).EngiesWrathEeriePlayOnce = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ewrathtimenighttimerblock = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ewrathdialoguetimeblock = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).engieswrathstart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 0;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).doomsdaymainsongstart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).doomsdayaltsongstart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
			EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).BYEBYE = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true
					&& EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525000) {
				if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == true) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), ("time set " + EngiesChaosModVariables.MapVariables.get(world).engiepoctime));
					EngiesChaosModVariables.MapVariables.get(world).timecheckstop = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == true) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), ("time set " + EngiesChaosModVariables.MapVariables.get(world).timeticks));
					EngiesChaosModVariables.MapVariables.get(world).timecheckstop = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
			EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
	}
}