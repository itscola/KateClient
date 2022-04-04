package top.whitecola.kateclient.injection.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.PacketThreadUtil;
import net.minecraft.network.play.server.S3EPacketTeams;
import net.minecraft.network.play.server.S47PacketPlayerListHeaderFooter;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Iterator;

@Mixin(NetHandlerPlayClient.class)
public class MixinNetHandlerPlayClient {
    @Shadow private Minecraft gameController;


    @Shadow private WorldClient clientWorldController;

//    /**
//     * @author White_cola
//     * @reason fix the nullPointer bug.
//     */
//    @Overwrite
//    public void handlePlayerListHeaderFooter(S47PacketPlayerListHeaderFooter p_handlePlayerListHeaderFooter_1_) {
//        if(p_handlePlayerListHeaderFooter_1_.getHeader()!=null & p_handlePlayerListHeaderFooter_1_.getHeader().getFormattedText().length()!=0) {
//            this.gameController.ingameGUI.getTabList().setHeader(p_handlePlayerListHeaderFooter_1_.getHeader());
//        }
//
//        if(p_handlePlayerListHeaderFooter_1_.getFooter()!=null & p_handlePlayerListHeaderFooter_1_.getFooter().getFormattedText().length()!=0) {
//            this.gameController.ingameGUI.getTabList().setFooter(p_handlePlayerListHeaderFooter_1_.getFooter());
//        }
//    }

    /**
     * @author White_cola
     * @reason fix the nullPointer bug.
     */
    @Overwrite
    public void handleTeams(S3EPacketTeams p_handleTeams_1_) {
        if(p_handleTeams_1_==null )
            return;


        PacketThreadUtil.checkThreadAndEnqueue(p_handleTeams_1_, Minecraft.getMinecraft().getNetHandler(), this.gameController);
        Scoreboard scoreboard = this.clientWorldController.getScoreboard();
        ScorePlayerTeam scoreplayerteam;
        if (p_handleTeams_1_.func_149307_h() == 0) {
            scoreplayerteam = scoreboard.createTeam(p_handleTeams_1_.func_149312_c());
        } else {
            scoreplayerteam = scoreboard.getTeam(p_handleTeams_1_.func_149312_c());
        }


        if(scoreplayerteam==null)
            return;

        if (p_handleTeams_1_.func_149307_h() == 0 || p_handleTeams_1_.func_149307_h() == 2) {
            scoreplayerteam.setTeamName(p_handleTeams_1_.func_149306_d());
            scoreplayerteam.setNamePrefix(p_handleTeams_1_.func_149311_e());
            scoreplayerteam.setNameSuffix(p_handleTeams_1_.func_149309_f());
            scoreplayerteam.setChatFormat(EnumChatFormatting.func_175744_a(p_handleTeams_1_.func_179813_h()));
            scoreplayerteam.func_98298_a(p_handleTeams_1_.func_149308_i());
            Team.EnumVisible team$enumvisible = Team.EnumVisible.func_178824_a(p_handleTeams_1_.func_179814_i());
            if (team$enumvisible != null) {
                scoreplayerteam.setNameTagVisibility(team$enumvisible);
            }
        }

        String s1;
        Iterator var6;
        if (p_handleTeams_1_.func_149307_h() == 0 || p_handleTeams_1_.func_149307_h() == 3) {
            var6 = p_handleTeams_1_.func_149310_g().iterator();

            while(var6.hasNext()) {
                s1 = (String)var6.next();
                scoreboard.addPlayerToTeam(s1, p_handleTeams_1_.func_149312_c());
            }
        }



        if (p_handleTeams_1_.func_149307_h() == 4) {
            var6 = p_handleTeams_1_.func_149310_g().iterator();

            while(var6.hasNext()) {
                s1 = (String)var6.next();
                scoreboard.removePlayerFromTeam(s1, scoreplayerteam);
            }
        }



        if (p_handleTeams_1_.func_149307_h() == 1) {
            scoreboard.removeTeam(scoreplayerteam);
        }

    }




}
