package top.whitecola.kateclient.module.modules.game;

import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;
import static top.whitecola.kateclient.utils.MCWrapper.*;

public class AutoTools extends AbstractModule {

    @Override
    public void onPlayerInteract(PlayerInteractEvent e) {



        if(e.action != PlayerInteractEvent.Action.LEFT_CLICK_BLOCK){
            return;
        }

        if(mc.thePlayer==null){
            return;
        }



        IBlockState blockState = mc.theWorld.getBlockState(e.pos);
        int selectSolt = mc.thePlayer.inventory.currentItem;
        float bestSpeed = 0;

        for(int i=0;i<8;i++){
            ItemStack itemStack = mc.thePlayer.inventory.getStackInSlot(i);
            if(itemStack==null){
                continue;
            }
            float speed = itemStack.getStrVsBlock(blockState.getBlock());

            if(speed > bestSpeed){
                bestSpeed = speed;
                selectSolt = i;
            }
        }

        mc.thePlayer.inventory.currentItem = selectSolt;

        super.onPlayerInteract(e);
    }

    @Override
    public ModuleCategory getModuleType() {
        return ModuleCategory.GAME;
    }

    @Override
    public String getModuleName() {
        return "AutoTools";

    }
}
