package engiegames.engieschaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class DevCheckProcedure {
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
		}.UUIDSafeParse("0b2e6bf517764c90a0797cd0addc1320")) || entity.getUUID().equals(new Object() {
			UUID UUIDSafeParse(String s) {
				try {
					return UUID.fromString(s);
				} catch (Exception e) {
				}
				return new UUID(0, 0);
			}
		}.UUIDSafeParse("0b2e6bf5-1776-4c90-a079-7cd0addc1320")) || entity.getUUID().equals(new Object() {
			UUID UUIDSafeParse(String s) {
				try {
					return UUID.fromString(s);
				} catch (Exception e) {
				}
				return new UUID(0, 0);
			}
		}.UUIDSafeParse("447fceafed574b92be559ae4a47b33bf")) || entity.getUUID().equals(new Object() {
			UUID UUIDSafeParse(String s) {
				try {
					return UUID.fromString(s);
				} catch (Exception e) {
				}
				return new UUID(0, 0);
			}
		}.UUIDSafeParse("447fceaf-ed57-4b92-be55-9ae4a47b33bf"))) {
			return true;
		}
		return false;
	}
}