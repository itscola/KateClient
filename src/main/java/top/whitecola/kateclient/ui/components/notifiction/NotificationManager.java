package top.whitecola.kateclient.ui.components.notifiction;


import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Vector;

public class NotificationManager {
    protected Vector<Notification> notifications = new Vector<Notification>();

    public void draw(){
        for(Notification notification : notifications){
            notification.drawWidget();
        }
    }

    public void addNotification(Notification notification){
        notifications.add(notification);
    }

    public void removeNotification(Notification notification){
        notifications.remove(notification);
    }

    public void clear(){
        this.notifications.clear();
    }

}
