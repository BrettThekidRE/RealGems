package net.brett.realgems.item;

import net.brett.realgems.RealGems;
import net.brett.realgems.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class  ModItemGroup {
    public static final ItemGroup JADE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RealGems.MOD_ID, "jade"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.jade"))
                    .icon(() -> new ItemStack(ModItems.JADE)).entries((displayContext, entries) -> {
                         entries.add(ModItems.JADE);
                         entries.add(ModItems.RAW_JADE);
                         entries.add(ModBlocks.JADE_BLOCK);
                         entries.add(ModBlocks.RAW_JADE_BLOCK);
                         entries.add(ModBlocks.JADE_ORE);
                         entries.add(ModBlocks.DEEPSLATE_JADE_ORE);

                         entries.add(ModItems.JADE_SWORD);
                         entries.add(ModItems.JADE_AXE);
                         entries.add(ModItems.JADE_PICKAXE);
                         entries.add(ModItems.JADE_SHOVEL);
                         entries.add(ModItems.JADE_HOE);
                         entries.add(ModItems.JADE_PAXEL);

                         entries.add(ModItems.JADE_HELMET);
                         entries.add(ModItems.JADE_CHESTPLATE);
                         entries.add(ModItems.JADE_LEGGINGS);
                         entries.add(ModItems.JADE_BOOTS);




                    }).build());

    public static final ItemGroup FOOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RealGems.MOD_ID, "food"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.food"))
                    .icon(() -> new ItemStack(ModItems.BANANA)).entries((displayContext, entries) -> {
                         entries.add(ModItems.BANANA);
                         entries.add(ModItems.CHERRY);
                         entries.add(ModItems.SWEETCORN);






                    }).build());

    public static final ItemGroup STONES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RealGems.MOD_ID, "blue_stone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blue_stone"))
                    .icon(() -> new ItemStack(ModBlocks.BLUE_STONE)).entries((displayContext, entries) -> {
                      entries.add(ModBlocks.BLUE_STONE);
                      entries.add(ModBlocks.BLUE_COBBLESTONE);
                      entries.add(ModBlocks.BLUE_STONE_BRICKS);
                      entries.add(ModBlocks.PINK_STONE);
                      entries.add(ModBlocks.PINK_COBBLESTONE);






                    }).build());

    public static final ItemGroup SEEDS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RealGems.MOD_ID, "seeds"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.seeds"))
                    .icon(() -> new ItemStack(ModItems.SWEETCORN_SEEDS)).entries((displayContext, entries) -> {
                         entries.add(ModItems.SWEETCORN_SEEDS);






                    }).build());



    public static final ItemGroup SAPPHIRE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RealGems.MOD_ID, "sapphire"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sapphire"))
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE)).entries((displayContext, entries) -> {
                         entries.add(ModItems.SAPPHIRE);
                         entries.add(ModBlocks.SAPPHIRE_BLOCK);
                         entries.add(ModBlocks.SAPPHIRE_ORE);
                         entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);

                         entries.add(ModItems.SAPPHIRE_SWORD);
                         entries.add(ModItems.SAPPHIRE_AXE);
                         entries.add(ModItems.SAPPHIRE_PICKAXE);
                         entries.add(ModItems.SAPPHIRE_SHOVEL);
                         entries.add(ModItems.SAPPHIRE_HOE);
                         entries.add(ModItems.SAPPHIRE_PAXEL);

                         entries.add(ModItems.SAPPHIRE_HELMET);
                         entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                         entries.add(ModItems.SAPPHIRE_LEGGINGS);
                         entries.add(ModItems.SAPPHIRE_BOOTS);



                    }).build());

    public static final ItemGroup RED_COAL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RealGems.MOD_ID, "red_coal"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.red_coal"))
                    .icon(() -> new ItemStack(ModItems.RED_COAL)).entries((displayContext, entries) -> {
                         entries.add(ModItems.RED_COAL);
                         entries.add(ModBlocks.RED_COAL_BLOCK);
                         entries.add(ModBlocks.RED_COAL_ORE);
                         entries.add(ModBlocks.DEEPSLATE_RED_COAL_ORE);






                    }).build());

    public static final ItemGroup PINK_DIAMOND = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RealGems.MOD_ID, "pink_diamond"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pink_diamond"))
                    .icon(() -> new ItemStack(ModItems.PINK_DIAMOND)).entries((displayContext, entries) -> {
                         entries.add(ModItems.PINK_DIAMOND);
                         entries.add(ModBlocks.PINK_DIAMOND_BLOCK);
                         entries.add(ModBlocks.PINK_DIAMOND_ORE);
                         entries.add(ModBlocks.DEEPSLATE_PINK_DIAMOND_ORE);

                        entries.add(ModItems.PINK_DIAMOND_SWORD);
                        entries.add(ModItems.PINK_DIAMOND_AXE);
                        entries.add(ModItems.PINK_DIAMOND_PICKAXE);
                        entries.add(ModItems.PINK_DIAMOND_SHOVEL);
                        entries.add(ModItems.PINK_DIAMOND_HOE);
                        entries.add(ModItems.PINK_DIAMOND_PAXEL);

                        entries.add(ModItems.PINK_DIAMOND_HELMET);
                        entries.add(ModItems.PINK_DIAMOND_CHESTPLATE);
                        entries.add(ModItems.PINK_DIAMOND_LEGGINGS);
                        entries.add(ModItems.PINK_DIAMOND_BOOTS);

                    }).build());

                        public static final ItemGroup WOOD_AND_SAPLINGS = Registry.register(Registries.ITEM_GROUP,
                                new Identifier(RealGems.MOD_ID, "wood_and_saplings"),
                                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.wood_and_saplings"))
                                        .icon(() -> new ItemStack(ModBlocks.COLD_TREE_SAPLING)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.COLD_TREE_PLANKS);
                        entries.add(ModBlocks.COLD_TREE_LEAVES);
                        entries.add(ModBlocks.COLD_TREE_LOG);
                        entries.add(ModBlocks.COLD_TREE_WOOD);
                        entries.add(ModBlocks.STRIPPED_COLD_TREE_WOOD);
                        entries.add(ModBlocks.STRIPPED_COLD_TREE_LOG);
                        entries.add(ModBlocks.COLD_TREE_SAPLING);
                        entries.add(ModBlocks.COLORED_LEAVES);


                    }).build());

   public static final ItemGroup AMBER = Registry.register(Registries.ITEM_GROUP,
                                new Identifier(RealGems.MOD_ID, "amber"),
                                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.amber"))
                                        .icon(() -> new ItemStack(ModItems.AMBER)).entries((displayContext, entries) -> {

                       entries.add(ModItems.AMBER);
                       entries.add(ModItems.RAW_AMBER);

                       entries.add(ModItems.AMBER_HELMET);
                       entries.add(ModItems.AMBER_CHESTPLATE);
                       entries.add(ModItems.AMBER_LEGGINGS);
                       entries.add(ModItems.AMBER_BOOTS);

                       entries.add(ModItems.AMBER_SWORD);
                       entries.add(ModItems.AMBER_AXE);
                       entries.add(ModItems.AMBER_PICKAXE);
                       entries.add(ModItems.AMBER_SHOVEL);
                       entries.add(ModItems.AMBER_HOE);
                       entries.add(ModItems.AMBER_PAXEL);

                       entries.add(ModBlocks.AMBER_BLOCK);
                       entries.add(ModBlocks.AMBER_ORE);
                       entries.add(ModBlocks.DEEPSLATE_AMBER_ORE);

                    }).build());

    public static final ItemGroup RUBY = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RealGems.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);







                    }).build());


    public static void registerItemGroups() {

    }
}
