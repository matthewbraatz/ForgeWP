package org.braatz.forge.mods.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.braatz.forge.mods.Reference;

import java.util.List;

/**
 * Created by matthewbraatz on 4/21/17.
 */
public class ItemChickenpickaxe extends ItemPickaxe{

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {

        tooltip.add("Emma's Amazing Chicken Pickaxe!!");


        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    public ItemChickenpickaxe(ToolMaterial material){

        super(material);
        setUnlocalizedName(Reference.MattModItems.CHICKENPICKAXE.getunlocalizedName());
        setRegistryName(Reference.MattModItems.CHICKENPICKAXE.getRegistryName());





    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        //return super.getRarity(stack);

        return EnumRarity.EPIC;

    }


    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }


    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(worldIn.getBlockState(pos).getBlock() == Blocks.GRASS){
            //worldIn.setBlockState(pos.up(), Blocks.DIAMOND_BLOCK.getDefaultState());

            if(!worldIn.isRemote) {
                Entity chick = new EntityChicken(worldIn);
                chick.setPosition(pos.getX() + 2, pos.getY() + 2, pos.getZ() + 2);
                worldIn.spawnEntity(chick);
            }

            EntityLightningBolt lb = new EntityLightningBolt(worldIn, pos.getX() + 4, pos.getY() + 2, pos.getZ() + 2, true);
            worldIn.addWeatherEffect(lb);


            return EnumActionResult.SUCCESS;

        }

        else {

            return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
        }
    }


    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        return true;

    }
}
