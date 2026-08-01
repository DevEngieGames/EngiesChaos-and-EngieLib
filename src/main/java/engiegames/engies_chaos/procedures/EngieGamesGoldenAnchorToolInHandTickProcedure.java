package engiegames.engies_chaos.procedures;

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

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class EngieGamesGoldenAnchorToolInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_roughian_scythe_obtained"))).isDone())) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_roughian_scythe_obtained"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50525) {
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 50525);
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50535) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Strange" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50535 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50550) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Unremarkable" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50570) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Scarcely Lethal" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50570 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50595) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Mildly Menacing" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50595 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50625) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Somewhat Threatening" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50625 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50660) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Uncharitable" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50660 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50700) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Notably Dangerous" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50700 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50750) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Sufficiently Lethal" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50750 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50800) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Truly Feared" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50800 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50875) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Spectacularly Lethal" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50875 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 51025) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Essence Spattered" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 51025 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 51275) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Wicked Nasty" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 51275 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 51524) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Positively Inhumane" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 51524 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 51525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Totally Ordinary" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 51525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 52025) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Engie Destroying" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 52025 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 53025) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Rage Inducing" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 53025 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 55525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "World Clearing" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 55525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 58025) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Rare" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 58025 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 60525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Epic" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 60525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 63025) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Legendary" + " " + "Golden Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 63025 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 65525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Mythic" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 65525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 70525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Exotic" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 70525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 75525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Engie" + " " + "Golden Roughian Anchor")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 75525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101050) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "DevEngie's Own" + " " + "Golden Roughian Anchor")));
			itemstack.getOrCreateTag().putBoolean("givenupgradeitem", false);
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101052) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "EngieGame's Own" + " " + "Golden Roughian Anchor")));
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 101050);
			if (itemstack.getOrCreateTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.GOLD_HALLOW_UPGRADE_TO_COLLECTOR.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				itemstack.getOrCreateTag().putBoolean("givenupgradeitem", true);
			}
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101052) {
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 0);
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("allaboutengie:items/stunavilible")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}