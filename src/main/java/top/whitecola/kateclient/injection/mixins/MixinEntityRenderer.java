package top.whitecola.kateclient.injection.mixins;

import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import top.whitecola.kateclient.KateClient;

import static top.whitecola.kateclient.utils.MCWrapper.*;

@Mixin(EntityRenderer.class)
public class MixinEntityRenderer {



    /**
     * @author White_cola
     * @reason NoHurtCam module.
     */
    @Overwrite
    private void hurtCameraEffect(float p_hurtCameraEffect_1_) {

        if(KateClient.getKateClient().getModuleManager().getModuleByName("NoHurtCam").isEnabled()) {
            return;
        }

        if (mc.getRenderViewEntity() instanceof EntityLivingBase) {
            EntityLivingBase entitylivingbase = (EntityLivingBase)mc.getRenderViewEntity();
            float f = (float)entitylivingbase.hurtTime - p_hurtCameraEffect_1_;
            float f2;
            if (entitylivingbase.getHealth() <= 0.0F) {
                f2 = (float)entitylivingbase.deathTime + p_hurtCameraEffect_1_;
                GlStateManager.rotate(40.0F - 8000.0F / (f2 + 200.0F), 0.0F, 0.0F, 1.0F);
            }

            if (f < 0.0F) {
                return;
            }



            f /= (float)entitylivingbase.maxHurtTime;
            f = MathHelper.sin(f * f * f * f * 3.1415927F);
            f2 = entitylivingbase.attackedAtYaw;
            GlStateManager.rotate(-f2, 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(-f * 14.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.rotate(f2, 0.0F, 1.0F, 0.0F);
        }

    }

}
