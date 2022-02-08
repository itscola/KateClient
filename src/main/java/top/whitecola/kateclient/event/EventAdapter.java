package top.whitecola.kateclient.event;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public abstract class EventAdapter {
    private final String id;

    public EventAdapter(String id){
        this.id = id;
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent e){

    }

    @SubscribeEvent
    public void onRender(TickEvent.RenderTickEvent event) {

    }

    @SubscribeEvent
    public void tickEvent(TickEvent event) {

    }

    public String getId() {
        return id;
    }


}
