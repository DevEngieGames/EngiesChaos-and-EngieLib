package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Registry;

import net.engiegames.reallaboutengie.entity.TheEndHostileEntity;
import net.engiegames.reallaboutengie.entity.SuperDoomsDayHostileEntity;
import net.engiegames.reallaboutengie.entity.DoomsDayHostileEntity;
import net.engiegames.reallaboutengie.entity.DistortedEntity;

public class EntityNameDisplayUpdateTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
			entity.setCustomName(Component.literal(("Mad Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
			entity.setCustomName(Component.literal(("Angry Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
			entity.setCustomName(Component.literal(("Enraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
			entity.setCustomName(Component.literal(("Outraged Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
			entity.setCustomName(
					Component.literal(("Biblically Accurate Engie (Hostile)" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
			entity.setCustomName(Component.literal(("Monstrosity Engie" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof DoomsDayHostileEntity) {
			entity.setCustomName(Component.literal(("Doomsday (Hostile)" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof SuperDoomsDayHostileEntity) {
			entity.setCustomName(Component.literal(("Super Doomsday (Hostile)" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof TheEndHostileEntity) {
			entity.setCustomName(Component.literal(("The End (Hostile)" + " - [" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		} else if (entity instanceof DistortedEntity) {
			entity.setCustomName(Component.literal(("\u00A7kD\u00A7rD\u00A7kI\u00A7rI\u00A7kS\u00A7rS\u00A7kT\u00A7rT\u00A7kO\u00A7rO\u00A7kR\u00A7rR\u00A7kT\u00A7rT\u00A7kE\u00A7rE\u00A7kD\u00A7rD\u00A7kD\u00A7r" + " - ["
					+ (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + "]")));
		}
	}
}