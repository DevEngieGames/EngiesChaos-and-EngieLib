package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class EngieGamesAnchorToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:roughian_scythe_obtained"))).isDone())) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:roughian_scythe_obtained"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 10) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Strange" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 10
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 25) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Unremarkable" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 25
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 45) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Scarcely Lethal" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 45
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 70) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Mildly Menacing" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 70
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 100) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Somewhat Threatening" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 100
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 135) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Uncharitable" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 135
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 175) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Notably Dangerous" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 175
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 225) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Sufficiently Lethal" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 225
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 275) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Truly Feared" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 275
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 350) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Spectacularly Lethal" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 350
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 500) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Essence Spattered" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 500
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 750) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Wicked Nasty" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 750
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 999) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Positively Inhumane" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 999
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 1000) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Totally Ordinary" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 1000
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 1500) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Engie Destroying" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 1500
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 2500) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Rage Inducing" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 2500
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 5000) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "World Clearing" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 5000
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 7500) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Rare" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 7500
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 10000) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Epic" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 10000
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 12500) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Legendary" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 12500
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 15000) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Mythic" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 17500
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 20000) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Exotic" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 20000
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 25000) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "Engie" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 25000
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 50525) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "DevEngie's Own" + " " + "Roughian Anchor")));
			{
				final String _tagName = "givenupgradeitem";
				final boolean _tagValue = false;
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putBoolean(_tagName, _tagValue));
			}
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 50525
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 50527) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A76" + "EngieGames's Own" + " " + "Roughian Anchor")));
			{
				final String _tagName = "engiegameshallowscythestatclockcount";
				final double _tagValue = 50525;
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HALLOW_UPGRADE_TO_GOLD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				{
					final String _tagName = "givenupgradeitem";
					final boolean _tagValue = true;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putBoolean(_tagName, _tagValue));
				}
			}
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 50527) {
			{
				final String _tagName = "engiegameshallowscythestatclockcount";
				final double _tagValue = 0;
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
		}
		if (itemstack.is(ItemTags.create(ResourceLocation.parse("allaboutengie:items/stunavilible")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}