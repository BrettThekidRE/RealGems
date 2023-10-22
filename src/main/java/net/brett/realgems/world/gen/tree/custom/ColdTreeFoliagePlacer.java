package net.brett.realgems.world.gen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.brett.realgems.world.gen.tree.ModFoliagePlacerTypes;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ColdTreeFoliagePlacer extends FoliagePlacer {
   public static final Codec<ColdTreeFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) -> fillFoliagePlacerFields(instance)
           .and(Codec.intRange(0, 12).fieldOf("height").forGetter((placer) -> placer.height)).apply(instance, ColdTreeFoliagePlacer::new));

   private static int height;



    public ColdTreeFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return ModFoliagePlacerTypes.COLDTREE_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
      // CREATE THE FOLIAGE
     // treeNode.getCentre() is the first position ABOVE the last log placed!

        for(int i = 0; i < 3; i++){
            this.generateSquare(world, placer, random, config, treeNode.getCenter().up(i), 1,   i + -4, treeNode.isGiantTrunk());
        }
    }
    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return height;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
