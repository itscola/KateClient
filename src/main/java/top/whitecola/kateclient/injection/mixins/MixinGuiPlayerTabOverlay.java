package top.whitecola.kateclient.injection.mixins;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Iterator;
import java.util.List;

import static top.whitecola.kateclient.utils.MCWrapper.*;

@Mixin(GuiPlayerTabOverlay.class)
public class MixinGuiPlayerTabOverlay extends Gui{
    public ResourceLocation statIcons = GuiPlayerTabOverlay.statIcons;

    public ResourceLocation icons = GuiPlayerTabOverlay.icons;

    protected float zLevel;


    /**
     * @author
     */
//    @Overwrite
//    public void renderPlayerlist(int p_renderPlayerlist_1_, Scoreboard p_renderPlayerlist_2_, ScoreObjective p_renderPlayerlist_3_) {
//        NetHandlerPlayClient lvt_4_1_ = mc.thePlayer.sendQueue;
//        List<NetworkPlayerInfo> lvt_5_1_ = field_175252_a.sortedCopy(lvt_4_1_.getPlayerInfoMap());
//        int lvt_6_1_ = 0;
//        int lvt_7_1_ = 0;
//        Iterator lvt_8_1_ = lvt_5_1_.iterator();
//
//        int lvt_10_2_;
//        while(lvt_8_1_.hasNext()) {
//            NetworkPlayerInfo lvt_9_1_ = (NetworkPlayerInfo)lvt_8_1_.next();
//            lvt_10_2_ = mc.fontRendererObj.getStringWidth(this.getPlayerName(lvt_9_1_));
//            lvt_6_1_ = Math.max(lvt_6_1_, lvt_10_2_);
//            if (p_renderPlayerlist_3_ != null && p_renderPlayerlist_3_.getRenderType() != IScoreObjectiveCriteria.EnumRenderType.HEARTS) {
//                lvt_10_2_ = mc.fontRendererObj.getStringWidth(" " + p_renderPlayerlist_2_.getValueFromObjective(lvt_9_1_.getGameProfile().getName(), p_renderPlayerlist_3_).getScorePoints());
//                lvt_7_1_ = Math.max(lvt_7_1_, lvt_10_2_);
//            }
//        }
//
//        lvt_5_1_ = lvt_5_1_.subList(0, Math.min(lvt_5_1_.size(), 80));
//        int lvt_8_2_ = lvt_5_1_.size();
//        int lvt_9_2_ = lvt_8_2_;
//
//        for(lvt_10_2_ = 1; lvt_9_2_ > 20; lvt_9_2_ = (lvt_8_2_ + lvt_10_2_ - 1) / lvt_10_2_) {
//            ++lvt_10_2_;
//        }
//
//        boolean lvt_11_1_ = mc.isIntegratedServerRunning() || mc.getNetHandler().getNetworkManager().getIsencrypted();
//        int lvt_12_3_;
//        if (p_renderPlayerlist_3_ != null) {
//            if (p_renderPlayerlist_3_.getRenderType() == IScoreObjectiveCriteria.EnumRenderType.HEARTS) {
//                lvt_12_3_ = 90;
//            } else {
//                lvt_12_3_ = lvt_7_1_;
//            }
//        } else {
//            lvt_12_3_ = 0;
//        }
//
//        int lvt_13_1_ = Math.min(lvt_10_2_ * ((lvt_11_1_ ? 9 : 0) + lvt_6_1_ + lvt_12_3_ + 13), p_renderPlayerlist_1_ - 50) / lvt_10_2_;
//        int lvt_14_1_ = p_renderPlayerlist_1_ / 2 - (lvt_13_1_ * lvt_10_2_ + (lvt_10_2_ - 1) * 5) / 2;
//        int lvt_15_1_ = 10;
//        int lvt_16_1_ = lvt_13_1_ * lvt_10_2_ + (lvt_10_2_ - 1) * 5;
//        List<String> lvt_17_1_ = null;
//        List<String> lvt_18_1_ = null;
//        Iterator lvt_19_5_;
//        String lvt_20_5_;
//        if (this.header != null) {
//            lvt_17_1_ = mc.fontRendererObj.listFormattedStringToWidth(this.header.getFormattedText(), p_renderPlayerlist_1_ - 50);
//
//            for(lvt_19_5_ = lvt_17_1_.iterator(); lvt_19_5_.hasNext(); lvt_16_1_ = Math.max(lvt_16_1_, mc.fontRendererObj.getStringWidth(lvt_20_5_))) {
//                lvt_20_5_ = (String)lvt_19_5_.next();
//            }
//        }
//
//        if (this.footer != null) {
//            lvt_18_1_ = mc.fontRendererObj.listFormattedStringToWidth(this.footer.getFormattedText(), p_renderPlayerlist_1_ - 50);
//
//            for(lvt_19_5_ = lvt_18_1_.iterator(); lvt_19_5_.hasNext(); lvt_16_1_ = Math.max(lvt_16_1_, mc.fontRendererObj.getStringWidth(lvt_20_5_))) {
//                lvt_20_5_ = (String)lvt_19_5_.next();
//            }
//        }
//
//        int lvt_21_3_;
//        if (lvt_17_1_ != null) {
//            drawRect(p_renderPlayerlist_1_ / 2 - lvt_16_1_ / 2 - 1, lvt_15_1_ - 1, p_renderPlayerlist_1_ / 2 + lvt_16_1_ / 2 + 1, lvt_15_1_ + lvt_17_1_.size() * mc.fontRendererObj.FONT_HEIGHT, -2147483648);
//
//            for(lvt_19_5_ = lvt_17_1_.iterator(); lvt_19_5_.hasNext(); lvt_15_1_ += mc.fontRendererObj.FONT_HEIGHT) {
//                lvt_20_5_ = (String)lvt_19_5_.next();
//                lvt_21_3_ = mc.fontRendererObj.getStringWidth(lvt_20_5_);
//                mc.fontRendererObj.drawStringWithShadow(lvt_20_5_, (float)(p_renderPlayerlist_1_ / 2 - lvt_21_3_ / 2), (float)lvt_15_1_, -1);
//            }
//
//            ++lvt_15_1_;
//        }
//
//        drawRect(p_renderPlayerlist_1_ / 2 - lvt_16_1_ / 2 - 1, lvt_15_1_ - 1, p_renderPlayerlist_1_ / 2 + lvt_16_1_ / 2 + 1, lvt_15_1_ + lvt_9_2_ * 9, -2147483648);
//
//        for(int lvt_19_4_ = 0; lvt_19_4_ < lvt_8_2_; ++lvt_19_4_) {
//            int lvt_20_4_ = lvt_19_4_ / lvt_9_2_;
//            lvt_21_3_ = lvt_19_4_ % lvt_9_2_;
//            int lvt_22_1_ = lvt_14_1_ + lvt_20_4_ * lvt_13_1_ + lvt_20_4_ * 5;
//            int lvt_23_1_ = lvt_15_1_ + lvt_21_3_ * 9;
//            drawRect(lvt_22_1_, lvt_23_1_, lvt_22_1_ + lvt_13_1_, lvt_23_1_ + 8, 553648127);
//            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
//            GlStateManager.enableAlpha();
//            GlStateManager.enableBlend();
//            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
//            if (lvt_19_4_ < lvt_5_1_.size()) {
//                NetworkPlayerInfo lvt_24_1_ = (NetworkPlayerInfo)lvt_5_1_.get(lvt_19_4_);
//                String lvt_25_1_ = this.getPlayerName(lvt_24_1_);
//                GameProfile lvt_26_1_ = lvt_24_1_.getGameProfile();
//                if (lvt_11_1_) {
//                    EntityPlayer lvt_27_1_ = mc.theWorld.getPlayerEntityByUUID(lvt_26_1_.getId());
//                    boolean lvt_28_1_ = lvt_27_1_ != null && lvt_27_1_.isWearing(EnumPlayerModelParts.CAPE) && (lvt_26_1_.getName().equals("Dinnerbone") || lvt_26_1_.getName().equals("Grumm"));
//                    mc.getTextureManager().bindTexture(lvt_24_1_.getLocationSkin());
//                    int lvt_29_1_ = 8 + (lvt_28_1_ ? 8 : 0);
//                    int lvt_30_1_ = 8 * (lvt_28_1_ ? -1 : 1);
//                    Gui.drawScaledCustomSizeModalRect(lvt_22_1_, lvt_23_1_, 8.0F, (float)lvt_29_1_, 8, lvt_30_1_, 8, 8, 64.0F, 64.0F);
//                    if (lvt_27_1_ != null && lvt_27_1_.isWearing(EnumPlayerModelParts.HAT)) {
//                        int lvt_31_1_ = 8 + (lvt_28_1_ ? 8 : 0);
//                        int lvt_32_1_ = 8 * (lvt_28_1_ ? -1 : 1);
//                        Gui.drawScaledCustomSizeModalRect(lvt_22_1_, lvt_23_1_, 40.0F, (float)lvt_31_1_, 8, lvt_32_1_, 8, 8, 64.0F, 64.0F);
//                    }
//
//                    lvt_22_1_ += 9;
//                }
//
//                if (lvt_24_1_.getGameType() == WorldSettings.GameType.SPECTATOR) {
//                    lvt_25_1_ = EnumChatFormatting.ITALIC + lvt_25_1_;
//                    mc.fontRendererObj.drawStringWithShadow(lvt_25_1_, (float)lvt_22_1_, (float)lvt_23_1_, -1862270977);
//                } else {
//                    mc.fontRendererObj.drawStringWithShadow(lvt_25_1_, (float)lvt_22_1_, (float)lvt_23_1_, -1);
//                }
//
//                if (p_renderPlayerlist_3_ != null && lvt_24_1_.getGameType() != WorldSettings.GameType.SPECTATOR) {
//                    int lvt_27_2_ = lvt_22_1_ + lvt_6_1_ + 1;
//                    int lvt_28_2_ = lvt_27_2_ + lvt_12_3_;
//                    if (lvt_28_2_ - lvt_27_2_ > 5) {
//                        this.drawScoreboardValues(p_renderPlayerlist_3_, lvt_23_1_, lvt_26_1_.getName(), lvt_27_2_, lvt_28_2_, lvt_24_1_);
//                    }
//                }
//
//                this.drawPing(lvt_13_1_, lvt_22_1_ - (lvt_11_1_ ? 9 : 0), lvt_23_1_, lvt_24_1_);
//            }
//        }
//
//        if (lvt_18_1_ != null) {
//            lvt_15_1_ += lvt_9_2_ * 9 + 1;
//            drawRect(p_renderPlayerlist_1_ / 2 - lvt_16_1_ / 2 - 1, lvt_15_1_ - 1, p_renderPlayerlist_1_ / 2 + lvt_16_1_ / 2 + 1, lvt_15_1_ + lvt_18_1_.size() * mc.fontRendererObj.FONT_HEIGHT, -2147483648);
//
//            for(lvt_19_5_ = lvt_18_1_.iterator(); lvt_19_5_.hasNext(); lvt_15_1_ += mc.fontRendererObj.FONT_HEIGHT) {
//                lvt_20_5_ = (String)lvt_19_5_.next();
//                lvt_21_3_ = mc.fontRendererObj.getStringWidth(lvt_20_5_);
//                mc.fontRendererObj.drawStringWithShadow(lvt_20_5_, (float)(p_renderPlayerlist_1_ / 2 - lvt_21_3_ / 2), (float)lvt_15_1_, -1);
//            }
//        }
//
//    }


//    /**
//     * @author
//     * @author
//     */
//    @Overwrite
//    protected void drawPing(int p_drawPing_1_, int p_drawPing_2_, int p_drawPing_3_, NetworkPlayerInfo p_drawPing_4_) {
//        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
//        mc.getTextureManager().bindTexture(icons);
//        int lvt_5_1_ = 0;
//        byte lvt_6_1_;
//        if (p_drawPing_4_.getResponseTime() < 0) {
//            lvt_6_1_ = 5;
//        } else if (p_drawPing_4_.getResponseTime() < 150) {
//            lvt_6_1_ = 0;
//        } else if (p_drawPing_4_.getResponseTime() < 300) {
//            lvt_6_1_ = 1;
//        } else if (p_drawPing_4_.getResponseTime() < 600) {
//            lvt_6_1_ = 2;
//        } else if (p_drawPing_4_.getResponseTime() < 1000) {
//            lvt_6_1_ = 3;
//        } else {
//            lvt_6_1_ = 4;
//        }
//
//        this.zLevel += 100.0F;
//        this.drawTexturedModalRect(p_drawPing_2_ + p_drawPing_1_ - 11, p_drawPing_3_, 0 + lvt_5_1_ * 10, 176 + lvt_6_1_ * 8, 10, 8);
//        this.zLevel -= 100.0F;
//
//    }


//    public void drawTexturedModalRect(int p_drawTexturedModalRect_1_, int p_drawTexturedModalRect_2_, int p_drawTexturedModalRect_3_, int p_drawTexturedModalRect_4_, int p_drawTexturedModalRect_5_, int p_drawTexturedModalRect_6_) {
//        float lvt_7_1_ = 0.00390625F;
//        float lvt_8_1_ = 0.00390625F;
//        Tessellator lvt_9_1_ = Tessellator.getInstance();
//        WorldRenderer lvt_10_1_ = lvt_9_1_.getWorldRenderer();
//        lvt_10_1_.begin(7, DefaultVertexFormats.POSITION_TEX);
//        lvt_10_1_.pos((double)(p_drawTexturedModalRect_1_ + 0), (double)(p_drawTexturedModalRect_2_ + p_drawTexturedModalRect_6_), (double)this.zLevel).tex((double)((float)(p_drawTexturedModalRect_3_ + 0) * lvt_7_1_), (double)((float)(p_drawTexturedModalRect_4_ + p_drawTexturedModalRect_6_) * lvt_8_1_)).endVertex();
//        lvt_10_1_.pos((double)(p_drawTexturedModalRect_1_ + p_drawTexturedModalRect_5_), (double)(p_drawTexturedModalRect_2_ + p_drawTexturedModalRect_6_), (double)this.zLevel).tex((double)((float)(p_drawTexturedModalRect_3_ + p_drawTexturedModalRect_5_) * lvt_7_1_), (double)((float)(p_drawTexturedModalRect_4_ + p_drawTexturedModalRect_6_) * lvt_8_1_)).endVertex();
//        lvt_10_1_.pos((double)(p_drawTexturedModalRect_1_ + p_drawTexturedModalRect_5_), (double)(p_drawTexturedModalRect_2_ + 0), (double)this.zLevel).tex((double)((float)(p_drawTexturedModalRect_3_ + p_drawTexturedModalRect_5_) * lvt_7_1_), (double)((float)(p_drawTexturedModalRect_4_ + 0) * lvt_8_1_)).endVertex();
//        lvt_10_1_.pos((double)(p_drawTexturedModalRect_1_ + 0), (double)(p_drawTexturedModalRect_2_ + 0), (double)this.zLevel).tex((double)((float)(p_drawTexturedModalRect_3_ + 0) * lvt_7_1_), (double)((float)(p_drawTexturedModalRect_4_ + 0) * lvt_8_1_)).endVertex();
//        lvt_9_1_.draw();
//    }
}
