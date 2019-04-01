package xyz.vsngamer.elevator;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.vsngamer.elevator.init.ModConfig;
import xyz.vsngamer.elevator.network.NetworkHandler;
import xyz.vsngamer.elevator.proxy.IProxy;

import java.io.File;

@Mod(modid = Ref.MOD_ID, name = Ref.NAME, version = Ref.VERSION, acceptedMinecraftVersions = Ref.ACCPEPTED_VERSIONS, guiFactory = Ref.GUI_FACTORY)
public class ElevatorMod {

    @Instance
    public static ElevatorMod instance;

    @SidedProxy(clientSide = Ref.CLIENT_PROXY_CLASS, serverSide = Ref.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    public static final CreativeTabs CREATIVE_TAB = new ElevatorModTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();

        NetworkHandler.init();

        File configDir = new File(event.getModConfigurationDirectory(), "ElevatorMod");
        ModConfig.init(new File(configDir, "ElevatorMod.cfg"));

        MinecraftForge.EVENT_BUS.register(new ModConfig());
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
    }
}
