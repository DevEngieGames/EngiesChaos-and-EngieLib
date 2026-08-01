package engiegames.engies_chaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class ContentCreatorCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getUUID().equals(new Object() {
			UUID UUIDSafeParse(String s) {
				try {
					return UUID.fromString(s);
				} catch (Exception e) {
				}
				return new UUID(0, 0);
			}
		}.UUIDSafeParse("668211ac1e804cd3bdde723012fad255")) || entity.getUUID().equals(new Object() {
			UUID UUIDSafeParse(String s) {
				try {
					return UUID.fromString(s);
				} catch (Exception e) {
				}
				return new UUID(0, 0);
			}
		}.UUIDSafeParse("668211ac-1e80-4cd3-bdde-723012fad255"))) {
			return true;
		}
		return false;
	}
}