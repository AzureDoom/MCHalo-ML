package mod.azure.mchalo.platform;

import mod.azure.mchalo.Constants;
import mod.azure.mchalo.platform.services.ABlockRegistry;
import mod.azure.mchalo.platform.services.AEntityRegistry;
import mod.azure.mchalo.platform.services.AtemRegistry;
import mod.azure.mchalo.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

public class Services {

    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    // This platform helper is responsible for streamlining game object registration through a single point.
    // Fabric and Forge register things differently (Fabric prefers direct registration while Forge defers registration).
    // This service provides a common, shared API for registering game objects to both mod loaders.
    public static final AtemRegistry ITEM_REGISTRY = load(AtemRegistry.class);
    public static final ABlockRegistry BLOCK_REGISTRY = load(ABlockRegistry.class);
    public static final AEntityRegistry ENTITY_REGISTRY = load(AEntityRegistry.class);


    public static <T> T load(Class<T> clazz) {

        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        Constants.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}
