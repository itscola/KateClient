package top.whitecola.kateclient.injection.mixins;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import top.whitecola.kateclient.ui.UICache;
import top.whitecola.kateclient.ui.components.buttons.LongReactButton;
import top.whitecola.kateclient.ui.components.buttons.SwitchButton;

import java.io.IOException;

@Mixin(GuiMainMenu.class)
public class MixinGUIMainMenu extends GuiScreen {
    @Shadow
    private DynamicTexture viewportTexture;
    @Shadow
    private ResourceLocation backgroundTexture;

    @Shadow private String splashText;

    protected SwitchButton switchButton;

    /**
     * @author white_cola
     */
    @Overwrite
    public void initGui() {


        this.viewportTexture = new DynamicTexture(256, 256);
        this.backgroundTexture = mc.getTextureManager().getDynamicTextureLocation("background", this.viewportTexture);
        this.splashText = "KateClient";


        int j = this.height / 4 + 48;

        switchButton = new SwitchButton(9999,this.width / 2 + 2 +150, j + 72 + 12, 17,20,"");
        switchButton.forceToggle(UICache.mainUISwitched);
        this.buttonList.add(switchButton);

        this.buttonList.add(new LongReactButton(1, this.width / 2 - 100, j, I18n.format("menu.singleplayer", new Object[0])));
        this.buttonList.add(new LongReactButton(2, this.width / 2 - 100, j + 24 * 1, I18n.format("menu.multiplayer", new Object[0])));

        this.buttonList.add(new LongReactButton(14, this.width / 2 + 2, j + 24 * 2, 98, 20, I18n.format("menu.online", new Object[0]).replace("Minecraft", "").trim()));
        this.buttonList.add(new LongReactButton(0, this.width / 2 - 100 -3, j + 72 + 12, 98, 20, I18n.format("menu.options", new Object[0])));
        this.buttonList.add(new LongReactButton(4, this.width / 2 + 2 +3, j + 72 + 12, 98, 20, I18n.format("menu.quit", new Object[0])));
        this.buttonList.add(new LongReactButton(6, this.width / 2 - 100, j + 24 * 2, 98, 20, I18n.format("fml.menu.mods", new Object[0])));

    }

    @Inject(method = "actionPerformed", at = @At(value = "HEAD"), cancellable = true)
    protected void actionPerformed(GuiButton button, CallbackInfo ci) throws IOException {
        if(button.id == 9999){
            switchButton.toggle();
        }
    }
}
