package net.brett.realgems.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BANANA = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent CHERRY = new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build();
}
