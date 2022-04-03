package top.whitecola.kateclient.event.events;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.event.EventAdapter;
import top.whitecola.kateclient.keybinds.MainMenuInGameKeybind;
import top.whitecola.kateclient.ui.components.notifiction.Notification;
import top.whitecola.kateclient.ui.components.screen.MainClickUIIngame;
import top.whitecola.kateclient.utils.ClientUtils;

public class MainMenuEvent extends EventAdapter {

    public MainMenuEvent() {
        super(MainMenuEvent.class.getSimpleName());

    }

    @Override
    public void onKeyInput(InputEvent.KeyInputEvent e) {
        if(MainMenuInGameKeybind.getInstance().isPressed()){
            Minecraft.getMinecraft().displayGuiScreen(MainClickUIIngame.getGui());
        }


//        ClientUtils.sendAClientMessage("Display Click GUI","");

    }
}
