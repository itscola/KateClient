package top.whitecola.kateclient.module;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import top.whitecola.kateclient.utils.ClientUtils;

import java.util.Vector;

public class AbstractModule implements IModule{
    Vector<ModuleOption> options = new Vector<ModuleOption>();
    private boolean enabled;

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
        ClientUtils.sendAClientMessage(this.getModuleName()+" ON.","");
    }

    @Override
    public void onDisable() {
        ClientUtils.sendAClientMessage(this.getModuleName()+" OFF.","");
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
}
