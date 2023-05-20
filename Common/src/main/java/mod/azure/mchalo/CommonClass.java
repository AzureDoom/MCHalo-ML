package mod.azure.mchalo;

import mod.azure.mchalo.platform.Services;

public class CommonClass {

    public static void init() {
        if (Services.PLATFORM.isModLoaded(Constants.MOD_ID)) {
            Constants.LOG.info("Hello to {}", Constants.MOD_ID);

            // Initialize items.
            Services.ITEM_REGISTRY.init();
            // Initialize blocks.
            Services.BLOCK_REGISTRY.init();
            // Initialize entities.
            Services.ENTITY_REGISTRY.init();
        }
    }

}