package chunkanalyzer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiAnalyzer extends GuiScreen {
	private EntityPlayer player;
	public int xSizeOfTexture = 200;
	public int ySizeOfTexture = 150;
	
	public GuiAnalyzer(EntityPlayer _player){
		player = _player;;
	}
	public GuiAnalyzer(){
		
	}
	
	public void initGui()
	{
		this.controlList.clear();
	
		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;
		
		this.controlList.add(new GuiButton(0, posX+xSizeOfTexture - 45, posY + 4, 40, 20, "Scan"));
	}
	
	@Override
	public void drawScreen(int x, int y, float f)
	{
		drawDefaultBackground();
	
		int textureID = this.mc.renderEngine.getTexture("/chunkanalyzer/GuiBackground.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(textureID);
	
		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;
	
		drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);
		
		super.drawScreen(x, y, f);
	}
}
