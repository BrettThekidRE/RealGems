package net.brett.realgems.datagen;

import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registerFuture) {
        super(output, registerFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.JADE_HELMET)
                .add(ModItems.JADE_CHESTPLATE)
                .add(ModItems.JADE_LEGGINGS)
                .add(ModItems.JADE_BOOTS)

                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.SAPPHIRE_BOOTS)

                .add(ModItems.PINK_DIAMOND_HELMET)
                .add(ModItems.PINK_DIAMOND_CHESTPLATE)
                .add(ModItems.PINK_DIAMOND_LEGGINGS)
                .add(ModItems.PINK_DIAMOND_BOOTS)

                .add(ModItems.AMBER_HELMET)
                .add(ModItems.AMBER_CHESTPLATE)
                .add(ModItems.AMBER_LEGGINGS)
                .add(ModItems.AMBER_BOOTS);



        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.COLD_TREE_WOOD.asItem(),
                        ModBlocks.STRIPPED_COLD_TREE_LOG.asItem(),
                        ModBlocks.STRIPPED_COLD_TREE_WOOD.asItem(),
                        ModBlocks.COLD_TREE_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.COLD_TREE_PLANKS.asItem());

    }
}
