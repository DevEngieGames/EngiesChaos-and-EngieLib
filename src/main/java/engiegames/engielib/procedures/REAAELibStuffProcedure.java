package engiegames.engielib.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class REAAELibStuffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "LibNeed")).equals("EChaos")) {
			if ((StringArgumentType.getString(arguments, "LibStuff")).equals("darkness")) {
				DarknessProcedure.execute(world, x, y, z);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("missile")) {
				MissileProcedure.execute(world);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("lightning")) {
				LightningProcedure.execute(world);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("lightning2")) {
				Lightning2Procedure.execute(world);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("rift")) {
				RiftProcedure.execute(world);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("spike")) {
				SpikeProcedure.execute(world);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("startchallenge")) {
				StartchallengeProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("challengecompleted")) {
				ChallengeCompletionProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("startchallenge")) {
				StartchallengeProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("giveoperatorgear")) {
				OperatorGearProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("givestartergear")) {
				StarterGearProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("givestartergearez")) {
				StarterGearEZProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("givedevelopergear")) {
				DeveloperGearProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("giveideagivergear")) {
				IdeaGiverGearProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("givebetatestergear")) {
				BetaTesterGearProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("givetestergear")) {
				TesterGearProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("givecontentcreatorgear")) {
				ContentCreatorProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "LibStuff")).equals("refresh")) {
				RefreshProcedure.execute(world);
			}
		}
	}
}