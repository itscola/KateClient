package top.whitecola.kateclient.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.ui.components.notifiction.Notification;
import top.whitecola.kateclient.ui.components.screen.MainClickUIIngame;

public class ClientUtils {
    public static void sendAClientMessage(String title,String content){
        sendAClientMessage(title,content, MainClickUIIngame.getGui().setting);
    }

    public static void sendAClientMessage(String title, String content, ResourceLocation icon){
        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());

        float height = scaledResolution.getScaledHeight()/4;
        float width = scaledResolution.getScaledWidth()/3;
        Notification notification = new Notification(scaledResolution.getScaledHeight()-height,scaledResolution.getScaledWidth()-width,width,height).setIcon(MainClickUIIngame.getGui().setting).setIcon(icon).setTitle(title).setContent(content);
        KateClient.getKateClient().getNotificationManager().addNotification(notification);
    }
}
