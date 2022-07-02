package io.github.thepoultryman.wildwizardry.registry;

import io.github.thepoultryman.wildwizardry.WildWizardry;
import io.github.thepoultryman.wildwizardry.pig.statue.screen.PigGuiDescription;
import io.github.thepoultryman.wildwizardry.pig.statue.screen.PigStatueScreen;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class GuiRegistry {
    public static ScreenHandlerType<PigGuiDescription> PIG_STATUE_SCREEN;

    public static void registerScreenHandlers() {
        PIG_STATUE_SCREEN = ScreenHandlerRegistry.registerSimple(new Identifier(WildWizardry.MOD_ID, "pig_statue"), PigGuiDescription::new);
    }

    public static void registerScreenHandlersClient() {
        ScreenRegistry.<PigGuiDescription, PigStatueScreen>register(PIG_STATUE_SCREEN, ((description, inventory, title) -> new PigStatueScreen(description, inventory.player, title)));
    }
}
