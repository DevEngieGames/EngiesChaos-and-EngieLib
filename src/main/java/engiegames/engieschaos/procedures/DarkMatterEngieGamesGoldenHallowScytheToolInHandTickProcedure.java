package engiegames.engieschaos.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import engiegames.engieschaos.init.EngiesChaosModItems;

public class DarkMatterEngieGamesGoldenHallowScytheToolInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50525) {
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 50525);
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50535) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Strange" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50535 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50550) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Unremarkable" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50570) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Scarcely Lethal" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50570 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50595) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Mildly Menacing" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50595 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50625) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Somewhat Threatening" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50625 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50660) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Uncharitable" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50660 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50700) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Notably Dangerous" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50700 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50750) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Sufficiently Lethal" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50750 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50800) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Truly Feared" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50800 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 50875) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Spectacularly Lethal" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 50875 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 51025) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Essence Spattered" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 51025 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 51275) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Wicked Nasty" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 51275 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 51524) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Positively Inhumane" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 51524 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 51525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Totally Ordinary" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 51525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 52025) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Engie Destroying" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 52025 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 53025) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Rage Inducing" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 53025 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 55525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "World Clearing" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 55525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 58025) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Rare" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 58025 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 60525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Epic" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 60525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 63025) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Legendary" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 63025 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 65525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Mythic" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 65525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 70525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Exotic" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 70525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 75525) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "Engie" + " " + "Golden Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 75525 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101050) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "DevEngie's Own" + " " + "Golden Dark Matter Hallow's Scythe")));
			itemstack.getOrCreateTag().putBoolean("givenupgradeitem", false);
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101052) {
			itemstack.setHoverName(Component.literal(("\u00A76" + "EngieGames's Own" + " " + "Golden Dark Matter Hallow's Scythe")));
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
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 50525);
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("allaboutengie:items/stunavilible")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}