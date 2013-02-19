package chunkanalyzer;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

public class Analyzer extends Item {

	public Analyzer(int _itemID) {
		super(_itemID);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabDecorations);
		setIconIndex(1);
	}
	
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
             ModLoader.openGUI(player, new GuiAnalyzer(player));
                    return itemStack;
    }
	
	@Override
    public boolean onItemUse(ItemStack items, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		if(world.isRemote) return false;
		
		return false; // this device doesn't alter the world.
	}
		
	@Override
	public String getTextureFile(){
		return ServerProxy.ITEMS_PNG;
	}
}
