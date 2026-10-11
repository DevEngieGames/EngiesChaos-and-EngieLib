package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

@Mod.EventBusSubscriber
public class ModeCheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP) == true) {
			if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity1.getAttribute(Attributes.MAX_HEALTH).setBaseValue(1);
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).healthreductiondday == true) {
				if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity3.getAttribute(Attributes.MAX_HEALTH).setBaseValue(25);
			} else {
				if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity4.getAttribute(Attributes.MAX_HEALTH).setBaseValue(12.5);
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) == true) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).healthreductiondday == true
					&& world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == true) {
				if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity7.getAttribute(Attributes.MAX_HEALTH).setBaseValue(50);
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).healthreductiondday == true
					&& world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == false) {
				if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity9.getAttribute(Attributes.MAX_HEALTH).setBaseValue(100);
			} else {
				if (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity10.getAttribute(Attributes.MAX_HEALTH).setBaseValue(25);
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO) == true) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).healthreductiondday == true
					&& world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == true) {
				if (entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity13.getAttribute(Attributes.MAX_HEALTH).setBaseValue(50);
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).healthreductiondday == true
					&& world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == false) {
				if (entity instanceof LivingEntity _livingEntity15 && _livingEntity15.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity15.getAttribute(Attributes.MAX_HEALTH).setBaseValue(100);
			} else {
				if (entity instanceof LivingEntity _livingEntity16 && _livingEntity16.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity16.getAttribute(Attributes.MAX_HEALTH).setBaseValue(50);
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_ONE) == true) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).healthreductiondday == true
					&& world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == true) {
				if (entity instanceof LivingEntity _livingEntity19 && _livingEntity19.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity19.getAttribute(Attributes.MAX_HEALTH).setBaseValue(50);
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).healthreductiondday == true
					&& world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == false) {
				if (entity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity21.getAttribute(Attributes.MAX_HEALTH).setBaseValue(100);
			} else {
				if (entity instanceof LivingEntity _livingEntity22 && _livingEntity22.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity22.getAttribute(Attributes.MAX_HEALTH).setBaseValue(75);
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == true) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).healthreductiondday == true) {
				if (entity instanceof LivingEntity _livingEntity24 && _livingEntity24.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity24.getAttribute(Attributes.MAX_HEALTH).setBaseValue(50);
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY) == true) {
				if (entity instanceof LivingEntity _livingEntity26 && _livingEntity26.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity26.getAttribute(Attributes.MAX_HEALTH).setBaseValue(150);
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.NIGHTMARE_DIFFICULTY) == true) {
				if (entity instanceof LivingEntity _livingEntity28 && _livingEntity28.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity28.getAttribute(Attributes.MAX_HEALTH).setBaseValue(125);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				if (entity instanceof LivingEntity _livingEntity30 && _livingEntity30.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity30.getAttribute(Attributes.MAX_HEALTH).setBaseValue(100);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				if (entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity32.getAttribute(Attributes.MAX_HEALTH).setBaseValue(75);
			} else if (world.getDifficulty() == Difficulty.EASY) {
				if (entity instanceof LivingEntity _livingEntity34 && _livingEntity34.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity34.getAttribute(Attributes.MAX_HEALTH).setBaseValue(50);
			} else if (world.getDifficulty() == Difficulty.PEACEFUL) {
				if (entity instanceof LivingEntity _livingEntity36 && _livingEntity36.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity36.getAttribute(Attributes.MAX_HEALTH).setBaseValue(25);
			}
		} else {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).healthreductiondday == true) {
				if (entity instanceof LivingEntity _livingEntity37 && _livingEntity37.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity37.getAttribute(Attributes.MAX_HEALTH).setBaseValue(100);
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY) == true) {
				if (entity instanceof LivingEntity _livingEntity39 && _livingEntity39.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity39.getAttribute(Attributes.MAX_HEALTH).setBaseValue(300);
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.NIGHTMARE_DIFFICULTY) == true) {
				if (entity instanceof LivingEntity _livingEntity41 && _livingEntity41.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity41.getAttribute(Attributes.MAX_HEALTH).setBaseValue(250);
			} else if (world.getDifficulty() == Difficulty.HARD) {
				if (entity instanceof LivingEntity _livingEntity43 && _livingEntity43.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity43.getAttribute(Attributes.MAX_HEALTH).setBaseValue(200);
			} else if (world.getDifficulty() == Difficulty.NORMAL) {
				if (entity instanceof LivingEntity _livingEntity45 && _livingEntity45.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity45.getAttribute(Attributes.MAX_HEALTH).setBaseValue(150);
			} else if (world.getDifficulty() == Difficulty.EASY) {
				if (entity instanceof LivingEntity _livingEntity47 && _livingEntity47.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity47.getAttribute(Attributes.MAX_HEALTH).setBaseValue(100);
			} else if (world.getDifficulty() == Difficulty.PEACEFUL) {
				if (entity instanceof LivingEntity _livingEntity49 && _livingEntity49.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity49.getAttribute(Attributes.MAX_HEALTH).setBaseValue(50);
			}
		}
	}
}