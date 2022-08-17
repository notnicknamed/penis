package net.mcreator.plannittwo.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.plannittwo.init.PlannittwoModItems;
import net.mcreator.plannittwo.entity.PenisEntity;

public class DesertEagelPart2RightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PlannittwoModItems.BULLET.get()))
				: false) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				PenisEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 50000, 5);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PlannittwoModItems.BULLET.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
