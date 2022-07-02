package io.github.thepoultryman.wildwizardry.pig.statue;

import io.github.thepoultryman.wildwizardry.WildWizardry;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PigStatueModel extends AnimatedGeoModel<PigStatueBlockEntity> {
    @Override
    public Identifier getModelResource(PigStatueBlockEntity object) {
        return new Identifier(WildWizardry.MOD_ID, "geo/statues/pig_statue.geo.json");
    }

    @Override
    public Identifier getTextureResource(PigStatueBlockEntity object) {
        return new Identifier(WildWizardry.MOD_ID, "textures/block/pig_statue.png");
    }

    @Override
    public Identifier getAnimationResource(PigStatueBlockEntity animatable) {
        return new Identifier(WildWizardry.MOD_ID, "animations/statues/pig_statue.animation.json");
    }
}
