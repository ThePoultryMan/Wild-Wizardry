package io.github.thepoultryman.wildwizardry.pig.statue;

import io.github.thepoultryman.wildwizardry.common.statue.AnimalStatueBlockEntity;
import io.github.thepoultryman.wildwizardry.pig.statue.screen.PigGuiDescription;
import io.github.thepoultryman.wildwizardry.registry.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.util.math.BlockPos;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

public class PigStatueBlockEntity extends AnimalStatueBlockEntity {
    public PigStatueBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockRegistry.BlockEntityRegistry.PIG_STATUE_BLOCK_ENTITY, blockPos, blockState);
    }

    @Override
    public ScreenHandler createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new PigGuiDescription(i, playerInventory, ScreenHandlerContext.create(world, pos));
    }

    @Override
    protected <E extends IAnimatable> PlayState getPlayState(AnimationEvent<E> event) {
        return super.getPlayState(event);
    }
}
