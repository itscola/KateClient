package top.whitecola.kateclient.config.struct;

import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleOption;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ModuleConfig {
    public ArrayList<ModuleConfigStruct> moduleConfigs = new ArrayList<ModuleConfigStruct>();

    public void loadConfig(List<AbstractModule> modules){
        for(AbstractModule module : modules){
            moduleConfigs.add(new ModuleConfigStruct(module.getModuleName(),module.isEnabled(),module.getOptions()));
        }
    }


    public ModuleConfigStruct getModuleConfigStructByModuleName(String moduleName){
        for(ModuleConfigStruct struct : moduleConfigs){
            if(struct.moduleName.equalsIgnoreCase(moduleName)){
                return struct;
            }
        }
        return null;
    }


    class ModuleConfigStruct {
        public String moduleName;
        public boolean enabled;
        public Vector<ModuleOption> moduleOptions = new Vector<ModuleOption>();


        public ModuleConfigStruct(String moduleName, boolean enabled,Vector<ModuleOption> moduleOptions){
            this.moduleName = moduleName;
            this.enabled = enabled;
            this.moduleOptions = moduleOptions;
        }

        public String getModuleName() {
            return moduleName;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public Vector<ModuleOption> getModuleOptions() {
            return moduleOptions;
        }

        public void setModuleOptions(Vector<ModuleOption> moduleOptions) {
            this.moduleOptions = moduleOptions;
        }
    }
}
