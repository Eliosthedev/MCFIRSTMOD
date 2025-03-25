
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmc.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.testmc.network.LancementMusicMessage;
import net.mcreator.testmc.network.KLancementGodmodMessage;
import net.mcreator.testmc.TestmcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TestmcModKeyMappings {
	public static final KeyMapping LANCEMENT_MUSIC = new KeyMapping("key.testmc.lancement_music", GLFW.GLFW_KEY_M, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TestmcMod.PACKET_HANDLER.sendToServer(new LancementMusicMessage(0, 0));
				LancementMusicMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping K_LANCEMENT_GODMOD = new KeyMapping("key.testmc.k_lancement_godmod", GLFW.GLFW_KEY_G, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TestmcMod.PACKET_HANDLER.sendToServer(new KLancementGodmodMessage(0, 0));
				KLancementGodmodMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(LANCEMENT_MUSIC);
		event.register(K_LANCEMENT_GODMOD);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				LANCEMENT_MUSIC.consumeClick();
				K_LANCEMENT_GODMOD.consumeClick();
			}
		}
	}
}
