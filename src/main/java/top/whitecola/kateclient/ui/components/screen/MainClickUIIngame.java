package top.whitecola.kateclient.ui.components.screen;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Mouse;
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


    protected Color mainColor = new Color(31, 31, 31);
    protected CircleButton circleButton;







    private MainClickUIIngame(){


    }


    @Override
    public void initGui() {
        super.initGui();
        circleButton = new CircleButton(0,(int)this.xPosition+6,(int)this.yPosition+6,(int)this.width,(int)this.height / 25,"");
        this.buttonList.add(circleButton);
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


        Render2DUtils.drawRoundedRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, this.mainColor.getRGB(),this.mainColor.getRGB());

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
