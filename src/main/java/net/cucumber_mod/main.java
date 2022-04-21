package net.cucumber_mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class main implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MODID = "cucumber_magic_mod";

	@Override
	public void onInitialize() {

		LOGGER.info("cucumber_magic_mod is lorded now");
	}
}
