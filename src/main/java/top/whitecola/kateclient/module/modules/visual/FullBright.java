package top.whitecola.kateclient.module.modules.visual;

import net.minecraft.client.Minecraft;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;

public class FullBright extends AbstractModule {
    float lastGammaSetting = 100;

    @Override
    public void onEnable() {
        super.onEnable();
        lastGammaSetting = Minecraft.getMinecraft().gameSettings.gammaSetting;
        Minecraft.getMinecraft().gameSettings.gammaSetting = 260;

    }

    @Override
    public void onDisable() {
        super.onDisable();
        Minecraft.getMinecraft().gameSettings.gammaSetting = lastGammaSetting;
    }

    @Override
    public String getModuleName() {
        return "FullBright";

    }

    @Override
    public ModuleCategory getModuleType() {
        return ModuleCategory.RENDERS;
    }
}
