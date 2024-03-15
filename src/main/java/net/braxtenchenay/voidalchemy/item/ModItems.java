package net.braxtenchenay.voidalchemy.item;

import net.braxtenchenay.voidalchemy.VoidAlchemy;
import net.braxtenchenay.voidalchemy.item.custom.BasicCustomItem;
import net.braxtenchenay.voidalchemy.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class ModItems {

    public static final Map<Item, Model> itemMap = new HashMap<>();

    public static final Item ALCHEMICAL_DUST = registerItem("alchemical_dust",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item ARCAMIRUS_DUST = registerItem("arcamirus_dust",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item ETHEREAL_DUST = registerItem("ethereal_dust",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item MIRCANTERS_DUST = registerItem("mircanters_dust",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item VOID_DUST = registerItem("void_dust",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item BAG_OF_ALCHEMICAL_DUST = registerItem("bag_of_alchemical_dust",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item BAG_OF_ARCAMIRUS_DUST = registerItem("bag_of_arcamirus_dust",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item BAG_OF_ETHEREAL_DUST = registerItem("bag_of_ethereal_dust",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item BAG_OF_MIRCANTERS_DUST = registerItem("bag_of_mircanters_dust",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item BAG_OF_VOID_DUST = registerItem("bag_of_void_dust",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item GLIMMER_OF_HOPE = registerItem("glimmer_of_hope",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item SPARK_OF_SUPERNATURAL_STRENGTH = registerItem("spark_of_supernatural_strength",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item ZORUMITE = registerItem("zorumite",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item STRANGE_ZORUMITE = registerItem("strange_zorumite",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item CELESTIAL_ZORUMITE = registerItem("celestial_zorumite",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item SUPERNATURAL_ZORUMITE = registerItem("supernatural_zorumite",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item ALCHEMISTS_GUIDE = registerItem("alchemists_guide",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item OMINOUS_BOOK = registerItem("ominous_book",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item GABE_PEPPER = registerItem("gabe_pepper",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item GABE_PEPPER_SEEDS = registerItem("gabe_pepper_seeds",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item EMPTY_VIAL = registerItem("empty_vial",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item PINK_GARNET = registerItem("pink_garnet",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item CAULIFLOWER = registerItem("cauliflower",
            new BasicCustomItem(new FabricItemSettings().food(ModFoodComponents.CAULIFLOWER), Models.GENERATED));

    public static final Item PEAT_BRICK = registerItem("peat_brick",
            new BasicCustomItem(new FabricItemSettings(), Models.GENERATED));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(256), Models.GENERATED));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VoidAlchemy.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {

    }

    public static void registerModItemsLogger() {
        VoidAlchemy.LOGGER.info("[ITEMS] Registering ModItems for " + VoidAlchemy.MOD_ID);

        for(Item item : itemMap.keySet()) {
            int itemTranslationKeyNameIndex = item.getTranslationKey().indexOf("voidalchemy.") + "voidalchemy.".length();
            VoidAlchemy.LOGGER.info("Registered " + item.getTranslationKey().substring(itemTranslationKeyNameIndex));
        }
    }

}
