package top.whitecola.kateclient.ui.components.notifiction;


import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import top.whitecola.animationlib.Animation;
import top.whitecola.animationlib.functions.AbstractAnimationFunction;
import top.whitecola.animationlib.functions.type.CubicOutFunction;
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
    private AbstractAnimationFunction animationFunction = new CubicOutFunction();

    protected final long firstShowTime = System.currentTimeMillis();



    private Notification(float x, float y, float width, float height) {
        super(x, y, width, height);
        animation1 = new Animation();
        animation1.setMin(0).setMax(100).setFunction(animationFunction).setTotalTime(600).setLock(true);

    }

    public Notification(){
        this(0,0,0,0);

    }


    @Override
    public void drawWidget() {

        ScaledResolution scaledResolution = new ScaledResolution(mc);
        x = scaledResolution.getScaledWidth() - scaledResolution.getScaledWidth()/5 -7 + 100 - animation1.update();
        y = scaledResolution.getScaledHeight() - scaledResolution.getScaledWidth()/14 -7;
        int titleWidth = Minecraft.getMinecraft().fontRendererObj.getStringWidth(title);
        Render2DUtils.drawRoundedRect(x,y,x+scaledResolution.getScaledWidth()/5+6,y+scaledResolution.getScaledWidth()/14,color.getRGB(),color.getRGB());
//        Render2DUtils.drawCustomImage((int)x,(int)y,scaledResolution.getScaledWidth()/5,scaledResolution.getScaledWidth()/14,background);

        Render2DUtils.drawCustomImage((int)x+3,(int)y+3,scaledResolution.getScaledWidth()/14-6,scaledResolution.getScaledWidth()/14-6,icon);
        mc.fontRendererObj.drawStringWithShadow(title,x+scaledResolution.getScaledWidth()/14 +4 ,y +(scaledResolution.getScaledWidth()/14/2-4),textColor.getRGB());
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
