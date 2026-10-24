package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import java.util.Comparator;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.AvalancheBallEntity;

@Mod.EventBusSubscriber
public class AvalancheBallTickUpdateProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			EngiesChaosModVariables.MapVariables.get(world).avaballtimebeforeshrink = EngiesChaosModVariables.MapVariables.get(world).avaballtimebeforeshrink + 0.05;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).avaballtimebeforeshrink >= 5) {
				EngiesChaosModVariables.MapVariables.get(world).avaballtimebeforeshrink = 0;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					final Vec3 _center = new Vec3(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(704 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof AvalancheBallEntity) {
							if ((entityiterator instanceof AvalancheBallEntity _datEntI ? _datEntI.getEntityData().get(AvalancheBallEntity.DATA_scale) : 0) > 1) {
								if (entityiterator instanceof AvalancheBallEntity _datEntSetI)
									_datEntSetI.getEntityData().set(AvalancheBallEntity.DATA_scale, (int) ((entityiterator instanceof AvalancheBallEntity _datEntI ? _datEntI.getEntityData().get(AvalancheBallEntity.DATA_scale) : 0) - 1));
							} else if ((entityiterator instanceof AvalancheBallEntity _datEntI ? _datEntI.getEntityData().get(AvalancheBallEntity.DATA_scale) : 0) == 1) {
								if (!entityiterator.level.isClientSide())
									entityiterator.discard();
								EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount - 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
						}
					}
				}
			}
		}
	}
}