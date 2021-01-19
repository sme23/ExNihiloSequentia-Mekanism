package novamachina.exnihilomekanism;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import novamachina.exnihilomekanism.common.utility.ExNihiloMekanismConstants;
import novamachina.exnihilosequentia.common.item.ore.EnumOre;
import novamachina.exnihilosequentia.common.utility.Color;
import novamachina.exnihilosequentia.common.utility.ExNihiloLogger;
import org.apache.logging.log4j.LogManager;

@Mod(ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM)
public class ExNihiloMekanism {
    private static final ExNihiloLogger logger = new ExNihiloLogger(LogManager.getLogger());

    public static EnumOre osmium;

    public ExNihiloMekanism() {
        logger.debug("Starting Ex Nihilo: Sequentia - Mekanism Addon");
        createOres();
    }

    private void createOres() {
        osmium = EnumOre.create(createOreName("osmium"), EnumOre.Type.MODDED, "osmium", new Color("BBDDFF"), true, false);
    }

    private String createOreName(String ore) {
        return new ResourceLocation(ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM, ore).toString();
    }
}
