package pl.grm.narutocraftmod.Armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import pl.grm.narutocraftmod.NarutoCraftMod;
import pl.grm.narutocraftmod.Libs.Registry.RegItems;

public class NCPLItemArmor extends ItemArmor {
	private ArmorMaterial amat;
	private String armorTex = "narutocraftmod:armor/";
	
	public NCPLItemArmor(ArmorMaterial armormaterial, int ID, int placement) {
		
		super(armormaterial, ID, placement);
		this.setCreativeTab(NarutoCraftMod.mTabNarutoCraftMod);
		amat=armormaterial;
		
		if (placement == 0) { this.setTextureName(armorTex+"helmet"+armormaterial); }
		else if (placement == 1) { this.setTextureName(armorTex+"chestplate"+armormaterial); }
		else if (placement == 2) { this.setTextureName(armorTex+"leggins"+armormaterial); }
		else if (placement == 3) { this.setTextureName(armorTex+"boots"+armormaterial); }
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == RegItems.helmetBushido || stack.getItem() == RegItems.plateBushido || stack.getItem() == RegItems.bootsBushido) 
		{ return "narutocraftmod:textures/model/BushidoArmor.1.png"; }
		if (stack.getItem() == RegItems.legsBushido)
		{ return "narutocraftmod:textures/model/BushidoArmor.2.png"; } 
		if(stack.getItem() == RegItems.helmetAnbu1 || stack.getItem() == RegItems.helmetAnbu2  ||  stack.getItem() ==  RegItems.helmetAnbu3  ||  stack.getItem() == RegItems.helmetAnbu4  ||  stack.getItem() == RegItems.plateAnbu || stack.getItem() == RegItems.bootsAnbu) 
		{ return "narutocraftmod:textures/model/AnbuArmor.1.png"; }
		if (stack.getItem() == RegItems.legsAnbu)
		{ return "narutocraftmod:textures/model/AnbuArmor.2.png"; } 
		if(stack.getItem() == RegItems.plateKiri  ||  stack.getItem() == RegItems.legsKiri)
		{ return "narutocraftmod:textures/model/Kiri.png"; }
		if(stack.getItem() == RegItems.plateSuna  ||  stack.getItem() ==  RegItems.legsSuna)
		{ return "narutocraftmod:textures/model/Suna.png"; }
		else { return null; }
	}
	
}
