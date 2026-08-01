package engiegames.engielib.procedures;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import java.util.UUID;

@EventBusSubscriber
public class PlayerTagCheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (ModList.get().isLoaded("engies_chaos")) {
			if (entity.getUUID().equals(UUIDSafeParse("0b2e6bf517764c90a0797cd0addc1320")) || entity.getUUID().equals(UUIDSafeParse("0b2e6bf5-1776-4c90-a079-7cd0addc1320"))) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == false) {
					entity.getPersistentData().putBoolean("EngiesChaos_Dev", true);
				}
			} else if (entity.getUUID().equals(UUIDSafeParse("447fceafed574b92be559ae4a47b33bf")) || entity.getUUID().equals(UUIDSafeParse("447fceaf-ed57-4b92-be55-9ae4a47b33bf"))) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == false) {
					entity.getPersistentData().putBoolean("EngiesChaos_Dev", true);
				}
			} else if (entity.getUUID().equals(UUIDSafeParse("797281dfd9d54be29a566f69e0bd189a")) || entity.getUUID().equals(UUIDSafeParse("797281df-d9d5-4be2-9a56-6f69e0bd189a"))) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Contributor") == false) {
					entity.getPersistentData().putBoolean("EngiesChaos_Contributor", true);
				}
			} else if (entity.getUUID().equals(UUIDSafeParse("3d64b3baca8d4771a98efc748a27d9c9")) || entity.getUUID().equals(UUIDSafeParse("3d64b3ba-ca8d-4771-a98e-fc748a27d9c9"))) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Contributor") == false) {
					entity.getPersistentData().putBoolean("EngiesChaos_Contributor", true);
				}
			} else if (entity.getUUID().equals(UUIDSafeParse("253d8148104445bf92514dcd9fdf3f96")) || entity.getUUID().equals(UUIDSafeParse("253d8148-1044-45bf-9251-4dcd9fdf3f96"))) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Contributor") == false) {
					entity.getPersistentData().putBoolean("EngiesChaos_Contributor", true);
				}
			} else if (entity.getUUID().equals(UUIDSafeParse("2f7e986199864618a0495f65c6c3dd0f")) || entity.getUUID().equals(UUIDSafeParse("2f7e9861-9986-4618-a049-5f65c6c3dd0f"))) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_BetaTester") == false) {
					entity.getPersistentData().putBoolean("EngiesChaos_BetaTester", true);
				}
			} else if (entity.getUUID().equals(UUIDSafeParse("29930f5dd23e47b6aad6e04406663341")) || entity.getUUID().equals(UUIDSafeParse("29930f5d-d23e-47b6-aad6-e04406663341"))) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Tester") == false) {
					entity.getPersistentData().putBoolean("EngiesChaos_Tester", true);
				}
			} else if (entity.getUUID().equals(UUIDSafeParse("668211ac1e804cd3bdde723012fad255")) || entity.getUUID().equals(UUIDSafeParse("668211ac-1e80-4cd3-bdde-723012fad255"))) {
				if (entity.getPersistentData().getBoolean("EngiesChaos_CC") == false) {
					entity.getPersistentData().putBoolean("EngiesChaos_CC", true);
				}
			} else {
				if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true || entity.getPersistentData().getBoolean("") == true || entity.getPersistentData().getBoolean("EngiesChaos_CC") == true
						|| entity.getPersistentData().getBoolean("EngiesChaos_BetaTester") == true || entity.getPersistentData().getBoolean("EngiesChaos_Tester") == true) {
					entity.getPersistentData().putBoolean("EngiesChaos_Dev", false);
					entity.getPersistentData().putBoolean("EngiesChaos_Contributor", false);
					entity.getPersistentData().putBoolean("EngiesChaos_BetaTester", false);
					entity.getPersistentData().putBoolean("EngiesChaos_Tester", false);
					entity.getPersistentData().putBoolean("EngiesChaos_CC", false);
				}
			}
		}
	}

	private static UUID UUIDSafeParse(String s) {
		try {
			return UUID.fromString(s);
		} catch (Exception e) {
		}
		return new UUID(0, 0);
	}
}