package net.brett.realgems.world;

import net.brett.realgems.RealGems;
import net.brett.realgems.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;


import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> COLDTREE_PLACED_KEY = registryKey("coldtree_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntityLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, COLDTREE_PLACED_KEY, configuredFeatureRegistryEntityLookup.getOrThrow(ModConfiguredFeatures.COLDTREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.COLD_TREE_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registryKey(String name) {
      return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(RealGems.MOD_ID, name));
    }
    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                     List<PlacementModifier> modifiers) {
                            context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers){

    }
}
