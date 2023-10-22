package net.brett.realgems.world.dimensions;


import net.brett.realgems.RealGems;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> BRETTDIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(RealGems.MOD_ID, "brettdim"));
    public static final RegistryKey<World> BRETTDIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(RealGems.MOD_ID, "brettdim"));
    public static final RegistryKey<DimensionType> BRETT_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(RealGems.MOD_ID, "brettdim_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(BRETT_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                -64, // minY
                400, // height
                400, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(true, false, UniformIntProvider.create(0, 0), 0)));
    }
}
