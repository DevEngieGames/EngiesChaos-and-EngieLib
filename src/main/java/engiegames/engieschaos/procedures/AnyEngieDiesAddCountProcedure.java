package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.entity.PureInsanityEntity;
import engiegames.engieschaos.entity.InsanityEntity;

public class AnyEngieDiesAddCountProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
				{
					double _setval = (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount + 1;
					sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MadEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
				{
					double _setval = (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount + 1;
					sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AngryEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
				{
					double _setval = (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount + 1;
					sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EnragedEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
				{
					double _setval = (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount + 1;
					sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OutragedEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
				{
					double _setval = (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount + 1;
					sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MonstrosityEngieKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof InsanityEntity) {
				{
					double _setval = (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount + 1;
					sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.InsanityKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (entity instanceof PureInsanityEntity) {
				{
					double _setval = (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PureInsanityKillCount + 1;
					sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PureInsanityKillCount = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}