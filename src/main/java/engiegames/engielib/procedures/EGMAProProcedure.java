package engiegames.engielib.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import java.util.UUID;

public class EGMAProProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (ModList.get().isLoaded("engies_chaos")) {
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
			}.UUIDSafeParse("447fceaf-ed57-4b92-be55-9ae4a47b33bf")) || entity.getUUID().equals(new Object() {
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
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.ADVENTURE);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76egmc, egms, egmsp for other modes"), false);
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
			}
		} else {
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
			}.UUIDSafeParse("668211ac1e804cd3bdde723012fad255")) || entity.getUUID().equals(new Object() {
				UUID UUIDSafeParse(String s) {
					try {
						return UUID.fromString(s);
					} catch (Exception e) {
					}
					return new UUID(0, 0);
				}
			}.UUIDSafeParse("668211ac-1e80-4cd3-bdde-723012fad255"))) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.ADVENTURE);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76egmc, egms, egmsp for other modes"), false);
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just Engie."), false);
			}
		}
	}
}