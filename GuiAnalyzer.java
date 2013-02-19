package chunkanalyzer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiScreen;

public class GuiAnalyzer extends GuiScreen {
	public final int xSizeOfTexture = 176;
	public final int ySizeOfTexture = 88;
	
	@Override
	public void drawScreen(int x, int y, float f)
	{
		drawDefaultBackground();
	
		int var4 = this.mc.renderEngine.getTexture("/chunkanalyzer/GuiBackground.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(var4);
	
		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;
	
		drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);
	
		super.drawScreen(x, y, f);
	}
}
