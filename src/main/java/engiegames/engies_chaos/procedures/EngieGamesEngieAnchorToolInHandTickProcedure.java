package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

public class EngieGamesEngieAnchorToolInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:engie_roughian_scythe_obtained"))).isDone())) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("engies_chaos:engie_roughian_scythe_obtained"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101050) {
			{
				final String _tagName = "engiegameshallowscythestatclockcount";
				final double _tagValue = 101050;
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101060) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Collectors" + " " + "Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101060
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101075) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Unremarkable" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101075
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101095) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Scarcely Lethal" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101095
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101120) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Mildly Menacing" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101120
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101150) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Somewhat Threatening" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101150
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101185) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Uncharitable" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101185
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101225) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Notably Dangerous" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101225
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101275) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Sufficiently Lethal" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101275
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101325) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Truly Feared" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101325
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101400) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Spectacularly Lethal" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101400
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101550) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Essence Spattered" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101550
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 101800) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Wicked Nasty" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 101800
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 102049) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Positively Inhumane" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 102049
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 102050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Totally Ordinary" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 102050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 102550) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Engie Destroying" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 102550
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 103550) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Rage Inducing" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 103550
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 106050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "World Clearing" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 106050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 108550) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Rare" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 108550
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 111050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Epic" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 111050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 113550) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Legendary" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 113550
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 116050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Mythic" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 116050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 121050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Exotic" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 121050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 126050) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Engie" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 126050
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 151575) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "DevEngie's Own" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 151575
				&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") < 525000) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "EngieGames's Own" + " " + "Collectors Anchor")));
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") >= 525000) {
			itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("\u00A74" + "Voidbound" + " " + "Collectors Anchor")));
		}
		if (itemstack.is(ItemTags.create(ResourceLocation.parse("allaboutengie:items/stunavilible")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}