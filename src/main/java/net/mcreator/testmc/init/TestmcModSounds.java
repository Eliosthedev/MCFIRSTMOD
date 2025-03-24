
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.testmc.TestmcMod;

public class TestmcModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TestmcMod.MODID);
	public static final RegistryObject<SoundEvent> TESTSONG1 = REGISTRY.register("testsong1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("testmc", "testsong1")));
}
