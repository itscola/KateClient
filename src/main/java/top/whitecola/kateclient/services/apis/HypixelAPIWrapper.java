package top.whitecola.kateclient.services.apis;

import net.minecraft.util.ChatComponentText;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.utils.ClientUtils;
import top.whitecola.kateclient.utils.UrlUtil;

import java.io.IOException;

import static top.whitecola.kateclient.utils.MCWrapper.mc;
import static top.whitecola.kateclient.utils.MCWrapper.visual;

public class HypixelAPIWrapper {
    public static final String api = "https://api.hypixel.net/";

    public HypixelAPIWrapper(){

    }

    public void getPlayerHypixelLevelByName(String name) throws IOException {
        getPlayerHypixelLevelByUUID(MojangAPIWrapper.getUUIDByPlayerName(name));
    }

    public String getPlayerHypixelLevelByUUID(String uuid) throws IOException {
            return "";
    }

    public boolean sendGettingKeyRequest(){
        if(KateClient.getKateClient().getHypixelConfig().getConfig().key.equals("")){
            mc.thePlayer.addChatMessage(new ChatComponentText("[KateClient] We need your hypixel API key to enable some modules like levelTab, The key won't share with any other one including us."));
            ClientUtils.sendAClientMessage("/api new","",visual);
            mc.thePlayer.sendChatMessage("/api new");
            return true;
        }
        return false;
    }

}
