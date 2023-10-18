package net.brett.realgems.datagen;

import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {

    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.TORCH)
                .pattern(" R ")
                .pattern(" S ")
                .pattern("   ")
                .input('S', Items.STICK)
                .input('R', ModItems.RED_COAL)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.RED_COAL), conditionsFromItem(ModItems.RED_COAL))
                .offerTo(exporter, new Identifier(getRecipeName(Items.TORCH) + "_"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_SWORD)
                .pattern(" J ")
                .pattern(" J ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('J', ModItems.JADE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_SWORD) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE_PICKAXE)
                .pattern("JJJ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('J', ModItems.JADE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_PICKAXE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE_AXE)
                .pattern("JJ ")
                .pattern("JS ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('J', ModItems.JADE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_AXE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE_SHOVEL)
                .pattern(" J ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('J', ModItems.JADE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_SHOVEL) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE_HOE)
                .pattern("JJ ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('J', ModItems.JADE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_HOE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE_SWORD)
                .pattern(" s ")
                .pattern(" s ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('s', ModItems.SAPPHIRE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_SWORD) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SAPPHIRE_PICKAXE)
                .pattern("sss")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('s', ModItems.SAPPHIRE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_PICKAXE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SAPPHIRE_AXE)
                .pattern("ss ")
                .pattern("sS ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('s', ModItems.SAPPHIRE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_AXE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SAPPHIRE_SHOVEL)
                .pattern(" s ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('s', ModItems.SAPPHIRE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_SHOVEL) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SAPPHIRE_HOE)
                .pattern("ss ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('s', ModItems.SAPPHIRE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_HOE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_DIAMOND_SWORD)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('P', ModItems.PINK_DIAMOND)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_DIAMOND), conditionsFromItem(ModItems.PINK_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_DIAMOND_SWORD) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_DIAMOND_PICKAXE)
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('P', ModItems.PINK_DIAMOND)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_DIAMOND), conditionsFromItem(ModItems.PINK_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_DIAMOND_PICKAXE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_DIAMOND_AXE)
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('P', ModItems.PINK_DIAMOND)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_DIAMOND), conditionsFromItem(ModItems.PINK_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_DIAMOND_AXE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_DIAMOND_SHOVEL)
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('P', ModItems.PINK_DIAMOND)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_DIAMOND), conditionsFromItem(ModItems.PINK_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_DIAMOND_SHOVEL) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_DIAMOND_HOE)
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('P', ModItems.PINK_DIAMOND)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_DIAMOND), conditionsFromItem(ModItems.PINK_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_DIAMOND_HOE) + "_"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_DIAMOND_PAXEL)
                .pattern("pza")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('z', ModItems.PINK_DIAMOND_SHOVEL)
                .input('a', ModItems.PINK_DIAMOND_AXE)
                .input('p', ModItems.PINK_DIAMOND_PICKAXE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_DIAMOND_SHOVEL), conditionsFromItem(ModItems.PINK_DIAMOND_SHOVEL))
                .criterion(hasItem(ModItems.PINK_DIAMOND_AXE), conditionsFromItem(ModItems.PINK_DIAMOND_AXE))
                .criterion(hasItem(ModItems.PINK_DIAMOND_PICKAXE), conditionsFromItem(ModItems.PINK_DIAMOND_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_DIAMOND_PAXEL) + "_"));

  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE_PAXEL)
                .pattern("pza")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('z', ModItems.JADE_SHOVEL)
                .input('a', ModItems.JADE_AXE)
                .input('p', ModItems.JADE_PICKAXE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.JADE_SHOVEL), conditionsFromItem(ModItems.JADE_SHOVEL))
                .criterion(hasItem(ModItems.JADE_AXE), conditionsFromItem(ModItems.JADE_AXE))
                .criterion(hasItem(ModItems.JADE_PICKAXE), conditionsFromItem(ModItems.JADE_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_PAXEL) + "_"));

  ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SAPPHIRE_PAXEL)
                .pattern("pza")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('z', ModItems.SAPPHIRE_SHOVEL)
                .input('a', ModItems.SAPPHIRE_AXE)
                .input('p', ModItems.SAPPHIRE_PICKAXE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SAPPHIRE_SHOVEL), conditionsFromItem(ModItems.SAPPHIRE_SHOVEL))
                .criterion(hasItem(ModItems.SAPPHIRE_AXE), conditionsFromItem(ModItems.SAPPHIRE_AXE))
                .criterion(hasItem(ModItems.SAPPHIRE_PICKAXE), conditionsFromItem(ModItems.SAPPHIRE_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_PAXEL) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .input('S', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_HELMET) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_CHESTPLATE) + "_"));

    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE_LEGGINGS)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_LEGGINGS) + "_"));

    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE_BOOTS)
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_BOOTS) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_DIAMOND_HELMET)
                .pattern("   ")
                .pattern("PPP")
                .pattern("P P")
                .input('P', ModItems.PINK_DIAMOND)
                .criterion(hasItem(ModItems.PINK_DIAMOND), conditionsFromItem(ModItems.PINK_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_DIAMOND_HELMET) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_DIAMOND_CHESTPLATE)
                .pattern("P P")
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModItems.PINK_DIAMOND)
                .criterion(hasItem(ModItems.PINK_DIAMOND), conditionsFromItem(ModItems.PINK_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_DIAMOND_CHESTPLATE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_DIAMOND_LEGGINGS)
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.PINK_DIAMOND)
                .criterion(hasItem(ModItems.PINK_DIAMOND), conditionsFromItem(ModItems.PINK_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_DIAMOND_LEGGINGS) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_DIAMOND_BOOTS)
                .pattern("   ")
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.PINK_DIAMOND), conditionsFromItem(ModItems.PINK_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_DIAMOND_BOOTS) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_HELMET)
                .pattern("   ")
                .pattern("JJJ")
                .pattern("J J")
                .input('J', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_HELMET) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_CHESTPLATE)
                .pattern("J J")
                .pattern("JJJ")
                .pattern("JJJ")
                .input('J', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_CHESTPLATE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_LEGGINGS)
                .pattern("JJJ")
                .pattern("J J")
                .pattern("J J")
                .input('J', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_LEGGINGS) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_BOOTS)
                .pattern("   ")
                .pattern("J J")
                .pattern("J J")
                .input('J', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_BOOTS) + "_"));

 ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_HELMET)
                .pattern("   ")
                .pattern("AAA")
                .pattern("A A")
                .input('A', ModItems.AMBER)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMBER_HELMET) + "_"));

 ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.AMBER)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMBER_CHESTPLATE) + "_"));

 ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.AMBER)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMBER_LEGGINGS) + "_"));

 ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_BOOTS)
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.AMBER)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMBER_BOOTS) + "_"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_SWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('A', ModItems.AMBER)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMBER_SWORD) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_AXE)
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('A', ModItems.AMBER)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMBER_AXE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_PICKAXE)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('A', ModItems.AMBER)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMBER_PICKAXE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_SHOVEL)
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('A', ModItems.AMBER)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMBER_SHOVEL) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_HOE)
                .pattern(" AA")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('A', ModItems.AMBER)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMBER_HOE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMBER_PAXEL)
                .pattern("asP")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('P', ModItems.AMBER_PICKAXE)
                .input('s', ModItems.AMBER_SHOVEL)
                .input('a', ModItems.AMBER_AXE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.AMBER_AXE), conditionsFromItem(ModItems.AMBER_AXE))
                .criterion(hasItem(ModItems.AMBER_SHOVEL), conditionsFromItem(ModItems.AMBER_SHOVEL))
                .criterion(hasItem(ModItems.AMBER_PICKAXE), conditionsFromItem(ModItems.AMBER_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMBER_PAXEL) + "_"));


    offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.JADE, RecipeCategory.MISC, ModBlocks.JADE_BLOCK);
    offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SAPPHIRE, RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK);
    offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RED_COAL, RecipeCategory.MISC, ModBlocks.RED_COAL_BLOCK);
    offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PINK_DIAMOND, RecipeCategory.MISC, ModBlocks.PINK_DIAMOND_BLOCK);

    offerSmelting(exporter, List.of(ModItems.JADE, ModBlocks.JADE_ORE, ModBlocks.DEEPSLATE_JADE_ORE),
            RecipeCategory.MISC, ModItems.JADE,
            0.25f, 200, "jade");

    offerBlasting(exporter, List.of(ModItems.JADE, ModBlocks.JADE_ORE, ModBlocks.DEEPSLATE_JADE_ORE),
            RecipeCategory.MISC, ModItems.JADE,
            0.45f, 100, "jade");

    offerSmelting(exporter, List.of(ModItems.SAPPHIRE, ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE),
          RecipeCategory.MISC, ModItems.SAPPHIRE,
            0.25f, 200, "sapphire");

    offerBlasting(exporter, List.of(ModItems.SAPPHIRE, ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE),
          RecipeCategory.MISC, ModItems.SAPPHIRE,
            0.45f, 100, "sapphire");

    offerSmelting(exporter, List.of(ModItems.AMBER, ModBlocks.AMBER_ORE, ModBlocks.DEEPSLATE_AMBER_ORE),
          RecipeCategory.MISC, ModItems.AMBER,
            0.25f, 200, "amber");

    offerBlasting(exporter, List.of(ModItems.AMBER, ModBlocks.AMBER_ORE, ModBlocks.DEEPSLATE_AMBER_ORE),
          RecipeCategory.MISC, ModItems.AMBER,
            0.45f, 100, "amber");


    offerSmelting(exporter, List.of(ModItems.RED_COAL, ModBlocks.RED_COAL_ORE, ModBlocks.DEEPSLATE_RED_COAL_ORE),
            RecipeCategory.MISC, ModItems.RED_COAL,
            0.25f, 200, "red_coal");

    offerBlasting(exporter, List.of(ModItems.RED_COAL, ModBlocks.RED_COAL_ORE, ModBlocks.DEEPSLATE_RED_COAL_ORE),
            RecipeCategory.MISC, ModItems.RED_COAL,
            0.45f, 100, "red_coal");


    offerSmelting(exporter, List.of(ModItems.PINK_DIAMOND, ModBlocks.PINK_DIAMOND_ORE, ModBlocks.DEEPSLATE_PINK_DIAMOND_ORE),
            RecipeCategory.MISC, ModItems.PINK_DIAMOND,
            0.25f, 200, "pink_diamond");

    offerBlasting(exporter, List.of(ModItems.PINK_DIAMOND, ModBlocks.PINK_DIAMOND_ORE, ModBlocks.DEEPSLATE_PINK_DIAMOND_ORE),
            RecipeCategory.MISC, ModItems.PINK_DIAMOND,
            0.45f, 100, "pink_diamond");




    }
}

