package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModEntities;
import engiegames.engieschaos.entity.XEngieGamesEntity;
import engiegames.engieschaos.entity.TheRealEngieGamesHalloweenEntity;
import engiegames.engieschaos.entity.TheRealEngieGamesEntity;
import engiegames.engieschaos.entity.TheEndEntity;
import engiegames.engieschaos.entity.SuperDoomsDayEntity;
import engiegames.engieschaos.entity.ScorchedEntity;
import engiegames.engieschaos.entity.RoughianTheRealEngieGamesEntity;
import engiegames.engieschaos.entity.MindscapeEngieEntity;
import engiegames.engieschaos.entity.EngieGamesEntity;
import engiegames.engieschaos.entity.DoomsDayEntity;
import engiegames.engieschaos.entity.CosmicTheRealEngieGamesEntity;
import engiegames.engieschaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class TraderDiesProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/tradeable")))) {
			EngiesChaosMod.queueServerWork(1, () -> {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).crucifixsavedentity == false) {
					if (entity instanceof DoomsDayEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof SuperDoomsDayEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof TheEndEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberoftheend = EngiesChaosModVariables.MapVariables.get(world).numberoftheend - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof EngieGamesEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = EngiesChaosModVariables.MapVariables.get(world).numberofdistorted - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof MindscapeEngieEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable = EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof TheRealEngieGamesEntity || entity instanceof TheRealEngieGamesHalloweenEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof ScorchedEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof CosmicTheRealEngieGamesEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof RoughianTheRealEngieGamesEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof XEngieGamesEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new XEngieGamesEntity(EngiesChaosModEntities.X_ENGIE_GAMES.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z()));
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			});
		}
	}
}