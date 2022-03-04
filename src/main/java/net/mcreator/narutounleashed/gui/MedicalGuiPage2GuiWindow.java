
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

import net.mcreator.narutounleashed.procedures.BodyHealerLearntTextProcedure;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MedicalGuiPage2GuiWindow extends ContainerScreen<MedicalGuiPage2Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = MedicalGuiPage2Gui.guistate;

	public MedicalGuiPage2GuiWindow(MedicalGuiPage2Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/medical_gui_page_2.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/medicaljutsu.png"));
		this.blit(ms, this.guiLeft + 177, this.guiTop + -2, 0, 0, 32, 32, 32, 32);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/body_healer_jutsu.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 52, 0, 0, 16, 16, 16, 16);

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
		this.font.drawString(ms, "Medical", -29, -2, -3665978);
		this.font.drawString(ms, "Jutsu", -29, 25, -12829636);
		this.font.drawString(ms, "Body Healer", -29, 43, -3470385);
		this.font.drawString(ms, "500 Jutsu Points", -11, 52, -5432921);
		this.font.drawString(ms, "Jutsu Combo: 312", -11, 61, -4123679);
		this.font.drawString(ms, "312", -29, 70, -12829636);
		this.font.drawString(ms, "200 Chakra", -2, 70, -1939469);
		this.font.drawString(ms, "Requires: 28 Medical", -29, 79, -12829636);
		if (BodyHealerLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 6, 88, -12829636);
		this.font.drawString(ms, "Page 2", -29, 160, -16777216);
		this.font.drawString(ms, "Jutsu Points:", -29, 16, -16777216);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuPoints) + "", 42, 16, -16777216);
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
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MedicalGuiPage2Gui.ButtonPressedMessage(0, x, y, z));
				MedicalGuiPage2Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 177, this.guiTop + 151, 30, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new MedicalGuiPage2Gui.ButtonPressedMessage(1, x, y, z));
				MedicalGuiPage2Gui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
