package net.mcreator.plannittwo.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.mcreator.plannittwo.network.PlannittwoModVariables;

public class VisibilityEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double valvarsi = 0;
		if (PlannittwoModVariables.visvar <= 200) {
			PlannittwoModVariables.visvar = PlannittwoModVariables.visvar + 1;
		} else {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent((entity.getDisplayName().getString() + "'s location is: "
							+ entity.getX() + ", " + entity.getY() + ", " + entity.getZ() + ".")), ChatType.SYSTEM, Util.NIL_UUID);
			}
			PlannittwoModVariables.visvar = 0;
		}
	}
}
