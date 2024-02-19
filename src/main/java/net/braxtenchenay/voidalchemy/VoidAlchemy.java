package net.braxtenchenay.voidalchemy;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VoidAlchemy implements ModInitializer {

	public static final String MOD_ID = "voidalchemy";

    public static final Logger LOGGER = LoggerFactory.getLogger("voidalchemy");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

	}
}