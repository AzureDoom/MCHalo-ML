package mod.azure.mchalo;

import mod.azure.mchalo.entity.TestEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.entity.api.QuiltEntityTypeBuilder;

public class MCHaloMod implements ModInitializer {

    @Override
    public void onInitialize(ModContainer container) {
        Constants.LOG.info("Hello Quilt world!");
        CommonClass.init();

    }
}
