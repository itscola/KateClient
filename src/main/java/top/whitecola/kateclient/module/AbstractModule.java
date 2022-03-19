package top.whitecola.kateclient.module;

import net.minecraftforge.client.event.RenderWorldLastEvent;

import java.util.Vector;

public class AbstractModule implements IModule{
    Vector<ModuleOption> options = new Vector<ModuleOption>();

    @Override
    public void onTick() {

    }

    @Override
    public void onRender(RenderWorldLastEvent e) {

    }


    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public ModuleCategory getModuleType() {
        return null;
    }

    @Override
    public String getModuleName() {
        return null;
    }

    @Override
    public void optionEnable(String optionName) {

    }

    @Override
    public void optionDisable(String optionName) {

    }

    public ModuleOption getOptionByName(String optionName) {

        return null;
    }
}
