package net.mcreator.testmc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.testmc.network.TestmcModVariables;

public class PReturnTextLabelEtatMusic1MenuMusicProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TestmcModVariables.PlayerVariables())).etatMusic1Label;
	}
}
