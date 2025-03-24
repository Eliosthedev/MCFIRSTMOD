
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
import net.mcreator.testmc.world.inventory.MenuCultivationMenu;
import net.mcreator.testmc.TestmcMod;

public class TestmcModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TestmcMod.MODID);
	public static final RegistryObject<MenuType<MenuCultivationMenu>> MENU_CULTIVATION = REGISTRY.register("menu_cultivation", () -> IForgeMenuType.create(MenuCultivationMenu::new));
	public static final RegistryObject<MenuType<MenuMusicMenu>> MENU_MUSIC = REGISTRY.register("menu_music", () -> IForgeMenuType.create(MenuMusicMenu::new));
}
