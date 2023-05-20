package mod.azure.mchalo.platform.services;

import mod.azure.mchalo.util.GameObj;
import mod.azure.mchalo.IRegistry;
import mod.azure.mchalo.util.MCHaloBlocks;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Boston Vanseghi
 */
public abstract class ABlockRegistry implements IRegistry<Block> {

    public final List<GameObj<? extends Block>> entries = new ArrayList<>();

    @Override
    public void registerEntries() {
        MCHaloBlocks.entries.forEach(this::register);
    }

    @Override
    public <I extends Block> void register(GameObj<I> gameObj) {
        this.entries.add(gameObj);
    }

    @Override
    public List<GameObj<? extends Block>> getEntries() {
        return this.entries;
    }
}