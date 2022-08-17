
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plannittwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.plannittwo.block.ThisisAblockBlock;
import net.mcreator.plannittwo.block.StairwayToHeavenBlock;
import net.mcreator.plannittwo.block.PeeBlock;
import net.mcreator.plannittwo.block.MorningWoodBlock;
import net.mcreator.plannittwo.block.MorningStairsBlock;
import net.mcreator.plannittwo.block.MorningSlabBlock;
import net.mcreator.plannittwo.block.MorningPressurePlateBlock;
import net.mcreator.plannittwo.block.MorningPlanksBlock;
import net.mcreator.plannittwo.block.MorningLogBlock;
import net.mcreator.plannittwo.block.MorningLeavesBlock;
import net.mcreator.plannittwo.block.MorningFenceGateBlock;
import net.mcreator.plannittwo.block.MorningFenceBlock;
import net.mcreator.plannittwo.block.MorningButtonBlock;
import net.mcreator.plannittwo.block.BowlingBallBlock;
import net.mcreator.plannittwo.PlannittwoMod;

public class PlannittwoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PlannittwoMod.MODID);
	public static final RegistryObject<Block> BOWLING_BALL = REGISTRY.register("bowling_ball", () -> new BowlingBallBlock());
	public static final RegistryObject<Block> THISIS_ABLOCK = REGISTRY.register("thisis_ablock", () -> new ThisisAblockBlock());
	public static final RegistryObject<Block> STAIRWAY_TO_HEAVEN = REGISTRY.register("stairway_to_heaven", () -> new StairwayToHeavenBlock());
	public static final RegistryObject<Block> MORNING_WOOD = REGISTRY.register("morning_wood", () -> new MorningWoodBlock());
	public static final RegistryObject<Block> MORNING_LOG = REGISTRY.register("morning_log", () -> new MorningLogBlock());
	public static final RegistryObject<Block> MORNING_PLANKS = REGISTRY.register("morning_planks", () -> new MorningPlanksBlock());
	public static final RegistryObject<Block> MORNING_LEAVES = REGISTRY.register("morning_leaves", () -> new MorningLeavesBlock());
	public static final RegistryObject<Block> MORNING_STAIRS = REGISTRY.register("morning_stairs", () -> new MorningStairsBlock());
	public static final RegistryObject<Block> MORNING_SLAB = REGISTRY.register("morning_slab", () -> new MorningSlabBlock());
	public static final RegistryObject<Block> MORNING_FENCE = REGISTRY.register("morning_fence", () -> new MorningFenceBlock());
	public static final RegistryObject<Block> MORNING_FENCE_GATE = REGISTRY.register("morning_fence_gate", () -> new MorningFenceGateBlock());
	public static final RegistryObject<Block> MORNING_PRESSURE_PLATE = REGISTRY.register("morning_pressure_plate",
			() -> new MorningPressurePlateBlock());
	public static final RegistryObject<Block> MORNING_BUTTON = REGISTRY.register("morning_button", () -> new MorningButtonBlock());
	public static final RegistryObject<Block> PEE = REGISTRY.register("pee", () -> new PeeBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BowlingBallBlock.registerRenderLayer();
			ThisisAblockBlock.registerRenderLayer();
			StairwayToHeavenBlock.registerRenderLayer();
		}
	}
}
