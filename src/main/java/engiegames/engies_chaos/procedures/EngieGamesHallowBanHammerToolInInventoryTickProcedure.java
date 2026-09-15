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
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class EngieGamesHallowBanHammerToolInInventoryTickProcedure {
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
		if (itemstack.getOrCreateTag().getDouble("hallowbanhammerkillcount") < 10000) {
			itemstack.getOrCreateTag().putBoolean("givenupgradeitem", false);
		} else if (itemstack.getOrCreateTag().getDouble("hallowbanhammerkillcount") >= 10000) {
			if (itemstack.getOrCreateTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HALLOW_UPGRADE_TO_GOLD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				itemstack.getOrCreateTag().putBoolean("givenupgradeitem", true);
			}
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/strong_stun"))) || itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/normal_stun")))
				|| itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/strong_stun")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}