package io.github.thepoultryman.wildwizardry.common.statue.screen;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.thepoultryman.wildwizardry.registry.GuiRegistry;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;

public class BaseGuiDescription extends SyncedGuiDescription {
    public BaseGuiDescription(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(GuiRegistry.PIG_STATUE_SCREEN, syncId, playerInventory, getBlockInventory(context, 1), getBlockPropertyDelegate(context));
    }
}
