package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Calendar;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModMenus;

public class CodesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof Player _entity0 && _entity0.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(0, "codeinput", "") : "").equals("ByeByeThere")) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).coderedeemblock == false) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:comically_massive_ban_hammer");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:bye_bye_there");
					}
				}
				if ((entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
						&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:comically_massive_obtain"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:comically_massive_obtain"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.coderedeemblock = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).coderedeemblock == true) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level.getServer(), _ent),
								"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
					}
				}
			}
		}
		if (((entity instanceof Player _entity6 && _entity6.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu6) ? _menu6.getMenuState(0, "codeinput", "") : "").equals("HeWhoGames")) {
			if (EngiesChaosModVariables.MapVariables.get(world).hewhowatches == false) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:engies_scythe");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level.getServer(), _ent),
								"tellraw @p [\"\",{\"text\":\"You start to see figures...\",\"bold\":true,\"color\":\"black\"},{\"text\":\"\\n\"},{\"text\":\"Are these figures what made Engie lock the scythe behind a command?\",\"color\":\"dark_red\"}]");
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).hewhowatches = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if (EngiesChaosModVariables.MapVariables.get(world).hewhowatches == true) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"There is no going back now...\",\"bold\":true,\"color\":\"black\"}");
					}
				}
			}
		}
		if (((entity instanceof Player _entity10 && _entity10.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu10) ? _menu10.getMenuState(0, "codeinput", "") : "").equals("EngiesChaos")
				|| ((entity instanceof Player _entity11 && _entity11.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu11) ? _menu11.getMenuState(0, "codeinput", "") : "").equals("ENGIESCHAOS")
				|| ((entity instanceof Player _entity12 && _entity12.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu12) ? _menu12.getMenuState(0, "codeinput", "") : "").equals("engieschaos")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_helmet");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_chestplate");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_leggings");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_boots");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_hammer");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_scythe");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_sword");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_pickaxe");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_axe");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_shovel");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:code_redeemers_hoe");
				}
			}
		}
		if (((entity instanceof Player _entity24 && _entity24.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu24) ? _menu24.getMenuState(0, "codeinput", "") : "").equals("HappyNewYears")
				|| ((entity instanceof Player _entity25 && _entity25.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu25) ? _menu25.getMenuState(0, "codeinput", "") : "").equals("HAPPYNEWYEARS")
				|| ((entity instanceof Player _entity26 && _entity26.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu26) ? _menu26.getMenuState(0, "codeinput", "") : "").equals("happynewyears")) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 0 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) < 6) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:angel_hatted_present 18");
					}
				}
			}
		}
		if (((entity instanceof Player _entity28 && _entity28.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu28) ? _menu28.getMenuState(0, "codeinput", "") : "").equals("MerryChristmas")
				|| ((entity instanceof Player _entity29 && _entity29.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu29) ? _menu29.getMenuState(0, "codeinput", "") : "").equals("MERRYCHRISTMAS")
				|| ((entity instanceof Player _entity30 && _entity30.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu30) ? _menu30.getMenuState(0, "codeinput", "") : "").equals("merrychristmas")) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 11 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:angel_hatted_present 18");
					}
				}
			}
		}
		if (((entity instanceof Player _entity32 && _entity32.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu32) ? _menu32.getMenuState(0, "codeinput", "") : "").equals("HappyBirthdayEngie")
				|| ((entity instanceof Player _entity33 && _entity33.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu33) ? _menu33.getMenuState(0, "codeinput", "") : "").equals("HAPPYBIRTHDAYENGIE")
				|| ((entity instanceof Player _entity34 && _entity34.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu34) ? _menu34.getMenuState(0, "codeinput", "") : "").equals("happybirthdayengie")) {
			if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).Birthday == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:engies_own_engie_bundle");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:angel_hatted_present 18");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:dev_engie_plush");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:engie_plush");
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).Birthday == false) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
						}
					}
				}
			} else {
				if (EngiesChaosModVariables.MapVariables.get(world).Birthday == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 5");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).Birthday == false) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
						}
					}
				}
			}
		}
		if (((entity instanceof Player _entity46 && _entity46.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu46) ? _menu46.getMenuState(0, "codeinput", "") : "").equals("HotlineMiami2")
				|| ((entity instanceof Player _entity47 && _entity47.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu47) ? _menu47.getMenuState(0, "codeinput", "") : "").equals("HOTLINEMIAMI2")
				|| ((entity instanceof Player _entity48 && _entity48.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu48) ? _menu48.getMenuState(0, "codeinput", "") : "").equals("hotlinemiami2")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:hotline_miami_2_run");
				}
			}
		}
		if (((entity instanceof Player _entity50 && _entity50.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu50) ? _menu50.getMenuState(0, "codeinput", "") : "").equals("HappyBirthdaySaph")
				|| ((entity instanceof Player _entity51 && _entity51.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu51) ? _menu51.getMenuState(0, "codeinput", "") : "").equals("HAPPYBIRTHDAYSAPH")
				|| ((entity instanceof Player _entity52 && _entity52.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu52) ? _menu52.getMenuState(0, "codeinput", "") : "").equals("happybirthdaysaph")) {
			if ((entity.getDisplayName().getString()).equals("Two_Dragons15")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:engie_birthday_bundle_for_youngest");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:engie_plush");
					}
				}
			}
		}
		if (((entity instanceof Player _entity56 && _entity56.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu56) ? _menu56.getMenuState(0, "codeinput", "") : "").equals("Punisher")
				|| ((entity instanceof Player _entity57 && _entity57.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu57) ? _menu57.getMenuState(0, "codeinput", "") : "").equals("PUNISHER")
				|| ((entity instanceof Player _entity58 && _entity58.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu58) ? _menu58.getMenuState(0, "codeinput", "") : "").equals("punisher")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:punisher_plush");
				}
			}
		}
		if (((entity instanceof Player _entity60 && _entity60.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu60) ? _menu60.getMenuState(0, "codeinput", "") : "").equals("Phantom")
				|| ((entity instanceof Player _entity61 && _entity61.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu61) ? _menu61.getMenuState(0, "codeinput", "") : "").equals("PHANTOM")
				|| ((entity instanceof Player _entity62 && _entity62.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu62) ? _menu62.getMenuState(0, "codeinput", "") : "").equals("phantom")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:phantom_and_nutter_butter");
				}
			}
		}
		if (((entity instanceof Player _entity64 && _entity64.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu64) ? _menu64.getMenuState(0, "codeinput", "") : "").equals("Scarlet")
				|| ((entity instanceof Player _entity65 && _entity65.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu65) ? _menu65.getMenuState(0, "codeinput", "") : "").equals("SCARLET")
				|| ((entity instanceof Player _entity66 && _entity66.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu66) ? _menu66.getMenuState(0, "codeinput", "") : "").equals("scarlet")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:scarlet");
				}
			}
		}
		if (((entity instanceof Player _entity68 && _entity68.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu68) ? _menu68.getMenuState(0, "codeinput", "") : "").equals("Ceasar")
				|| ((entity instanceof Player _entity69 && _entity69.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu69) ? _menu69.getMenuState(0, "codeinput", "") : "").equals("CEASAR")
				|| ((entity instanceof Player _entity70 && _entity70.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu70) ? _menu70.getMenuState(0, "codeinput", "") : "").equals("ceasar")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:ceasar");
				}
			}
		}
	}
}