package top.whitecola.kateclient.module.modules.visual;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.BlockPos;
import net.minecraftforge.client.event.RenderWorldEvent;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;
import top.whitecola.kateclient.utils.PlayerSPUtils;

import java.awt.*;

public class BlockOveraly extends AbstractModule {
    protected Color color = new Color(250, 249, 248);


    @Override
    public ModuleCategory getModuleType() {
        return ModuleCategory.VISUAL;
    }

    @Override
    public String getModuleName() {
        return "BlockOveraly";
    }
}
