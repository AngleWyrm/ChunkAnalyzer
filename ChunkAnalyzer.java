package chunkanalyzer;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "ChunkAnalyzer", name = "ChunkAnalyzer", version = "15 Feb 2012")

@NetworkMod( channels = {"ChunkAnalyzer"},
	clientSideRequired = true,
	serverSideRequired = false,
	packetHandler = PacketHandler.class 
)

public class ChunkAnalyzer
{
	public static Item analyzer;
	private int ChunkAnalyzerItemID;
	
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
		ChunkAnalyzerItemID = config.getBlock("ChunkAnalyzerItemID", 1200).getInt();
		config.save();
	}

	@Init
	public void init(FMLInitializationEvent evt)
	{
		analyzer = new Analyzer(ChunkAnalyzerItemID).setItemName("Chunk Analyzer");
		LanguageRegistry.addName(analyzer, "Chunk Analyzer");
	}
	
	public String Version() {
		return "Pre-alpha 1";
	}
}