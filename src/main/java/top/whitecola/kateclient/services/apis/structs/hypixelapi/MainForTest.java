package top.whitecola.kateclient.services.apis.structs.hypixelapi;

import com.google.gson.Gson;
import top.whitecola.kateclient.services.apis.HypixelAPIWrapper;

import java.io.IOException;

public class MainForTest {
    public static void main(String[] args) {
        try {
            System.out.println(HypixelAPIWrapper.getHypixelPlayerLevelByName("white_cola"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
