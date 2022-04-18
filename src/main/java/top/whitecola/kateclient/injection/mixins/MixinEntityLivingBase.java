package top.whitecola.kateclient.injection.mixins;

import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(EntityLivingBase.class)
public class MixinEntityLivingBase {
    /**
     * @author white_cola
     */
    @Overwrite
    protected String getHurtSound() {
        return "game.neutral.hurt";
    }
}
