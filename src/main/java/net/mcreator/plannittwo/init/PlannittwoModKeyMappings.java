
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plannittwo.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.plannittwo.network.WoodManCommandMessage;
import net.mcreator.plannittwo.PlannittwoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PlannittwoModKeyMappings {
	public static final KeyMapping WOOD_MAN_COMMAND = new KeyMapping("key.plannittwo.wood_man_command", GLFW.GLFW_KEY_G, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(WOOD_MAN_COMMAND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == WOOD_MAN_COMMAND.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						PlannittwoMod.PACKET_HANDLER.sendToServer(new WoodManCommandMessage(0, 0));
						WoodManCommandMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
