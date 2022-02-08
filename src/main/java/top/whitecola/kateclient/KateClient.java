package top.whitecola.kateclient;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import top.whitecola.kateclient.event.EventManager;
import top.whitecola.kateclient.event.events.MainMenuEvent;
import top.whitecola.kateclient.keybinds.MainMenuInGameKeybind;

@Mod(modid = KateClient.MODID, version = KateClient.VERSION)
public class KateClient {
    public static final String MODID = "KateClient";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        registerKeyBinds();
        registerEvents();
    }

    public void registerEvents(){
        MinecraftForge.EVENT_BUS.register(EventManager.getEventManager());
        EventManager.getEventManager().addEvent(new MainMenuEvent());
    }

    public void registerKeyBinds(){
        ClientRegistry.registerKeyBinding(MainMenuInGameKeybind.getInstance());
    }
}
