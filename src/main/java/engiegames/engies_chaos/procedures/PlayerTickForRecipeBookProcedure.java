package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import engiegames.engies_chaos.world.inventory.RecipeBookVol5GUIMenu;
import engiegames.engies_chaos.world.inventory.RecipeBookVol3GUIMenu;
import engiegames.engies_chaos.world.inventory.RecipeBookVol2GUIMenu;
import engiegames.engies_chaos.world.inventory.RecipeBookVol1GUIMenu;
import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class PlayerTickForRecipeBookProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof RecipeBookVol1GUIMenu) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber < 1) {
				{
					double _setval = 1;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pageNumber = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber > 67) {
				{
					double _setval = 67;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pageNumber = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (entity instanceof Player _plr1 && _plr1.containerMenu instanceof RecipeBookVol2GUIMenu) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber < 1) {
				{
					double _setval = 1;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pageNumber = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber > 31) {
				{
					double _setval = 31;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pageNumber = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (entity instanceof Player _plr2 && _plr2.containerMenu instanceof RecipeBookVol3GUIMenu) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber < 1) {
				{
					double _setval = 1;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pageNumber = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber > 35) {
				{
					double _setval = 35;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pageNumber = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (entity instanceof Player _plr3 && _plr3.containerMenu instanceof RecipeBookVol5GUIMenu) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber < 1) {
				{
					double _setval = 1;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pageNumber = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber > 123) {
				{
					double _setval = 123;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pageNumber = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			{
				double _setval = 1;
				entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pageNumber = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}