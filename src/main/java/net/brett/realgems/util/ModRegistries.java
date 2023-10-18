package net.brett.realgems.util;

import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.item.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerStrippables();
        registerFlammables();
    }








    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.RED_COAL, 250);
        registry.add(ModBlocks.RED_COAL_BLOCK, 650);

    }

        private static void registerStrippables() {
            StrippableBlockRegistry.register(ModBlocks.COLD_TREE_LOG, ModBlocks.STRIPPED_COLD_TREE_LOG);
            StrippableBlockRegistry.register(ModBlocks.COLD_TREE_WOOD, ModBlocks.STRIPPED_COLD_TREE_WOOD);
        }
            private static void registerFlammables() {
            FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.COLD_TREE_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.COLD_TREE_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_COLD_TREE_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_COLD_TREE_WOOD, 5, 5);

            FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.COLD_TREE_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.COLD_TREE_PLANKS, 5, 20);
        }
    }

