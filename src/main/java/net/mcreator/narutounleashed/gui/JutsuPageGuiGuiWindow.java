
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

import net.mcreator.narutounleashed.procedures.YinYangReleaseUnlockedProcedure;
import net.mcreator.narutounleashed.procedures.YinReleaseUnlockProcedure;
import net.mcreator.narutounleashed.procedures.YangReleaseUnlockedProcedure;
import net.mcreator.narutounleashed.procedures.WindReleaseUnlockedProcedure;
import net.mcreator.narutounleashed.procedures.WaterReleaseUnlockedProcedure;
import net.mcreator.narutounleashed.procedures.LightningReleaseUnlockedProcedure;
import net.mcreator.narutounleashed.procedures.FireReleaseUnlockedProcedure;
import net.mcreator.narutounleashed.procedures.EarthReleaseUnlockedProcedure;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class JutsuPageGuiGuiWindow extends ContainerScreen<JutsuPageGuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = JutsuPageGuiGui.guistate;

	public JutsuPageGuiGuiWindow(JutsuPageGuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/jutsu_page_gui.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjacard2.png"));
		this.blit(ms, this.guiLeft + -38, this.guiTop + 12, 0, 0, 256, 256, 256, 256);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/fire_release.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 16, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/water_release.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 52, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/lightning_release.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 88, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/wind_release.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 124, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/earth_release.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 160, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/other_jutsu-.png"));
		this.blit(ms, this.guiLeft + 96, this.guiTop + 16, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/yin_release.png"));
		this.blit(ms, this.guiLeft + 96, this.guiTop + 52, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/yang_release.png"));
		this.blit(ms, this.guiLeft + 96, this.guiTop + 88, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/yin-yang_release.png"));
		this.blit(ms, this.guiLeft + 96, this.guiTop + 124, 0, 0, 32, 32, 32, 32);

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
		this.font.drawString(ms, "Jutsu", -29, -2, -16777216);
		this.font.drawString(ms, "Fire Nature", 6, 25, -6750208);
		this.font.drawString(ms, "Water Nature", 6, 61, -16777114);
		this.font.drawString(ms, "Lightning Nature", 6, 97, -256);
		this.font.drawString(ms, "Wind Nature", 6, 133, -6697729);
		this.font.drawString(ms, "Earth Nature", 6, 169, -6724096);
		this.font.drawString(ms, "Other Jutsu", 132, 25, -12829636);
		this.font.drawString(ms, "28 Jutsus", 51, 34, -12829636);
		this.font.drawString(ms, "22 Jutsus", 51, 70, -12829636);
		this.font.drawString(ms, "20 Jutsus", 51, 106, -12829636);
		this.font.drawString(ms, "32 Jutsus", 51, 142, -12829636);
		this.font.drawString(ms, "29 Jutsus", 51, 178, -12829636);
		this.font.drawString(ms, "6 Jutsus", 168, 34, -12829636);
		if (FireReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 51, 43, -12829636);
		if (WaterReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 51, 79, -12829636);
		if (LightningReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 51, 115, -12829636);
		if (WindReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 51, 151, -12829636);
		if (EarthReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 51, 187, -12829636);
		this.font.drawString(ms, "Yin Release", 132, 61, -16777216);
		this.font.drawString(ms, "Yang Release", 132, 97, -1);
		this.font.drawString(ms, "Yin", 132, 133, -16777216);
		this.font.drawString(ms, "Yang", 150, 133, -1);
		this.font.drawString(ms, "Release", 177, 133, -12829636);
		this.font.drawString(ms, "1 Jutsu", 168, 70, -12829636);
		if (YinReleaseUnlockProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 168, 79, -12829636);
		if (YangReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 168, 115, -12829636);
		if (YinYangReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 168, 151, -12829636);
		this.font.drawString(ms, "1 Jutsu", 168, 106, -12829636);
		this.font.drawString(ms, "1 Jutsu", 168, 142, -12829636);
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
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 34, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPageGuiGui.ButtonPressedMessage(0, x, y, z));
				JutsuPageGuiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 70, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPageGuiGui.ButtonPressedMessage(1, x, y, z));
				JutsuPageGuiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 106, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPageGuiGui.ButtonPressedMessage(2, x, y, z));
				JutsuPageGuiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 142, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPageGuiGui.ButtonPressedMessage(3, x, y, z));
				JutsuPageGuiGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 178, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPageGuiGui.ButtonPressedMessage(4, x, y, z));
				JutsuPageGuiGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 132, this.guiTop + 34, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPageGuiGui.ButtonPressedMessage(5, x, y, z));
				JutsuPageGuiGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 132, this.guiTop + 70, 35, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPageGuiGui.ButtonPressedMessage(6, x, y, z));
				JutsuPageGuiGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 132, this.guiTop + 106, 35, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPageGuiGui.ButtonPressedMessage(7, x, y, z));
				JutsuPageGuiGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 132, this.guiTop + 142, 35, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPageGuiGui.ButtonPressedMessage(8, x, y, z));
				JutsuPageGuiGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 177, this.guiTop + 169, 30, 20, new StringTextComponent("Next"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPageGuiGui.ButtonPressedMessage(9, x, y, z));
				JutsuPageGuiGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
	}
}
