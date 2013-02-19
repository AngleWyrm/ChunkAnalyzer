package chunkanalyzer;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Analyzer extends Item {

	public Analyzer(int _itemID) {
		super(_itemID);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabDecorations);
		setIconIndex(1);
		// setIconCoord(15,0);
	}
	
	@Override
    public boolean onItemUse(ItemStack items, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		return false;
	}
		
	@Override
	public String getTextureFile(){
		return ServerProxy.ITEMS_PNG;
	}
}
