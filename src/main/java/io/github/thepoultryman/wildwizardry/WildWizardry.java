package io.github.thepoultryman.wildwizardry;

import io.github.thepoultryman.wildwizardry.registry.BlockRegistry;
import io.github.thepoultryman.wildwizardry.registry.GuiRegistry;
import io.github.thepoultryman.wildwizardry.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WildWizardry implements ModInitializer {
	public static final String MOD_ID = "wildwizardry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRegistry.registerBlocks();
		BlockRegistry.BlockEntityRegistry.registerBlockEntities();
		ItemRegistry.BlockItemRegistry.registerBlockItems();
		GuiRegistry.registerScreenHandlers();
	}
}
