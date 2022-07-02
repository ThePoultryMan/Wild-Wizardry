package io.github.thepoultryman.wildwizardry.pig.statue;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class PigStatueRenderer extends GeoBlockRenderer<PigStatueBlockEntity> {
    public PigStatueRenderer() {
        super(new PigStatueModel());
    }
}
