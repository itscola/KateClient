package top.whitecola.kateclient.ui.screen.innerscreen;


import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;

public class ClickGUIEntry extends AbstractClickGUIEntry{
    protected String entryName;
    protected String entryDescription;
    protected ModuleCategory category;
    protected float xPosition;
    protected float yPosition;
    protected float width;
    protected float height;
    protected boolean enabled;


    public ClickGUIEntry(){

    }

    public ClickGUIEntry fromModule(AbstractModule module){
        this.entryName = module.getModuleName();
        this.category = module.getModuleType();
        this.enabled = module.isEnabled();
        this.entryDescription = module.getDescription();
        return this;
    }

    public boolean needDisplay(float upBound,float downBound){
        if(yPosition<=upBound && yPosition<=downBound){
            return true;
        }
        return false;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }


    public float getxPosition() {
        return xPosition;
    }


    public float getyPosition() {
        return yPosition;
    }

    public ModuleCategory getCategory() {
        return category;
    }


    public String getEntryDescription() {
        return entryDescription;
    }


    public String getEntryName() {
        return entryName;
    }


    public boolean isEnabled() {
        return enabled;
    }
}
