package novamachina.exnihilomekanism.common.datagen;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import novamachina.exnihilomekanism.common.init.ExNihiloMekanismBlocks;
import novamachina.exnihilomekanism.common.utility.ExNihiloMekanismConstants;

public class ExNihiloMekanismBlockStates extends BlockStateProvider {
    public ExNihiloMekanismBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }

    private void basicBlock(Block block) {
        simpleItemBlock(block, cubeAll(block));
    }

    private void simpleItemBlock(Block block, ModelFile modelFile) {
        simpleBlock(block, modelFile);
        simpleBlockItem(block, modelFile);
    }
}
