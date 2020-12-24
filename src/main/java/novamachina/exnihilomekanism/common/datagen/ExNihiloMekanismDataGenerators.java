package novamachina.exnihilomekanism.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExNihiloMekanismDataGenerators {

    private ExNihiloMekanismDataGenerators() {
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        if (event.includeServer()) {
            // Recipes
            generator.addProvider(new ExNihiloMekanismRecipes(generator));
            // LootTable
            generator.addProvider(new ExNihiloMekanismLootTables(generator));
        }
        if (event.includeClient()) {
            // BlockStates
            generator.addProvider(new ExNihiloMekanismBlockStates(generator, event.getExistingFileHelper()));
        }
    }
}
