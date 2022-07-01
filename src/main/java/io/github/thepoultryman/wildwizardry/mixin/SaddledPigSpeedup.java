package io.github.thepoultryman.wildwizardry.mixin;

import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.PigEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PigEntity.class)
public class SaddledPigSpeedup {
    @Inject(method = "getSaddledSpeed", at = @At("HEAD"), cancellable = true)
    private void wildwizardry$overrideSaddledPigSpeed(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue((float) ((PigEntity) (Object) this).getAttributeValue(EntityAttributes.GENERIC_MOVEMENT_SPEED) * 0.55f);
    }
}
