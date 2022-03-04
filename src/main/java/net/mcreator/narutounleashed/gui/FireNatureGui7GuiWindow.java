
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

import net.mcreator.narutounleashed.procedures.BurningAshCloudLearntTextProcedure;
import net.mcreator.narutounleashed.procedures.BlazingRedCannonLearntTextProcedure;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FireNatureGui7GuiWindow extends ContainerScreen<FireNatureGui7Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = FireNatureGui7Gui.guistate;

	public FireNatureGui7GuiWindow(FireNatureGui7Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("naruto_unleashed:textures/fire_nature_gui_7.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/fire_release.png"));
		this.blit(ms, this.guiLeft + 141, this.guiTop + -2, 0, 0, 64, 64, 64, 64);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/firechakrabomb.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 52, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/fireshuriken.png"));
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
		this.font.drawString(ms, "Fire Nature", -29, -2, -6750208);
		this.font.drawString(ms, "Jutsu", -29, 25, -12829636);
		this.font.drawString(ms, "Burning Ash Cloud Jutsu", -29, 43, -3407872);
		this.font.drawString(ms, "Page 7", -29, 160, -16777216);
		this.font.drawString(ms, "1350 Jutsu Points", -11, 52, -3394816);
		this.font.drawString(ms, "Jutsu Combo: 64", -11, 61, -26368);
		this.font.drawString(ms, "64", -29, 70, -12829636);
		this.font.drawString(ms, "450 Chakra", -2, 70, -3381760);
		if (BurningAshCloudLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 6, 88, -12829636);
		this.font.drawString(ms, "Requires: Ninjutsu 85", -29, 79, -12829636);
		this.font.drawString(ms, "Jutsu Points:", -29, 16, -7536126);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuPoints) + "", 42, 16, -10092287);
		this.font.drawString(ms, "Blazing Red Cannon Jutsu", 87, 70, -10092544);
		this.font.drawString(ms, "50 Jutsu Points", 105, 79, -3407872);
		this.font.drawString(ms, "Jutsu Combo: 567", 105, 88, -39424);
		this.font.drawString(ms, "567", 87, 97, -12829636);
		this.font.drawString(ms, "15 Chakra", 114, 97, -52480);
		this.font.drawString(ms, "Requires: 4 Ninjutsu", 87, 106, -12829636);
		if (BlazingRedCannonLearntTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Learnt", 123, 115, -12829636);
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
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new FireNatureGui7Gui.ButtonPressedMessage(0, x, y, z));
				FireNatureGui7Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 141, this.guiTop + 151, 30, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new FireNatureGui7Gui.ButtonPressedMessage(1, x, y, z));
				FireNatureGui7Gui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 87, this.guiTop + 115, 30, 20, new StringTextComponent("Learn"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new FireNatureGui7Gui.ButtonPressedMessage(2, x, y, z));
				FireNatureGui7Gui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 177, this.guiTop + 151, 30, 20, new StringTextComponent("Next"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new FireNatureGui7Gui.ButtonPressedMessage(3, x, y, z));
				FireNatureGui7Gui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
