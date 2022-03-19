package top.whitecola.kateclient.injection.mixins;

import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.ui.widget.WidgetManager;
import static top.whitecola.kateclient.utils.MCWrapper.*;

@Mixin(GuiIngame.class)
public class MixinGuiIngame {
    protected WidgetManager widgetManager;
    {
        widgetManager = KateClient.getKateClient().getGameUI().widgetManager;
    }


}
