package io.github.thepoultryman.wildwizardry.pig.statue;

import io.github.thepoultryman.wildwizardry.common.statue.AnimalStatueBlockEntity;
import io.github.thepoultryman.wildwizardry.registry.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class PigStatueBlockEntity extends AnimalStatueBlockEntity implements IAnimatable {
    private final AnimationFactory animationFactory = new AnimationFactory(this);

    public PigStatueBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockRegistry.BlockEntityRegistry.PIG_STATUE_BLOCK_ENTITY, blockPos, blockState);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        return PlayState.STOP; // There are no animations currently
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.animationFactory;
    }
}
