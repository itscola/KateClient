package top.whitecola.kateclient.services.apis;

import com.google.gson.Gson;
import top.whitecola.kateclient.utils.UrlUtil;

import java.io.IOException;

public class MojangAPIWrapper {
    private static Gson gson = new Gson();
    public final static String api = "https://api.mojang.com/";

    public static String getUUIDByPlayerName(String playerName) throws IOException {
        String address = "https://api.mojang.com/users/profiles/minecraft/"+playerName;
        String content = UrlUtil.readURL(address);
        UUIDJson uuidJson = gson.fromJson(content, UUIDJson.class);
        String beforeUUID = uuidJson.id;
        String uuid = beforeUUID.substring(0, 8) +"-"+ beforeUUID.substring(9, 13)+"-"+ beforeUUID.substring(14, 18) +"-"+ beforeUUID.substring(19, 23) +"-"+ beforeUUID.substring(24);
        return uuid;
    }

    public class UUIDJson {
        public String id;
        public String name;
    }
}
