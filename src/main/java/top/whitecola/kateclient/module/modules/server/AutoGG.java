package top.whitecola.kateclient.module.modules.server;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;

public class AutoGG extends AbstractModule {
    protected String[] trriger = {"胜者","1st","2st","3st","第一名","第二名","第三名"};

    @Override
    public void onChatReceive(ClientChatReceivedEvent e) {


        super.onChatReceive(e);
    }

    @Override
    public ModuleCategory getModuleType() {
        return ModuleCategory.SERVER;
    }

    @Override
    public String getModuleName() {
        return "AutoGG";

    }
}
