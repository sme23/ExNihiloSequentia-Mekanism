package novamachina.exnihilomekanism.common.datagen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilomekanism.common.utility.ExNihiloMekanismConstants;
import novamachina.exnihilosequentia.api.ExNihiloTags;
import novamachina.exnihilosequentia.api.datagen.AbstractItemTagGenerator;

public class ExNihiloMekanismItemTagGenerator extends AbstractItemTagGenerator {
    public ExNihiloMekanismItemTagGenerator(DataGenerator generator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM, existingFileHelper);
    }


    @Override
    protected void addTags() {
        registerOre(ExNihiloMekanism.osmium, new ExNihiloTags.OreTag(ExNihiloMekanism.osmium));
    }
}
