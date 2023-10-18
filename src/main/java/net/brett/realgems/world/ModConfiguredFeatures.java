package net.brett.realgems.world;

import net.brett.realgems.RealGems;
import net.brett.realgems.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {
public static final RegistryKey<ConfiguredFeature<?, ?>> COLDTREE_KEY = registryKey("coldtree");

public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
    register(context, COLDTREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(ModBlocks.COLD_TREE_LOG),
            new StraightTrunkPlacer(4, 6,7),
            BlockStateProvider.of(ModBlocks.COLD_TREE_LEAVES),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
            new TwoLayersFeatureSize(1, 2, 2)).build());

}

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(RealGems.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature <FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                    RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {

        context.register(key,new ConfiguredFeature<>(feature, configuration));
    }
}
