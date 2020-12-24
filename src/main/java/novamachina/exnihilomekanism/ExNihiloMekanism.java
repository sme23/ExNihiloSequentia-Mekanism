package novamachina.exnihilomekanism;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import novamachina.exnihilomekanism.common.init.ExNihiloMekanismInitialization;
import novamachina.exnihilomekanism.common.utility.ExNihiloMekanismConstants;
import novamachina.exnihilosequentia.common.item.ore.EnumOre;
import novamachina.exnihilosequentia.common.utility.Color;
import novamachina.exnihilosequentia.common.utility.ExNihiloLogger;
import org.apache.logging.log4j.LogManager;

@Mod(ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM)
public class ExNihiloMekanism {
    private static final ExNihiloLogger logger = new ExNihiloLogger(LogManager.getLogger());

    // Add Florite and Osmium
    public static EnumOre osmium;

    public ExNihiloMekanism() {
        logger.debug("Starting Ex Nihilo: Sequentia - Mekanism Addon");
        createOres();
        ExNihiloMekanismInitialization.init(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void createOres() {
        osmium = EnumOre.create(createOreName("osmium"), EnumOre.Type.MODDED, "osmium", new Color("BBDDFF"), true);
    }

    private String createOreName(String ore) {
        return new ResourceLocation(ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM, ore).toString();
    }
}
