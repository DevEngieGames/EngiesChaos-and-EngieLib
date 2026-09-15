package engiegames.engies_chaos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class StunKeyTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/weak_stun"))) || itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/pickaxe_only/weak_stun")))) {
			if (itemstack.getOrCreateTag().getBoolean("usedstun") == true) {
				itemstack.getOrCreateTag().putDouble("stuntimer", (itemstack.getOrCreateTag().getDouble("stuntimer") + 0.05));
				if (itemstack.getOrCreateTag().getDouble("stuntimer") >= 20) {
					itemstack.getOrCreateTag().putBoolean("usedstun", false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:playerstunabiloffcooldown")), SoundSource.PLAYERS, (float) 0.5, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:playerstunabiloffcooldown")), SoundSource.PLAYERS, (float) 0.5, 1, false);
						}
					}
				}
			}
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/normal_stun"))) || itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/pickaxe_only/normal_stun")))) {
			if (itemstack.getOrCreateTag().getBoolean("usedstun") == true) {
				itemstack.getOrCreateTag().putDouble("stuntimer", (itemstack.getOrCreateTag().getDouble("stuntimer") + 0.05));
				if (itemstack.getOrCreateTag().getDouble("stuntimer") >= 40) {
					itemstack.getOrCreateTag().putBoolean("usedstun", false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:playerstunabiloffcooldown")), SoundSource.PLAYERS, (float) 0.5, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:playerstunabiloffcooldown")), SoundSource.PLAYERS, (float) 0.5, 1, false);
						}
					}
				}
			}
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/strong_stun"))) || itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:items/pickaxe_only/strong_stun")))) {
			if (itemstack.getOrCreateTag().getBoolean("usedstun") == true) {
				itemstack.getOrCreateTag().putDouble("stuntimer", (itemstack.getOrCreateTag().getDouble("stuntimer") + 0.05));
				if (itemstack.getOrCreateTag().getDouble("stuntimer") >= 60) {
					itemstack.getOrCreateTag().putBoolean("usedstun", false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:playerstunabiloffcooldown")), SoundSource.PLAYERS, (float) 0.5, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:playerstunabiloffcooldown")), SoundSource.PLAYERS, (float) 0.5, 1, false);
						}
					}
				}
			}
		}
	}
}