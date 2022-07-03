package io.github.thepoultryman.wildwizardry.common;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;

public interface SimpleInventory extends Inventory {
    DefaultedList<ItemStack> getItems();

    static SimpleInventory of(int size) {
        return () -> DefaultedList.ofSize(size, ItemStack.EMPTY);
    }

    @Override
    default int size() {
        return this.getItems().size();
    }

    @Override
    default boolean isEmpty() {
        for (int i = 0; i < size(); i++) {
            ItemStack stack = this.getStack(i);
            if (!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    default ItemStack getStack(int slot) {
        return this.getItems().get(slot);
    }

    @Override
    default ItemStack removeStack(int slot, int count) {
        ItemStack result = Inventories.splitStack(this.getItems(), slot, count);
        if (!result.isEmpty()) {
            this.markDirty();
        }
        return result;
    }

    @Override
    default ItemStack removeStack(int slot) {
        return Inventories.removeStack(getItems(), slot);
    }

    @Override
    default void setStack(int slot, ItemStack stack) {
        this.getItems().set(slot, stack);
        if (stack.getCount() > getMaxCountPerStack()) {
            stack.setCount(getMaxCountPerStack());
        }
    }

    @Override
    default void clear() {
        this.getItems().clear();
    }

    @Override
    default void markDirty() {
        // Override if you want behavior.
    }

    @Override
    default boolean canPlayerUse(PlayerEntity player) {
        return true;
    }
}
