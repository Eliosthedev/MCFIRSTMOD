package net.mcreator.testmc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.testmc.network.TestmcModVariables;

public class PReturnTextLabelMusic2MenuMusicProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TestmcModVariables.PlayerVariables())).etatMusic2Label;
	}
}
