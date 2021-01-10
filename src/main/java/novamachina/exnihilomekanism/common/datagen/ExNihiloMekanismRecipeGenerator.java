package novamachina.exnihilomekanism.common.datagen;

import mekanism.common.registries.MekanismItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.crafting.Ingredient;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilomekanism.common.utility.ExNihiloMekanismConstants;
import novamachina.exnihilosequentia.api.crafting.sieve.MeshWithChance;
import novamachina.exnihilosequentia.api.crafting.sieve.SieveRecipeBuilder;
import novamachina.exnihilosequentia.api.datagen.AbstractRecipeGenerator;
import novamachina.exnihilosequentia.common.init.ExNihiloBlocks;
import novamachina.exnihilosequentia.common.item.mesh.EnumMesh;

import java.util.function.Consumer;

public class ExNihiloMekanismRecipeGenerator extends AbstractRecipeGenerator {
    public ExNihiloMekanismRecipeGenerator(DataGenerator generator) {
        super(generator, ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        registerSmelting(ExNihiloMekanism.osmium, consumer);
        registerOre(ExNihiloMekanism.osmium, consumer);
        registerSieve(consumer);
    }

    private void registerSieve(Consumer<IFinishedRecipe> consumer) {
        SieveRecipeBuilder.builder()
            .input(Ingredient.fromItems(Blocks.GRAVEL))
            .drop(ExNihiloMekanism.osmium.getPieceItem().get())
            .addRoll(new MeshWithChance(EnumMesh.IRON, 0.05F))
            .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.1F))
            .build(consumer, sieveLoc(ExNihiloMekanism.osmium.getPieceName()));

        SieveRecipeBuilder.builder()
            .input(Ingredient.fromItems(Blocks.GRAVEL))
            .drop(MekanismItems.FLUORITE_GEM.getItem())
            .addRoll(new MeshWithChance(EnumMesh.IRON, 0.025F))
            .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.05F))
            .build(consumer, sieveLoc(ExNihiloMekanism.osmium.getPieceName()));

        SieveRecipeBuilder.builder()
            .input(Ingredient.fromItems(Blocks.SAND))
            .drop(MekanismItems.SALT.getItem())
            .addRoll(new MeshWithChance(EnumMesh.FLINT, 0.01F))
            .addRoll(new MeshWithChance(EnumMesh.IRON, 0.02F))
            .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.4F))
            .build(consumer, sieveLoc(ExNihiloMekanism.osmium.getPieceName()));
    }
}
