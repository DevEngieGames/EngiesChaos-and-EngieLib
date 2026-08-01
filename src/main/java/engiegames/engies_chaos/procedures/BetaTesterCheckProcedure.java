package engiegames.engies_chaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class BetaTesterCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getUUID().equals(UUIDSafeParse("2f7e986199864618a0495f65c6c3dd0f")) || entity.getUUID().equals(UUIDSafeParse("2f7e9861-9986-4618-a049-5f65c6c3dd0f"))) {
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