package top.whitecola.kateclient.module.modules.renders;

import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;

public class NoHurtCam extends AbstractModule {



    @Override
    public ModuleCategory getModuleType() {
        return ModuleCategory.RENDERS;
    }

    @Override
    public String getModuleName() {
        return "NoHurtCam";

    }
}
