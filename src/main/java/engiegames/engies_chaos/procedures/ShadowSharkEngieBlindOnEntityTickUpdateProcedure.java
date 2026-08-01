package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Comparator;
import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ShadowSharkEngieBlindOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		double rx = 0;
		double ry = 0;
		double rz = 0;
		boolean entity_found = false;
		Entity player = null;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			player = entityiterator;
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(200 / 2d), e -> true).isEmpty()) {
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((player.getX()), (player.getY() + 1.6), (player.getZ())));
				if (player.getData(EngiesChaosModVariables.PLAYER_VARIABLES).BlindShadowSharkEngieAttack == false) {
					if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(100 / 2d), e -> true).isEmpty())) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("spreadplayers " + player.getX() + " " + player.getZ() + " 25 50 false @s"));
							}
						}
					} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(5 / 2d), e -> true).isEmpty()) {
						if (!entity.level().isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ENCHANT, x, y, z, 15, 1, 2, 1, 1);
					} else {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().stop();
					}
				} else if (player.getData(EngiesChaosModVariables.PLAYER_VARIABLES).BlindShadowSharkEngieAttack == true) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((player.getX()), (player.getY()), (player.getZ()), 1);
				}
			}
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(2 / 2d), e -> true).isEmpty()) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (findEntityInWorldRange(world, Player.class, x, y, z, 4)).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.BlindShadowSharkEngieAttack = false;
					_vars.syncPlayerVariables((findEntityInWorldRange(world, Player.class, x, y, z, 4)));
				}
				(findEntityInWorldRange(world, Player.class, x, y, z, 4)).hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
				if ((findEntityInWorldRange(world, Player.class, x, y, z, 4)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 120, 255, false, false));
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}