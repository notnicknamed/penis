package net.mcreator.plannittwo.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TNTPickaxeBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
					new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "summon tnt");
	}
}
