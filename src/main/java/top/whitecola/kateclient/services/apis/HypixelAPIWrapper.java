package top.whitecola.kateclient.services.apis;

import com.google.gson.Gson;
import net.minecraft.util.ChatComponentText;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.services.apis.structs.hypixelapi.HypixelPlayer;
import top.whitecola.kateclient.services.apis.structs.hypixelapi.LevelUtils;
import top.whitecola.kateclient.utils.ClientUtils;
import top.whitecola.kateclient.utils.UrlUtil;

import java.io.IOException;

import static top.whitecola.kateclient.utils.MCWrapper.mc;
import static top.whitecola.kateclient.utils.MCWrapper.visual;

public class HypixelAPIWrapper {
    public static final String api = "https://api.hypixel.net/";
    public static Gson gson = new Gson();

    public HypixelAPIWrapper(){

    }


    public static int getHypixelPlayerLevelByName(String playerName) throws IOException {

        return (int) LevelUtils.getLevel(getHypixelPlayerName(playerName).getPlayer().getNetworkExp());
    }

    public static HypixelPlayer getHypixelPlayerName(String name) throws IOException {
        return getHypixelPlayerByUUID(MojangAPIWrapper.getUUIDByPlayerName(name));
    }

    public static HypixelPlayer getHypixelPlayerByUUID(String uuid) throws IOException {

        if(KateClient.getKateClient().getHypixelConfig().config.key==null&&KateClient.getKateClient().getHypixelConfig().config.key.equals("")){
            return null;
        }

        String content = UrlUtil.readURL(api+"player?key="+KateClient.getKateClient().getHypixelConfig().config.key+"&uuid="+uuid);
        HypixelPlayer hypixelPlayer = gson.fromJson(content,HypixelPlayer.class);
        return hypixelPlayer;
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
