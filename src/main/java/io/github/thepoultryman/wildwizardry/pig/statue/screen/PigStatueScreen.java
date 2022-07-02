package io.github.thepoultryman.wildwizardry.pig.statue.screen;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class PigStatueScreen extends CottonInventoryScreen<PigGuiDescription> {
    public PigStatueScreen(PigGuiDescription description, PlayerEntity player, Text title) {
        super(description, player, title);
    }
}
