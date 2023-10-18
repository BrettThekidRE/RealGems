package net.brett.realgems.block;

import net.brett.realgems.RealGems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_JADE_BLOCK = registerBlock("raw_jade_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block PINK_DIAMOND_BLOCK = registerBlock("pink_diamond_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block RED_COAL_BLOCK = registerBlock("red_coal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE), UniformIntProvider.create(3, 6)));

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE), UniformIntProvider.create(3, 6)));

    public static final Block PINK_DIAMOND_ORE = registerBlock("pink_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE), UniformIntProvider.create(3, 6)));

    public static final Block RED_COAL_ORE = registerBlock("red_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE), UniformIntProvider.create(3, 6)));

    public static final Block DEEPSLATE_RED_COAL_ORE = registerBlock("deepslate_red_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE), UniformIntProvider.create(4, 7)));

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE), UniformIntProvider.create(4, 7)));

    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE), UniformIntProvider.create(4, 7)));

    public static final Block DEEPSLATE_PINK_DIAMOND_ORE = registerBlock("deepslate_pink_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE), UniformIntProvider.create(4, 7)));

    public static final Block COLD_TREE_LOG = registerBlock("cold_tree_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG).strength(4f)));

    public static final Block STRIPPED_COLD_TREE_LOG = registerBlock("stripped_cold_tree_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_LOG).strength(4f)));

    public static final Block COLD_TREE_WOOD = registerBlock("cold_tree_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD).strength(4f)));

    public static final Block STRIPPED_COLD_TREE_WOOD = registerBlock("stripped_cold_tree_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f)));



    public static final Block COLD_TREE_PLANKS = registerBlock("cold_tree_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).strength(4f)));


    public static final Block COLD_TREE_LEAVES = registerBlock("cold_tree_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).strength(1f)));


    public static final Block COLD_TREE_SAPLING = registerBlock("cold_tree_sapling",
            new SaplingBlock(null, FabricBlockSettings.copyOf(Blocks.SPRUCE_SAPLING).strength(1f)));




 private static Block registerBlock(String name, Block block) {
     registerBlockItem(name, block);
     return Registry.register(Registries.BLOCK,new Identifier(RealGems.MOD_ID,name),block);
 }




private static Item registerBlockItem(String name, Block block){
    return Registry.register(Registries.ITEM, new Identifier(RealGems.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
}

    public static void registerModBlocks() {
        RealGems.LOGGER.info("Registering ModBlocks for " + RealGems.MOD_ID);
    }
}
