package mod.azure.mchalo.util;

import mod.azure.mchalo.platform.Services;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class HaloItems {

    private HaloItems() {}

    public static final List<GameObj<Item>> entries = new ArrayList<>();

    private static GameObj<Item> create(String registryName, Supplier<Item> supplier) {
        GameObj<Item> gameObj = Services.ITEM_REGISTRY.create(registryName, supplier);
        entries.add(gameObj);
        return gameObj;
    }

}
