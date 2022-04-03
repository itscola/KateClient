package top.whitecola.kateclient.utils;

import static top.whitecola.kateclient.utils.MCWrapper.mc;

public class PlayerSPUtils {
    public static boolean isMoving() {

        if (mc.thePlayer.movementInput.moveForward != 0f || mc.thePlayer.movementInput.moveStrafe != 0f) {
            return true;
        }
        return false;
    }

    public static boolean isSneaking() {

        if ((mc.thePlayer.isSneaking())) {
            return true;
        }
        return false;
    }



}
