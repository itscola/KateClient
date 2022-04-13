package top.whitecola.kateclient.services.apis;

import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.utils.UrlUtil;

import java.io.IOException;

public class HypixelAPIWrapper {
    public static final String apiLink = "https://api.hypixel.net/";
    protected boolean needKey;

    public HypixelAPIWrapper(){
        needKey = KateClient.getKateClient().getHypixelConfig().getConfig().key.equals("");
    }

    public void getPlayerHypixelLevelByName(String name) throws IOException {
        getPlayerHypixelLevelByUUID(MojangAPIWrapper.getUUIDByPlayerName(name));
    }

    public void getPlayerHypixelLevelByUUID(String uuid) throws IOException {
        String url = "https://api.hypixel.net/player?key="+KateClient.getKateClient().getHypixelConfig().getConfig().key+"&uuid="+uuid;
        String content = UrlUtil.readURL(url);
    }

}
