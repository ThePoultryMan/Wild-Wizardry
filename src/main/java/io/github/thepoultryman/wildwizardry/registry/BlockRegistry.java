package io.github.thepoultryman.wildwizardry.registry;

import io.github.thepoultryman.wildwizardry.WildWizardry;
import io.github.thepoultryman.wildwizardry.pig.statue.PigStatueBlock;
import io.github.thepoultryman.wildwizardry.pig.statue.PigStatueBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final PigStatueBlock PIG_STATUE_BLOCK = new PigStatueBlock(FabricBlockSettings.of(Material.METAL));

    public static void registerBlocks() {
        register("pig_statue", PIG_STATUE_BLOCK);
    }

    private static void register(String name, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(WildWizardry.MOD_ID, name), block);
    }

    public static class BlockEntityRegistry {
        public static BlockEntityType<PigStatueBlockEntity> PIG_STATUE_BLOCK_ENTITY = FabricBlockEntityTypeBuilder.create((PigStatueBlockEntity::new),
                PIG_STATUE_BLOCK).build(null);

        public static void registerBlockEntities() {
            register("pig_statue_entity", PIG_STATUE_BLOCK_ENTITY);
        }

        private static void register(String name, BlockEntityType<?> blockEntityType) {
            Registry.register(Registry.BLOCK_ENTITY_TYPE, WildWizardry.MOD_ID + ":" + name, blockEntityType);
        }
    }
}
