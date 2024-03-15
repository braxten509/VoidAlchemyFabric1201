package net.braxtenchenay.voidalchemy.item;

import jdk.jfr.Description;
import net.braxtenchenay.voidalchemy.VoidAlchemy;
import net.braxtenchenay.voidalchemy.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VoidAlchemy.MOD_ID, "pink_garnet_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pink_garnet_group"))
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ALCHEMICAL_DUST);
                        entries.add(ModItems.ARCAMIRUS_DUST);
                        entries.add(ModItems.ETHEREAL_DUST);
                        entries.add(ModItems.MIRCANTERS_DUST);
                        entries.add(ModItems.VOID_DUST);

                        entries.add(ModItems.BAG_OF_ALCHEMICAL_DUST);
                        entries.add(ModItems.BAG_OF_ARCAMIRUS_DUST);
                        entries.add(ModItems.BAG_OF_ETHEREAL_DUST);
                        entries.add(ModItems.BAG_OF_MIRCANTERS_DUST);
                        entries.add(ModItems.BAG_OF_VOID_DUST);
                        entries.add(ModItems.GLIMMER_OF_HOPE);
                        entries.add(ModItems.SPARK_OF_SUPERNATURAL_STRENGTH);

                        entries.add(ModItems.ZORUMITE);
                        entries.add(ModItems.STRANGE_ZORUMITE);
                        entries.add(ModItems.CELESTIAL_ZORUMITE);
                        entries.add(ModItems.SUPERNATURAL_ZORUMITE);

                        entries.add(ModItems.ALCHEMISTS_GUIDE);
                        entries.add(ModItems.OMINOUS_BOOK);
                        entries.add(ModItems.GABE_PEPPER_SEEDS);
                        entries.add(ModItems.GABE_PEPPER);
                        entries.add(ModItems.EMPTY_VIAL);

                    }).build());

    public static void registerItemGroups() {

    }

}
