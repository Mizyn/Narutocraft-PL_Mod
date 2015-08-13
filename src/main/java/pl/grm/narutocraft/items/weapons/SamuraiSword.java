package pl.grm.narutocraft.items.weapons;

import pl.grm.narutocraft.libs.config.Materials;

public class SamuraiSword extends SwordMain {

	public SamuraiSword() {
		super(Materials.stal3);
		this.setAttackDamage(4);
		this.setMaxDamage(800);

	}
}