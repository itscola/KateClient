package top.whitecola.kateclient;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import top.whitecola.kateclient.event.EventManager;
import top.whitecola.kateclient.event.events.EventToInvokeModules;
import top.whitecola.kateclient.event.events.EventToInvokeNotification;
import top.whitecola.kateclient.event.events.MainMenuEvent;
import top.whitecola.kateclient.keybinds.MainMenuInGameKeybind;
import top.whitecola.kateclient.module.ModuleManager;
import top.whitecola.kateclient.module.modules.movment.AutoSprint;
import top.whitecola.kateclient.ui.GameUI;
import top.whitecola.kateclient.ui.components.notifiction.NotificationManager;

@Mod(modid = KateClient.MODID, version = KateClient.VERSION)
public class KateClient {
    public static final String MODID = "KateClient";
    public static final String VERSION = "1.0";

    private GameUI gameUI = new GameUI();
    private ModuleManager moduleManager = new ModuleManager();
    private NotificationManager notificationManager = new NotificationManager();

    private static KateClient kateClient = null;
    {
        kateClient = this;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        registerKeyBinds();
        registerEvents();
        addModules();
    }

    public void registerEvents(){
        MinecraftForge.EVENT_BUS.register(EventManager.getEventManager());
        EventManager.getEventManager().addEvent(new MainMenuEvent());
        EventManager.getEventManager().addEvent(new EventToInvokeModules());
        EventManager.getEventManager().addEvent(new EventToInvokeNotification());


    }

    public void addModules(){
        this.moduleManager.addModule(new AutoSprint());
        moduleManager.getModuleByName("AutoSprint").enable();
    }

    public void registerKeyBinds(){
        ClientRegistry.registerKeyBinding(MainMenuInGameKeybind.getInstance());
    }

    public static KateClient getKateClient() {
        return kateClient;
    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }

    public GameUI getGameUI() {
        return gameUI;
    }

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }
}
