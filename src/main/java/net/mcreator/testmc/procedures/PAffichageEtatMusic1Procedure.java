package net.mcreator.testmc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.testmc.network.TestmcModVariables;
import net.mcreator.testmc.TestmcMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PAffichageEtatMusic1Procedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TestmcModVariables.PlayerVariables())).etatMusic1) {
			{
				String _setval = "Lancer";
				entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.etatMusic1Label = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = "En cours";
				entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.etatMusic1Label = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			TestmcMod.queueServerWork(1600, () -> {
				{
					boolean _setval = true;
					entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.etatMusic1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
	}
}
