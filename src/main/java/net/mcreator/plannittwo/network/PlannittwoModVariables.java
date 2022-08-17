package net.mcreator.plannittwo.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PlannittwoModVariables {
	public static double visvar = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
