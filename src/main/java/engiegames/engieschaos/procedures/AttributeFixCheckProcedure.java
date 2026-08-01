package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.ModList;

public class AttributeFixCheckProcedure {
	public static boolean execute() {
		if (!ModList.get().isLoaded("attributefix")) {
			return true;
		}
		return false;
	}
}