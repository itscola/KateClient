package top.whitecola.kateclient.injection.mixins;

import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import top.whitecola.kateclient.KateClient;

@Mixin(RendererLivingEntity.class)
public abstract class MixinRendererLivingEntity {

    @Inject(method = "doRender", at = @At(value = "HEAD"))
    public <T extends EntityLivingBase> void HeadDoRender(T p_doRender_1_, double p_doRender_2_, double p_doRender_4_, double p_doRender_5_, float p_doRender_6_, float p_doRender_7_, CallbackInfo ci){
        if(KateClient.getKateClient().getModuleManager().getModuleByName("Chams").isEnabled()){
            GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
            GL11.glPolygonOffset(1.0F,-1000000F);
        }
    }

    @Inject(method = "doRender", at = @At(value = "RETURN"))
    public <T extends EntityLivingBase> void RETURNDoRender(T p_doRender_1_, double p_doRender_2_, double p_doRender_4_, double p_doRender_5_, float p_doRender_6_, float p_doRender_7_, CallbackInfo ci) {
        if (KateClient.getKateClient().getModuleManager().getModuleByName("Chams").isEnabled()) {

            GL11.glPolygonOffset(1.0F, 1000000F);
            GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
        }
    }



}
