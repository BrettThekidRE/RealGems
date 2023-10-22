package net.brett.realgems.datagen;

import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.block.custom.SweetcornCropBlock;
import net.brett.realgems.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.CropBlock;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_JADE_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_DIAMOND_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PINK_DIAMOND_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_COAL_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RED_COAL_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_BLOCK);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_JADE_BLOCK);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_COAL_BLOCK);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_DIAMOND_BLOCK);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMBER_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_AMBER_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMBER_BLOCK);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_STONE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_STONE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_COBBLESTONE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_COBBLESTONE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_STONE_BRICKS);

         blockStateModelGenerator.registerCrop(ModBlocks.SWEETCORN_CROP, SweetcornCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

         blockStateModelGenerator.registerSingleton(ModBlocks.COLORED_LEAVES, TexturedModel.LEAVES);

         blockStateModelGenerator.registerLog(ModBlocks.COLD_TREE_LOG).log(ModBlocks.COLD_TREE_LOG).wood(ModBlocks.COLD_TREE_WOOD);
         blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_COLD_TREE_LOG).log(ModBlocks.STRIPPED_COLD_TREE_LOG).wood(ModBlocks.STRIPPED_COLD_TREE_WOOD);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COLD_TREE_PLANKS);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COLD_TREE_LEAVES);

         blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.COLD_TREE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
      itemModelGenerator.register(ModItems.BANANA, Models.GENERATED);
      itemModelGenerator.register(ModItems.CHERRY, Models.GENERATED);
      itemModelGenerator.register(ModItems.RED_COAL, Models.GENERATED);
      itemModelGenerator.register(ModItems.JADE, Models.GENERATED);
      itemModelGenerator.register(ModItems.RAW_JADE, Models.GENERATED);
      itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
      itemModelGenerator.register(ModItems.PINK_DIAMOND, Models.GENERATED);
      itemModelGenerator.register(ModItems.AMBER, Models.GENERATED);
      itemModelGenerator.register(ModItems.RAW_AMBER, Models.GENERATED);
      itemModelGenerator.register(ModItems.SWEETCORN, Models.GENERATED);


      itemModelGenerator.register(ModItems.AMBER_SWORD, Models.HANDHELD);
      itemModelGenerator.register(ModItems.AMBER_AXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.AMBER_PICKAXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.AMBER_SHOVEL, Models.HANDHELD);
      itemModelGenerator.register(ModItems.AMBER_HOE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.AMBER_PAXEL, Models.HANDHELD);

      itemModelGenerator.register(ModItems.JADE_SWORD, Models.HANDHELD);
      itemModelGenerator.register(ModItems.JADE_AXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.JADE_PICKAXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.JADE_SHOVEL, Models.HANDHELD);
      itemModelGenerator.register(ModItems.JADE_HOE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.JADE_PAXEL, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADE_BOOTS));


      itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
      itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
      itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.SAPPHIRE_PAXEL, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_BOOTS));


      itemModelGenerator.register(ModItems.PINK_DIAMOND_SWORD, Models.HANDHELD);
      itemModelGenerator.register(ModItems.PINK_DIAMOND_AXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.PINK_DIAMOND_PICKAXE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.PINK_DIAMOND_SHOVEL, Models.HANDHELD);
      itemModelGenerator.register(ModItems.PINK_DIAMOND_HOE, Models.HANDHELD);
      itemModelGenerator.register(ModItems.PINK_DIAMOND_PAXEL, Models.HANDHELD);

      itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_DIAMOND_HELMET));
      itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_DIAMOND_CHESTPLATE));
      itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_DIAMOND_LEGGINGS));
      itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_DIAMOND_BOOTS));

      itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_HELMET));
      itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_CHESTPLATE));
      itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_LEGGINGS));
      itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMBER_BOOTS));







    }
}
