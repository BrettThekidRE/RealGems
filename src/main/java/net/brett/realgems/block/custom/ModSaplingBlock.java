package net.brett.realgems.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModSaplingBlock extends SaplingBlock {
    public ModSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.DIRT);
    }
}
