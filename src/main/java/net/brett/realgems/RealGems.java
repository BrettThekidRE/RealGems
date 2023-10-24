package net.brett.realgems;

import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.block.entity.ModBlockEntities;
import net.brett.realgems.item.ModItemGroup;
import net.brett.realgems.item.ModItems;;
import net.brett.realgems.screen.ModScreenHandlers;
import net.brett.realgems.util.ModRegistries;
import net.brett.realgems.world.gen.ModWorldGeneration;
import net.brett.realgems.world.gen.tree.ModFoliagePlacerTypes;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealGems implements ModInitializer {
    public static final String MOD_ID = "realgems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModRegistries.registerModStuffs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGeneration();
		ModFoliagePlacerTypes.register();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}