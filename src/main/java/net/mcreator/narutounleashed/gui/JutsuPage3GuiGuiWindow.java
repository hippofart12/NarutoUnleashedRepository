
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

import net.mcreator.narutounleashed.procedures.TyphoonReleaseUnlockTextProcedure;
import net.mcreator.narutounleashed.procedures.SwiftReleaseUnlockTextProcedure;
import net.mcreator.narutounleashed.procedures.StormReleaseUnlockTextProcedure;
import net.mcreator.narutounleashed.procedures.SteelReleaseUnlockTextProcedure;
import net.mcreator.narutounleashed.procedures.MudReleaseUnlockedTextProcedure;
import net.mcreator.narutounleashed.procedures.DustReleaseUnlockedTextProcedure;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class JutsuPage3GuiGuiWindow extends ContainerScreen<JutsuPage3GuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = JutsuPage3GuiGui.guistate;

	public JutsuPage3GuiGuiWindow(JutsuPage3GuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/jutsu_page_3_gui.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/dust_release.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 16, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/mud_release.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 52, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/steel_release.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 88, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/storm_release.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 124, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/swift_release.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 160, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/typhoonrelease.png"));
		this.blit(ms, this.guiLeft + 96, this.guiTop + 16, 0, 0, 32, 32, 32, 32);

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
		this.font.drawString(ms, "Dust Release", 6, 25, -3835125);
		this.font.drawString(ms, "Mud Release", 6, 61, -10998524);
		this.font.drawString(ms, "Steel Release", 6, 97, -11119018);
		this.font.drawString(ms, "Storm Release", 6, 133, -15530835);
		this.font.drawString(ms, "Swift Release", 6, 169, -22528);
		this.font.drawString(ms, "Typhoon Release", 132, 25, -16711613);
		this.font.drawString(ms, "1 Jutsus", 51, 34, -12829636);
		this.font.drawString(ms, "2 Jutsus", 51, 70, -12829636);
		this.font.drawString(ms, "2 Jutsus", 51, 106, -12829636);
		this.font.drawString(ms, "2 Jutsus", 51, 142, -12829636);
		this.font.drawString(ms, "1 Jutsus", 51, 178, -12829636);
		this.font.drawString(ms, "2 Jutsus", 168, 34, -12829636);
		if (DustReleaseUnlockedTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 51, 43, -12829636);
		if (MudReleaseUnlockedTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 51, 79, -12829636);
		if (SteelReleaseUnlockTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 51, 115, -12829636);
		if (StormReleaseUnlockTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 51, 151, -12829636);
		if (SwiftReleaseUnlockTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 51, 187, -12829636);
		if (TyphoonReleaseUnlockTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Unlocked", 168, 43, -12829636);
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
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPage3GuiGui.ButtonPressedMessage(0, x, y, z));
				JutsuPage3GuiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 70, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPage3GuiGui.ButtonPressedMessage(1, x, y, z));
				JutsuPage3GuiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 106, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPage3GuiGui.ButtonPressedMessage(2, x, y, z));
				JutsuPage3GuiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 142, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPage3GuiGui.ButtonPressedMessage(3, x, y, z));
				JutsuPage3GuiGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 178, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPage3GuiGui.ButtonPressedMessage(4, x, y, z));
				JutsuPage3GuiGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 132, this.guiTop + 34, 30, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPage3GuiGui.ButtonPressedMessage(5, x, y, z));
				JutsuPage3GuiGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 177, this.guiTop + 169, 30, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new JutsuPage3GuiGui.ButtonPressedMessage(6, x, y, z));
				JutsuPage3GuiGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
	}
}
