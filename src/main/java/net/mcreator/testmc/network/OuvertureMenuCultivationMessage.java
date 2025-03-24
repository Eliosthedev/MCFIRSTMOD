
package net.mcreator.testmc.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.testmc.TestmcMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OuvertureMenuCultivationMessage {
	int type, pressedms;

	public OuvertureMenuCultivationMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public OuvertureMenuCultivationMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(OuvertureMenuCultivationMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(OuvertureMenuCultivationMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TestmcMod.addNetworkMessage(OuvertureMenuCultivationMessage.class, OuvertureMenuCultivationMessage::buffer, OuvertureMenuCultivationMessage::new, OuvertureMenuCultivationMessage::handler);
	}
}
