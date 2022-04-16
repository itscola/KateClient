package top.whitecola.kateclient.utils;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import static top.whitecola.kateclient.utils.MCWrapper.*;

public class ParticleUtils {

    public static void spawnBloodParticle(Entity entity){
        BlockPos blockPos = new BlockPos(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ);
        spawnBloodParticle(blockPos);
    }

    public static void spawnBloodParticle(BlockPos blockPos){
        IBlockState blockState = Blocks.redstone_block.getDefaultState();
        mc.renderGlobal.playAuxSFX(null,2001,blockPos, Block.getStateId(blockState));
    }

}
