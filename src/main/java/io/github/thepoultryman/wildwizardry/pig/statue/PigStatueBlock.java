package io.github.thepoultryman.wildwizardry.pig.statue;

import io.github.thepoultryman.wildwizardry.common.statue.AnimalStatueBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class PigStatueBlock extends AnimalStatueBlock {
    private static final VoxelShape STATUE_SHAPE;

    public PigStatueBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new PigStatueBlockEntity(pos, state);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return STATUE_SHAPE;
    }

    static {
        VoxelShape base = Block.createCuboidShape(0D, 0D, 0D, 16D, 5, 16D);

        VoxelShape frontLegs = VoxelShapes.combineAndSimplify(Block.createCuboidShape(4D, 5D, 3D, 12D, 9D, 6D),
                Block.createCuboidShape(7D, 5D, 3D, 9D, 9D, 6D), BooleanBiFunction.ONLY_FIRST);
        VoxelShape backLegs = VoxelShapes.combineAndSimplify(Block.createCuboidShape(4D, 5D, 13D, 12D, 9D, 16D),
                Block.createCuboidShape(7D, 5D, 13D, 9D, 9D, 16D), BooleanBiFunction.ONLY_FIRST);
        VoxelShape legs = VoxelShapes.union(frontLegs, backLegs);

        VoxelShape body = Block.createCuboidShape(4D, 9D, 3D, 12D, 15D, 15D);

        VoxelShape face = Block.createCuboidShape(5D, 11D, -1D, 11D, 17D, 5D);
        VoxelShape nose = Block.createCuboidShape(6.5D, 12D, -2D,9.5D, 14D, -1D);
        VoxelShape head = VoxelShapes.union(face, nose);

        VoxelShape upperBody = VoxelShapes.combineAndSimplify(body, head, BooleanBiFunction.NOT_SAME);

        STATUE_SHAPE = VoxelShapes.union(VoxelShapes.union(base, legs), upperBody);
    }
}
