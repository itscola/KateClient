package top.whitecola.kateclient.ui.screen.innerscreen;


import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;

public class ClickGUIEntry extends AbstractClickGUIEntry{
    protected String entryName;
    protected String entryDescription;
    protected ModuleCategory category;
    protected float xPosition;
    protected float yPosition;
    protected boolean enabled;
    protected int index;


    public ClickGUIEntry(int index){
        this.index = index;
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

    public void draw(int mouseX, int mouseY, float partialTicks){

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
