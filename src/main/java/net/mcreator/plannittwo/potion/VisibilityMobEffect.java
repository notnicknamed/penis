
package net.mcreator.plannittwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.plannittwo.procedures.VisibilityEffectStartedappliedProcedure;

public class VisibilityMobEffect extends MobEffect {
	public VisibilityMobEffect() {
		super(MobEffectCategory.HARMFUL, -13369345);
	}

	@Override
	public String getDescriptionId() {
		return "effect.plannittwo.visibility";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		VisibilityEffectStartedappliedProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
