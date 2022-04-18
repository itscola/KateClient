package top.whitecola.kateclient.injection.mixins;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import top.whitecola.kateclient.KateClient;

@Mixin(C02PacketUseEntity.class)
public class MixinC02PacketUseEntity {

    @Inject(method = "<init>(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/C02PacketUseEntity$Action;)V", at = @At(value = "RETURN"), cancellable = true)
    public void onAttackOtherEntity(Entity entity, C02PacketUseEntity.Action p_i45251_2_, CallbackInfo ci){
        KateClient.getKateClient().getEventManager().onSendAttackPacket(entity,p_i45251_2_,ci);
    }

}

