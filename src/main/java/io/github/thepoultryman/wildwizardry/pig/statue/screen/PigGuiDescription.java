package io.github.thepoultryman.wildwizardry.pig.statue.screen;

import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.thepoultryman.wildwizardry.common.statue.screen.BaseGuiDescription;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;

public class PigGuiDescription extends BaseGuiDescription {
    public PigGuiDescription(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(syncId, playerInventory, context);

        WItemSlot slot1 = WItemSlot.of(this.blockInventory, 0);
        this.root.add(slot1, 4, 1);

        this.root.validate(this);
    }
}
