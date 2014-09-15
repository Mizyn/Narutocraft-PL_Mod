package pl.grm.narutocraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import pl.grm.narutocraft.NarutoCraft;
import pl.grm.narutocraft.libs.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ByoinBlock extends Block {
	@SideOnly(Side.CLIENT)
	protected IIcon blockIcon;

	public ByoinBlock() {
		super(Material.rock);
		this.setCreativeTab(NarutoCraft.mTabNarutoCraft);
		this.setBlockName("byoin");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon(References.ModTexturePath
				+ this.getUnlocalizedName().substring(5));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		return blockIcon;
	}
}
