package engiegames.engieschaos.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import engiegames.engieschaos.init.EngiesChaosModItems;

public class EngieGamesAnchorToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:roughian_scythe_obtained"))).isDone())) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:roughian_scythe_obtained"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 10) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Strange" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 10 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 25) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Unremarkable" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 25 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 45) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Scarcely Lethal" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 45 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 70) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Mildly Menacing" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 70 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 100) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Somewhat Threatening" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 100 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 135) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Uncharitable" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 135 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 175) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Notably Dangerous" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 175 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 225) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Sufficiently Lethal" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 225 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 275) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Truly Feared" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 275 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 350) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Spectacularly Lethal" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 350 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Essence Spattered" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 750) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Wicked Nasty" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 750 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 999) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Positively Inhumane" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 999 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 1000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Totally Ordinary" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 1000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 1500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Engie Destroying" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 1500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 2500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Rage Inducing" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 2500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 5000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "World Clearing" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 5000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 7500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Rare" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 7500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 10000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Epic" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 10000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 12500) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Legendary" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 12500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 15000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Mythic" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 17500 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 20000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Exotic" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 20000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 25000) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Engie" + " " + "Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 25000 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "DevEngie's Own" + " " + "Roughian Anchor")));
			itemstack.getOrCreateTag().putBoolean("givenupgradeitem", false);
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50527) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "EngieGames's Own" + " " + "Roughian Anchor")));
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 50525);
			if (itemstack.getOrCreateTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HALLOW_UPGRADE_TO_GOLD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				itemstack.getOrCreateTag().putBoolean("givenupgradeitem", true);
			}
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50527) {
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 0);
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("allaboutengie:items/stunavilible")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}