
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmc.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.testmc.TestmcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestmcModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestmcMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TestmcModItems.TESTTOLL_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TestmcModItems.TESTTOLL_AXE.get());
			tabData.accept(TestmcModItems.TESTTOLL_PICKAXE.get());
			tabData.accept(TestmcModItems.TESTTOLL_SHOVEL.get());
			tabData.accept(TestmcModItems.TESTTOLL_HOE.get());
		}
	}
}
