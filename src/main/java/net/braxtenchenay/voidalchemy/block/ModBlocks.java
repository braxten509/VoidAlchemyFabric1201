package net.braxtenchenay.voidalchemy.block;

import net.braxtenchenay.voidalchemy.VoidAlchemy;
import net.braxtenchenay.voidalchemy.block.custom.BasicCustomBlock;
import net.braxtenchenay.voidalchemy.block.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> blockList = new ArrayList<>();

    public static final IntProvider NO_XP_DROP = UniformIntProvider.create(0, 0);

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new BasicCustomBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), NO_XP_DROP));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new BasicCustomBlock(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK), NO_XP_DROP));

    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new BasicCustomBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(3, 6)));

    public static final Block DEEPSLATE_PINK_GARNET_ORE = registerBlock("deepslate_pink_garnet_ore",
            new BasicCustomBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE), UniformIntProvider.create(3, 6)));

    public static final Block NETHER_PINK_GARNET_ORE = registerBlock("nether_pink_garnet_ore",
            new BasicCustomBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(3, 6)));

    public static final Block END_STONE_PINK_GARNET_ORE = registerBlock("end_stone_pink_garnet_ore",
            new BasicCustomBlock(FabricBlockSettings.copyOf(Blocks.END_STONE), UniformIntProvider.create(3, 6)));

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(VoidAlchemy.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(VoidAlchemy.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocksLogger() {
        VoidAlchemy.LOGGER.info("[BLOCKS] Registering ModBlocks for " + VoidAlchemy.MOD_ID);

        for(Block block : blockList) {
            int blockTranslationKeyNameIndex = block.getTranslationKey().indexOf("voidalchemy.") + "voidalchemy.".length();
            VoidAlchemy.LOGGER.info("Registered " + block.getTranslationKey().substring(blockTranslationKeyNameIndex));
        }
    }

}
