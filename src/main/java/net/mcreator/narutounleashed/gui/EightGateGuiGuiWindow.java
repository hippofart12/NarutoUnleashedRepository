
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

import net.mcreator.narutounleashed.procedures.EighthGateLearntTextProcedure;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EightGateGuiGuiWindow extends ContainerScreen<EightGateGuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = EightGateGuiGui.guistate;

	public EightGateGuiGuiWindow(EightGateGuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/eight_gate_gui.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/8_gates_body.png"));
		this.blit(ms, this.guiLeft + 177, this.guiTop + -2, 0, 0, 32, 32, 32, 32);

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
		this.font.drawString(ms, "The Gate Of Death", -29, -2, -6750208);
		this.font.drawString(ms, "Jutsu", -29, 25, -12829636);
		this.font.drawString(ms, "Jutsu Points:", -29, 16, -16777216);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuPoints) + "", 42, 16, -16777216);
		this.font.drawString(ms, "Requirements: 300 Taijutsu", -29, 43, -12829636);
		this.font.drawString(ms, "Cost: 20000 Jutsu Points", -29, 61, -12829636);
		this.font.drawString(ms, "Front Locus", -29, 88, -15375613);
		this.font.drawString(ms, "Can be Used with any Gates Open", -29, 97, -15240697);
		if (EighthGateLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 168, 52, -12829636);
		this.font.drawString(ms, "Reverse Lotus", -29, 115, -16751104);
		this.font.drawString(ms, "Can Be Used 3-8 Gates", -29, 124, -16751104);
		this.font.drawString(ms, "Morning Peacock", 69, 106, -16751104);
		this.font.drawString(ms, "Can Be Used 6-8 Gates", 69, 115, -16751104);
		this.font.drawString(ms, "DaytimeTiger", 69, 133, -16724788);
		this.font.drawString(ms, "Can Be Used 7-8 Gates", 69, 142, -16724788);
		this.font.drawString(ms, "Evening Elephant", -29, 142, -6750208);
		this.font.drawString(ms, "Can Be Used 8 Gate", -29, 151, -6750208);
		this.font.drawString(ms, "Night Guy", 69, 151, -6750208);
		this.font.drawString(ms, "Can Be Used 8 Gates", 69, 160, -6750208);
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
		this.addButton(new Button(this.guiLeft + 177, this.guiTop + 151, 30, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new EightGateGuiGui.ButtonPressedMessage(0, x, y, z));
				EightGateGuiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 114, this.guiTop + 52, 50, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new EightGateGuiGui.ButtonPressedMessage(1, x, y, z));
				EightGateGuiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
