package net.mcreator.testmc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.testmc.network.TestmcModVariables;
import net.mcreator.testmc.init.TestmcModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PGodmodProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(TestmcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TestmcModVariables.PlayerVariables())).etatGodmod) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TestmcModMobEffects.PE_GODMOD.get(), 2, 1));
		}
	}
}
