package io.github.thepoultryman.wildwizardry.common.statue.screen;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.thepoultryman.wildwizardry.registry.GuiRegistry;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;

public class BaseGuiDescription extends SyncedGuiDescription {
    protected final WGridPanel root;

    public BaseGuiDescription(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(GuiRegistry.PIG_STATUE_SCREEN, syncId, playerInventory, getBlockInventory(context, 1), getBlockPropertyDelegate(context));

        this.root = new WGridPanel();
        this.setRootPanel(this.root);
        this.root.setSize(300, 200);
        this.root.setInsets(Insets.ROOT_PANEL);

        this.root.add(this.createPlayerInventoryPanel(), 0, 3);
    }
}
