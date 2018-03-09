package guardian.test_mod;

import guardian.test_mod.proxy.ServerProxy;
import guardian.test_mod.tab.CreativeTabTest;
import guardian.test_mod.util.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static net.minecraftforge.fml.common.Mod.*;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.ACCEPTED_VERSIONS)
public class Main {

    @Instance
    public static Main instance;

    public static CreativeTabTest tabTest;

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static ServerProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        tabTest = new CreativeTabTest(CreativeTabTest.getNextID(), "tab_test");
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event){

        proxy.init(event);

    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event){

        proxy.postinit(event);

    }
}
