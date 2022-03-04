
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

import net.mcreator.narutounleashed.procedures.TunnelTechniqueLearntTextProcedure;
import net.mcreator.narutounleashed.procedures.StoneTrapLearntTextProcedure;
import net.mcreator.narutounleashed.procedures.RockShelterLearntTextProcedure;
import net.mcreator.narutounleashed.procedures.RockRainBoulderLearntTextProcedure;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EarthNatureGuiGuiWindow extends ContainerScreen<EarthNatureGuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = EarthNatureGuiGui.guistate;

	public EarthNatureGuiGuiWindow(EarthNatureGuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/earth_nature_gui.png");

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
		this.blit(ms, this.guiLeft + 168, this.guiTop + 52, 0, 0, 128, 128, 128, 128);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjacardtop.png"));
		this.blit(ms, this.guiLeft + 40, this.guiTop + 32, 0, 0, 256, 256, 256, 256);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjacard2.png"));
		this.blit(ms, this.guiLeft + -119, this.guiTop + 70, 0, 0, 128, 128, 128, 128);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjacardtop.png"));
		this.blit(ms, this.guiLeft + -119, this.guiTop + 52, 0, 0, 256, 256, 256, 256);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjacard2.png"));
		this.blit(ms, this.guiLeft + -38, this.guiTop + -11, 0, 0, 256, 256, 256, 256);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjacardtop.png"));
		this.blit(ms, this.guiLeft + -38, this.guiTop + -29, 0, 0, 256, 256, 256, 256);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/earth_release.png"));
		this.blit(ms, this.guiLeft + 141, this.guiTop + -2, 0, 0, 64, 64, 64, 64);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/rockshelterjutsu.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 52, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/tunneltechniquejutsu.png"));
		this.blit(ms, this.guiLeft + 87, this.guiTop + 79, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/stonetrap.png"));
		this.blit(ms, this.guiLeft + -56, this.guiTop + 79, 0, 0, 16, 16, 16, 16);

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
		this.font.drawString(ms, "Earth Nature", -29, -2, -12640255);
		this.font.drawString(ms, "Jutsu", -29, 25, -12829636);
		this.font.drawString(ms, "Page 1", -29, 160, -16777216);
		this.font.drawString(ms, "Rock Shelter", -29, 43, -7589376);
		this.font.drawString(ms, "600 Jutsu Points", -11, 52, -10274033);
		this.font.drawString(ms, "Jutsu Combo: 101", -11, 61, -7779311);
		this.font.drawString(ms, "101", -29, 70, -12829636);
		this.font.drawString(ms, "100 Chakra", -2, 70, -13429248);
		if (RockShelterLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 6, 88, -12829636);
		this.font.drawString(ms, "Tunnel Technique Jutsu", 87, 70, -9619709);
		this.font.drawString(ms, "Requires: 6 Ninjutsu", -29, 79, -12829636);
		this.font.drawString(ms, "Jutsu Combo: 13", 105, 88, -13032697);
		this.font.drawString(ms, "150 Jutsu Points", 105, 79, -6862336);
		this.font.drawString(ms, "13", 87, 97, -12829636);
		this.font.drawString(ms, "50 Chakra", 114, 97, -11654641);
		this.font.drawString(ms, "Requires: 5 Ninjutsu", 87, 106, -12829636);
		if (TunnelTechniqueLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 123, 115, -12829636);
		this.font.drawString(ms, "Jutsu Points:", -29, 16, -10476285);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuPoints) + "", 42, 16, -13298683);
		this.font.drawString(ms, "Stone Trap", -110, 79, -7911932);
		this.font.drawString(ms, "400 Jutsu", -110, 88, -10076159);
		this.font.drawString(ms, "points", -110, 97, -7124992);
		this.font.drawString(ms, "2", -47, 97, -12829636);
		this.font.drawString(ms, "180 Chakra", -110, 106, -8696576);
		this.font.drawString(ms, "Requires:", -110, 115, -12829636);
		this.font.drawString(ms, "5 Ninjutsu", -110, 124, -12829636);
		if (StoneTrapLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", -74, 133, -12829636);
		this.font.drawString(ms, "Rock Rain Boulder Jutsu", 222, 61, -9290752);
		this.font.drawString(ms, "1300 Jutsu Points", 222, 70, -11194624);
		this.font.drawString(ms, "626", 276, 79, -12829636);
		this.font.drawString(ms, "300 Chakra", 222, 79, -5938674);
		this.font.drawString(ms, "Requires:", 222, 88, -12829636);
		this.font.drawString(ms, "65 Ninjutsu", 222, 97, -12829636);
		if (RockRainBoulderLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 258, 106, -12829636);
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
		this.addButton(new Button(this.guiLeft + -29, this.guiTop + 88, 30, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new EarthNatureGuiGui.ButtonPressedMessage(0, x, y, z));
				EarthNatureGuiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 87, this.guiTop + 115, 30, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new EarthNatureGuiGui.ButtonPressedMessage(1, x, y, z));
				EarthNatureGuiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 141, this.guiTop + 151, 30, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new EarthNatureGuiGui.ButtonPressedMessage(2, x, y, z));
				EarthNatureGuiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 177, this.guiTop + 151, 30, 20, new StringTextComponent("Next"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new EarthNatureGuiGui.ButtonPressedMessage(3, x, y, z));
				EarthNatureGuiGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -110, this.guiTop + 133, 30, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new EarthNatureGuiGui.ButtonPressedMessage(4, x, y, z));
				EarthNatureGuiGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 222, this.guiTop + 106, 30, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new EarthNatureGuiGui.ButtonPressedMessage(5, x, y, z));
				EarthNatureGuiGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
	}
}
