package net.brett.realgems.item.custom;

import net.brett.realgems.util.ModTags;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;


public class PaxelItem extends MiningToolItem {
    public PaxelItem(ToolMaterial material, float attackDamage, float attackSpeed,   Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL_MINEABLE, settings);
    }
}
