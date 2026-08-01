package engiegames.engies_chaos.procedures;

import net.neoforged.fml.ModList;

public class AttributeFixCheckProcedure {
	public static boolean execute() {
		if (!ModList.get().isLoaded("attributefix")) {
			return true;
		}
		return false;
	}
}