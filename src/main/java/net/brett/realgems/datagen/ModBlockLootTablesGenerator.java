package net.brett.realgems.datagen;

import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.block.custom.SweetcornCropBlock;
import net.brett.realgems.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.data.server.loottable.vanilla.VanillaBlockLootTableGenerator;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModBlockLootTablesGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTablesGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);

    }

    @Override
    public void generate() {
        addDrop(ModBlocks.JADE_BLOCK);
        addDrop(ModBlocks.PINK_DIAMOND_BLOCK);
        addDrop(ModBlocks.RED_COAL_BLOCK);
        addDrop(ModBlocks.RAW_JADE_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.AMBER_BLOCK);

       addDrop(ModBlocks.JADE_ORE, oreDrops(ModBlocks.JADE_ORE, ModItems.RAW_JADE));
       addDrop(ModBlocks.DEEPSLATE_JADE_ORE, oreDrops(ModBlocks.DEEPSLATE_JADE_ORE, ModItems.RAW_JADE));
       addDrop(ModBlocks.PINK_DIAMOND_ORE, oreDrops(ModBlocks.PINK_DIAMOND_ORE, ModItems.PINK_DIAMOND));
       addDrop(ModBlocks.DEEPSLATE_PINK_DIAMOND_ORE, oreDrops(ModBlocks.DEEPSLATE_PINK_DIAMOND_ORE, ModItems.PINK_DIAMOND));
       addDrop(ModBlocks.SAPPHIRE_ORE, oreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));
       addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, oreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.SAPPHIRE));
       addDrop(ModBlocks.RED_COAL_ORE, oreDrops(ModBlocks.RED_COAL_ORE, ModItems.RED_COAL));
       addDrop(ModBlocks.DEEPSLATE_RED_COAL_ORE, oreDrops(ModBlocks.DEEPSLATE_RED_COAL_ORE, ModItems.RED_COAL));
       addDrop(ModBlocks.DEEPSLATE_AMBER_ORE, oreDrops(ModBlocks.DEEPSLATE_AMBER_ORE, ModItems.RAW_AMBER));
       addDrop(ModBlocks.AMBER_ORE, oreDrops(ModBlocks.AMBER_ORE, ModItems.RAW_AMBER));

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.SWEETCORN_CROP).
                properties(StatePredicate.Builder.create().exactMatch(SweetcornCropBlock.AGE, 6));
        this.addDrop(ModBlocks.SWEETCORN_CROP, this.cropDrops(ModBlocks.SWEETCORN_CROP, ModItems.SWEETCORN, ModItems.SWEETCORN_SEEDS, builder2));
    }
}
