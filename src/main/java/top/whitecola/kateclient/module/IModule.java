package top.whitecola.kateclient.module;

import net.minecraftforge.client.event.RenderWorldLastEvent;

public interface IModule {
    void onTick();
    void onRender(RenderWorldLastEvent e);
    void onEnable();
    void onDisable();
    ModuleCategory getModuleType();
    String getModuleName();
    void optionEnable(String optionName);
    void optionDisable(String optionName);
    ModuleOption getOptionByName(String optionName);
}
