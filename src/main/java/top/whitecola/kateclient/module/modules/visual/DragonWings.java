package top.whitecola.kateclient.module.modules.visual;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.lwjgl.opengl.GL11;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;
import top.whitecola.kateclient.utils.RenderWings;

public class DragonWings extends AbstractModule {
    private RenderWings renderWings = new RenderWings();

    @Override
    public void onRenderPlayer(RenderPlayerEvent.Post e) {
        EntityPlayer player = e.entityPlayer;
        if(player.isInvisible()){
            return;
        }

        if(player instanceof EntityPlayerSP || player.getGameProfile().getName().equalsIgnoreCase("White_cola")){
            if(useChams()){
                GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
                GL11.glPolygonOffset(1.0F,-1000000F);
            }
            renderWings.renderWings(player, e.partialRenderTick);
            if (useChams()) {
                GL11.glPolygonOffset(1.0F, 1000000F);
                GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
            }
        }
        super.onRenderPlayer(e);
    }

    @Override
    public ModuleCategory getModuleType() {
        return ModuleCategory.VISUAL;
    }

    @Override
    public String getModuleName() {
        return "DragonWings";
    }

    private boolean useChams() {
        return KateClient.getKateClient().getModuleManager().getModuleByName("Chams").isEnabled();

    }
}
