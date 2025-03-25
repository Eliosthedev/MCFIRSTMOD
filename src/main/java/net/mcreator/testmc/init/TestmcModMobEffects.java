
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.testmc.potion.PEGodmodMobEffect;
import net.mcreator.testmc.TestmcMod;

public class TestmcModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TestmcMod.MODID);
	public static final RegistryObject<MobEffect> PE_GODMOD = REGISTRY.register("pe_godmod", () -> new PEGodmodMobEffect());
}
