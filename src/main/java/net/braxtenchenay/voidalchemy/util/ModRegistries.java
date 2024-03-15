package net.braxtenchenay.voidalchemy.util;

import net.braxtenchenay.voidalchemy.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.PEAT_BRICK, 200);
    }

}
