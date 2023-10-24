package net.brett.realgems;

import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.screen.ModScreenHandlers;
import net.brett.realgems.screen.SolarStationScreen;
import net.brett.realgems.screen.SolarStationScreenHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class RealGemsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COLD_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SWEETCORN_CROP, RenderLayer.getCutout());


        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos)
                : FoliageColors.getDefaultColor(), ModBlocks.COLORED_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), ModBlocks.COLORED_LEAVES);


     HandledScreens.register(ModScreenHandlers.SOLAR_STATION_SCREEN_HANDLER, SolarStationScreen::new);


    }
}
