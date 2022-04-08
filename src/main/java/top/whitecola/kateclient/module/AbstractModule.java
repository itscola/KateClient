package top.whitecola.kateclient.module;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.ui.widget.AbstractWidget;
import top.whitecola.kateclient.utils.ClientUtils;

import java.util.Vector;
import static top.whitecola.kateclient.utils.MCWrapper.*;

public class AbstractModule implements IModule{
    Vector<ModuleOption> options = new Vector<ModuleOption>();
    protected boolean enabled;
    protected AbstractWidget widget;

    @Override
    public void onTick() {

    }

    @Override
    public void onRender2D(RenderWorldLastEvent e) {

    }

    @Override
    public void onRender(TickEvent.RenderTickEvent e) {

    }

    @Override
    public void onRenderOverLay(RenderGameOverlayEvent event) {

    }


    @Override
    public void onEnable() {
        ClientUtils.sendAClientMessage(this.getModuleName(),"",cube1);
    }

    @Override
    public void onDisable() {
        ClientUtils.sendAClientMessage(this.getModuleName(),"",cube2);
    }

    @Override
    public void enable() {
        this.enabled = true;
        onEnable();
    }

    @Override
    public void disable() {
        this.enabled = false;
        onDisable();
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void renderGameOverlayRETURN() {

    }

    @Override
    public void addOption(ModuleOption option) {
        options.add(option);
    }

    @Override
    public void removeOption(ModuleOption option) {
        options.remove(option);
    }

    @Override
    public ModuleCategory getModuleType() {
        return null;
    }

    @Override
    public String getModuleName() {
        return "";
    }

    @Override
    public void optionEnable(String optionName) {
//        getOptionByName(optionName).
    }

    @Override
    public void optionDisable(String optionName) {

    }





    public ModuleOption getOptionByName(String optionName) {

        return null;
    }

    @Override
    public void addWidget(AbstractWidget widget) {
        KateClient.getKateClient().getWidgetManager().addWidget(widget);
    }

    @Override
    public void removeWidget(AbstractWidget widget) {
        KateClient.getKateClient().getWidgetManager().removeWidget(widget);
    }

    public void setWidget(AbstractWidget widget) {
        this.widget = widget;
    }

    public AbstractWidget getWidget() {
        return widget;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
