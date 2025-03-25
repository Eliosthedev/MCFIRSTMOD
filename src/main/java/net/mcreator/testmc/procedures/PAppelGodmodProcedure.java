package net.mcreator.testmc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.testmc.network.TestmcModVariables;

public class PAppelGodmodProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TestmcModVariables.PlayerVariables())).etatGodmod) {
			{
				boolean _setval = false;
				entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.etatGodmod = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = true;
				entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.etatGodmod = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
