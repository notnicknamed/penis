
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plannittwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.plannittwo.item.TNTPickaxeItem;
import net.mcreator.plannittwo.item.RangedItem2Item;
import net.mcreator.plannittwo.item.PlaniteArmorItem;
import net.mcreator.plannittwo.item.PenisItem;
import net.mcreator.plannittwo.item.PeeItem;
import net.mcreator.plannittwo.item.DesertEagleItem;
import net.mcreator.plannittwo.item.BulletItem;
import net.mcreator.plannittwo.PlannittwoMod;

public class PlannittwoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PlannittwoMod.MODID);
	public static final RegistryObject<Item> BOWLERBEAR = REGISTRY.register("bowlerbear_spawn_egg",
			() -> new ForgeSpawnEggItem(PlannittwoModEntities.BOWLERBEAR, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PENIS = REGISTRY.register("penis", () -> new PenisItem());
	public static final RegistryObject<Item> BOUNCING_ROD = REGISTRY.register("bouncing_rod_spawn_egg",
			() -> new ForgeSpawnEggItem(PlannittwoModEntities.BOUNCING_ROD, -26215, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BOWLING_BALL = block(PlannittwoModBlocks.BOWLING_BALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STILLAGER = REGISTRY.register("stillager_spawn_egg",
			() -> new ForgeSpawnEggItem(PlannittwoModEntities.STILLAGER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PLANITE_ARMOR_HELMET = REGISTRY.register("planite_armor_helmet", () -> new PlaniteArmorItem.Helmet());
	public static final RegistryObject<Item> PLANITE_ARMOR_CHESTPLATE = REGISTRY.register("planite_armor_chestplate",
			() -> new PlaniteArmorItem.Chestplate());
	public static final RegistryObject<Item> PLANITE_ARMOR_LEGGINGS = REGISTRY.register("planite_armor_leggings",
			() -> new PlaniteArmorItem.Leggings());
	public static final RegistryObject<Item> PLANITE_ARMOR_BOOTS = REGISTRY.register("planite_armor_boots", () -> new PlaniteArmorItem.Boots());
	public static final RegistryObject<Item> RENDER_DRAGON = REGISTRY.register("render_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(PlannittwoModEntities.RENDER_DRAGON, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> KILLAGER = REGISTRY.register("killager_spawn_egg",
			() -> new ForgeSpawnEggItem(PlannittwoModEntities.KILLAGER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> RANGED_ITEM_2 = REGISTRY.register("ranged_item_2", () -> new RangedItem2Item());
	public static final RegistryObject<Item> DESERT_EAGLE = REGISTRY.register("desert_eagle", () -> new DesertEagleItem());
	public static final RegistryObject<Item> THISIS_ABLOCK = block(PlannittwoModBlocks.THISIS_ABLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STAIRWAY_TO_HEAVEN = block(PlannittwoModBlocks.STAIRWAY_TO_HEAVEN, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANTI_GOLEM = REGISTRY.register("anti_golem_spawn_egg",
			() -> new ForgeSpawnEggItem(PlannittwoModEntities.ANTI_GOLEM, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TNT_PICKAXE = REGISTRY.register("tnt_pickaxe", () -> new TNTPickaxeItem());
	public static final RegistryObject<Item> MORNING_WOOD = block(PlannittwoModBlocks.MORNING_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MORNING_LOG = block(PlannittwoModBlocks.MORNING_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MORNING_PLANKS = block(PlannittwoModBlocks.MORNING_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MORNING_LEAVES = block(PlannittwoModBlocks.MORNING_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MORNING_STAIRS = block(PlannittwoModBlocks.MORNING_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MORNING_SLAB = block(PlannittwoModBlocks.MORNING_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MORNING_FENCE = block(PlannittwoModBlocks.MORNING_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MORNING_FENCE_GATE = block(PlannittwoModBlocks.MORNING_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MORNING_PRESSURE_PLATE = block(PlannittwoModBlocks.MORNING_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MORNING_BUTTON = block(PlannittwoModBlocks.MORNING_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PEE_BUCKET = REGISTRY.register("pee_bucket", () -> new PeeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
