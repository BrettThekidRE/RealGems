package net.brett.realgems.datagen;

import com.ibm.icu.lang.UCharacter;
import net.brett.realgems.RealGems;
import net.brett.realgems.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementsProvider extends FabricAdvancementProvider {
    public ModAdvancementsProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.RAW_JADE),
                        Text.literal("JADE"), Text.literal("Amazing you found me"),
                        new Identifier(RealGems.MOD_ID, "textures/block/jade_ore.png"), AdvancementFrame.TASK,
                        true, true, false))
                .criterion("has_raw_jade", InventoryChangedCriterion.Conditions.items(ModItems.RAW_JADE))
                .build(consumer, RealGems.MOD_ID + ":realgems");

        Advancement sapphire_Ore = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.SAPPHIRE),
                        Text.literal("Sapphire"), Text.literal("Shine Bright Like A Diamond"),
                        new Identifier(RealGems.MOD_ID, "textures/block/sapphire_ore.png"), AdvancementFrame.TASK,
                        true, true, false))
                .criterion("has_sapphire", InventoryChangedCriterion.Conditions.items(ModItems.SAPPHIRE))
                .parent(rootAdvancement)
                .build(consumer, RealGems.MOD_ID + ":sapphire");

        Advancement pink_diamond_Ore = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.PINK_DIAMOND),
                        Text.literal("Pink_Diamond"), Text.literal("A Pink Diamond?"),
                        new Identifier(RealGems.MOD_ID, "textures/block/pink_diamond_ore.png"), AdvancementFrame.TASK,
                        true, true, false))
                .criterion("has_pink_diamond", InventoryChangedCriterion.Conditions.items(ModItems.PINK_DIAMOND))
                .parent(rootAdvancement)
                .build(consumer, RealGems.MOD_ID + ":pink_diamond");

        Advancement amber_Ore = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.AMBER),
                        Text.literal("Amber"), Text.literal("A Inspiration to my mod!"),
                        new Identifier(RealGems.MOD_ID, "textures/block/amber_ore.png"), AdvancementFrame.TASK,
                        true, true, false))
                .criterion("has_amber", InventoryChangedCriterion.Conditions.items(ModItems.AMBER))
                .parent(rootAdvancement)
                .build(consumer, RealGems.MOD_ID + ":amber");


    }
}
