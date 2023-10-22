package net.brett.realgems.world.gen.tree;


import net.brett.realgems.RealGems;
import net.brett.realgems.mixin.FoliagePlacerTypeInvoker;
import net.brett.realgems.world.gen.tree.custom.ColdTreeFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
   public static final FoliagePlacerType<?> COLDTREE_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister(
           "coldtree_foliage_placer", ColdTreeFoliagePlacer.CODEC);

   public static void register() {
       RealGems.LOGGER.info("Registering the Foliage Placer for " + RealGems.MOD_ID);
   }
}
