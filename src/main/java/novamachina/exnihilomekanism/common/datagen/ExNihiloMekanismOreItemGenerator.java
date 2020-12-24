package novamachina.exnihilomekanism.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilosequentia.api.datagen.AbstractOreItemGenerator;

public class ExNihiloMekanismOreItemGenerator extends AbstractOreItemGenerator {
    protected ExNihiloMekanismOreItemGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        registerChunk(ExNihiloMekanism.osmium);
        registerPiece(ExNihiloMekanism.osmium);
    }
}
