package top.whitecola.kateclient.services.apis;

import com.google.gson.Gson;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.services.apis.structs.hypixelapi.HypixelPlayer;
import top.whitecola.kateclient.services.apis.structs.hypixelapi.LevelUtils;
import top.whitecola.kateclient.utils.ClientUtils;
import top.whitecola.kateclient.utils.HiThread;
import top.whitecola.kateclient.utils.UrlUtil;

import java.io.IOException;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

import static top.whitecola.kateclient.utils.MCWrapper.mc;
import static top.whitecola.kateclient.utils.MCWrapper.visual;

public class HypixelAPIWrapper {
    public static final String api = "https://api.hypixel.net/";
    public static Gson gson = new Gson();
    private ConcurrentHashMap<String,Integer> playerLevels = new ConcurrentHashMap<String,Integer>();
    private HiThread thread = new HiThread("HypixelAPIWrapper",800);
    public Vector<String> neededPlayer = new Vector<String>();

    public HypixelAPIWrapper(){
        thread.start();
    }


    @Deprecated
    public String needPlayer(String name){

        if(neededPlayer.contains(name)){
            if(playerLevels.containsKey(name)){
                return playerLevels.get(name)+"";
            }
            addLevelForPlayer(name);
            return "";
        }

        neededPlayer.add(name);
        return "";
    }

    public String needPlayer(NetworkPlayerInfo networkPlayerInfo){
        String name = networkPlayerInfo.getGameProfile().getName();


        if(neededPlayer.contains(name)){
            if(playerLevels.containsKey(name)){
                return playerLevels.get(name)+"";
            }
            addLevelForPlayer(networkPlayerInfo);
            return "";
        }

        neededPlayer.add(name);
        return "";
    }

    @Deprecated
    private void addLevelForPlayer(final String name){
        thread.addTask(new Runnable() {
            @Override
            public void run() {
                try {
                    int level = getHypixelPlayerLevelByName(name);
                    playerLevels.put(name,level);
                } catch (IOException e) {

                }
            }
        });
    }


    private void addLevelForPlayer(final NetworkPlayerInfo networkPlayerInfo){
        thread.addTask(new Runnable() {
            @Override
            public void run() {
                try {
                    playerLevels.put(networkPlayerInfo.getGameProfile().getName(),getHypixelPlayerLevelByUUID(networkPlayerInfo.getGameProfile().getId().toString().replace("-","")));
                } catch (IOException e) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException interruptedException) {}
                    addLevelForPlayer(networkPlayerInfo);
                }
            }
        });
    }

    public void clearPlayerLevels(){
        playerLevels.clear();
    }




    public int getHypixelPlayerLevelByName(String playerName) throws IOException {
        HypixelPlayer hypixelPlayer = getHypixelPlayerName(playerName);
        if(hypixelPlayer==null){
            return -1;
        }
        return (int) LevelUtils.getLevel(hypixelPlayer.getPlayer().getNetworkExp());
    }

    public int getHypixelPlayerLevelByUUID(String uuid) throws IOException {
        HypixelPlayer hypixelPlayer = getHypixelPlayerByUUID(uuid);
        if(hypixelPlayer==null){
            return -1;
        }
        return (int) LevelUtils.getLevel(hypixelPlayer.getPlayer().getNetworkExp());
    }

    public HypixelPlayer getHypixelPlayerName(String name) throws IOException {
        return getHypixelPlayerByUUID(MojangAPIWrapper.getUUIDByPlayerName(name));
    }

    public HypixelPlayer getHypixelPlayerByUUID(String uuid) throws IOException {

        if(KateClient.getKateClient().getHypixelConfig().config.key==null&&KateClient.getKateClient().getHypixelConfig().config.key.equals("")){
            return null;
        }

        String url = api+"player?key="+KateClient.getKateClient().getHypixelConfig().config.key+"&uuid="+uuid;

        String content = UrlUtil.readURL(url);
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


    public ConcurrentHashMap<String, Integer> getPlayerLevels() {
        return playerLevels;
    }

    public HiThread getThread() {
        return thread;
    }
}
