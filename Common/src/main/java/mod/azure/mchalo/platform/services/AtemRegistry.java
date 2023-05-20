package mod.azure.mchalo.platform.services;

import mod.azure.mchalo.util.GameObj;
import mod.azure.mchalo.IRegistry;
import mod.azure.mchalo.util.HaloItems;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Boston Vanseghi
 */
public abstract class AtemRegistry implements IRegistry<Item> {

    public final List<GameObj<? extends Item>> entries = new ArrayList<>();

    @Override
    public void registerEntries() {
        HaloItems.entries.forEach(this::register);
    }

    @Override
    public <I extends Item> void register(GameObj<I> gameObj) {
        this.entries.add(gameObj);
    }

    @Override
    public List<GameObj<? extends Item>> getEntries() {
        return this.entries;
    }
