package org.retrotbg.fabricatedbackpacks;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Init implements ModInitializer {
	public static final String MOD_ID = "fabricatedbackpacks";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric, From Fabricated BackPacks!");
	}
}