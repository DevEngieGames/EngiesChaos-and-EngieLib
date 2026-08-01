package engiegames.engies_chaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class TesterCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getUUID().equals(UUIDSafeParse("29930f5dd23e47b6aad6e04406663341")) || entity.getUUID().equals(UUIDSafeParse("29930f5d-d23e-47b6-aad6-e04406663341"))) {
			return true;
		}
		return false;
	}

	private static UUID UUIDSafeParse(String s) {
		try {
			return UUID.fromString(s);
		} catch (Exception e) {
		}
		return new UUID(0, 0);
	}
}