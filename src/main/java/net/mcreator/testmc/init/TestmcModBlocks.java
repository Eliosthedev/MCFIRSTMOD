
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.testmc.block.CRAFTadvancedBlock;
import net.mcreator.testmc.TestmcMod;

public class TestmcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestmcMod.MODID);
	public static final RegistryObject<Block> CRAF_TADVANCED = REGISTRY.register("craf_tadvanced", () -> new CRAFTadvancedBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
