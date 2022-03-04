
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
import net.mcreator.narutounleashed.procedures.UzumakiClanTextOnProcedure;
import net.mcreator.narutounleashed.procedures.UchihajoinedtextProcedure;
import net.mcreator.narutounleashed.procedures.PLB9Procedure;
import net.mcreator.narutounleashed.procedures.PLB8Procedure;
import net.mcreator.narutounleashed.procedures.PLB7Procedure;
import net.mcreator.narutounleashed.procedures.PLB6Procedure;
import net.mcreator.narutounleashed.procedures.PLB5Procedure;
import net.mcreator.narutounleashed.procedures.PLB4Procedure;
import net.mcreator.narutounleashed.procedures.PLB3Procedure;
import net.mcreator.narutounleashed.procedures.PLB2Procedure;
import net.mcreator.narutounleashed.procedures.PLB1Procedure;
import net.mcreator.narutounleashed.procedures.PLB16Procedure;
import net.mcreator.narutounleashed.procedures.PLB15Procedure;
import net.mcreator.narutounleashed.procedures.PLB14Procedure;
import net.mcreator.narutounleashed.procedures.PLB13Procedure;
import net.mcreator.narutounleashed.procedures.PLB12Procedure;
import net.mcreator.narutounleashed.procedures.PLB11Procedure;
import net.mcreator.narutounleashed.procedures.PLB10Procedure;
import net.mcreator.narutounleashed.procedures.NoClanTextProcedure;
import net.mcreator.narutounleashed.procedures.LightningReleaseUnlockedProcedure;
import net.mcreator.narutounleashed.procedures.KageTextProcedure;
import net.mcreator.narutounleashed.procedures.JouninTextProcedure;
import net.mcreator.narutounleashed.procedures.GeninTextProcedure;
import net.mcreator.narutounleashed.procedures.FireReleaseUnlockedProcedure;
import net.mcreator.narutounleashed.procedures.EarthReleaseUnlockedProcedure;
import net.mcreator.narutounleashed.procedures.ChuuninTextProcedure;
import net.mcreator.narutounleashed.procedures.AcademyStudentTextProcedure;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NinjaStatsGUIGuiWindow extends ContainerScreen<NinjaStatsGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = NinjaStatsGUIGui.guistate;

	public NinjaStatsGUIGuiWindow(NinjaStatsGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjacard2.png"));
		this.blit(ms, this.guiLeft + -38, this.guiTop + -11, 0, 0, 256, 256, 256, 256);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjacardtop.png"));
		this.blit(ms, this.guiLeft + -38, this.guiTop + -29, 0, 0, 256, 256, 256, 256);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/bukijutsuscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 52, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/genjutsuscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 25, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/hidenscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 70, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/shurikenjutsuscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 43, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/taijutsuscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 16, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/kenjutsuscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 61, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/scroll_-_stat_points.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 34, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/ninjutsuscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 7, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/kinjutsuscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 79, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/medicaljutsuscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 88, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/nintaijutsuscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 97, 0, 0, 8, 8, 8, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/senjutsuscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 106, 0, 0, 8, 8, 8, 8);

		if (FireReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/fire.png"));
			this.blit(ms, this.guiLeft + 114, this.guiTop + 43, 0, 0, 256, 256, 256, 256);
		}
		if (WaterReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/water.png"));
			this.blit(ms, this.guiLeft + 141, this.guiTop + 43, 0, 0, 256, 256, 256, 256);
		}
		if (WindReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/wind.png"));
			this.blit(ms, this.guiLeft + 168, this.guiTop + 43, 0, 0, 256, 256, 256, 256);
		}
		if (LightningReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/lightning.png"));
			this.blit(ms, this.guiLeft + 114, this.guiTop + 70, 0, 0, 256, 256, 256, 256);
		}
		if (EarthReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/earth.png"));
			this.blit(ms, this.guiLeft + 141, this.guiTop + 70, 0, 0, 256, 256, 256, 256);
		}
		if (PLB16Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_16.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB15Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_15.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB14Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_14.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB13Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_13.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB12Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_12.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB11Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_11.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB10Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_10.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB9Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_9.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB8Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_8.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB7Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_7.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB6Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_6.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB5Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_5.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB4Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_4.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB3Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_3.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_2.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_1.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (PLB1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/level_bar_empty.png"));
			this.blit(ms, this.guiLeft + -29, this.guiTop + 133, 0, 0, 64, 16, 64, 16);
		}
		if (YinReleaseUnlockProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/yin_release.png"));
			this.blit(ms, this.guiLeft + 168, this.guiTop + 70, 0, 0, 32, 32, 32, 32);
		}
		if (YangReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/yang_release.png"));
			this.blit(ms, this.guiLeft + 114, this.guiTop + 97, 0, 0, 32, 32, 32, 32);
		}
		if (YinYangReleaseUnlockedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/yin-yang_release.png"));
			this.blit(ms, this.guiLeft + 150, this.guiTop + 97, 0, 0, 32, 32, 32, 32);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naruto_unleashed:textures/summoningscroll.png"));
		this.blit(ms, this.guiLeft + -29, this.guiTop + 115, 0, 0, 8, 8, 8, 8);

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
		this.font.drawString(ms, "Ninja Stats", 69, -2, -16777216);
		this.font.drawString(ms, "Max Chakra:", -20, 34, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraMax) + "", 39, 34, -13421773);
		this.font.drawString(ms, "Shurikenjutsu:", -20, 43, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Shurikenjutsu) + "", 52, 43, -13421773);
		this.font.drawString(ms, "Ninjutsu:", -20, 7, -13421773);
		this.font.drawString(ms, "Taijutsu:", -20, 16, -13421773);
		this.font.drawString(ms, "Genjutsu:", -20, 25, -13421773);
		this.font.drawString(ms, "Bukijutsu:", -20, 52, -13421773);
		this.font.drawString(ms, "Kenjutsu:", -20, 61, -13421773);
		this.font.drawString(ms, "Hiden:", -20, 70, -13421773);
		this.font.drawString(ms, "Kinjutsu:", -20, 79, -13421773);
		this.font.drawString(ms, "Medicaljutsu:", -20, 88, -13421773);
		this.font.drawString(ms, "Nintaijutsu:", -20, 97, -13421773);
		this.font.drawString(ms, "Senjutsu:", -20, 106, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu) + "", 24, 7, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Taijutsu) + "", 24, 16, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Genjutsu) + "", 29, 25, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Bukijutsu) + "", 32, 52, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Kenjutsu) + "", 29, 61, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).hiden) + "", 9, 70, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).medical) + "", 47, 88, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Kinjutsu) + "", 27, 79, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Nintaijutsu) + "", 40, 97, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Senjutsu) + "", 24, 106, -13421773);
		this.font.drawString(ms, "Clan:", 114, 7, -16777216);
		if (NoClanTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "None", 141, 7, -16777216);
		this.font.drawString(ms, "Affiliation:", 114, 16, -16777216);
		if (NoClanTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "None", 177, 16, -16777216);
		if (UchihajoinedtextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Uchiha", 141, 7, -16777216);
		this.font.drawString(ms, "Chakra Releases", 114, 34, -16777216);
		this.font.drawString(ms, "Level:", -29, 124, -16777216);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).PlayerLevel) + "", 6, 124, -16777216);
		this.font.drawString(ms, "Level Up Points", 114, 124, -16777216);
		this.font.drawString(ms, "Rank:", 114, 25, -16777216);
		if (GeninTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Genin", 141, 25, -16777216);
		if (AcademyStudentTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Academy Student", 141, 25, -16777216);
		if (ChuuninTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Chuunin", 141, 25, -16777216);
		if (JouninTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Jounin", 141, 25, -16777216);
		if (KageTextProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Kage", 141, 25, -16777216);
		if (UzumakiClanTextOnProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Uzumaki", 141, 7, -16777216);
		this.font.drawString(ms, "Summoning:", -20, 115, -13421773);
		this.font.drawString(ms, "" + (int) ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Summoning) + "", 33, 115, -13421773);
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
		this.addButton(new Button(this.guiLeft + 132, this.guiTop + 133, 35, 20, new StringTextComponent("Go"), e -> {
			if (true) {
				NarutoUnleashedMod.PACKET_HANDLER.sendToServer(new NinjaStatsGUIGui.ButtonPressedMessage(0, x, y, z));
				NinjaStatsGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
