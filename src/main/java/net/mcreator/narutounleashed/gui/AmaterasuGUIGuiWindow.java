
package net.mcreator.narutounleashed.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AmaterasuGUIGuiWindow extends ContainerScreen<AmaterasuGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = AmaterasuGUIGui.guistate;

	public AmaterasuGUIGuiWindow(AmaterasuGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/amaterasu_gui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjacard2.png"));
		this.blit(ms, this.guiLeft + -38, this.guiTop + -11, 0, 0, 256, 256, 256, 256);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjacardtop.png"));
		this.blit(ms, this.guiLeft + -38, this.guiTop + -29, 0, 0, 256, 256, 256, 256);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/sasukemangeko.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 106, 0, 0, 64, 64, 64, 64);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/uchiha.png"));
		this.blit(ms, this.guiLeft + 186, this.guiTop + -2, 0, 0, 24, 32, 24, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/sasukemangeko.png"));
		this.blit(ms, this.guiLeft + 78, this.guiTop + 106, 0, 0, 64, 64, 64, 64);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Amaterasu Jutsu", -29, -2, -16777216);
		this.font.drawString(ms, "Requirements", -29, 16, -13421773);
		this.font.drawString(ms, "Requires: Sasuke Mangekyo Sharingan ON", -29, 25, -12829636);
		this.font.drawString(ms, "Amaterasu-Normal", -29, 43, -16777216);
		this.font.drawString(ms, "Jutsu Combo: 401", -29, 52, -12829636);
		this.font.drawString(ms, "Amaterasu Ball", 87, 43, -16777216);
		this.font.drawString(ms, "Jutsu Combo: 402", 87, 52, -12829636);
		this.font.drawString(ms, "100 Chakra", -29, 61, -12829636);
		this.font.drawString(ms, "300 Chakra", 87, 61, -12829636);
		this.font.drawString(ms, "Get Rid of Amaterasu Flames", 15, 79, -16777216);
		this.font.drawString(ms, "Jutsu Combo: 400", 15, 88, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 168, this.guiTop + 151, 45, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new AmaterasuGUIGui.ButtonPressedMessage(0, x, y, z));
				AmaterasuGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
