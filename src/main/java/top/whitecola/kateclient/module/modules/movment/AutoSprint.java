package top.whitecola.kateclient.module.modules.movment;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.potion.Potion;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;
import top.whitecola.kateclient.utils.PlayerSPUtils;

import java.awt.*;

import static top.whitecola.kateclient.utils.MCWrapper.*;


public class AutoSprint extends AbstractModule {
    private int colorRGB = new Color(40, 168, 220).getRGB();
    ScaledResolution scaledResolution = new ScaledResolution(mc);


    @Override
    public void onTick() {
        if(Minecraft.getMinecraft()==null||Minecraft.getMinecraft().theWorld==null || mc.thePlayer==null){
            return;
        }

        if(!PlayerSPUtils.isMoving() || PlayerSPUtils.isSneaking() || mc.thePlayer.getFoodStats().getFoodLevel() <= 6.0F || mc.thePlayer.isPotionActive(Potion.blindness)){
            if(mc.thePlayer.isSprinting()) {
                mc.thePlayer.setSprinting(false);
            }
            return;
        }


        if(mc.thePlayer.movementInput.moveForward >= 0.8F){
            if(!mc.thePlayer.isSprinting()) {
                mc.thePlayer.setSprinting(true);
            }
            return;
        }

        super.onTick();
    }




    @Override
    public void onRenderOverLay(RenderGameOverlayEvent event) {
        if(Minecraft.getMinecraft()==null||Minecraft.getMinecraft().theWorld==null || mc.thePlayer==null){
            return;
        }

        if (event.type != RenderGameOverlayEvent.ElementType.ALL) {
            return;
        }


        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());

        FontRenderer fontRenderer = mc.fontRendererObj;

        fontRenderer.drawStringWithShadow("Auto Sprint",scaledResolution.getScaledWidth()/7 ,scaledResolution.getScaledHeight()-10,colorRGB);

        super.onRenderOverLay(event);
    }

    @Override
    public ModuleCategory getModuleType() {
        return ModuleCategory.MOVEMENT;
    }

    @Override
    public String getModuleName() {
        return "AutoSprint";

    }



}
