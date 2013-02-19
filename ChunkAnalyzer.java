package chunkanalyzer;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "ChunkAnalyzer", name = "ChunkAnalyzer", version = "15 Feb 2012")

@NetworkMod(
	channels = { "ChunkAnalyzer" },
	clientSideRequired = true,
	serverSideRequired = false,
	packetHandler = PacketHandler.class 
)

public class ChunkAnalyzer
{
	@Instance
	public static ChunkAnalyzer instance;
	
	@SidedProxy(clientSide = "chunkanalyzer.ClientProxy", serverSide = "chunkanalyzer.ServerProxy")
	public static ServerProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Initializing Chunk Analyzer " + Version());
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		setConfig(config);
		config.save();
	}

	@Init
	public void init(FMLInitializationEvent evt)
	{
		
	}
	
	private void setConfig(Configuration config) {
		// set default values for config file
	}

	public String Version() {
		return "Pre-alpha 1";
	}
}