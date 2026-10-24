package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.init.EngiesChaosModDamageSources;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class ChallengePlushChaosProcedure {
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
			if (!world.isClientSide()) {
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE) == false
						|| EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true) {
					if ((EngiesChaosModVariables.MapVariables.get(world).DoomsdayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart
							&& EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart) == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain == false) {
							EngiesChaosModVariables.MapVariables.get(world).plushtimeuntildeathforall = EngiesChaosModVariables.MapVariables.get(world).plushtimeuntildeathforall + 0.05;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (EngiesChaosModVariables.MapVariables.get(world).plushtimeuntildeathforall >= 60 && EngiesChaosModVariables.MapVariables.get(world).BYEBYE == false) {
								EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								for (Entity entityiterator : new ArrayList<>(world.players())) {
									{
										boolean _setval = true;
										entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.crucifixbypass = _setval;
											capability.syncPlayerVariables(entityiterator);
										});
									}
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									for (Entity entityiterator : new ArrayList<>(world.players())) {
										entityiterator.hurt(EngiesChaosModDamageSources.CHALLENGE_PLUSH_FAILED, 2147483647);
									}
									EngiesChaosMod.queueServerWork(2, () -> {
										for (Entity entityiterator : new ArrayList<>(world.players())) {
											{
												boolean _setval = false;
												entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.crucifixbypass = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
										}
									});
								});
							}
							if (EngiesChaosModVariables.MapVariables.get(world).plushtimeuntildeathforall >= 30 && EngiesChaosModVariables.MapVariables.get(world).BYEBYE == true) {
								EngiesChaosModVariables.MapVariables.get(world).graceperiodbeforeplushangryagain = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								for (Entity entityiterator : new ArrayList<>(world.players())) {
									{
										boolean _setval = true;
										entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.crucifixbypass = _setval;
											capability.syncPlayerVariables(entityiterator);
										});
									}
								}
								EngiesChaosMod.queueServerWork(1, () -> {
									for (Entity entityiterator : new ArrayList<>(world.players())) {
										entityiterator.hurt(EngiesChaosModDamageSources.CHALLENGE_PLUSH_FAILED, 2147483647);
									}
									EngiesChaosMod.queueServerWork(2, () -> {
										for (Entity entityiterator : new ArrayList<>(world.players())) {
											{
												boolean _setval = false;
												entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.crucifixbypass = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
										}
									});
								});
							}
						}
					}
				}
			}
		}
	}
}