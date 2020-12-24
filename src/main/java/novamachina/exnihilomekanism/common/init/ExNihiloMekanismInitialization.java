package novamachina.exnihilomekanism.common.init;

import mekanism.common.registries.MekanismItems;
import mekanism.common.resource.PrimaryResource;
import mekanism.common.resource.ResourceType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import novamachina.exnihilomekanism.ExNihiloMekanism;
import novamachina.exnihilomekanism.common.utility.ExNihiloMekanismConstants;
import novamachina.exnihilosequentia.common.item.ore.EnumOre;
import novamachina.exnihilosequentia.common.utility.ExNihiloLogger;
import org.apache.logging.log4j.LogManager;

@Mod.EventBusSubscriber(
    modid = ExNihiloMekanismConstants.ModIds.EX_NIHILO_MEKANISM,
    bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class ExNihiloMekanismInitialization {
    private static final ExNihiloLogger logger = new ExNihiloLogger(LogManager.getLogger());

    private ExNihiloMekanismInitialization() {
    }

    @SubscribeEvent
    public static void onCommonStart(FMLCommonSetupEvent event) {
        ExNihiloMekanism.osmium.setIngotItem(MekanismItems.PROCESSED_RESOURCES.get(ResourceType.INGOT, PrimaryResource.OSMIUM).getItem());
    }

    @SubscribeEvent
    public static void onServerStart(FMLServerStartingEvent event) {
        logger.debug("Fired FMLServerStartingEvent");
        enableOres();
    }

    private static void enableOres() {
        EnumOre.TIN.setEnabled();
        EnumOre.COPPER.setEnabled();
    }
}
