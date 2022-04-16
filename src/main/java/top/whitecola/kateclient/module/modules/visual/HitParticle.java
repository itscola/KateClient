package top.whitecola.kateclient.module.modules.visual;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import top.whitecola.kateclient.module.AbstractModule;
import top.whitecola.kateclient.module.ModuleCategory;
import top.whitecola.kateclient.utils.ParticleUtils;


public class HitParticle extends AbstractModule {

    public HitParticle(){

    }

    @Override
    public void onLivingHurt(LivingHurtEvent e) {
        Entity entity = e.entity;
        if(entity instanceof EntityPlayer){
            ParticleUtils.spawnBloodParticle(entity.getPosition());
        }


        super.onLivingHurt(e);
    }

    @Override
    public ModuleCategory getModuleType() {
        return ModuleCategory.VISUAL;
    }

    @Override
    public String getModuleName() {
        return "HitParticle";
    }
}
