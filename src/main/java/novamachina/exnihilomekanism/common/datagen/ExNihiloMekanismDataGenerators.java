package novamachina.exnihilomekanism.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import novamachina.exnihilomekanism.common.init.ExNihiloMekanismInitialization;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExNihiloMekanismDataGenerators {

    private ExNihiloMekanismDataGenerators() {
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        ExNihiloMekanismInitialization.onCommonStart(null);

        if (event.includeServer()) {
            // Recipes
            generator.addProvider(new ExNihiloMekanismRecipeGenerator(generator));
        }
        if (event.includeClient()) {
            // Items
            generator.addProvider(new ExNihiloMekanismOreItemGenerator(generator, event.getExistingFileHelper()));
        }
    }
}
