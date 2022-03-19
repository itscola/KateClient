package top.whitecola.kateclient.module;

import java.util.Vector;

public class ModuleManager {
    private Vector<AbstractModule> modules = new Vector<AbstractModule>();

    public ModuleManager(){

    }

    public void addModule(AbstractModule module){
        this.modules.add(module);
    }

    public void removeModule(AbstractModule module){
        this.modules.remove(module);
    }

    public AbstractModule getModuleByName(String name){
        for(int i=0;i<modules.size();i++){
            AbstractModule module = modules.get(i);
            if(module.getModuleName().equalsIgnoreCase(name)){
                return module;
            }
        }
        return null;
    }

}
