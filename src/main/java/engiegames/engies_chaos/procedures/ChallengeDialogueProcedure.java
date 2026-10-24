package engiegames.engies_chaos.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.EngiesChaosMod;

public class ChallengeDialogueProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Do you know what you have just done?\",\"bold\":true,\"color\":\"gray\"}");
			}
		}
		EngiesChaosMod.queueServerWork(200, () -> {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Well...\",\"bold\":true,\"color\":\"gray\"}");
				}
			}
			EngiesChaosMod.queueServerWork(200, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"GOODBYE.\",\"bold\":true,\"color\":\"dark_red\"}");
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CHALLENGE_INSANITY_ENGIE_PLUSH.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (entityiterator instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINI_SCYTHE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entityiterator instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINI_BAN_HAMMER.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entityiterator instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.CRUCIFIX.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entityiterator instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_HELMET.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entityiterator instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_CHESTPLATE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entityiterator instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_LEGGINGS.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entityiterator instanceof Player _player) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_BOOTS.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			});
		});
	}
}