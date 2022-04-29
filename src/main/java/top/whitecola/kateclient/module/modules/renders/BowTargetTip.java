package top.whitecola.kateclient.module.modules.renders;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.opengl.GL11;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;
import top.whitecola.kateclient.utils.PlayerSPUtils;
import top.whitecola.kateclient.utils.PlayerUtils;

import static top.whitecola.kateclient.utils.MCWrapper.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BowTargetTip extends AbstractModule {

    @Override
    public void onRenderOverLayPre(RenderGameOverlayEvent.Pre event) {
//        if (event.type != RenderGameOverlayEvent.ElementType.CROSSHAIRS) {
//            return;
//        }
//
//
//        for(Entity entity : mc.thePlayer.getEntityWorld().getLoadedEntityList()){
////            !(entity instanceof EntityPlayerMP)
//            if(entity==null || entity.isDead  || entity.isInvisible()){
//                continue;
//            }
//
//            float[] rotations = PlayerUtils.getBowAngles(entity);
//
//
//
//        }

        super.onRenderOverLayPre(event);
    }



    @Override
    public String getModuleName() {
        return "BowTargetTip";

    }

    @Override
    public ModuleCategory getModuleType() {
        return ModuleCategory.RENDERS;
    }
}
