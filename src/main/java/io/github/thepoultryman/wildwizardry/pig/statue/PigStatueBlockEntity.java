package io.github.thepoultryman.wildwizardry.pig.statue;

import io.github.thepoultryman.wildwizardry.common.statue.AnimalStatueBlockEntity;
import io.github.thepoultryman.wildwizardry.registry.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class PigStatueBlockEntity extends AnimalStatueBlockEntity {
    public PigStatueBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockRegistry.BlockEntityRegistry.PIG_STATUE_BLOCK_ENTITY, blockPos, blockState);
    }


}
