
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plannittwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.plannittwo.entity.StillagerEntity;
import net.mcreator.plannittwo.entity.RenderDragonEntity;
import net.mcreator.plannittwo.entity.RangedItem2Entity;
import net.mcreator.plannittwo.entity.PenisEntity;
import net.mcreator.plannittwo.entity.KillagerEntity;
import net.mcreator.plannittwo.entity.BowlerbearEntity;
import net.mcreator.plannittwo.entity.BouncingRodEntity;
import net.mcreator.plannittwo.entity.AntiGolemEntity;
import net.mcreator.plannittwo.PlannittwoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PlannittwoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, PlannittwoMod.MODID);
	public static final RegistryObject<EntityType<BowlerbearEntity>> BOWLERBEAR = register("bowlerbear",
			EntityType.Builder.<BowlerbearEntity>of(BowlerbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BowlerbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PenisEntity>> PENIS = register("projectile_penis",
			EntityType.Builder.<PenisEntity>of(PenisEntity::new, MobCategory.MISC).setCustomClientFactory(PenisEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BouncingRodEntity>> BOUNCING_ROD = register("bouncing_rod",
			EntityType.Builder.<BouncingRodEntity>of(BouncingRodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BouncingRodEntity::new)

					.sized(0.6f, 100f));
	public static final RegistryObject<EntityType<StillagerEntity>> STILLAGER = register("stillager",
			EntityType.Builder.<StillagerEntity>of(StillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RenderDragonEntity>> RENDER_DRAGON = register("render_dragon",
			EntityType.Builder.<RenderDragonEntity>of(RenderDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RenderDragonEntity::new)

					.sized(20f, 5f));
	public static final RegistryObject<EntityType<KillagerEntity>> KILLAGER = register("killager",
			EntityType.Builder.<KillagerEntity>of(KillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(KillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RangedItem2Entity>> RANGED_ITEM_2 = register("projectile_ranged_item_2",
			EntityType.Builder.<RangedItem2Entity>of(RangedItem2Entity::new, MobCategory.MISC).setCustomClientFactory(RangedItem2Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AntiGolemEntity>> ANTI_GOLEM = register("anti_golem",
			EntityType.Builder.<AntiGolemEntity>of(AntiGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AntiGolemEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BowlerbearEntity.init();
			BouncingRodEntity.init();
			StillagerEntity.init();
			RenderDragonEntity.init();
			KillagerEntity.init();
			AntiGolemEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BOWLERBEAR.get(), BowlerbearEntity.createAttributes().build());
		event.put(BOUNCING_ROD.get(), BouncingRodEntity.createAttributes().build());
		event.put(STILLAGER.get(), StillagerEntity.createAttributes().build());
		event.put(RENDER_DRAGON.get(), RenderDragonEntity.createAttributes().build());
		event.put(KILLAGER.get(), KillagerEntity.createAttributes().build());
		event.put(ANTI_GOLEM.get(), AntiGolemEntity.createAttributes().build());
	}
}
