package novamachina.exnihilomekanism.common.init;

import net.minecraftforge.eventbus.api.IEventBus;
import novamachina.exnihilosequentia.common.utility.ExNihiloLogger;
import org.apache.logging.log4j.LogManager;

public class ExNihiloMekanismInitialization {
    private static final ExNihiloLogger logger = new ExNihiloLogger(LogManager.getLogger());

    private ExNihiloMekanismInitialization() {
    }

    public static void init(IEventBus modEventBus) {
        logger.debug("Initializing modded items");
        ExNihiloMekanismBlocks.init(modEventBus);
        ExNihiloMekanismItems.init(modEventBus);
    }
}
