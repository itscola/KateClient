package top.whitecola.kateclient.module.modules.visual;

import net.minecraftforge.event.entity.player.AttackEntityEvent;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;

public class ItemPhysic extends AbstractModule {


    @Override
    public ModuleCategory getModuleType() {
        return ModuleCategory.VISUAL;
    }

    @Override
    public String getModuleName() {
        return "ItemPhysic";
    }
}
