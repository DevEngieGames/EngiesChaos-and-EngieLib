package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

public class DarkMatterEngieGamesEngieHallowScytheToolInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101050) {
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 101050);
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101060) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Collectors" + " " + "Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101060 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101075) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Unremarkable" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101075 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101095) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Scarcely Lethal" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101095 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101120) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Mildly Menacing" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101120 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101150) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Somewhat Threatening" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101150 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101185) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Uncharitable" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101185 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101225) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Notably Dangerous" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101225 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101275) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Sufficiently Lethal" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101275 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101325) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Truly Feared" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101325 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101400) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Spectacularly Lethal" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101400 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101550) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Essence Spattered" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101800) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Wicked Nasty" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101800 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 102049) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Positively Inhumane" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 102049 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 102050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Totally Ordinary" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 102050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 102550) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Engie Destroying" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 102550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 103550) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Rage Inducing" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 103550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 106050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "World Clearing" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 106050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 108550) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Rare" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 108550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 111050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Epic" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 111050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 113550) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Legendary" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 113550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 116050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Mythic" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 116050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 121050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Exotic" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 121050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 126050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Engie" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 126050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 151575) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "DevEngie's Own" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 151575 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 525000) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "EngieGames's Own" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 525000) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Voidbound" + " " + "Collectors Dark Matter Hallow's Scythe")));
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("allaboutengie:items/stunavilible")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}