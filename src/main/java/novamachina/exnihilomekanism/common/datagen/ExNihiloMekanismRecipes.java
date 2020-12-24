package novamachina.exnihilomekanism.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import novamachina.exnihilomekanism.common.utility.ExNihiloMekanismConstants;
import novamachina.exnihilosequentia.api.datagen.AbstractRecipeGenerator;

import java.util.function.Consumer;

public class ExNihiloMekanismRecipes extends AbstractRecipeGenerator {
    public ExNihiloMekanismRecipes(DataGenerator generator) {
        super(generator, ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
    }
}
