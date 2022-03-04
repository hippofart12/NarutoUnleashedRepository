
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

import net.mcreator.narutounleashed.procedures.SasukeSusanooSkeletalLearntTextProcedure;
import net.mcreator.narutounleashed.procedures.SasukeSusanooCageLearntTextProcedure;
import net.mcreator.narutounleashed.procedures.SasukeSusanooArmoredLearntTextProcedure;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SasukeSusanooGuiGuiWindow extends ContainerScreen<SasukeSusanooGuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = SasukeSusanooGuiGui.guistate;

	public SasukeSusanooGuiGuiWindow(SasukeSusanooGuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/sasuke_susanoo_gui.png");

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
		this.font.drawString(ms, "Sasuke Susanoo", -29, -2, -16777216);
		this.font.drawString(ms, "Requirements", -29, 16, -13421773);
		this.font.drawString(ms, "Requires: Sasuke Mangekyo Sharingan ON,", -29, 25, -12829636);
		this.font.drawString(ms, "Susanoo Cage", -29, 52, -16777216);
		this.font.drawString(ms, "5000 Jutsu Points", -29, 61, -16777216);
		this.font.drawString(ms, "Susanoo Skeletal", -29, 79, -16777216);
		this.font.drawString(ms, "7500 Jutsu Points", -29, 88, -16777216);
		this.font.drawString(ms, "Previous Susanoo Form", -29, 34, -12829636);
		if (SasukeSusanooCageLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 96, 52, -12829636);
		if (SasukeSusanooSkeletalLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 96, 79, -12829636);
		this.font.drawString(ms, "Susanoo Armored", 132, 52, -16777216);
		this.font.drawString(ms, "15000 Jutsu Points", 123, 61, -16777216);
		if (SasukeSusanooArmoredLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 177, 70, -12829636);
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
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new SasukeSusanooGuiGui.ButtonPressedMessage(0, x, y, z));
				SasukeSusanooGuiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 60, this.guiTop + 52, 30, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new SasukeSusanooGuiGui.ButtonPressedMessage(1, x, y, z));
				SasukeSusanooGuiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 60, this.guiTop + 79, 30, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new SasukeSusanooGuiGui.ButtonPressedMessage(2, x, y, z));
				SasukeSusanooGuiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 141, this.guiTop + 70, 30, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new SasukeSusanooGuiGui.ButtonPressedMessage(3, x, y, z));
				SasukeSusanooGuiGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
