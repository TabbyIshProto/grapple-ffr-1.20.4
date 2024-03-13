package net.tabby.grappleffr;

import net.fabricmc.api.ClientModInitializer;
import net.tabby.grappleffr.event.GHFKeyInputHandler;

public class GrappleFFRcl implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GHFKeyInputHandler.register(); //# register the key handler
    }
}
