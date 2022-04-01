package top.whitecola.kateclient.injection.mixins;

import com.google.common.collect.Sets;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.util.Util;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.io.IOUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.PixelFormat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Mixin(Minecraft.class)
@SideOnly(Side.CLIENT)
public abstract class MixinMinecraft {
//    @Shadow public abstract void displayGuiScreen(GuiScreen p_displayGuiScreen_1_);

    @Shadow
    private boolean fullscreen;

    @Shadow
    private static List<DisplayMode> macDisplayModes;

    @Shadow
    public int displayWidth;
    @Shadow
    public int displayHeight;

    @Inject(method = "startGame", at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;ingameGUI:Lnet/minecraft/client/gui/GuiIngame;", shift = At.Shift.AFTER))
    private void startGame(CallbackInfo ci) {
    }

    /**
     * @author White_cola
     */
    @Overwrite
    private void createDisplay() throws LWJGLException {
        Display.setResizable(true);
        Display.setTitle("KateClient 1.0 beta | Minecraft 1.8.9");

        try {
            Display.create((new PixelFormat()).withDepthBits(24));
        } catch (LWJGLException var4) {

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var3) {
            }

            if (this.fullscreen) {
                this.updateDisplayMode();
            }

            Display.create();
        }

    }

//    /**
//     * @author
//     */
//    @Overwrite
//    public void drawSplashScreen(TextureManager p_drawSplashScreen_1_) throws LWJGLException {
//        ScaledResolution scaledresolution = new ScaledResolution(this);
//        int i = scaledresolution.getScaleFactor();
//        Framebuffer framebuffer = new Framebuffer(scaledresolution.getScaledWidth() * i, scaledresolution.getScaledHeight() * i, true);
//        framebuffer.bindFramebuffer(false);
//        GlStateManager.matrixMode(5889);
//        GlStateManager.loadIdentity();
//        GlStateManager.ortho(0.0D, (double)scaledresolution.getScaledWidth(), (double)scaledresolution.getScaledHeight(), 0.0D, 1000.0D, 3000.0D);
//        GlStateManager.matrixMode(5888);
//        GlStateManager.loadIdentity();
//        GlStateManager.translate(0.0F, 0.0F, -2000.0F);
//        GlStateManager.disableLighting();
//        GlStateManager.disableFog();
//        GlStateManager.disableDepth();
//        GlStateManager.enableTexture2D();
//        InputStream inputstream = null;
//
//        try {
//            inputstream = this.mcDefaultResourcePack.getInputStream(locationMojangPng);
//            this.mojangLogo = p_drawSplashScreen_1_.getDynamicTextureLocation("logo", new DynamicTexture(ImageIO.read(inputstream)));
//            p_drawSplashScreen_1_.bindTexture(this.mojangLogo);
//        } catch (IOException var12) {
//            logger.error("Unable to load logo: " + locationMojangPng, var12);
//        } finally {
//            IOUtils.closeQuietly(inputstream);
//        }
//
//        Tessellator tessellator = Tessellator.getInstance();
//        WorldRenderer worldrenderer = tessellator.getWorldRenderer();
//        worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
//        worldrenderer.pos(0.0D, (double)this.displayHeight, 0.0D).tex(0.0D, 0.0D).color(255, 255, 255, 255).endVertex();
//        worldrenderer.pos((double)this.displayWidth, (double)this.displayHeight, 0.0D).tex(0.0D, 0.0D).color(255, 255, 255, 255).endVertex();
//        worldrenderer.pos((double)this.displayWidth, 0.0D, 0.0D).tex(0.0D, 0.0D).color(255, 255, 255, 255).endVertex();
//        worldrenderer.pos(0.0D, 0.0D, 0.0D).tex(0.0D, 0.0D).color(255, 255, 255, 255).endVertex();
//        tessellator.draw();
//        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
//        int j = 256;
//        int k = 256;
//        this.func_181536_a((scaledresolution.getScaledWidth() - j) / 2, (scaledresolution.getScaledHeight() - k) / 2, 0, 0, j, k, 255, 255, 255, 255);
//        GlStateManager.disableLighting();
//        GlStateManager.disableFog();
//        framebuffer.unbindFramebuffer();
//        framebuffer.framebufferRender(scaledresolution.getScaledWidth() * i, scaledresolution.getScaledHeight() * i);
//        GlStateManager.enableAlpha();
//        GlStateManager.alphaFunc(516, 0.1F);
//        this.updateDisplay();
//    }

    /**
     * @author
     */
    @Overwrite
    private void updateDisplayMode() throws LWJGLException {
        Set<DisplayMode> set = Sets.newHashSet();
        Collections.addAll(set, Display.getAvailableDisplayModes());
        DisplayMode displaymode = Display.getDesktopDisplayMode();
        if (!set.contains(displaymode) && Util.getOSType() == Util.EnumOS.OSX) {
            Iterator var3 = macDisplayModes.iterator();

            label52:
            while(true) {
                while(true) {
                    DisplayMode displaymode1;
                    boolean flag;
                    Iterator iterator;
                    DisplayMode displaymode3;
                    do {
                        if (!var3.hasNext()) {
                            break label52;
                        }

                        displaymode1 = (DisplayMode)var3.next();
                        flag = true;
                        iterator = set.iterator();

                        while(iterator.hasNext()) {
                            displaymode3 = (DisplayMode)iterator.next();
                            if (displaymode3.getBitsPerPixel() == 32 && displaymode3.getWidth() == displaymode1.getWidth() && displaymode3.getHeight() == displaymode1.getHeight()) {
                                flag = false;
                                break;
                            }
                        }
                    } while(flag);

                    iterator = set.iterator();

                    while(iterator.hasNext()) {
                        displaymode3 = (DisplayMode)iterator.next();
                        if (displaymode3.getBitsPerPixel() == 32 && displaymode3.getWidth() == displaymode1.getWidth() / 2 && displaymode3.getHeight() == displaymode1.getHeight() / 2) {
                            displaymode = displaymode3;
                            break;
                        }
                    }
                }
            }
        }

        Display.setDisplayMode(displaymode);
        this.displayWidth = displaymode.getWidth();
        this.displayHeight = displaymode.getHeight();
    }
}
