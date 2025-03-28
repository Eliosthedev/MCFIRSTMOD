
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.testmc.world.inventory.MenuMusicMenu;
import net.mcreator.testmc.world.inventory.CraftadvancedinterfaceMenu;
import net.mcreator.testmc.TestmcMod;

public class TestmcModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TestmcMod.MODID);
	public static final RegistryObject<MenuType<MenuMusicMenu>> MENU_MUSIC = REGISTRY.register("menu_music", () -> IForgeMenuType.create(MenuMusicMenu::new));
	public static final RegistryObject<MenuType<CraftadvancedinterfaceMenu>> CRAFTADVANCEDINTERFACE = REGISTRY.register("craftadvancedinterface", () -> IForgeMenuType.create(CraftadvancedinterfaceMenu::new));
}
