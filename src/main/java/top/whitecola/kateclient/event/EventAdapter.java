package top.whitecola.kateclient.event;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

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
    public void onRender2D(RenderWorldLastEvent event) {

    }


    @SubscribeEvent
    public void tickEvent(TickEvent event) {

    }

    @SubscribeEvent
    public void onRenderOverLay(RenderGameOverlayEvent event) {

    }


    public String getId() {
        return id;
    }

    @SubscribeEvent
    public void renderGameOverlayRETURN() {

    }

    @SubscribeEvent
    public void onAttackEntity(AttackEntityEvent e) {

    }

    @SubscribeEvent
    public void onWordRender(RenderWorldEvent e){

    }

    @SubscribeEvent
    public void onLoginIn(FMLNetworkEvent.ClientConnectedToServerEvent e){

    }

    @SubscribeEvent
    public void onLoginOut(FMLNetworkEvent.ClientDisconnectionFromServerEvent e){

    }

    @SubscribeEvent
    public void onChatReceive(ClientChatReceivedEvent e){

    }


}
