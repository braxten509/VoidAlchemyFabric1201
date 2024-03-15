package net.braxtenchenay.voidalchemy;

import net.braxtenchenay.voidalchemy.block.ModBlocks;
import net.braxtenchenay.voidalchemy.item.ModItemGroup;
import net.braxtenchenay.voidalchemy.item.ModItems;
import net.braxtenchenay.voidalchemy.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class VoidAlchemy implements ModInitializer {

	public static final String MOD_ID = "voidalchemy";

    public static final Logger LOGGER = LoggerFactory.getLogger("VoidAlchemy");

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocksLogger();
		ModItems.registerModItemsLogger();

		ModRegistries.registerModStuffs();

	}
}