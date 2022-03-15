package top.whitecola.kateclient.ui.components.screen;

import gg.essential.elementa.components.UICircle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Mouse;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.ui.components.buttons.CircleButton;
import top.whitecola.kateclient.ui.components.buttons.SwitchButton;
import top.whitecola.kateclient.utils.GUIUtils;
import top.whitecola.kateclient.utils.Render2DUtils;

import java.awt.*;
import java.io.IOException;

public class MainClickUIIngame extends GuiScreen {
    private static MainClickUIIngame gui = new MainClickUIIngame();
    protected float width = 300;
    protected float height = 200;
    protected float xPosition = 90;
    protected float yPosition = 16;

    protected float dragX;
    protected float dragY;

    protected boolean draged;


    protected Color mainColor = new Color(33, 33, 33);
    protected Color mainBarColor = new Color(28, 28, 28);

    protected Color circleButtonColor1 = new Color(252, 98, 93);
    protected Color circleButtonColor2 = new Color(253, 188, 64);
    protected Color circleButtonColor3 = new Color(53, 205, 75);


    protected Color mainTextColor = new Color(196, 210, 210);

    protected CircleButton circleButton;
    protected CircleButton circleButton2;
    protected CircleButton circleButton3;





    private MainClickUIIngame(){

    }


    @Override
    public void initGui() {
        super.initGui();
        circleButton = new CircleButton(0,(int)this.xPosition+6,(int)this.yPosition+6,(int)this.width,(int)this.height / 30,"");
        circleButton2 = new CircleButton(1,(int)this.xPosition+6,(int)this.yPosition+6,(int)this.width,(int)this.height / 30,"");
        circleButton3 = new CircleButton(2,(int)this.xPosition+6,(int)this.yPosition+6,(int)this.width,(int)this.height / 30,"");

        this.buttonList.add(circleButton.setColor(circleButtonColor1));
        this.buttonList.add(circleButton2.setColor(circleButtonColor2));
        this.buttonList.add(circleButton3.setColor(circleButtonColor3));

    }

    public static MainClickUIIngame getGui() {
        return gui;
    }




    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {


        if(GUIUtils.isHovered(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height,mouseX,mouseY) && Mouse.isButtonDown(0)){
            if (dragX == 0 && dragY == 0) {
                dragX = mouseX - xPosition;
                dragY = mouseY - yPosition;
            } else {
                xPosition = mouseX - dragX;
                yPosition = mouseY - dragY;
            }
            draged = true;
        } else if (dragX != 0 || dragY != 0) {
            dragX = 0;
            dragY = 0;
        }




        // draw main gui background
        circleButton.xPosition = (int)xPosition;
        circleButton.yPosition = (int)yPosition;

        circleButton2.xPosition = (int)xPosition +9;
        circleButton2.yPosition = (int)yPosition;

        circleButton3.xPosition = (int)xPosition + 18;
        circleButton3.yPosition = (int)yPosition;



        Render2DUtils.drawRoundedRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, this.mainColor.getRGB(),this.mainColor.getRGB());
        Render2DUtils.drawRoundedRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + 12, this.mainBarColor.getRGB(),this.mainBarColor.getRGB());
        FontRenderer fontRenderer = mc.fontRendererObj;
        fontRenderer.drawString(KateClient.MODID, (int)(this.xPosition +32 ), (int) this.yPosition +2, this.mainTextColor.getRGB());;

        super.drawScreen(mouseX,mouseY,partialTicks);
    }



    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
    }

    @Override
    protected void mouseClicked(int p_mouseClicked_1_, int p_mouseClicked_2_, int p_mouseClicked_3_) throws IOException {
        super.mouseClicked(p_mouseClicked_1_, p_mouseClicked_2_, p_mouseClicked_3_);
    }

    @Override
    protected void mouseReleased(int p_mouseReleased_1_, int p_mouseReleased_2_, int p_mouseReleased_3_) {
        super.mouseReleased(p_mouseReleased_1_, p_mouseReleased_2_, p_mouseReleased_3_);
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0){
            Minecraft.getMinecraft().displayGuiScreen(null);
            button.playPressSound(Minecraft.getMinecraft().getSoundHandler());
        }
    }
}
