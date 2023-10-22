package net.brett.realgems.world.biome.surface;

import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule PINK_STONE = makeStateRule(ModBlocks.PINK_STONE);
    private static final MaterialRules.MaterialRule BLUE_STONE = makeStateRule(ModBlocks.BLUE_STONE);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.COLDTREE_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, PINK_STONE)
                        ), MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, PINK_STONE),

                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.DRIEDOUT_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, BLUE_STONE)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, BLUE_STONE)),

                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
    ));
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}

