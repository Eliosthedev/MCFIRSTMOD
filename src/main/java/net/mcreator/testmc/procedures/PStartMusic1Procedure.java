package net.mcreator.testmc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.testmc.network.TestmcModVariables;
import net.mcreator.testmc.TestmcMod;

public class PStartMusic1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TestmcModVariables.PlayerVariables())).etatMusic1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("testmc:testsong1")), SoundSource.MUSIC, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("testmc:testsong1")), SoundSource.MUSIC, 1, 1, false);
				}
			}
			{
				boolean _setval = false;
				entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.etatMusic1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "En cours";
				entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.etatMusic1Label = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			TestmcMod.queueServerWork(1600, () -> {
				{
					boolean _setval = true;
					entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.etatMusic1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Lancer";
					entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.etatMusic1Label = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
	}
}
