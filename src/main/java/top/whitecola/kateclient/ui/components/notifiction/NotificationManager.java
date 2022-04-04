package top.whitecola.kateclient.ui.components.notifiction;



import java.util.Vector;

public class NotificationManager {
    protected Vector<Notification> notifications = new Vector<Notification>();

    public void draw(){
        for(int i=0;i<notifications.size();i++){
//            if(i==0){
//                notifications.get(i).drawWidget();
//            }else if(i==2){
//
//            }else if(i==3){
//
//            }else{
//                notifications.remove(0);
//            }

            notifications.get(i).drawWidget();

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
