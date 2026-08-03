package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

public class EngieGamesEngieHallowScytheToolInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_roughian_scythe_obtained"))).isDone())) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_roughian_scythe_obtained"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101050) {
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 101050);
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101060) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Collectors" + " " + "Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101060 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101075) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Unremarkable" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101075 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101095) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Scarcely Lethal" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101095 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101120) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Mildly Menacing" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101120 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101150) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Somewhat Threatening" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101150 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101185) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Uncharitable" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101185 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101225) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Notably Dangerous" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101225 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101275) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Sufficiently Lethal" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101275 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101325) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Truly Feared" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101325 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101400) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Spectacularly Lethal" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101400 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101550) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Essence Spattered" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 101800) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Wicked Nasty" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 101800 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 102049) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Positively Inhumane" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 102049 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 102050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Totally Ordinary" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 102050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 102550) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Engie Destroying" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 102550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 103550) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Rage Inducing" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 103550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 106050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "World Clearing" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 106050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 108550) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Rare" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 108550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 111050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Epic" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 111050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 113550) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Legendary" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 113550 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 116050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Mythic" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 116050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 121050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Exotic" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 121050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 126050) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Engie" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 126050 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 151575) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "DevEngie's Own" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 151575 && itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") < 525000) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "EngieGames's Own" + " " + "Collectors Hallow Scythe")));
		} else if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") >= 525000) {
			itemstack.setHoverName(Component.literal(("\u00A74" + "Voidbound" + " " + "Collectors Hallow Scythe")));
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("allaboutengie:items/stunavilible")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}