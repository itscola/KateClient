package top.whitecola.kateclient;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import top.whitecola.kateclient.config.HiConfig;
import top.whitecola.kateclient.config.struct.ModuleConfig;
import top.whitecola.kateclient.event.EventManager;
import top.whitecola.kateclient.event.events.EventToInvokeModules;
import top.whitecola.kateclient.event.events.EventToInvokeNotification;
import top.whitecola.kateclient.event.events.EventToInvokeWidgets;
import top.whitecola.kateclient.event.events.MainMenuEvent;
import top.whitecola.kateclient.keybinds.MainMenuInGameKeybind;
import top.whitecola.kateclient.module.ModuleManager;
import top.whitecola.kateclient.module.modules.movment.AutoSprint;
import top.whitecola.kateclient.module.modules.renders.*;
import top.whitecola.kateclient.module.modules.sound.HitSounds;
import top.whitecola.kateclient.module.modules.visual.FullBright;
import top.whitecola.kateclient.module.modules.visual.HitParticle;
import top.whitecola.kateclient.module.modules.visual.Weather;
import top.whitecola.kateclient.ui.GameUI;
import top.whitecola.kateclient.ui.components.notifiction.NotificationManager;
import top.whitecola.kateclient.ui.widget.WidgetManager;

import java.nio.charset.Charset;

@Mod(modid = KateClient.MODID, version = KateClient.VERSION)
public class KateClient {
    public static final String MODID = "KateClient";
    public static final String VERSION = "1.0";

    private GameUI gameUI = new GameUI();
    private ModuleManager moduleManager = new ModuleManager();
    private NotificationManager notificationManager = new NotificationManager();
    private WidgetManager widgetManager = new WidgetManager();
    private HiConfig<ModuleConfig> moduleConfig = new HiConfig<ModuleConfig>("./KateClient/Modules.json",ModuleConfig.class, Charset.forName("utf8"));

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
        moduleConfig.config.loadConfigForModules();
    }

    public void registerEvents(){
        MinecraftForge.EVENT_BUS.register(EventManager.getEventManager());
        EventManager.getEventManager().addEvent(new MainMenuEvent());
        EventManager.getEventManager().addEvent(new EventToInvokeModules());
        EventManager.getEventManager().addEvent(new EventToInvokeNotification());
        EventManager.getEventManager().addEvent(new EventToInvokeWidgets());


    }

    public void addModules(){
        this.moduleManager.addModule(new AutoSprint());
        this.moduleManager.addModule(new PingDisplay());
        this.moduleManager.addModule(new FullBright());
        this.moduleManager.addModule(new FPSDisplay());
        this.moduleManager.addModule(new HitSounds());
        this.moduleManager.addModule(new LockTime());

        this.moduleManager.addModule(new Weather()); // not finish

        this.moduleManager.addModule(new HitParticle());
        this.moduleManager.addModule(new CPSDisplay()); // not finish
        this.moduleManager.addModule(new ArmorDisplay()); // not finish
        this.moduleManager.addModule(new AttackRangeDisplay()); // not finish


        moduleManager.getModuleByName("AutoSprint").enable();
        moduleManager.getModuleByName("PingDisplay").enable();
//        moduleManager.getModuleByName("FPSDisplay").enable();


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

    public WidgetManager getWidgetManager() {
        return widgetManager;
    }

    public HiConfig<ModuleConfig> getModuleConfig() {
        return moduleConfig;
    }
}
