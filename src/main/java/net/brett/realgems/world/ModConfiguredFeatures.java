package net.brett.realgems.world;

import net.brett.realgems.RealGems;
import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.world.gen.tree.custom.ColdTreeFoliagePlacer;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> COLDTREE_KEY = registryKey("coldtree");


    public static final RegistryKey<ConfiguredFeature<?, ?>> JADE_ORE_KEY = registryKey("jade_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_COAL_ORE_KEY = registryKey("red_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMBER_ORE_KEY = registryKey("amber_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registryKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_DIAMOND_ORE_KEY = registryKey("pink_diamond_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
    RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
    RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldJadeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.JADE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_JADE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSapphireOres =
            List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRedCoalOres =
            List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RED_COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RED_COAL_ORE.getDefaultState()));

                List<OreFeatureConfig.Target> overworldPinkDiamondOres =
            List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.PINK_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_PINK_DIAMOND_ORE.getDefaultState()));

                List<OreFeatureConfig.Target> overworldAmberOres =
            List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.AMBER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_AMBER_ORE.getDefaultState()));





register(context, COLDTREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(ModBlocks.COLD_TREE_LOG),
            new StraightTrunkPlacer(2, 3,5),
            BlockStateProvider.of(ModBlocks.COLD_TREE_LEAVES),
            new ColdTreeFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
            new TwoLayersFeatureSize(2, 2, 2)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).build());


        register(context, JADE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldJadeOres,10));
        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres,6));
        register(context, RED_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRedCoalOres,14));
        register(context, PINK_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPinkDiamondOres,12));
        register(context, AMBER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAmberOres,8));



}

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(RealGems.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature <FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                    RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {

        context.register(key,new ConfiguredFeature<>(feature, configuration));
    }
}
