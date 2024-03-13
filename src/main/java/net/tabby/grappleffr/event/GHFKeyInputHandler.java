package net.tabby.grappleffr.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class GHFKeyInputHandler {
    public static final String KEY_CATEGORY_GRAPPLEFFR = "key.category.grapple-ffr";
    public static final String KEY_GRAPPLE = "key.grapple-ffr.grapple";

    public static KeyBinding grappleKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (grappleKey.wasPressed()) {
                //# do key stuff
                client.player.networkHandler.sendChatMessage("/wel");
            }
        });
    }
    public static void register() {
        grappleKey = KeyBindingHelper.registerKeyBinding(
                new KeyBinding(
                        KEY_GRAPPLE,
                        InputUtil.Type.KEYSYM,
                        GLFW.GLFW_KEY_KP_ADD,
                        KEY_CATEGORY_GRAPPLEFFR));
        registerKeyInputs();
    }
}
