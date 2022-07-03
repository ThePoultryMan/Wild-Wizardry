package io.github.thepoultryman.wildwizardry.common.statue;

import io.github.thepoultryman.wildwizardry.common.SimpleInventory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public abstract class AnimalStatueBlockEntity extends BlockEntity implements IAnimatable, NamedScreenHandlerFactory, SimpleInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(5, new ItemStack(Items.BREAD));
    private final AnimationFactory animationFactory = new AnimationFactory(this);

    public AnimalStatueBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable(this.getCachedState().getBlock().getTranslationKey());
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return null;
    }

    protected <E extends IAnimatable> PlayState getPlayState(AnimationEvent<E> event) {
        return PlayState.STOP;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController<>(this, "controller", 0, this::getPlayState));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.animationFactory;
    }
}
