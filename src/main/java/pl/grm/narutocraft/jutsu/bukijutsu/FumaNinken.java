package pl.grm.narutocraft.jutsu.bukijutsu;

import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import pl.grm.narutocraft.jutsu.IJutsu;
import pl.grm.narutocraft.jutsu.Jutsu;

public class FumaNinken extends Jutsu implements IJutsu {

	public FumaNinken() {
		this.setUnlocalizedName("Fuma Ninken");
		this.setTextureName(jutsuLoc + "Fuma Ninken");
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!world.isRemote) {

		}
		return stack;
	}
	public void uploadEffects() {
		// TODO Auto-generated method stub

	}
	public <IEffect> Map<IJutsu, IEffect> getEffects() {
		// TODO Auto-generated method stub
		return null;
	}
	public <IEffect> void setEffect(IEffect effect) {
		// TODO Auto-generated method stub

	}
	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setActive(boolean par) {
		// TODO Auto-generated method stub

	}
	@Override
	public void onJutsuUpdate() {
		// TODO Auto-generated method stub

	}
	public void consumeChackra(int value) {
		// TODO Auto-generated method stub

	}
	@Override
	public void activateJutsu() {
		// TODO Auto-generated method stub

	}
	@Override
	public void jutsuEnd() {
		// TODO Auto-generated method stub

	}
	@Override
	public Map<Integer, IJutsu> getJutsuProps() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateJutsuDurationsMap() {
		// TODO Auto-generated method stub

	}
	@Override
	public int getJutsuID() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getTotalDuration() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getDurationPass() {
		// TODO Auto-generated method stub
		return 0;
	}

}