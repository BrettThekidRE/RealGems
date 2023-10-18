package net.brett.realgems.util;

import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerStrippables();
        registerFlammables();
        registerCustomTrades();
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
        public static void registerCustomTrades() {

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                     factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.AMBER, 5),
                        new ItemStack(ModItems.AMBER_HELMET, 1),
                             6, 2, 0.05f
                     ));
                    });

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                     factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.AMBER, 8),
                        new ItemStack(ModItems.AMBER_CHESTPLATE, 1),
                             6, 4, 0.05f
                     ));
                    });

           TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                     factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.JADE, 5),
                        new ItemStack(ModItems.JADE_HELMET, 1),
                             6, 4, 0.05f
                     ));
                    });

           TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                     factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.JADE, 8),
                        new ItemStack(ModItems.JADE_CHESTPLATE, 1),
                             6, 4, 0.05f
                     ));
                    });

           TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2,
                    factories -> {
                     factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.JADE, 7),
                        new ItemStack(ModItems.JADE_LEGGINGS, 1),
                             6, 4, 0.05f
                     ));
                    });

           TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                     factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.JADE, 4),
                        new ItemStack(ModItems.JADE_BOOTS, 1),
                             6, 4, 0.05f
                     ));
                    });

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2,
                    factories -> {
                     factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.AMBER, 7),
                        new ItemStack(ModItems.AMBER_LEGGINGS, 1),
                             6, 4, 0.05f
                     ));
                    });

            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2,
                    factories -> {
                     factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.AMBER, 4),
                        new ItemStack(ModItems.AMBER_BOOTS, 1),
                             6, 4, 0.05f
                     ));
                    });

    }
}

