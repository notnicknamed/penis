
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plannittwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.plannittwo.PlannittwoMod;

public class PlannittwoModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, PlannittwoMod.MODID);
	public static final RegistryObject<Potion> O_VISIBILITY = REGISTRY.register("o_visibility",
			() -> new Potion(new MobEffectInstance(PlannittwoModMobEffects.VISIBILITY.get(), 3600, 0, false, true)));
}
