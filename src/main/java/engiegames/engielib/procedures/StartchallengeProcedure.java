package engiegames.engielib.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import engiegames.engielib.network.EngielibModVariables;
import engiegames.engielib.EngielibMod;

public class StartchallengeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngielibModVariables.MapVariables.get(world).onlyrunonce == false) {
			EngielibModVariables.MapVariables.get(world).onlyrunonce = true;
			EngielibModVariables.MapVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "REAAE EngieLib StartChallenge");
				}
			}
			EngielibMod.queueServerWork(60, () -> {
				EngielibMod.queueServerWork(120, () -> {
					EngielibMod.queueServerWork(100, () -> {
						EngielibMod.queueServerWork(120, () -> {
							EngielibMod.queueServerWork(1, () -> {
								if (EngielibModVariables.MapVariables.get(world).stoptimecheckduetospecial == false) {
									EngielibModVariables.MapVariables.get(world).stoptimecheckduetospecial = true;
									EngielibModVariables.MapVariables.get(world).syncData(world);
								}
								if (world instanceof ServerLevel _serverLevel)
									_serverLevel.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, world.getServer());
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"give @a allaboutengie:engies_helmet{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"give @a allaboutengie:engies_chestplate{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"give @a allaboutengie:engies_leggings{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"give @a allaboutengie:engies_boots{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @a allaboutengie:mini_ban_hammer");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"give @a allaboutengie:engie_pickaxe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"give @a allaboutengie:engie_axe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"give @a allaboutengie:engie_shovel{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"give @a allaboutengie:engie_hoe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"give @a allaboutengie:challenge_insanity_engie_plush");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"give @a allaboutengie:crucifix{Damage:25}");
									}
								}
							});
						});
					});
				});
			});
		}
	}
}