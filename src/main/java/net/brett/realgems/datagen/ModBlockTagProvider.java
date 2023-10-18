package net.brett.realgems.datagen;

import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;


import javax.print.attribute.standard.DialogTypeSelection;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.JADE_ORE,
                        ModBlocks.AMBER_ORE,
                        ModBlocks.PINK_DIAMOND_ORE,
                        ModBlocks.SAPPHIRE_ORE,
                        ModBlocks.RED_COAL_ORE,

                        ModBlocks.RED_COAL_BLOCK,
                        ModBlocks.JADE_BLOCK,
                        ModBlocks.SAPPHIRE_BLOCK,
                        ModBlocks.PINK_DIAMOND_BLOCK,
                        ModBlocks.AMBER_BLOCK,

                        ModBlocks.DEEPSLATE_PINK_DIAMOND_ORE,
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE,
                        ModBlocks.DEEPSLATE_JADE_ORE,
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE,
                        ModBlocks.DEEPSLATE_RED_COAL_ORE,
                        ModBlocks.DEEPSLATE_AMBER_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

                .add(ModBlocks.DEEPSLATE_PINK_DIAMOND_ORE,
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE,
                        ModBlocks.DEEPSLATE_JADE_ORE,
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE,
                        ModBlocks.DEEPSLATE_AMBER_ORE,
                        ModBlocks.DEEPSLATE_RED_COAL_ORE);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.JADE_ORE,
                        ModBlocks.RED_COAL_ORE,
                        ModBlocks.SAPPHIRE_ORE,
                        ModBlocks.RAW_JADE_BLOCK,
                        ModBlocks.PINK_DIAMOND_ORE,
                        ModBlocks.AMBER_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.JADE_BLOCK,
                        ModBlocks.PINK_DIAMOND_BLOCK,
                        ModBlocks.SAPPHIRE_BLOCK,
                        ModBlocks.AMBER_BLOCK,
                        ModBlocks.RED_COAL_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.PAXEL_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.STRIPPED_COLD_TREE_LOG, ModBlocks.STRIPPED_COLD_TREE_WOOD, ModBlocks.COLD_TREE_LOG, ModBlocks.COLD_TREE_WOOD);
    }
}
