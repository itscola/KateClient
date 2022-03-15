package top.whitecola.kateclient.ui.components.buttons;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.util.ResourceLocation;
import top.whitecola.kateclient.utils.Render2DUtils;

public class IconButton extends AbstractButton{
    protected ResourceLocation resourceLocation;
    int animatedHeight = 0;



    public IconButton(int buttonId, int x, int y, int width, int height, String buttonText) {
        super(buttonId, x, y, width, height, buttonText);
        initAnimation();
    }

    public IconButton(int buttonId, int x, int y, String buttonText) {
        super(buttonId, x, y, buttonText);
        initAnimation();
    }

    public void initAnimation(){
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        if(!this.visible){
            return;
        }


        Render2DUtils.drawCustomImage(this.xPosition, this.yPosition + animatedHeight,width ,height ,resourceLocation);

//        if(this.isHovered(mouseX,mouseY)){
//            animatedY -= 0.2;
//            if(animatedY - yPosition <= -3){
//                animatedY = yPosition -3;
//            }
//        }else{
//            animatedY += 0.2;
//            if(animatedY >= yPosition){
//                animatedY = yPosition;
//            }
//        }

        if(this.isHovered(mouseX,mouseY)){

            animatedHeight--;
            if(animatedHeight < -3) {
                animatedHeight = -3;
            }

//            presentTextColor = textColor2;
        }else {

            animatedHeight++;
            if(animatedHeight > 0) {
                animatedHeight = 0;
            }

//            presentTextColor = textColor;

        }


    }


    @Override
    public void playPressSound(SoundHandler p_playPressSound_1_) {
        super.playPressSound(p_playPressSound_1_);
    }

    public IconButton setIcon(ResourceLocation resourceLocation){
        this.resourceLocation = resourceLocation;
        return this;
    }
}
