package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import engiegames.engies_chaos.world.inventory.RecipeBookVol5GUIMenu;
import engiegames.engies_chaos.world.inventory.RecipeBookVol3GUIMenu;
import engiegames.engies_chaos.world.inventory.RecipeBookVol2GUIMenu;
import engiegames.engies_chaos.world.inventory.RecipeBookVol1GUIMenu;
import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class PlayerTick2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity instanceof Player _plr1 && _plr1.containerMenu instanceof RecipeBookVol1GUIMenu) {
				if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber > 66) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.pageNumber = 66;
						_vars.syncPlayerVariables(entity);
					}
				} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber < 1) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.pageNumber = 1;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else if (entity instanceof Player _plr2 && _plr2.containerMenu instanceof RecipeBookVol2GUIMenu) {
				if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber > 30) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.pageNumber = 30;
						_vars.syncPlayerVariables(entity);
					}
				} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber < 1) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.pageNumber = 1;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else if (entity instanceof Player _plr3 && _plr3.containerMenu instanceof RecipeBookVol3GUIMenu) {
				if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber > 29) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.pageNumber = 29;
						_vars.syncPlayerVariables(entity);
					}
				} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber < 1) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.pageNumber = 1;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else if (entity instanceof Player _plr4 && _plr4.containerMenu instanceof RecipeBookVol5GUIMenu) {
				if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber > 127) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.pageNumber = 127;
						_vars.syncPlayerVariables(entity);
					}
				} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber < 1) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.pageNumber = 1;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else {
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.pageNumber = 1;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}