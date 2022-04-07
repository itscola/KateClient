package top.whitecola.kateclient.module;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import top.whitecola.kateclient.ui.widget.AbstractWidget;

public interface IModule {
    void onTick();
    void onRender2D(RenderWorldLastEvent e);

    void onRender(TickEvent.RenderTickEvent e);
    void onRenderOverLay(RenderGameOverlayEvent event);

    void onEnable();
    void onDisable();

    void enable();
    void disable();
    boolean isEnabled();
    @Deprecated
    void renderGameOverlayRETURN();

    void addOption(ModuleOption option);
    void removeOption(ModuleOption option);

    ModuleCategory getModuleType();
    String getModuleName();
    void optionEnable(String optionName);
    void optionDisable(String optionName);
    ModuleOption getOptionByName(String optionName);

    void addWidget(AbstractWidget widget);
    void removeWidget(AbstractWidget widget);

    String getDescription();

}
