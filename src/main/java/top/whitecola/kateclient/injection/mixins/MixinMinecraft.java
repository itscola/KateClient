package top.whitecola.kateclient.injection.mixins;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
@SideOnly(Side.CLIENT)
public class MixinMinecraft {
    @Inject(at=@At(value="HEAD"), method = "startGame",cancellable=true)
    private void startGame(CallbackInfo ci) {
        for(int i=0;i<30;i++){
            System.out.println("Mixin is already!!!!!!");
        }
    }
}
