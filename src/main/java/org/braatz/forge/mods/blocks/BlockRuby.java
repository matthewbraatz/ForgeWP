package org.braatz.forge.mods.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.braatz.forge.mods.Reference;

/**
 * Created by matthewbraatz on 4/21/17.
 */
public class BlockRuby extends Block {


    public BlockRuby() {

        super(Material.IRON);

        setUnlocalizedName(Reference.MattModBlocks.RUBYBLOCK.getunlocalizedName());
        setRegistryName(Reference.MattModBlocks.RUBYBLOCK.getRegistryName());
        setHardness(25.0F);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setResistance(3000.0F);
        setLightLevel(3.8F);
        setSoundType(SoundType.SLIME);





    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

       if (worldIn.isRemote){
           Minecraft.getMinecraft().displayGuiScreen(new GuiChat());
       }


        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }
}
