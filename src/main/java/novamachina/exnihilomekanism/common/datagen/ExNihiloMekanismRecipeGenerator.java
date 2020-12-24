package novamachina.exnihilomekanism.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilomekanism.common.utility.ExNihiloMekanismConstants;
import novamachina.exnihilosequentia.api.datagen.AbstractRecipeGenerator;

import java.util.function.Consumer;

public class ExNihiloMekanismRecipeGenerator extends AbstractRecipeGenerator {
    public ExNihiloMekanismRecipeGenerator(DataGenerator generator) {
        super(generator, ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        registerSmelting(ExNihiloMekanism.osmium, consumer);
        registerOre(ExNihiloMekanism.osmium, consumer);
    }
}
