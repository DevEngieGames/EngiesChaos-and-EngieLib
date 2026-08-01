package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

public class DarkMatterEngieGamesEngieHallowScytheToolInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101050) {
			{
				final String _tagName = "engiegameshallowscythestatclockcount";
				final double _tagValue = 101050;
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101060) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Collectors" + " " + "Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101060
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101075) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Unremarkable" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101075
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101095) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Scarcely Lethal" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101095
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101120) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Mildly Menacing" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101120
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101150) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Somewhat Threatening" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101150
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101185) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Uncharitable" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101185
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101225) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Notably Dangerous" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101225
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101275) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Sufficiently Lethal" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101275
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101325) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Truly Feared" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101325
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101400) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Spectacularly Lethal" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101400
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101550) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Essence Spattered" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101550
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101800) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Wicked Nasty" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101800
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 102049) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Positively Inhumane" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 102049
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 102050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Totally Ordinary" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 102050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 102550) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Engie Destroying" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 102550
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 103550) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Rage Inducing" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 103550
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 106050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "World Clearing" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 106050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 108550) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Rare" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 108550
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 111050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Epic" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 111050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 113550) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Legendary" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 113550
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 116050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Mythic" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 116050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 121050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Exotic" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 121050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 126050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Engie" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 126050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 151575) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "DevEngie's Own" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 151575
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 525000) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "EngieGames's Own" + " " + "Collectors Dark Matter Hallow's Scythe")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 525000) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Voidbound" + " " + "Collectors Dark Matter Hallow's Scythe")));
		}
		if (itemstack.is(ItemTags.create(ResourceLocation.parse("allaboutengie:items/stunavilible")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}