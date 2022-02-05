package top.whitecola.kateclient.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class Render2DUtils {



    public static void drawRect(float x1,float y1,float x2,float y2,int RGBColor){
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(2848);

        GL11.glPushMatrix();
        setColor(RGBColor);
        GL11.glBegin(7);

        GL11.glVertex2d(x2, y1);
        GL11.glVertex2d(x1, y1);
        GL11.glVertex2d(x1, y2);
        GL11.glVertex2d(x2, y2);

        GL11.glEnd();
        GL11.glPopMatrix();

        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glDisable(2848);
    }

    public static void drawCircle(int x, int y, float radius, int color) {
        setColor(color);
        GL11.glBegin(9);
        for (int i = 0; i <= 360; i++) {
            GL11.glVertex2d(x + Math.sin(i * 3.141526D / 180.0D) * radius, y + Math.cos(i * 3.141526D / 180.0D) * radius);
        }
        GL11.glEnd();
    }

    public static void drawVLine(float x2, float y2, float x1, int y1) {
        if (x1 < y2) {
            float var5 = y2;
            y2 = x1;
            x1 = var5;
        }
        drawRect(x2, y2 + 1.0f, x2 + 1.0f, x1, y1);
    }

    public static void drawHLine(float x2, float y2, float x1, int y1) {
        if (y2 < x2) {
            float var5 = x2;
            x2 = y2;
            y2 = var5;
        }
        drawRect(x2, x1, y2 + 1.0f, x1 + 1.0f, y1);
    }

    public static void drawRoundedRect(float x,float y,float x2,float y2,float round,int color) {
        x += (float) (round / 2.0f + 0.5);
        y += (float) (round / 2.0f + 0.5);
        x2 -= (float) (round / 2.0f + 0.5);
        y2 -= (float) (round / 2.0f + 0.5);
        Gui.drawRect((int) x, (int) y, (int) x2, (int) y2, color);
        drawCircle((int)(x2 - round / 2.0f), (int)(y + round / 2.0f), round, color);
        drawCircle((int)(x + round / 2.0f), (int)(y2 - round / 2.0f), round, color);
        drawCircle((int)(x + round / 2.0f), (int)(y + round / 2.0f), round, color);
        drawCircle((int)(x2 - round / 2.0f), (int)(y2 - round / 2.0f), round, color);
        Gui.drawRect((int) (x - round / 2.0f - 0.5f), (int) (y + round / 2.0f), (int) x2, (int) (y2 - round / 2.0f),
                color);
        Gui.drawRect((int) x, (int) (y + round / 2.0f), (int) (x2 + round / 2.0f + 0.5f), (int) (y2 - round / 2.0f),
                color);
        Gui.drawRect((int) (x + round / 2.0f), (int) (y - round / 2.0f - 0.5f), (int) (x2 - round / 2.0f),
                (int) (y2 - round / 2.0f), color);
        Gui.drawRect((int) (x + round / 2.0f), (int) y, (int) (x2 - round / 2.0f), (int) (y2 + round / 2.0f + 0.5f),
                color);
    }


    public static void drawImage(final int x, final int y, final int width, final int height,ResourceLocation image) {
        final ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
        GL11.glDisable(2929);
        GL11.glEnable(3042);
        GL11.glDepthMask(false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(image);
        Gui.drawModalRectWithCustomSizedTexture(x, y, 0.0f, 0.0f, width, height, (float) width, (float) height);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
        GL11.glEnable(2929);
    }

    public static void setColor(int color) {
        float r = (color >> 24 & 0xFF) / 255.0F;
        float g = (color >> 16 & 0xFF) / 255.0F;
        float b = (color >> 8 & 0xFF) / 255.0F;
        float alpha = (color & 0xFF) / 255.0F;
        GL11.glColor4f(r,g,b,alpha);
    }

    public static void enableGL2D() {
        GL11.glDisable(2929);
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glDepthMask(true);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glHint(3155, 4354);
    }

    public static void disableGL2D() {
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glHint(3154, 4352);
        GL11.glHint(3155, 4352);
    }
}
