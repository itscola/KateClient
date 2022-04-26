package top.whitecola.kateclient.injection.mixins;

import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import top.whitecola.kateclient.KateClient;

@Mixin(PlayerControllerMP.class)
public class MixinPlayerControllerMP {


    @Inject(method = "clickBlock", at = @At(value = "HEAD"))
    public void clickBlock(BlockPos p_clickBlock_1_, EnumFacing p_clickBlock_2_, CallbackInfoReturnable<Boolean> cir) {
        KateClient.getKateClient().getEventManager().onPlayerClickBlock(p_clickBlock_1_,p_clickBlock_2_);
    }
}
