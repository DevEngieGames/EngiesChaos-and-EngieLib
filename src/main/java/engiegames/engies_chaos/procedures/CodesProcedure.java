package engiegames.engies_chaos.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
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
import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.init.EngiesChaosModBlocks;

public class CodesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((((entity instanceof Player _entity0 && _entity0.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("byebyethere")
				|| (((entity instanceof Player _entity1 && _entity1.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu1) ? _menu1.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("bye bye there")
				|| (((entity instanceof Player _entity2 && _entity2.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("bye bye there!")) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).coderedeemblock == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.COMICALLY_MASSIVE_BAN_HAMMER.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BYE_BYE_THERE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
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
		if ((((entity instanceof Player _entity8 && _entity8.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu8) ? _menu8.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engieschaos")
				|| (((entity instanceof Player _entity9 && _entity9.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu9) ? _menu9.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engies chaos")
				|| (((entity instanceof Player _entity10 && _entity10.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu10) ? _menu10.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engie's chaos")
				|| (((entity instanceof Player _entity11 && _entity11.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu11) ? _menu11.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engie'schaos")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_HELMET.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_BOOTS.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_SCYTHE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_HAMMER.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_SWORD.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_PICKAXE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_AXE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_SHOVEL.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CODE_REDEEMERS_HOE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((((entity instanceof Player _entity23 && _entity23.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu23) ? _menu23.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happynewyears")
				|| (((entity instanceof Player _entity24 && _entity24.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu24) ? _menu24.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happy new years")) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 0 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) < 6) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGEL_HATTED_PRESENT.get()).copy();
					_setstack.setCount(16);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if ((((entity instanceof Player _entity26 && _entity26.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu26) ? _menu26.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("merrychristmas")
				|| (((entity instanceof Player _entity27 && _entity27.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu27) ? _menu27.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("merry christmas")) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 11 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGEL_HATTED_PRESENT.get()).copy();
					_setstack.setCount(16);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if ((((entity instanceof Player _entity29 && _entity29.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu29) ? _menu29.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happybirthdayengie")
				|| (((entity instanceof Player _entity30 && _entity30.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu30) ? _menu30.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happy birthday engie")) {
			if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).Birthday == true) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_OWN_ENGIE_BUNDLE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGEL_HATTED_PRESENT.get()).copy();
						_setstack.setCount(19);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.DEV_ENGIE_PLUSH.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.X_ENGIE_PLUSH.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
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
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_BIRTHDAY_BUNDLE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGEL_HATTED_PRESENT.get()).copy();
						_setstack.setCount(5);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.DEV_ENGIE_PLUSH.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.X_ENGIE_PLUSH.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
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
		if ((((entity instanceof Player _entity42 && _entity42.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu42) ? _menu42.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("hotlinemiami2")
				|| (((entity instanceof Player _entity43 && _entity43.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu43) ? _menu43.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("hotline miami 2")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.HOTLINE_MIAMI_2_RUN.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((((entity instanceof Player _entity45 && _entity45.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu45) ? _menu45.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happybirthdaysaph")
				|| (((entity instanceof Player _entity46 && _entity46.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu46) ? _menu46.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("happy birthday saph")) {
			if ((entity.getDisplayName().getString()).equals("Two_Dragons15")) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_BIRTHDAY_BUNDLE_FOR_YOUNGEST.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.X_ENGIE_PLUSH.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if ((((entity instanceof Player _entity50 && _entity50.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu50) ? _menu50.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("punisher")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.PUNISHER_PLUSH.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((((entity instanceof Player _entity52 && _entity52.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu52) ? _menu52.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("phantom")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.PHANTOM_AND_NUTTER_BUTTER.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((((entity instanceof Player _entity54 && _entity54.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu54) ? _menu54.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("scarlet")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.SCARLET.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((((entity instanceof Player _entity56 && _entity56.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu56) ? _menu56.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("ceasar")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.CEASAR.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((((entity instanceof Player _entity58 && _entity58.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu58) ? _menu58.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engiesbuggedchaos")
				|| (((entity instanceof Player _entity59 && _entity59.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu59) ? _menu59.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engies bugged chaos")
				|| (((entity instanceof Player _entity60 && _entity60.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu60) ? _menu60.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engie's bugged chaos")
				|| (((entity instanceof Player _entity61 && _entity61.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu61) ? _menu61.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("engie'sbuggedchaos")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OLD_ENRAGED_PLUSH.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((((entity instanceof Player _entity63 && _entity63.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu63) ? _menu63.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("pureinsanity")
				|| (((entity instanceof Player _entity64 && _entity64.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu64) ? _menu64.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("pure insanity")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.PURE_INSANITY_PLUSH.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((((entity instanceof Player _entity66 && _entity66.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu66) ? _menu66.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("devmode")) {
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
		if ((((entity instanceof Player _entity71 && _entity71.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu71) ? _menu71.getMenuState(0, "codeinput", "") : "").toLowerCase()).equals("lucky")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.LUCKY_BLOCK.get()).copy();
				_setstack.setCount((int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 64)));
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}