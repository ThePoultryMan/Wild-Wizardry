package io.github.thepoultryman.wildwizardry;

import io.github.thepoultryman.wildwizardry.pig.statue.PigStatueRenderer;
import io.github.thepoultryman.wildwizardry.registry.BlockRegistry;
import io.github.thepoultryman.wildwizardry.registry.GuiRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;

public class WildWizardryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererRegistry.register(BlockRegistry.BlockEntityRegistry.PIG_STATUE_BLOCK_ENTITY, (context -> new PigStatueRenderer()));

        GuiRegistry.registerScreenHandlersClient();
    }
}
