package mod.azure.mchalo.util;

import mod.azure.mchalo.platform.Services;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MCHaloEntities {

    private MCHaloEntities() {}

    public static final List<GameObj<? extends EntityType<? extends Entity>>> entries = new ArrayList<>();

    private static <T extends Entity> GameObj<EntityType<T>> create(String registryName, Supplier<EntityType.Builder<T>> supplier) {
        GameObj<EntityType<T>> gameObj = Services.ENTITY_REGISTRY.create(registryName, () -> supplier.get().build(registryName));
        entries.add(gameObj);
        return gameObj;
    }

}
