
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.testmc.item.TESTTOLLSwordItem;
import net.mcreator.testmc.item.TESTTOLLShovelItem;
import net.mcreator.testmc.item.TESTTOLLPickaxeItem;
import net.mcreator.testmc.item.TESTTOLLHoeItem;
import net.mcreator.testmc.item.TESTTOLLAxeItem;
import net.mcreator.testmc.TestmcMod;

public class TestmcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestmcMod.MODID);
	public static final RegistryObject<Item> TESTTOLL_PICKAXE = REGISTRY.register("testtoll_pickaxe", () -> new TESTTOLLPickaxeItem());
	public static final RegistryObject<Item> TESTTOLL_AXE = REGISTRY.register("testtoll_axe", () -> new TESTTOLLAxeItem());
	public static final RegistryObject<Item> TESTTOLL_SWORD = REGISTRY.register("testtoll_sword", () -> new TESTTOLLSwordItem());
	public static final RegistryObject<Item> TESTTOLL_SHOVEL = REGISTRY.register("testtoll_shovel", () -> new TESTTOLLShovelItem());
	public static final RegistryObject<Item> TESTTOLL_HOE = REGISTRY.register("testtoll_hoe", () -> new TESTTOLLHoeItem());
	// Start of user code block custom items
	// End of user code block custom items
}
