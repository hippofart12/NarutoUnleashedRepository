package net.mcreator.narutounleashed.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class UnlockAllJutsuCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure UnlockAllJutsuCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WaterJutsuBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.DisguiseJutsuBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WaterShurikenJutsuBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.RasenganBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ChidoriBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.InfuseChakraBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.FireballJutsuBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WaterWalkingBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.RockShelterBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.thunderBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.LightningBallBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TunnelTechniqueBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.GalePalmBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.airbulletbuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.flameBulletBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.HailBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StoneTrapBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.FireCircleBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WaterBladeTechniqueBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.HazyGenjutsuBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.blocklifegiverbuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.COATTBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.AntidoteBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ChakraStrengthBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.BodyHealerBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.UzumakiChainsBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.UzumakiChakraBiteBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WoodCloneBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WoodBeamBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ExtremeSteamingMurderBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WaterShurikenJutsuBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.LavaChakraModeBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WaterShurikenJutsuBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.IceBreakingFistBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TenThousandIcePetalsBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SkilledMistTechniqueBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.EruptingPropulsionFistBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.CrystalNeedlesBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ShurikenWildDanceBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ExplosivePalmBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ExplosiveLandminesBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.InhalingMawBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.JudgementBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.GoldSandDrizzleBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.IronSandDrizzleBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.DOTPWbuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.BottomlessMudHoleBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MuddyWaterBallBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ImperviousArmorBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SteelProjectileBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.LazerCircusBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WaterShurikenJutsuBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ShadowlessFlightBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ConsecutiveBurstingStrongWaindBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.GreatConsecutiveBurstingExtremeWindsBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WaterShurikenJutsuBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ExplosiveSacrificeTechniqueBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.FireChakraBombBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.FireShurikenBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.BlazingShieldBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StickyFireBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WaterEncampmentWallBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SharkProjectileBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ChidoriNagashiBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ChidoriSenbonBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.RockRainBoulderBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (true);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.AttackingPlantsBuy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
