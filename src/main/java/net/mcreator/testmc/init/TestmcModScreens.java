
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmc.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.testmc.client.gui.MenuMusicScreen;
import net.mcreator.testmc.client.gui.CraftadvancedinterfaceScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TestmcModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TestmcModMenus.MENU_MUSIC.get(), MenuMusicScreen::new);
			MenuScreens.register(TestmcModMenus.CRAFTADVANCEDINTERFACE.get(), CraftadvancedinterfaceScreen::new);
		});
	}
}
