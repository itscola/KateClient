package top.whitecola.kateclient.event;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Vector;

public class EventManager {
    private static EventManager eventManager = new EventManager();
    protected Vector<EventAdapter> events = new Vector<EventAdapter>();

    private EventManager(){
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static EventManager getEventManager() {
        return eventManager;
    }


    public void addEvent(EventAdapter adapter){
        this.events.add(adapter);
    }

    public void removeEvent(EventAdapter adapter){
        this.events.remove(adapter);
    }

    public <T extends EventAdapter> T getEvent(Class<T> clazz) {
        for(EventAdapter eventAdapter : events){
            if(eventAdapter.getClass() == clazz){
                return (T)eventAdapter;
            }
        }

        return null;
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent e){
        for(EventAdapter eventAdapter : events){
            eventAdapter.onKeyInput(e);
        }
    }

    @SubscribeEvent
    public void onRender(TickEvent.RenderTickEvent e) {
        for(EventAdapter eventAdapter : events){
            eventAdapter.onRender(e);
        }
    }

    @SubscribeEvent
    public void tickEvent(TickEvent e) {
        for(EventAdapter eventAdapter : events){
            eventAdapter.tickEvent(e);
        }
    }

}
