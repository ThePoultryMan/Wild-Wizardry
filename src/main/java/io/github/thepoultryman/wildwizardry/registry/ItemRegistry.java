package io.github.thepoultryman.wildwizardry.registry;

import io.github.thepoultryman.wildwizardry.WildWizardry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static class BlockItemRegistry {
        public static void registerBlockItems() {
            register("pig_statue", BlockRegistry.PIG_STATUE_BLOCK, ItemGroup.DECORATIONS);
        }

        private static void register(String name, Block block, ItemGroup group) {
            Registry.register(Registry.ITEM, new Identifier(WildWizardry.MOD_ID, name), new BlockItem(block,new Item.Settings().group(group)));
        }
    }
}
