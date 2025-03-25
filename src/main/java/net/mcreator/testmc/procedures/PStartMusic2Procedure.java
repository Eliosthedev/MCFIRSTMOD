package net.mcreator.testmc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.testmc.network.TestmcModVariables;
import net.mcreator.testmc.TestmcMod;

import java.util.HashMap;

public class PStartMusic2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TestmcModVariables.PlayerVariables())).etatMusic2) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.MUSIC, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.MUSIC, 1, 1, false);
				}
			}
			{
				boolean _setval = false;
				entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.etatMusic2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (guistate.get("text:button_start_2") instanceof EditBox _tf)
				_tf.setValue("En cours");
		} else {
			TestmcMod.queueServerWork(60, () -> {
				{
					boolean _setval = true;
					entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.etatMusic2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (guistate.get("text:button_start_2") instanceof EditBox _tf)
					_tf.setValue("Start");
			});
		}
	}
}
