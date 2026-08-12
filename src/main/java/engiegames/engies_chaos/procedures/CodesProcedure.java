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
		if ((((entity instanceof Player _entity0 && _entity0.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("byebyethere")
				|| (((entity instanceof Player _entity1 && _entity1.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu1) ? _menu1.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("bye bye there")
				|| (((entity instanceof Player _entity2 && _entity2.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("bye bye there!")) {
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
				if ((entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
						&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:comically_massive_obtain"))).isDone()) == false) {
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
		if ((((entity instanceof Player _entity8 && _entity8.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu8) ? _menu8.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("hewhogames")
				|| (((entity instanceof Player _entity9 && _entity9.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu9) ? _menu9.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("he who games")) {
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
		if ((((entity instanceof Player _entity13 && _entity13.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu13) ? _menu13.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engieschaos")
				|| (((entity instanceof Player _entity14 && _entity14.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu14) ? _menu14.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engies chaos")
				|| (((entity instanceof Player _entity15 && _entity15.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu15) ? _menu15.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engie's chaos")
				|| (((entity instanceof Player _entity16 && _entity16.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu16) ? _menu16.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engie'schaos")) {
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
		if ((((entity instanceof Player _entity28 && _entity28.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu28) ? _menu28.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happynewyears")
				|| (((entity instanceof Player _entity29 && _entity29.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu29) ? _menu29.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happy new years")) {
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
		if ((((entity instanceof Player _entity31 && _entity31.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu31) ? _menu31.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("merrychristmas")
				|| (((entity instanceof Player _entity32 && _entity32.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu32) ? _menu32.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("merry christmas")) {
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
		if ((((entity instanceof Player _entity34 && _entity34.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu34) ? _menu34.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happybirthdayengie")
				|| (((entity instanceof Player _entity35 && _entity35.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu35) ? _menu35.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happy birthday engie")) {
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
		if ((((entity instanceof Player _entity47 && _entity47.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu47) ? _menu47.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("hotlinemiami2")
				|| (((entity instanceof Player _entity48 && _entity48.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu48) ? _menu48.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("hotline miami 2")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:hotline_miami_2_run");
				}
			}
		}
		if ((((entity instanceof Player _entity50 && _entity50.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu50) ? _menu50.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happybirthdaysaph")
				|| (((entity instanceof Player _entity51 && _entity51.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu51) ? _menu51.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happy birthday saph")) {
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
		if ((((entity instanceof Player _entity55 && _entity55.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu55) ? _menu55.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("punisher")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:punisher_plush");
				}
			}
		}
		if ((((entity instanceof Player _entity57 && _entity57.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu57) ? _menu57.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("phantom")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:phantom_and_nutter_butter");
				}
			}
		}
		if ((((entity instanceof Player _entity59 && _entity59.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu59) ? _menu59.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("scarlet")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:scarlet");
				}
			}
		}
		if ((((entity instanceof Player _entity61 && _entity61.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu61) ? _menu61.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("ceasar")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:ceasar");
				}
			}
		}
		if ((((entity instanceof Player _entity63 && _entity63.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu63) ? _menu63.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engiesbuggedchaos")
				|| (((entity instanceof Player _entity64 && _entity64.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu64) ? _menu64.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engies bugged chaos")
				|| (((entity instanceof Player _entity65 && _entity65.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu65) ? _menu65.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engie's bugged chaos")
				|| (((entity instanceof Player _entity66 && _entity66.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu66) ? _menu66.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engie'sbuggedchaos")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:old_enraged_plush");
				}
			}
		}
		if ((((entity instanceof Player _entity68 && _entity68.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu68) ? _menu68.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("pureinsanity")
				|| (((entity instanceof Player _entity69 && _entity69.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu69) ? _menu69.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("pure insanity")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p engies_chaos:pure_insanity_plush");
				}
			}
		}
		if ((((entity instanceof Player _entity71 && _entity71.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu71) ? _menu71.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("devmode")) {
			if ((entity.getPersistentData().getBoolean("EngiesChaos_Dev") || entity.getPersistentData().getBoolean("EngiesChaos_Contributor") || entity.getPersistentData().getBoolean("EngiesChaos_BetaTester")
					|| entity.getPersistentData().getBoolean("EngiesChaos_Tester")) == true) {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerdebugmode == false) {
					{
						boolean _setval = true;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.playerdebugmode = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerdebugmode == true) {
					{
						boolean _setval = false;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.playerdebugmode = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}