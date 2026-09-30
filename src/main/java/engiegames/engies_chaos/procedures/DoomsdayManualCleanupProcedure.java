package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DoomsdayManualCleanupProcedure {
	public static void execute(LevelAccessor world) {
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			{
				Entity _ent = entityiterator;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EChaos EngieLib DoomsdayCleanupPlayer");
				}
			}
			{
				Entity _ent = entityiterator;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "worldborder set 59999968");
				}
			}
			{
				boolean _setval = false;
				entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.healthreductiondday = _setval;
					capability.syncPlayerVariables(entityiterator);
				});
			}
			{
				boolean _setval = false;
				entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.crucifixbypass = _setval;
					capability.syncPlayerVariables(entityiterator);
				});
			}
			for (int index0 = 0; index0 < 10; index0++) {
				{
					Entity _ent = entityiterator;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "kill @e[type=#engies_chaos:doomsday/entitycleanup]");
					}
				}
				{
					Entity _ent = entityiterator;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a");
					}
				}
				{
					Entity _ent = entityiterator;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect clear @a darkness");
					}
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.setDayTime((int) (EngiesChaosModVariables.MapVariables.get(world).timeticks + 11000));
		EngiesChaosModVariables.MapVariables.get(world).spawnedfinaldisasters = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ranfirstcleanup = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ransecondcleanup = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).stopdialogue = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).prophallowticking = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).pausedialogue = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayStart = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayNightTime = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueDelay = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).StartDoomsdayBeginning = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayEerie = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayTeleportedPlayers = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayStart = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayNightTime = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayDialogueDelay = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).StartSuperDoomsdayBeginning = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayEerie = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayTeleportedPlayers = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndNightTime = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDelay = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).StartTheEndBeginning = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndEerie = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndTeleportedPlayers = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathNightTime = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDelay = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).StartEngiesWrathBeginning = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathEerie = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathTeleportedPlayers = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).playlightningsound = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).playriftsound = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).playlightningcornersound = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).playmissilespawnsound = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ddayhappened = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).sddayhappened = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).theendhappened = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ewrathhappened = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ddayoncleanup = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		world.getLevelData().getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(true, world.getServer());
		world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
		EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).missilecooldown = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).riftcooldown = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).spikecooldown = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 0;
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
		EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).hordecooldown = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).forecastdialogue = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).doomsdaycleanuptimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayHalf = 1;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ProphecyShowTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ProphecyDisasterRevealTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).ProphecyTimerTotal = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueDelayTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayNightTimeDelayTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TimeBeforeNextDialogue = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TimeBeforeDialogueDisappear = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DialogueDisappearTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).DoomsdayTeleportTime = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayDialogueDelayTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayNightTimeDelayTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayDialogueTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayTimeBeforeNextDialogue = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayTimeBeforeDialogueDisappear = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayDialogueDisappearTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayTeleportTime = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDelayTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndNightTimeDelayTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndTimeBeforeNextDialogue = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndTimeBeforeDialogueDisappear = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDisappearTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).TheEndTeleportTime = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDelayTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathNightTimeDelayTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathTimeBeforeNextDialogue = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathTimeBeforeDialogueDisappear = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDisappearTimer = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).EngiesWrathTeleportTime = 0;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
	}
}