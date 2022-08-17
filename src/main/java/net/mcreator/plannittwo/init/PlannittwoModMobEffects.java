
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plannittwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.plannittwo.potion.VisibilityMobEffect;
import net.mcreator.plannittwo.PlannittwoMod;

public class PlannittwoModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PlannittwoMod.MODID);
	public static final RegistryObject<MobEffect> VISIBILITY = REGISTRY.register("visibility", () -> new VisibilityMobEffect());
}
