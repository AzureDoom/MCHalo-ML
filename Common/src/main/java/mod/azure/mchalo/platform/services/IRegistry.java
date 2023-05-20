package mod.azure.mchalo;

import mod.azure.mchalo.util.GameObj;

/**
 * @author Boston Vanseghi
 */
public interface IRegistry<T> {

    default <I extends T> GameObj<I> create(String registryName, Supplier<? extends I> supplier) {
        return new GameObj<>(registryName, supplier);
    }

    <I extends T> void register(GameObj<I> gameObj);

    void registerEntries();

    Iterable<GameObj<? extends T>> getEntries();

    default void init() {
        this.registerEntries();
    }
}