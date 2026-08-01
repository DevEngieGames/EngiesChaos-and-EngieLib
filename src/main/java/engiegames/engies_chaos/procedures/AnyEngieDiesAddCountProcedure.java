package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.PureInsanityEntity;
import engiegames.engies_chaos.entity.InsanityEntity;

public class AnyEngieDiesAddCountProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/mad_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.MadEngieKillCount = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).MadEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/angry_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.AngryEngieKillCount = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/enraged_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.EnragedEngieKillCount = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).EnragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/outraged_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.OutragedEngieKillCount = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).OutragedEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/biblicallyhostile")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.HostileBiblicallyKillCount = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).HostileBiblicallyKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/monstrosity_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.MonstrosityEngieKillCount = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/hostile_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.HostileEngieKillCount = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).HostileEngieKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof InsanityEntity) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.InsanityKillCount = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).InsanityKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			} else if (entity instanceof PureInsanityEntity) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.InsanityKillCount = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).InsanityKillCount + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			}
		} else if ((sourceentity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:sharkos")))) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/mad_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.MadEngieKillCount = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES).MadEngieKillCount + 1;
					_vars.syncPlayerVariables((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/angry_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.AngryEngieKillCount = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES).AngryEngieKillCount + 1;
					_vars.syncPlayerVariables((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/enraged_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.EnragedEngieKillCount = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES).EnragedEngieKillCount + 1;
					_vars.syncPlayerVariables((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/outraged_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.OutragedEngieKillCount = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES).OutragedEngieKillCount + 1;
					_vars.syncPlayerVariables((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/biblicallyhostile")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.HostileBiblicallyKillCount = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES).HostileBiblicallyKillCount + 1;
					_vars.syncPlayerVariables((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/monstrosity_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.MonstrosityEngieKillCount = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES).MonstrosityEngieKillCount + 1;
					_vars.syncPlayerVariables((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
				}
			} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/hostile_engie")))) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.HostileEngieKillCount = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES).HostileEngieKillCount + 1;
					_vars.syncPlayerVariables((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
				}
			} else if (entity instanceof InsanityEntity) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.InsanityKillCount = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES).InsanityKillCount + 1;
					_vars.syncPlayerVariables((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
				}
			} else if (entity instanceof PureInsanityEntity) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.InsanityKillCount = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES).InsanityKillCount + 1;
					_vars.syncPlayerVariables((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
				}
			}
		}
	}
}