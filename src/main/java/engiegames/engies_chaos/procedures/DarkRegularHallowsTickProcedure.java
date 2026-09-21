package engiegames.engies_chaos.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class DarkRegularHallowsTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount") > 0) {
			itemstack.getOrCreateTag().putDouble("darkregularhallowskillcount", (itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount")));
			itemstack.getOrCreateTag().putDouble("engiegameshallowscythestatclockcount", 0);
		}
		if (itemstack.getOrCreateTag().getDouble("darkregularhallowskillcount") < 10000) {
			itemstack.getOrCreateTag().putBoolean("givenupgradeitem", false);
		} else if (itemstack.getOrCreateTag().getDouble("darkregularhallowskillcount") >= 10000) {
			if (itemstack.getOrCreateTag().getBoolean("givenupgradeitem") == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HALLOW_UPGRADE_TO_GOLD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				itemstack.getOrCreateTag().putBoolean("givenupgradeitem", true);
			}
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/weak_stun"))) || itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/normal_stun")))
				|| itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/strong_stun")))) {
			StunKeyTickProcedure.execute(world, entity, itemstack);
		}
	}
}