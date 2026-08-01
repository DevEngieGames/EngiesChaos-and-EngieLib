package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class TechnoPickaxeFailCheckProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).playerkilledmobswithoutpickaxeonlycount > 0) {
			itemstack.getOrCreateTag().putBoolean("playerfailedtechnochallenge", true);
		}
	}
}