package top.whitecola.kateclient.module.modules.server;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;

public class AutoGG extends AbstractModule {
    protected String[] trriger = {"胜者","1st","2st","3st","第一名","第二名","第三名","击杀数","winner"};
    boolean speaked;


    @Override
    public void onChatReceive(ClientChatReceivedEvent e) {
        if(speaked){
            return;
        }

        for(String str : trriger){
            if(e.message.getFormattedText().contains(str)){
                speaked = true;
                Minecraft.getMinecraft().thePlayer.sendChatMessage("GG");
                return;
            }
        }

        super.onChatReceive(e);
    }

    @Override
    public void onEntityJoinWorld(EntityJoinWorldEvent e) {
        if(!(e.entity instanceof EntityPlayerSP)){
            return;
        }

        if(speaked){
            speaked = false;
        }

        super.onEntityJoinWorld(e);
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
