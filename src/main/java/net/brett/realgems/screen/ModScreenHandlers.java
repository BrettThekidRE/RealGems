package net.brett.realgems.screen;

import net.brett.realgems.RealGems;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
      public static final ScreenHandlerType<SolarStationScreenHandler> SOLAR_STATION_SCREEN_HANDLER =
              Registry.register(Registries.SCREEN_HANDLER, new Identifier(RealGems.MOD_ID, "solar_station_screen_handler"),
                      new ExtendedScreenHandlerType<>(SolarStationScreenHandler::new));

    public static void registerScreenHandlers() {
        RealGems.LOGGER.info("Registering Screen Handlers for " + RealGems.MOD_ID);
    }
}
