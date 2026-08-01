package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModGameRules;
import net.engiegames.reallaboutengie.AllaboutengieMod;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class AAEAllCommandsProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "MainType")).equals("Gear") || (StringArgumentType.getString(arguments, "MainType")).equals("gear")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Operator") || (StringArgumentType.getString(arguments, "AltType")).equals("operator")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE giveoperatorgear");
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Starter") || (StringArgumentType.getString(arguments, "AltType")).equals("starter")) {
				StarterItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Developer") || (StringArgumentType.getString(arguments, "AltType")).equals("developer")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE giveodevelopergear");
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("IdeaGiver") || (StringArgumentType.getString(arguments, "AltType")).equals("ideagiver")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE giveideagivergear");
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("BetaTester") || (StringArgumentType.getString(arguments, "AltType")).equals("betatester")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE givebetatestergear");
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Tester") || (StringArgumentType.getString(arguments, "AltType")).equals("tester")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE givetestergear");
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ContentCreator") || (StringArgumentType.getString(arguments, "AltType")).equals("contentcreator")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE givecontentcreatorgear");
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("RecipeBook") || (StringArgumentType.getString(arguments, "AltType")).equals("recipebook")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @s allaboutengie:all_about_engie_recipe_book");
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("StarterBundle") || (StringArgumentType.getString(arguments, "AltType")).equals("starterbundle")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @s allaboutengie:regular_engie_bundle");
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Code") || (StringArgumentType.getString(arguments, "MainType")).equals("code")) {
			if ((StringArgumentType.getString(arguments, "MainType")).equals("Redeem") || (StringArgumentType.getString(arguments, "MainType")).equals("redeem")) {
				if ((StringArgumentType.getString(arguments, "TriType")).equals("ByeByeThere")) {
					if (AllaboutengieModVariables.WorldVariables.get(world).yeah == false) {
						if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:comically_massive_ban_hammer");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:bye_bye_there");
								}
							}
							if ((entity instanceof ServerPlayer _plr35 && _plr35.level instanceof ServerLevel
									&& _plr35.getAdvancements().getOrStartProgress(_plr35.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										for (String criteria : _ap.getRemainingCriteria())
											_player.getAdvancements().award(_adv, criteria);
									}
								}
							}
							{
								boolean _setval = true;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.coderedeemblock = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
								}
							}
						}
					} else if (AllaboutengieModVariables.WorldVariables.get(world).yeah == true) {
						if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:comically_massive_ban_hammer_pixel");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:bye_bye_there");
								}
							}
							if ((entity instanceof ServerPlayer _plr40 && _plr40.level instanceof ServerLevel
									&& _plr40.getAdvancements().getOrStartProgress(_plr40.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										for (String criteria : _ap.getRemainingCriteria())
											_player.getAdvancements().award(_adv, criteria);
									}
								}
							}
							{
								boolean _setval = true;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.coderedeemblock = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("HeWhoGames")) {
					if (AllaboutengieModVariables.WorldVariables.get(world).yeah == false) {
						if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_scythe");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"You start to see figures...\",\"bold\":true,\"color\":\"black\"},{\"text\":\"\\n\"},{\"text\":\"Are these figures what made Engie lock the scythe behind a command?\",\"color\":\"dark_red\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).hewhowatches = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						} else if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"There is no going back now...\",\"bold\":true,\"color\":\"black\"}");
								}
							}
						}
					} else if (AllaboutengieModVariables.WorldVariables.get(world).yeah == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_scythe_pixel");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"You start to see figures...\",\"bold\":true,\"color\":\"black\"},{\"text\":\"\\n\"},{\"text\":\"Are these figures what made Engie lock the scythe behind a command?\",\"color\":\"dark_red\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).hewhowatches = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						} else if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"There is no going back now...\",\"bold\":true,\"color\":\"black\"}");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("BigSharko") || (StringArgumentType.getString(arguments, "TriType")).equals("BIGSHARKO") || (StringArgumentType.getString(arguments, "TriType")).equals("bigsharko")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_helmet");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_chestplate");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_leggings");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_boots");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_hammer");
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("AnAllAboutEngieChristmas") || (StringArgumentType.getString(arguments, "TriType")).equals("ANALLABOUTENGIECHRISTMAS")
						|| (StringArgumentType.getString(arguments, "TriType")).equals("anallaboutengiechristmas")) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("HappyBirthdayEngie") || (StringArgumentType.getString(arguments, "TriType")).equals("HAPPYBIRTHDAYENGIE")
						|| (StringArgumentType.getString(arguments, "TriType")).equals("happybirthdayengie")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
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
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
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
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
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
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
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
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle25");
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
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("HotlineMiami2") || (StringArgumentType.getString(arguments, "TriType")).equals("HOTLINEMIAMI2")
						|| (StringArgumentType.getString(arguments, "TriType")).equals("hotlinemiami2")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:hotline_miami_2_run");
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("HappyBirthdaySaph") || (StringArgumentType.getString(arguments, "TriType")).equals("HAPPYBIRTHDAYSAPH")
						|| (StringArgumentType.getString(arguments, "TriType")).equals("happybirthdaysaph")) {
					if ((entity.getDisplayName().getString()).equals("Two_Dragons15")) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_birthday_bundle_for_youngest");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "TriType")).equals("Punisher") || (StringArgumentType.getString(arguments, "TriType")).equals("PUNISHER") || (StringArgumentType.getString(arguments, "TriType")).equals("punisher")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:punisher_plush");
						}
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Debug") || (StringArgumentType.getString(arguments, "MainType")).equals("debug")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Doomsday") || (StringArgumentType.getString(arguments, "AltType")).equals("doomsday")) {
				if ((StringArgumentType.getString(arguments, "TriType")).equals("Track") || (StringArgumentType.getString(arguments, "TriType")).equals("track")) {
					if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						{
							boolean _setval = false;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DoomsdayTrackToggle = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == false) {
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DoomsdayTrackToggle = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("Summon") || (StringArgumentType.getString(arguments, "TriType")).equals("summon")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("Dev")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
							AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).thestart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
							entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
								AllaboutengieMod.queueServerWork(5, () -> {
									AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					} else if (world.players().size() == 1) {
						if (entity.hasPermissions(4)) {
							if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
								AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).thestart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
								entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
								entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
								entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
									}
								}
								AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
									if (world instanceof ServerLevel _level)
										_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
									AllaboutengieMod.queueServerWork(5, () -> {
										AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									});
								}
							} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
									}
								}
								AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else if (world.players().size() > 1) {
						if (entity.hasPermissions(4)) {
							if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
								AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).thestart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaywait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaywait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theendwait = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).TheEndEeriePlayOnce = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theendtimenighttimerblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).theenddialoguetimeblock = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
								entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
								entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
								entity.getPersistentData().putDouble("TheEndDialogueCooldownStart", 0);
								entity.getPersistentData().putDouble("TimeUntilNightTHEEND", 0);
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
									}
								}
								AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
									if (world instanceof ServerLevel _level)
										_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
									AllaboutengieMod.queueServerWork(5, () -> {
										AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									});
								}
							} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
									}
								}
								AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
							}
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("CheckTime") || (StringArgumentType.getString(arguments, "AltType")).equals("checktime")) {
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).timeoverlaytoggle == true) {
					{
						boolean _setval = false;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.timeoverlaytoggle = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).timeoverlaytoggle == false) {
					{
						boolean _setval = true;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.timeoverlaytoggle = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("TraderCount") || (StringArgumentType.getString(arguments, "AltType")).equals("tradercount")) {
				if ((StringArgumentType.getString(arguments, "TriType")).equals("Reset") || (StringArgumentType.getString(arguments, "TriType")).equals("reset")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
						for (int index0 = 0; index0 < 10; index0++) {
							AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							});
						}
					} else if ((entity.getDisplayName().getString()).equals("Dev")) {
						AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
						for (int index1 = 0; index1 < 10; index1++) {
							AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							});
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
						for (int index2 = 0; index2 < 10; index2++) {
							AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							});
						}
					} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
						AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
						for (int index3 = 0; index3 < 10; index3++) {
							AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							});
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
						for (int index4 = 0; index4 < 10; index4++) {
							AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							});
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
						for (int index5 = 0; index5 < 10; index5++) {
							AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							});
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
						AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
						for (int index6 = 0; index6 < 10; index6++) {
							AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							});
						}
					} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
						AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
						for (int index7 = 0; index7 < 10; index7++) {
							AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(1, () -> {
								AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							});
						}
					} else if (world.players().size() == 1) {
						if (entity.hasPermissions(4)) {
							AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
							for (int index8 = 0; index8 < 10; index8++) {
								AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieMod.queueServerWork(1, () -> {
									AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						}
					} else if (world.players().size() > 1) {
						if (entity.hasPermissions(4)) {
							AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Successfully reset trader counts."), false);
							for (int index9 = 0; index9 < 10; index9++) {
								AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 10;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieMod.queueServerWork(1, () -> {
									AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberoftheend = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								});
							}
						}
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
							}
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Difficulty") || (StringArgumentType.getString(arguments, "AltType")).equals("difficulty")) {
				if ((StringArgumentType.getString(arguments, "TriType")).equals("Set") || (StringArgumentType.getString(arguments, "TriType")).equals("set")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						DifficultyDebugChangeProcedure.execute(world, arguments);
					} else if ((entity.getDisplayName().getString()).equals("Dev")) {
						DifficultyDebugChangeProcedure.execute(world, arguments);
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						DifficultyDebugChangeProcedure.execute(world, arguments);
					} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
						DifficultyDebugChangeProcedure.execute(world, arguments);
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						DifficultyDebugChangeProcedure.execute(world, arguments);
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						DifficultyDebugChangeProcedure.execute(world, arguments);
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
						DifficultyDebugChangeProcedure.execute(world, arguments);
					} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
						DifficultyDebugChangeProcedure.execute(world, arguments);
					} else if (world.players().size() == 1) {
						if (entity.hasPermissions(4)) {
							DifficultyDebugChangeProcedure.execute(world, arguments);
						}
					} else if (world.players().size() > 1) {
						if (entity.hasPermissions(4)) {
							DifficultyDebugChangeProcedure.execute(world, arguments);
						}
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "TriType")).equals("Overlay") || (StringArgumentType.getString(arguments, "TriType")).equals("overlay")) {
					if (DoubleArgumentType.getDouble(arguments, "number") == 0) {
						{
							double _setval = 0;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.difficultyoverlaytoggle = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (DoubleArgumentType.getDouble(arguments, "number") == 1) {
						{
							double _setval = 1;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.difficultyoverlaytoggle = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (DoubleArgumentType.getDouble(arguments, "number") == 2) {
						{
							double _setval = 2;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.difficultyoverlaytoggle = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (DoubleArgumentType.getDouble(arguments, "number") == 3) {
						{
							double _setval = 3;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.difficultyoverlaytoggle = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (DoubleArgumentType.getDouble(arguments, "number") == 4) {
						{
							double _setval = 4;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.difficultyoverlaytoggle = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Risk") || (StringArgumentType.getString(arguments, "MainType")).equals("risk")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Check") || (StringArgumentType.getString(arguments, "AltType")).equals("check")) {
				RiskCheckProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "TriType")).equals("Track") || (StringArgumentType.getString(arguments, "TriType")).equals("track")) {
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
					{
						boolean _setval = false;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DoomsdayRiskTrackToggle = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == false) {
					{
						boolean _setval = true;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DoomsdayRiskTrackToggle = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Modifier") || (StringArgumentType.getString(arguments, "MainType")).equals("modifier")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("SuperDoomsday") || (StringArgumentType.getString(arguments, "AltType")).equals("superdoomsday")) {
				if ((entity.getDisplayName().getString()).equals("DevEngie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("Dev")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity.hasPermissions(4)) {
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity.hasPermissions(4)) {
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Super Doomsday.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(true, world.getServer());
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Super Doomsday.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ExtremeDoomsdayLightning") || (StringArgumentType.getString(arguments, "AltType")).equals("extremedoomsdaylightning")) {
				if ((entity.getDisplayName().getString()).equals("DevEngie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("Dev")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity.hasPermissions(4)) {
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity.hasPermissions(4)) {
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(true, world.getServer());
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Doomsday Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("HeavyLightning") || (StringArgumentType.getString(arguments, "AltType")).equals("heavylightning")) {
				if ((entity.getDisplayName().getString()).equals("DevEngie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("Dev")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity.hasPermissions(4)) {
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity.hasPermissions(4)) {
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for increased destruction and lag, you have Successfully toggled on Heavy Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(true, world.getServer());
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.HEAVY_LIGHTNING) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for decreased destruction and lag, you have Successfully toggled off Heavy Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.HEAVY_LIGHTNING).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ExtremeLightning") || (StringArgumentType.getString(arguments, "AltType")).equals("extremelightning")) {
				if ((entity.getDisplayName().getString()).equals("DevEngie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("Dev")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if ((entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] playedbyengie")) {
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
							}
						}
						world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
					}
				} else if (world.players().size() == 1) {
					if (entity.hasPermissions(4)) {
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
						}
					}
				} else if (world.players().size() > 1) {
					if (entity.hasPermissions(4)) {
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for mass destruction and lag, you have Successfully toggled on Extreme Lightning.\",\"bold\":true,\"color\":\"aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(true, world.getServer());
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_LIGHTNING) == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Getting ready for less destruction and lag, you have Successfully toggled off Extreme Lightning.\",\"bold\":true,\"color\":\"dark_aqua\"}");
								}
							}
							world.getLevelData().getGameRules().getRule(AllaboutengieModGameRules.EXTREME_LIGHTNING).set(false, world.getServer());
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			}
		}
	}
}