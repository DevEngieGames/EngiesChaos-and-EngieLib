package engiegames.engieschaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import java.util.Comparator;

public class ShadowSharkEngieOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		double rx = 0;
		double ry = 0;
		double rz = 0;
		boolean entity_found = false;
		if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(200 / 2d), e -> true).isEmpty()) {
			entity.lookAt(EntityAnchorArgument.Anchor.EYES,
					new Vec3(((findEntityInWorldRange(world, Player.class, x, y, z, 300)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 300)).getY() + 1.5), ((findEntityInWorldRange(world, Player.class, x, y, z, 300)).getZ())));
			if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(25 / 2d), e -> true).isEmpty())) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Player.class, x, y, z, 300)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 300)).getY()),
							((findEntityInWorldRange(world, Player.class, x, y, z, 300)).getZ()), 1);
			} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(25 / 2d), e -> true).isEmpty()) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}