package top.whitecola.kateclient.module.modules.visual;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;
import top.whitecola.kateclient.utils.RenderWings;

public class DragonWings extends AbstractModule {
    private RenderWings renderWings = new RenderWings();

    @Override
    public void onRenderPlayer(RenderPlayerEvent.Post e) {
        EntityPlayer player = e.entityPlayer;
        if(player instanceof EntityPlayerSP || player.getGameProfile().getName().equalsIgnoreCase("White_cola")){
            renderWings.renderWings(player, e.partialRenderTick);
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
}
