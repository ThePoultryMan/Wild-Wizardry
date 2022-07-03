package io.github.thepoultryman.wildwizardry.pig.statue.screen;

import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.thepoultryman.wildwizardry.common.statue.screen.BaseGuiDescription;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;

public class PigGuiDescription extends BaseGuiDescription {
    public PigGuiDescription(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(syncId, playerInventory, context);

        WGridPanel root = new WGridPanel();
        this.setRootPanel(root);
        root.setSize(300, 200);
        root.setInsets(Insets.ROOT_PANEL);

        WItemSlot slot1 = WItemSlot.of(playerInventory, 0);
        root.add(slot1, 4, 1);

        root.add(this.createPlayerInventoryPanel(), 0, 3);

        root.validate(this);
    }
}
