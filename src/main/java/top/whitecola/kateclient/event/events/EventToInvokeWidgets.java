package top.whitecola.kateclient.event.events;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.event.EventAdapter;

public class EventToInvokeWidgets extends EventAdapter {
    public EventToInvokeWidgets() {
        super(EventToInvokeWidgets.class.getSimpleName());
    }

    @Override
    public void onRenderOverLay(RenderGameOverlayEvent event) {
        KateClient.getKateClient().getWidgetManager().drawWidgets();
        super.onRenderOverLay(event);
    }
}
