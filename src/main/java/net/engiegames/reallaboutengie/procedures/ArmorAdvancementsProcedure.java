package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.NonNullList;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.engiegames.reallaboutengie.init.AllaboutengieModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class ArmorAdvancementsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
						&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
						&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr10 && _plr10.level instanceof ServerLevel
						&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel
						&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr17 && _plr17.level instanceof ServerLevel
						&& _plr17.getAdvancements().getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr19 && _plr19.level instanceof ServerLevel
						&& _plr19.getAdvancements().getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr24 && _plr24.level instanceof ServerLevel
						&& _plr24.getAdvancements().getOrStartProgress(_plr24.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr26 && _plr26.level instanceof ServerLevel
						&& _plr26.getAdvancements().getOrStartProgress(_plr26.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
						&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr33 && _plr33.level instanceof ServerLevel
						&& _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr38 && _plr38.level instanceof ServerLevel
						&& _plr38.getAdvancements().getOrStartProgress(_plr38.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr40 && _plr40.level instanceof ServerLevel
						&& _plr40.getAdvancements().getOrStartProgress(_plr40.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr45 && _plr45.level instanceof ServerLevel
						&& _plr45.getAdvancements().getOrStartProgress(_plr45.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr47 && _plr47.level instanceof ServerLevel
						&& _plr47.getAdvancements().getOrStartProgress(_plr47.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr52 && _plr52.level instanceof ServerLevel
						&& _plr52.getAdvancements().getOrStartProgress(_plr52.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr54 && _plr54.level instanceof ServerLevel
						&& _plr54.getAdvancements().getOrStartProgress(_plr54.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr59 && _plr59.level instanceof ServerLevel
						&& _plr59.getAdvancements().getOrStartProgress(_plr59.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr61 && _plr61.level instanceof ServerLevel
						&& _plr61.getAdvancements().getOrStartProgress(_plr61.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr66 && _plr66.level instanceof ServerLevel
						&& _plr66.getAdvancements().getOrStartProgress(_plr66.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr68 && _plr68.level instanceof ServerLevel
						&& _plr68.getAdvancements().getOrStartProgress(_plr68.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr73 && _plr73.level instanceof ServerLevel
						&& _plr73.getAdvancements().getOrStartProgress(_plr73.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr75 && _plr75.level instanceof ServerLevel
						&& _plr75.getAdvancements().getOrStartProgress(_plr75.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr80 && _plr80.level instanceof ServerLevel
						&& _plr80.getAdvancements().getOrStartProgress(_plr80.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr82 && _plr82.level instanceof ServerLevel
						&& _plr82.getAdvancements().getOrStartProgress(_plr82.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr87 && _plr87.level instanceof ServerLevel
						&& _plr87.getAdvancements().getOrStartProgress(_plr87.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr89 && _plr89.level instanceof ServerLevel
						&& _plr89.getAdvancements().getOrStartProgress(_plr89.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr94 && _plr94.level instanceof ServerLevel
						&& _plr94.getAdvancements().getOrStartProgress(_plr94.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr96 && _plr96.level instanceof ServerLevel
						&& _plr96.getAdvancements().getOrStartProgress(_plr96.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr101 && _plr101.level instanceof ServerLevel
						&& _plr101.getAdvancements().getOrStartProgress(_plr101.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr103 && _plr103.level instanceof ServerLevel
						&& _plr103.getAdvancements().getOrStartProgress(_plr103.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr108 && _plr108.level instanceof ServerLevel
						&& _plr108.getAdvancements().getOrStartProgress(_plr108.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr110 && _plr110.level instanceof ServerLevel
						&& _plr110.getAdvancements().getOrStartProgress(_plr110.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr115 && _plr115.level instanceof ServerLevel
						&& _plr115.getAdvancements().getOrStartProgress(_plr115.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr117 && _plr117.level instanceof ServerLevel
						&& _plr117.getAdvancements().getOrStartProgress(_plr117.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr122 && _plr122.level instanceof ServerLevel
						&& _plr122.getAdvancements().getOrStartProgress(_plr122.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr124 && _plr124.level instanceof ServerLevel
						&& _plr124.getAdvancements().getOrStartProgress(_plr124.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr129 && _plr129.level instanceof ServerLevel
						&& _plr129.getAdvancements().getOrStartProgress(_plr129.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr131 && _plr131.level instanceof ServerLevel
						&& _plr131.getAdvancements().getOrStartProgress(_plr131.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr136 && _plr136.level instanceof ServerLevel
						&& _plr136.getAdvancements().getOrStartProgress(_plr136.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr138 && _plr138.level instanceof ServerLevel
						&& _plr138.getAdvancements().getOrStartProgress(_plr138.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:biblically_accurate_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr143 && _plr143.level instanceof ServerLevel
						&& _plr143.getAdvancements().getOrStartProgress(_plr143.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr145 && _plr145.level instanceof ServerLevel
						&& _plr145.getAdvancements().getOrStartProgress(_plr145.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr150 && _plr150.level instanceof ServerLevel
						&& _plr150.getAdvancements().getOrStartProgress(_plr150.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr152 && _plr152.level instanceof ServerLevel
						&& _plr152.getAdvancements().getOrStartProgress(_plr152.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr157 && _plr157.level instanceof ServerLevel
						&& _plr157.getAdvancements().getOrStartProgress(_plr157.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr159 && _plr159.level instanceof ServerLevel
						&& _plr159.getAdvancements().getOrStartProgress(_plr159.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr164 && _plr164.level instanceof ServerLevel
						&& _plr164.getAdvancements().getOrStartProgress(_plr164.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr166 && _plr166.level instanceof ServerLevel
						&& _plr166.getAdvancements().getOrStartProgress(_plr166.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:monstrosity_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr171 && _plr171.level instanceof ServerLevel
						&& _plr171.getAdvancements().getOrStartProgress(_plr171.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr173 && _plr173.level instanceof ServerLevel
						&& _plr173.getAdvancements().getOrStartProgress(_plr173.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr178 && _plr178.level instanceof ServerLevel
						&& _plr178.getAdvancements().getOrStartProgress(_plr178.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr180 && _plr180.level instanceof ServerLevel
						&& _plr180.getAdvancements().getOrStartProgress(_plr180.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr185 && _plr185.level instanceof ServerLevel
						&& _plr185.getAdvancements().getOrStartProgress(_plr185.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr187 && _plr187.level instanceof ServerLevel
						&& _plr187.getAdvancements().getOrStartProgress(_plr187.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr192 && _plr192.level instanceof ServerLevel
						&& _plr192.getAdvancements().getOrStartProgress(_plr192.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr194 && _plr194.level instanceof ServerLevel
						&& _plr194.getAdvancements().getOrStartProgress(_plr194.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr199 && _plr199.level instanceof ServerLevel
						&& _plr199.getAdvancements().getOrStartProgress(_plr199.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr201 && _plr201.level instanceof ServerLevel
						&& _plr201.getAdvancements().getOrStartProgress(_plr201.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_angry_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_angry_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr206 && _plr206.level instanceof ServerLevel
						&& _plr206.getAdvancements().getOrStartProgress(_plr206.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr208 && _plr208.level instanceof ServerLevel
						&& _plr208.getAdvancements().getOrStartProgress(_plr208.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_angry_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_angry_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr213 && _plr213.level instanceof ServerLevel
						&& _plr213.getAdvancements().getOrStartProgress(_plr213.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr215 && _plr215.level instanceof ServerLevel
						&& _plr215.getAdvancements().getOrStartProgress(_plr215.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_angry_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_angry_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr220 && _plr220.level instanceof ServerLevel
						&& _plr220.getAdvancements().getOrStartProgress(_plr220.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr222 && _plr222.level instanceof ServerLevel
						&& _plr222.getAdvancements().getOrStartProgress(_plr222.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_angry_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_angry_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr227 && _plr227.level instanceof ServerLevel
						&& _plr227.getAdvancements().getOrStartProgress(_plr227.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr229 && _plr229.level instanceof ServerLevel
						&& _plr229.getAdvancements().getOrStartProgress(_plr229.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_enraged_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_enraged_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr234 && _plr234.level instanceof ServerLevel
						&& _plr234.getAdvancements().getOrStartProgress(_plr234.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr236 && _plr236.level instanceof ServerLevel
						&& _plr236.getAdvancements().getOrStartProgress(_plr236.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_enraged_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_enraged_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr241 && _plr241.level instanceof ServerLevel
						&& _plr241.getAdvancements().getOrStartProgress(_plr241.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr243 && _plr243.level instanceof ServerLevel
						&& _plr243.getAdvancements().getOrStartProgress(_plr243.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_enraged_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_enraged_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr248 && _plr248.level instanceof ServerLevel
						&& _plr248.getAdvancements().getOrStartProgress(_plr248.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr250 && _plr250.level instanceof ServerLevel
						&& _plr250.getAdvancements().getOrStartProgress(_plr250.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_enraged_engie_armor_made"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_enraged_engie_armor_made"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr255 && _plr255.level instanceof ServerLevel
						&& _plr255.getAdvancements().getOrStartProgress(_plr255.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr257 && _plr257.level instanceof ServerLevel
						&& _plr257.getAdvancements().getOrStartProgress(_plr257.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_outraged_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_outraged_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr262 && _plr262.level instanceof ServerLevel
						&& _plr262.getAdvancements().getOrStartProgress(_plr262.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr264 && _plr264.level instanceof ServerLevel
						&& _plr264.getAdvancements().getOrStartProgress(_plr264.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_outraged_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_outraged_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr269 && _plr269.level instanceof ServerLevel
						&& _plr269.getAdvancements().getOrStartProgress(_plr269.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr271 && _plr271.level instanceof ServerLevel
						&& _plr271.getAdvancements().getOrStartProgress(_plr271.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_outraged_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_outraged_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr276 && _plr276.level instanceof ServerLevel
						&& _plr276.getAdvancements().getOrStartProgress(_plr276.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr278 && _plr278.level instanceof ServerLevel
						&& _plr278.getAdvancements().getOrStartProgress(_plr278.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_outraged_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_outraged_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr283 && _plr283.level instanceof ServerLevel
						&& _plr283.getAdvancements().getOrStartProgress(_plr283.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr285 && _plr285.level instanceof ServerLevel
						&& _plr285.getAdvancements().getOrStartProgress(_plr285.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr290 && _plr290.level instanceof ServerLevel
						&& _plr290.getAdvancements().getOrStartProgress(_plr290.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr292 && _plr292.level instanceof ServerLevel
						&& _plr292.getAdvancements().getOrStartProgress(_plr292.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr297 && _plr297.level instanceof ServerLevel
						&& _plr297.getAdvancements().getOrStartProgress(_plr297.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr299 && _plr299.level instanceof ServerLevel
						&& _plr299.getAdvancements().getOrStartProgress(_plr299.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr304 && _plr304.level instanceof ServerLevel
						&& _plr304.getAdvancements().getOrStartProgress(_plr304.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr306 && _plr306.level instanceof ServerLevel
						&& _plr306.getAdvancements().getOrStartProgress(_plr306.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_biblically_accurate_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_HELMET.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_HELMET.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_HELMET.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr311 && _plr311.level instanceof ServerLevel
						&& _plr311.getAdvancements().getOrStartProgress(_plr311.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr313 && _plr313.level instanceof ServerLevel
						&& _plr313.getAdvancements().getOrStartProgress(_plr313.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_monstrosity_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_monstrosity_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_CHESTPLATE.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_CHESTPLATE.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_CHESTPLATE.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr318 && _plr318.level instanceof ServerLevel
						&& _plr318.getAdvancements().getOrStartProgress(_plr318.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr320 && _plr320.level instanceof ServerLevel
						&& _plr320.getAdvancements().getOrStartProgress(_plr320.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_monstrosity_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_monstrosity_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_LEGGINGS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_LEGGINGS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_LEGGINGS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr325 && _plr325.level instanceof ServerLevel
						&& _plr325.getAdvancements().getOrStartProgress(_plr325.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr327 && _plr327.level instanceof ServerLevel
						&& _plr327.getAdvancements().getOrStartProgress(_plr327.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_monstrosity_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_monstrosity_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (hasEntityInInventory(entity, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_BOOTS.get()))) {
			if (!new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_BOOTS.get()).isEnchanted() || new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIES_BOOTS.get()).isEnchanted()) {
				if ((entity instanceof ServerPlayer _plr332 && _plr332.level instanceof ServerLevel
						&& _plr332.getAdvancements().getOrStartProgress(_plr332.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr334 && _plr334.level instanceof ServerLevel
						&& _plr334.getAdvancements().getOrStartProgress(_plr334.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_monstrosity_engie_armor_obtained"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:antimatter_monstrosity_engie_armor_obtained"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player) {
			Inventory inventory = player.getInventory();
			List<NonNullList<ItemStack>> compartments = com.google.common.collect.ImmutableList.of(inventory.items, inventory.armor, inventory.offhand);
			for (List<ItemStack> list : compartments) {
				for (ItemStack itemstack2 : list) {
					if (itemstack.sameItem(itemstack2)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}