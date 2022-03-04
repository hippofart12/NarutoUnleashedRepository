
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

import net.mcreator.narutounleashed.procedures.WaterBladeLearntTextProcedure;
import net.mcreator.narutounleashed.procedures.DisguiseJutsuLearntTextProcedure;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BodyTechniquesGuiGuiWindow extends ContainerScreen<BodyTechniquesGuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = BodyTechniquesGuiGui.guistate;

	public BodyTechniquesGuiGuiWindow(BodyTechniquesGuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/body_techniques_gui.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/bodytechniquebody.png"));
		this.blit(ms, this.guiLeft + 177, this.guiTop + -2, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/disguisejutsu.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 52, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/waterbladetechnique.png"));
		this.blit(ms, this.guiLeft + 87, this.guiTop + 79, 0, 0, 16, 16, 16, 16);

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
		this.font.drawString(ms, "Body Techniques", -29, -2, -16777216);
		this.font.drawString(ms, "Jutsu", -29, 25, -12829636);
		this.font.drawString(ms, "Page 1", -29, 160, -16777216);
		this.font.drawString(ms, "Jutsu Points:", -29, 16, -16777216);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuPoints) + "", 42, 16, -16777216);
		this.font.drawString(ms, "Disguise Jutsu", -29, 43, -12829636);
		this.font.drawString(ms, "250 Jutsu Points", -11, 52, -13684945);
		this.font.drawString(ms, "Jutsu Combo: 110", -11, 61, -11579569);
		this.font.drawString(ms, "110", -29, 70, -12829636);
		this.font.drawString(ms, "50 Chakra", -2, 70, -10921639);
		this.font.drawString(ms, "Requires: Nintaijutsu 5", -29, 79, -12829636);
		this.font.drawString(ms, "Ninjutsu 2", -29, 88, -12829636);
		if (DisguiseJutsuLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 6, 97, -12829636);
		this.font.drawString(ms, "Water Blade Technique", 87, 70, -16764007);
		this.font.drawString(ms, "450 Jutsu Points", 105, 79, -16777012);
		this.font.drawString(ms, "Jutsu Combo: 23", 105, 88, -16750849);
		this.font.drawString(ms, "23", 87, 97, -12829636);
		this.font.drawString(ms, "150 Chakra", 114, 97, -16776961);
		this.font.drawString(ms, "Requires: Nintaijutsu 25", 87, 106, -12829636);
		this.font.drawString(ms, "Ninjutsu 15", 87, 115, -12829636);
		this.font.drawString(ms, "Water Release Unlocked", 87, 124, -12829636);
		if (WaterBladeLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 123, 133, -12829636);
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
		this.addButton(new Button(this.guiLeft + -29, this.guiTop + 97, 30, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new BodyTechniquesGuiGui.ButtonPressedMessage(0, x, y, z));
				BodyTechniquesGuiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 177, this.guiTop + 151, 30, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new BodyTechniquesGuiGui.ButtonPressedMessage(1, x, y, z));
				BodyTechniquesGuiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 87, this.guiTop + 133, 30, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new BodyTechniquesGuiGui.ButtonPressedMessage(2, x, y, z));
				BodyTechniquesGuiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
