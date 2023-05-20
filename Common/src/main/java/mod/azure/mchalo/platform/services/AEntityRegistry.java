package mod.azure.mchalo.platform.services;

import mod.azure.mchalo.util.GameObj;
import mod.azure.mchalo.IRegistry;
import mod.azure.mchalo.util.MCHaloEntities;
import net.minecraft.world.entity.EntityType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Boston Vanseghi
 */
public class AEntityRegistry implements IRegistry<EntityType<?>> {

    public final List<GameObj<? extends EntityType<?>>> entries = new ArrayList<>();

    @Override
    public void registerEntries() {
        MCHaloEntities.entries.forEach(this::register);
    }

    @Override
    public <I extends EntityType<?>> void register(GameObj<I> gameObj) {
        this.entries.add(gameObj);
    }

    @Override
    public Iterable<GameObj<? extends EntityType<?>>> getEntries() {
        return this.entries;
    }
}