package net.brett.realgems.block.entity;

import net.brett.realgems.RealGems;
import net.brett.realgems.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<SolarStationBlockEntity> SOLAR_STATION_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(RealGems.MOD_ID, "solar_station_block_entity"),
                    FabricBlockEntityTypeBuilder.create(SolarStationBlockEntity::new,
                            ModBlocks.SOLAR_STATION).build(null));




    public static void registerBlockEntities() {
        RealGems.LOGGER.info("Registering Block Entities for " + RealGems.MOD_ID);
    }
}
