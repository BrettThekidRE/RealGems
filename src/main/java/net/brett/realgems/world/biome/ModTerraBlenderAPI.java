package net.brett.realgems.world.biome;

;
import net.brett.realgems.RealGems;
import net.brett.realgems.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(RealGems.MOD_ID,"overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD,RealGems.MOD_ID, ModMaterialRules.makeRules());

    }
}
