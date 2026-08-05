package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class EngieLibNeedProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "EngieLib")).equals("EngieLib")) {
			if ((StringArgumentType.getString(arguments, "Type")).equals("StartChallenge")) {
				ChallengeDialogueProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "Type")).equals("StartEndgameLoot")) {
				EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if ((StringArgumentType.getString(arguments, "Type")).equals("DoomsdayCleanupPlayer")) {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayhappened == true || EngiesChaosModVariables.MapVariables.get(world).sddayhappened == true || EngiesChaosModVariables.MapVariables.get(world).theendhappened == true
							|| EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == true) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).sddayhappened == true || EngiesChaosModVariables.MapVariables.get(world).theendhappened == true || EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == true) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:sdday_conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).theendhappened == true || EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == true) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_one"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).ewrathhappened == true) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engies_own"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount = EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount - 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == false) {
					EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount = EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount - 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}