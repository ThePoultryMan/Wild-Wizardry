package io.github.thepoultryman.wildwizardry.pig.statue;

import io.github.thepoultryman.wildwizardry.common.statue.AnimalStatueBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class PigStatueBlock extends AnimalStatueBlock {
    public PigStatueBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new PigStatueBlockEntity(pos, state);
    }
}
