package mod.azure.mchalo;

import mod.azure.mchalo.client.TestEntityRenderer;
import mod.azure.mchalo.entity.TestEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Constants.MOD_ID)
public class MCHaloMod {


    public void createTestEntityAttributes(final EntityAttributeCreationEvent event){
    }

    public void setupCommon(final FMLCommonSetupEvent event){
    }

    public ExampleMod() {
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
		
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }

    @Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    private static class ClientModListener {

        @SubscribeEvent
        public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
            event.registerEntityRenderer(TEST_ENTITY.get(), TestEntityRenderer::new);
        }
    }

}