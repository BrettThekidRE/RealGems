package net.brett.realgems.item;

import net.brett.realgems.RealGems;
import net.brett.realgems.block.ModBlocks;
import net.brett.realgems.item.custom.PaxelItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item JADE = registerItem("jade",
          new Item(new FabricItemSettings()));
  public static final Item RAW_JADE = registerItem("raw_jade",
          new Item(new FabricItemSettings()));
  public static final Item RED_COAL = registerItem("red_coal",
          new Item(new FabricItemSettings()));
  public static final Item PINK_DIAMOND = registerItem("pink_diamond",
          new Item(new FabricItemSettings()));
  public static final Item SAPPHIRE = registerItem("sapphire",
          new Item(new FabricItemSettings()));
 public static final Item AMBER = registerItem("amber",
          new Item(new FabricItemSettings()));
 public static final Item RAW_AMBER = registerItem("raw_amber",
          new Item(new FabricItemSettings()));

  public static final Item BANANA = registerItem("banana",
          new Item(new FabricItemSettings().food(ModFoodComponents.BANANA)));
  public static final Item CHERRY = registerItem("cherry",
          new Item(new FabricItemSettings().food(ModFoodComponents.CHERRY)));
  public static final Item SWEETCORN = registerItem("sweetcorn",
          new Item(new FabricItemSettings().food(ModFoodComponents.SWEETCORN)));
  public static final Item SWEETCORN_SEEDS = registerItem("sweetcorn_seeds",
          new AliasedBlockItem(ModBlocks.SWEETCORN_CROP, new FabricItemSettings()));




  public static final Item AMBER_HELMET = registerItem("amber_helmet",
          new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.HELMET, new FabricItemSettings()));
  public static final Item AMBER_CHESTPLATE = registerItem("amber_chestplate",
          new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
  public static final Item AMBER_LEGGINGS = registerItem("amber_leggings",
          new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
  public static final Item AMBER_BOOTS = registerItem("amber_boots",
          new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item AMBER_SWORD = registerItem("amber_sword",
            new SwordItem(ModToolMaterial.AMBER,3,3.5f,new FabricItemSettings()));
    public static final Item AMBER_AXE = registerItem("amber_axe",
            new AxeItem(ModToolMaterial.AMBER,2,1f,new FabricItemSettings()));
    public static final Item AMBER_PICKAXE = registerItem("amber_pickaxe",
            new PickaxeItem(ModToolMaterial.AMBER,2,1f,new FabricItemSettings()));
    public static final Item AMBER_SHOVEL = registerItem("amber_shovel",
            new ShovelItem(ModToolMaterial.AMBER,2,0.5f,new FabricItemSettings()));
    public static final Item AMBER_HOE = registerItem("amber_hoe",
            new HoeItem(ModToolMaterial.AMBER,1,1f,new FabricItemSettings()));
    public static final Item AMBER_PAXEL = registerItem("amber_paxel",
            new PaxelItem(ModToolMaterial.AMBER,2,2f,new FabricItemSettings()));


  public static final Item JADE_SWORD = registerItem("jade_sword",
          new SwordItem(ModToolMaterial.JADE,4,4f, new FabricItemSettings()));
  public static final Item JADE_AXE = registerItem("jade_axe",
          new AxeItem(ModToolMaterial.JADE,3,3f,new FabricItemSettings()));
  public static final Item JADE_PICKAXE = registerItem("jade_pickaxe",
          new PickaxeItem(ModToolMaterial.JADE,3,3f,new FabricItemSettings()));
  public static final Item JADE_SHOVEL = registerItem("jade_shovel",
          new ShovelItem(ModToolMaterial.JADE,2,1.5f,new FabricItemSettings()));
  public static final Item JADE_HOE = registerItem("jade_hoe",
          new HoeItem(ModToolMaterial.JADE,1,0.5f,new FabricItemSettings()));
    public static final Item JADE_PAXEL = registerItem("jade_paxel",
            new PaxelItem(ModToolMaterial.JADE,3,3f,new FabricItemSettings()));

    public static final Item JADE_HELMET = registerItem("jade_helmet",
            new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item JADE_CHESTPLATE = registerItem("jade_chestplate",
            new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item JADE_LEGGINGS = registerItem("jade_leggings",
            new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item JADE_BOOTS = registerItem("jade_boots",
            new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.BOOTS, new FabricItemSettings()));


  public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
          new SwordItem(ModToolMaterial.SAPPHIRE,3,3.5f,new FabricItemSettings()));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new AxeItem(ModToolMaterial.SAPPHIRE,2,1f,new FabricItemSettings()));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            new PickaxeItem(ModToolMaterial.SAPPHIRE,2,1f,new FabricItemSettings()));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            new ShovelItem(ModToolMaterial.SAPPHIRE,2,0.5f,new FabricItemSettings()));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new HoeItem(ModToolMaterial.SAPPHIRE,1,1f,new FabricItemSettings()));
    public static final Item SAPPHIRE_PAXEL = registerItem("sapphire_paxel",
            new PaxelItem(ModToolMaterial.SAPPHIRE,2,2f,new FabricItemSettings()));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item PINK_DIAMOND_SWORD = registerItem("pink_diamond_sword",
            new SwordItem(ModToolMaterial.PINK_DIAMOND,3,3f,new FabricItemSettings()));
    public static final Item PINK_DIAMOND_AXE = registerItem("pink_diamond_axe",
            new AxeItem(ModToolMaterial.PINK_DIAMOND,2,1f,new FabricItemSettings()));
    public static final Item PINK_DIAMOND_PICKAXE = registerItem("pink_diamond_pickaxe",
            new PickaxeItem(ModToolMaterial.PINK_DIAMOND,2,0.5f,new FabricItemSettings()));
    public static final Item PINK_DIAMOND_SHOVEL = registerItem("pink_diamond_shovel",
            new ShovelItem(ModToolMaterial.PINK_DIAMOND,2,1f,new FabricItemSettings()));
    public static final Item PINK_DIAMOND_HOE = registerItem("pink_diamond_hoe",
            new HoeItem(ModToolMaterial.PINK_DIAMOND,1,1f,new FabricItemSettings()));

    public static final Item PINK_DIAMOND_PAXEL = registerItem("pink_diamond_paxel",
            new PaxelItem(ModToolMaterial.PINK_DIAMOND,2,2f,new FabricItemSettings()));


    public static final Item PINK_DIAMOND_HELMET = registerItem("pink_diamond_helmet",
            new ArmorItem(ModArmorMaterials.PINK_DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PINK_DIAMOND_CHESTPLATE = registerItem("pink_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.PINK_DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PINK_DIAMOND_LEGGINGS = registerItem("pink_diamond_leggings",
            new ArmorItem(ModArmorMaterials.PINK_DIAMOND, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PINK_DIAMOND_BOOTS = registerItem("pink_diamond_boots",
            new ArmorItem(ModArmorMaterials.PINK_DIAMOND, ArmorItem.Type.BOOTS, new FabricItemSettings()));



   private static Item registerItem(String name, Item item) {
       return Registry.register(Registries.ITEM, new Identifier(RealGems.MOD_ID, name), item);
   }
    public static void registerModItems() {
        RealGems.LOGGER.info("Registering Mod Items for" + RealGems.MOD_ID);
    }
}
