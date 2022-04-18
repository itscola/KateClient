package top.whitecola.kateclient.injection.mixins;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.lookup.JndiLookup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(JndiLookup.class)
public class MixinJndiLookup {

    /**
     * @author White_cola
     * @reason fix the log4jbug
     */
    @Overwrite
    public String lookup(String key) {
        return null;
    }

    /**
     * @author White_cola
     * @reason fix the log4jbug
     */
    @Overwrite
    public String lookup(LogEvent event, String key) {
        return null;
    }
}
