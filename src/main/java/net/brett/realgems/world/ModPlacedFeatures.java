package net.brett.realgems.world;

import net.brett.realgems.RealGems;
import net.brett.realgems.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;


import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> COLDTREE_PLACED_KEY = registryKey("coldtree_placed");

    public static final RegistryKey<PlacedFeature> JADE_ORE_PLACED_KEY = registryKey("jade_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registryKey("sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> RED_COAL_ORE_PLACED_KEY = registryKey("red_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> PINK_DIAMOND_ORE_PLACED_KEY = registryKey("pink_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> AMBER_ORE_PLACED_KEY = registryKey("amber_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntityLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, COLDTREE_PLACED_KEY, configuredFeatureRegistryEntityLookup.getOrThrow(ModConfiguredFeatures.COLDTREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.COLD_TREE_SAPLING));

        register(context, JADE_ORE_PLACED_KEY, configuredFeatureRegistryEntityLookup.getOrThrow(ModConfiguredFeatures.JADE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(50))));

        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntityLookup.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(45))));

        register(context, PINK_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntityLookup.getOrThrow(ModConfiguredFeatures.PINK_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(25))));

        register(context, AMBER_ORE_PLACED_KEY, configuredFeatureRegistryEntityLookup.getOrThrow(ModConfiguredFeatures.AMBER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(30))));

        register(context, RED_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntityLookup.getOrThrow(ModConfiguredFeatures.RED_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(64))));


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
