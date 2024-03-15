package net.braxtenchenay.voidalchemy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.braxtenchenay.voidalchemy.block.ModBlocks;
import net.braxtenchenay.voidalchemy.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.item.Item;

import java.util.Map;

// @Deprecated
public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for(Block block : ModBlocks.blockList) {
            blockStateModelGenerator.registerSimpleCubeAll(block);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for(Map.Entry<Item, Model> entry : ModItems.itemMap.entrySet()) {
            Item item = entry.getKey();
            Model model = entry.getValue();

            itemModelGenerator.register(item, model);
        }
    }
}
