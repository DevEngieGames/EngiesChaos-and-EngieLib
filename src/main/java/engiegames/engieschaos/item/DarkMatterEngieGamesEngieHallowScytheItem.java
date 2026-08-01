package engiegames.engieschaos.item;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.List;

import engiegames.engieschaos.procedures.EngieGamesHallowScytheSpecialInformationProcedure;
import engiegames.engieschaos.procedures.DarkMatterEngieGamesEngieHallowScytheToolInHandTickProcedure;
import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class DarkMatterEngieGamesEngieHallowScytheItem extends SwordItem {
	public DarkMatterEngieGamesEngieHallowScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 160f;
			}

			public float getAttackDamageBonus() {
				return 14296f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_WEAPONS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		String hoverText = EngieGamesHallowScytheSpecialInformationProcedure.execute(level instanceof Level ? (LevelAccessor) level : null, itemstack);
		if (hoverText != null) {
			for (String line : hoverText.split("\n")) {
				list.add(Component.literal(line));
			}
		}
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		DarkMatterEngieGamesEngieHallowScytheToolInHandTickProcedure.execute(world, entity, itemstack);
	}
}