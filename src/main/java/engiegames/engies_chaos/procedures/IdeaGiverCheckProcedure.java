package engiegames.engies_chaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class IdeaGiverCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getUUID().equals(UUIDSafeParse("3d64b3baca8d4771a98efc748a27d9c9")) || entity.getUUID().equals(UUIDSafeParse("3d64b3ba-ca8d-4771-a98e-fc748a27d9c9")) || entity.getUUID().equals(UUIDSafeParse("253d8148104445bf92514dcd9fdf3f96"))
				|| entity.getUUID().equals(UUIDSafeParse("253d8148-1044-45bf-9251-4dcd9fdf3f96"))) {
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