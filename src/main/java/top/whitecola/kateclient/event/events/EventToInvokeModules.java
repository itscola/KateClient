package top.whitecola.kateclient.event.events;

import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.event.EventAdapter;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleManager;

import java.util.Vector;

public class EventToInvokeModules extends EventAdapter {
    private Vector<AbstractModule> modules;


    public EventToInvokeModules() {
        super(MainMenuEvent.class.getSimpleName());
        modules = KateClient.getKateClient().getModuleManager().getModules();
    }

    @Override
    public void onRender2D(RenderWorldLastEvent event) {
        for(AbstractModule module : modules){
            if(!module.isEnabled())
                continue;
            module.onRender2D(event);
        }

        super.onRender2D(event);
    }

    @Override
    public void onRender(TickEvent.RenderTickEvent event) {
        for(AbstractModule module : modules){
            if(!module.isEnabled())
                continue;
            module.onRender(event);
        }
        super.onRender(event);
    }

    @Override
    public void tickEvent(TickEvent event) {

        for(AbstractModule module : modules){
            if(!module.isEnabled())
                continue;
            module.onTick();
        }

        super.tickEvent(event);
    }
}
