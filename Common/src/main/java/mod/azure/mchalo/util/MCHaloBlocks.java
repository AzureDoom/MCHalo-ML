package mod.azure.mchalo.util;

import mod.azure.mchalo.platform.Services;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Boston Vanseghi
 */
public class MCHaloBlocks {

    private MCHaloBlocks() {}

    public static final List<GameObj<Block>> entries = new ArrayList<>();

    private static GameObj<Block> create(String registryName, Supplier<Block> supplier) {
        GameObj<Block> gameObj = Services.BLOCK_REGISTRY.create(registryName, supplier);
        entries.add(gameObj);
        return gameObj;
    }
}
