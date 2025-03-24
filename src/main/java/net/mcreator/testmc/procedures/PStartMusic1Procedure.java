package net.mcreator.testmc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.testmc.TestmcMod;

public class PStartMusic1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean musicLancer = false;
		if (musicLancer) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("testmc:testsong1")), SoundSource.MUSIC, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("testmc:testsong1")), SoundSource.MUSIC, 1, 1, false);
				}
			}
			musicLancer = false;
			TestmcMod.queueServerWork(2050, () -> {
			});
		} else {
			musicLancer = true;
		}
	}
}
