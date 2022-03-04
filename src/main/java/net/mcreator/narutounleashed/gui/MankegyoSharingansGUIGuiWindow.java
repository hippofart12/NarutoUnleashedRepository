
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
public class MankegyoSharingansGUIGuiWindow extends ContainerScreen<MankegyoSharingansGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = MankegyoSharingansGUIGui.guistate;

	public MankegyoSharingansGUIGuiWindow(MankegyoSharingansGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/mankegyo_sharingans_gui.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/uchiha.png"));
		this.blit(ms, this.guiLeft + 186, this.guiTop + -2, 0, 0, 24, 32, 24, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/sasukemangshar.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 70, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/itachims.png"));
		this.blit(ms, this.guiLeft + 15, this.guiTop + 70, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/obitoms.png"));
		this.blit(ms, this.guiLeft + 60, this.guiTop + 70, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/mms2.png"));
		this.blit(ms, this.guiLeft + 105, this.guiTop + 70, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ims.png"));
		this.blit(ms, this.guiLeft + 150, this.guiTop + 70, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/shisuims.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 142, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/indramangshar.png"));
		this.blit(ms, this.guiLeft + 15, this.guiTop + 142, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/shinmang.png"));
		this.blit(ms, this.guiLeft + 60, this.guiTop + 142, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/truesightms1.png"));
		this.blit(ms, this.guiLeft + 105, this.guiTop + 142, 0, 0, 16, 16, 16, 16);

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
		this.font.drawString(ms, "Mangekyo Sharingans", -29, -2, -65536);
		this.font.drawString(ms, "Sasuke", -29, 25, -65536);
		this.font.drawString(ms, "Itachi", 15, 25, -65536);
		this.font.drawString(ms, "Obito", 60, 25, -65536);
		this.font.drawString(ms, "Shisui", -29, 97, -65536);
		this.font.drawString(ms, "Indra", 15, 97, -65536);
		this.font.drawString(ms, "Madara", 105, 25, -65536);
		this.font.drawString(ms, "Izuna", 150, 25, -65536);
		this.font.drawString(ms, "Shin", 60, 97, -65536);
		this.font.drawString(ms, "True Sight", 105, 97, -65536);
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
		this.addButton(new Button(this.guiLeft + -29, this.guiTop + 43, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MankegyoSharingansGUIGui.ButtonPressedMessage(0, x, y, z));
				MankegyoSharingansGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 177, this.guiTop + 151, 30, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MankegyoSharingansGUIGui.ButtonPressedMessage(1, x, y, z));
				MankegyoSharingansGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 43, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MankegyoSharingansGUIGui.ButtonPressedMessage(2, x, y, z));
				MankegyoSharingansGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 60, this.guiTop + 43, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MankegyoSharingansGUIGui.ButtonPressedMessage(3, x, y, z));
				MankegyoSharingansGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 105, this.guiTop + 43, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MankegyoSharingansGUIGui.ButtonPressedMessage(4, x, y, z));
				MankegyoSharingansGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 150, this.guiTop + 43, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MankegyoSharingansGUIGui.ButtonPressedMessage(5, x, y, z));
				MankegyoSharingansGUIGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -29, this.guiTop + 115, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MankegyoSharingansGUIGui.ButtonPressedMessage(6, x, y, z));
				MankegyoSharingansGUIGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 115, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MankegyoSharingansGUIGui.ButtonPressedMessage(7, x, y, z));
				MankegyoSharingansGUIGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 60, this.guiTop + 115, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MankegyoSharingansGUIGui.ButtonPressedMessage(8, x, y, z));
				MankegyoSharingansGUIGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 105, this.guiTop + 115, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MankegyoSharingansGUIGui.ButtonPressedMessage(9, x, y, z));
				MankegyoSharingansGUIGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
	}
}
