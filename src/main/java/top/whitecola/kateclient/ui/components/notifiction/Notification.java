package top.whitecola.kateclient.ui.components.notifiction;


import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import top.whitecola.animationlib.Animation;
import top.whitecola.kateclient.ui.widget.AbstractWidget;
import top.whitecola.kateclient.utils.Render2DUtils;
import static top.whitecola.kateclient.utils.MCWrapper.*;

import java.awt.*;

public class Notification extends AbstractWidget {
    protected ResourceLocation icon;
    protected ResourceLocation background;

    protected String title = "";
    protected String content = "";
    protected Color color = new Color(31, 31, 31);
    protected Color textColor = new Color(243, 242, 241);
    protected Animation animation1;
    protected Animation animation2;
    protected Animation animation3;

    protected final long firstShowTime;



    public Notification(float x, float y, float width, float height) {
        super(x, y, width, height);
        firstShowTime = System.currentTimeMillis();
        background = new ResourceLocation("kateclient","ui/components/RoundedRect.png");
    }



    @Override
    public void drawWidget() {
//        System.out.println(x+" "+y+" "+width+" "+height);
        ScaledResolution scaledResolution = new ScaledResolution(mc);
        x = scaledResolution.getScaledWidth() - scaledResolution.getScaledWidth()/5 -4;
        y = scaledResolution.getScaledHeight() - scaledResolution.getScaledWidth()/14 -4;
        Render2DUtils.drawRoundedRect(x,y,x+scaledResolution.getScaledWidth()/5,y+scaledResolution.getScaledWidth()/14,color.getRGB(),color.getRGB());
//        Render2DUtils.drawCustomImage((int)x,(int)y,scaledResolution.getScaledWidth()/5,scaledResolution.getScaledWidth()/14,background);

        Render2DUtils.drawCustomImage((int)x+3,(int)y+3,scaledResolution.getScaledWidth()/14-6,scaledResolution.getScaledWidth()/14-6,icon);
//        mc.fontRendererObj.drawStringWithShadow(title,width/4 +3,height,textColor.getRGB());
        super.drawWidget();
    }


    public Notification setContent(String content) {
        this.content = content;
        return this;
    }

    public Notification setIcon(ResourceLocation icon) {
        this.icon = icon;
        return this;
    }

    public Notification setTitle(String title) {
        this.title = title;
        return this;
    }

    public long getTotalShowedTime(){
        return System.currentTimeMillis() - firstShowTime;
    }



}
