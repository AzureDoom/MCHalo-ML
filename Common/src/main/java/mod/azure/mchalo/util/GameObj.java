package mod.azure.mchalo.util;

import mod.azure.mchalo.Constants;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

/**
 * @author Boston Vanseghi
 */
public class GameObj<T> {

    private T obj;
    private final Supplier<? extends T> supplier;
    private final ResourceLocation resourceLocation;

    @Deprecated
    public GameObj(ResourceLocation resourceLocation, Supplier<? extends T> supplier) {
        this.resourceLocation = resourceLocation;
        this.supplier = supplier;
    }

    public GameObj(String registryName, Supplier<? extends T> supplier) {
        this(new ResourceLocation(Constants.MOD_ID, registryName), supplier);
    }

    public T get() {
        if (this.obj == null)
            this.obj = this.supplier.get();
        return this.obj;
    }

    public ResourceLocation getResourceLocation() {
        return this.resourceLocation;
    }
}
