package top.whitecola.kateclient.ui.screen;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Mouse;
import top.whitecola.animationlib.Animation;
import top.whitecola.animationlib.functions.type.*;
import top.whitecola.kateclient.KateClient;
import top.whitecola.kateclient.ui.components.buttons.CircleButton;
import top.whitecola.kateclient.ui.components.buttons.IconButton;
import top.whitecola.kateclient.utils.ClientUtils;
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

    private boolean needClose;

    protected Color mainColor = new Color(33, 33, 33);
    protected Color mainBarColor = new Color(28, 28, 28);
    protected Color mainBarDragColor = new Color(18, 80, 123);


    protected Color circleButtonColor1 = new Color(252, 98, 93);
    protected Color circleButtonColor2 = new Color(253, 188, 64);
    protected Color circleButtonColor3 = new Color(53, 205, 75);
//    protected Color dockColor = new Color(245,245,245, 200);

    protected Animation displayAnimation = new Animation();
    protected Animation closeAnimation = new Animation();



    protected Color mainTextColor = new Color(196, 210, 210);

    protected CircleButton circleButton;
    protected CircleButton circleButton2;
    protected CircleButton circleButton3;

    protected IconButton settingButton;
    protected IconButton messageButton;


    public ResourceLocation setting = new ResourceLocation("kateclient","ui/settings.png");
    public ResourceLocation message = new ResourceLocation("kateclient","ui/message.png");
    public ResourceLocation world = new ResourceLocation("kateclient","ui/world.png");
    public ResourceLocation visual = new ResourceLocation("kateclient","ui/visual.png");
    public ResourceLocation sound = new ResourceLocation("kateclient","ui/sound.png");
    public ResourceLocation render = new ResourceLocation("kateclient","ui/render.png");
    public ResourceLocation movement = new ResourceLocation("kateclient","ui/movement.png");
    public ResourceLocation server = new ResourceLocation("kateclient","ui/server.png");
    public ResourceLocation mods = new ResourceLocation("kateclient","ui/mods.png");




    private MainClickUIIngame(){
        initAnimation();
    }

    public void initAnimation(){
        displayAnimation.setMin(0).setMax(150).setFunction(new CubicOutFunction()).setTotalTime(260);
        closeAnimation.setMin(150).setMax(0).setFunction(new CubicOutFunction()).setTotalTime(230);
    }

    @Override
    public void initGui() {
        super.initGui();
        circleButton = new CircleButton(0,(int)this.xPosition+6,(int)this.yPosition+6,(int)this.width,(int)this.height / 30,"");
        circleButton2 = new CircleButton(1,(int)this.xPosition+6,(int)this.yPosition+6,(int)this.width,(int)this.height / 30,"");
        circleButton3 = new CircleButton(2,(int)this.xPosition+6,(int)this.yPosition+6,(int)this.width,(int)this.height / 30,"");
        settingButton = new IconButton(3,(int)this.xPosition +6, (int)this.yPosition +(int)this.height -32,25,25,"").setIcon(setting);
        messageButton = new IconButton(4,(int)this.xPosition +14 +25, (int)this.yPosition +(int)this.height -32,25,25,"").setIcon(message);

        this.buttonList.add(circleButton.setColor(circleButtonColor1));
        this.buttonList.add(circleButton2.setColor(circleButtonColor2));
        this.buttonList.add(circleButton3.setColor(circleButtonColor3));
        this.buttonList.add(settingButton);
        this.buttonList.add(messageButton);


        //temp : for test
        ClientUtils.sendAClientMessage("ClickGUI ON","");



    }



    public static MainClickUIIngame getGui() {
        return gui;
    }



    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        float value = displayAnimation.update();
        height = 50 + value;

        if(GUIUtils.isHovered(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + 16,mouseX,mouseY) && Mouse.isButtonDown(0)){

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
            if(draged){
                draged = false;
            }
        }









        // draw main gui background
        circleButton.xPosition = (int)xPosition;
        circleButton.yPosition = (int)yPosition;

        circleButton2.xPosition = (int)xPosition +9;
        circleButton2.yPosition = (int)yPosition;

        circleButton3.xPosition = (int)xPosition + 18;
        circleButton3.yPosition = (int)yPosition;

        settingButton.xPosition = (int)this.xPosition +6;
        settingButton.yPosition = (int)this.yPosition +(int)this.height -32;

        messageButton.xPosition = (int)this.xPosition +14 +25;
        messageButton.yPosition = (int)this.yPosition +(int)this.height -32;



        Render2DUtils.drawRoundedRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, this.mainColor.getRGB(),this.mainColor.getRGB());
        if(draged){
            Render2DUtils.drawRoundedRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + 12, this.mainBarDragColor.getRGB(),this.mainBarDragColor.getRGB());
        }else {
            Render2DUtils.drawRoundedRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + 12, this.mainBarColor.getRGB(),this.mainBarColor.getRGB());
        }
//        Render2DUtils.drawRoundedRect(this.xPosition +6, this.yPosition +this.height -28, this.xPosition + this.width-6, this.yPosition + this.height - 6, this.dockColor.getRGB(),this.dockColor.getRGB());



        FontRenderer fontRenderer = mc.fontRendererObj;
        fontRenderer.drawString(KateClient.MODID, (int)(this.xPosition +32 ), (int) this.yPosition +2, this.mainTextColor.getRGB());;



        // Just for design , I will make them into button later.
        Render2DUtils.drawCustomImage((int)this.xPosition +(14 +25 ) +25 +8, (int)this.yPosition +(int)this.height -32,25,25,world);
        Render2DUtils.drawCustomImage((int)this.xPosition +(14 +25 ) +25 +8 +25 + 8, (int)this.yPosition +(int)this.height -32,25,25,visual);
        Render2DUtils.drawCustomImage((int)this.xPosition +(14 +25 ) +25 +8 +25 + 8 + 25 + 8, (int)this.yPosition +(int)this.height -32,25,25,sound);
        Render2DUtils.drawCustomImage((int)this.xPosition +(14 +25 ) +25 +8 +25 + 8 + 25 + 8 + 25 + 8, (int)this.yPosition +(int)this.height -32,25,25,render);
        Render2DUtils.drawCustomImage((int)this.xPosition +(14 +25 ) +25 +8 +25 + 8 + 25 + 8 + 25 + 8 + 25 + 8, (int)this.yPosition +(int)this.height -32,25,25,movement);
        Render2DUtils.drawCustomImage((int)this.xPosition +(14 +25 ) +25 +8 +25 + 8 + 25 + 8 + 25 + 8 + 25 + 8 + 25 + 8, (int)this.yPosition +(int)this.height -32,25,25,server);
        Render2DUtils.drawCustomImage((int)this.xPosition +(14 +25 ) +25 +8 +25 + 8 + 25 + 8 + 25 + 8 + 25 + 8 + 25 + 8 + 25 + 8, (int)this.yPosition +(int)this.height -32,25,25,mods);



        super.drawScreen(mouseX,mouseY,partialTicks);
    }



    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
        displayAnimation.reset();

        //temp: clean the NotificationManager
        KateClient.getKateClient().getNotificationManager().clear();
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
            playButtonSound();
        }
    }

    private void playButtonSound(){
        Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.create(new ResourceLocation("gui.button.press"), 1.0F));
    }


    public void closeGUI(){
        setNeedClose(true);

    }


    public boolean isNeedClose() {
        return needClose;
    }

    public void setNeedClose(boolean needClose) {
        this.needClose = needClose;
    }
}
