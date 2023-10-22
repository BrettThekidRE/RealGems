package net.brett.realgems.world.biome;


import net.brett.realgems.RealGems;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.registry.Registerable;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModBiomes {
    public static final RegistryKey<Biome> COLDTREE_BIOME = register("coldtree_biome");
    public static final RegistryKey<Biome> DRIEDOUT_BIOME = register("driedout_biome");

    public static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(RealGems.MOD_ID, name));

    }

    public static void bootstrap(Registerable<Biome> context) {
        context.register(COLDTREE_BIOME, coldtree_biome(context));
        context.register(DRIEDOUT_BIOME, driedout_biome(context));
    }


    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome coldtree_biome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        ;

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.TREES_PLAINS);
        DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);

        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0xe46e7b)
                        .waterFogColor(0xe46e7b)
                        .skyColor(0x30c918)
                        .grassColor(0x7f03fc)
                        .foliageColor(0xd203fc)
                        .fogColor(0x22a1e6)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }

    public static Biome driedout_biome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.TREES_PLAINS);
        DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);

        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0xA1464)
                        .waterFogColor(0xA1464)
                        .skyColor(0x30c918)
                        .grassColor(0x82e1d7)
                        .foliageColor(0xd203fc)
                        .fogColor(0x22a1e6)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }
}
