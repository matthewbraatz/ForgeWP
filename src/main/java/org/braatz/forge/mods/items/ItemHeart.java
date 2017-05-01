package org.braatz.forge.mods.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import org.braatz.forge.mods.Reference;

/**
 * Created by matthewbraatz on 4/24/17.
 */
public class ItemHeart extends Item {

    public ItemHeart() {
        super();
        setUnlocalizedName(Reference.MattModItems.HEART.getunlocalizedName());
        setRegistryName(Reference.MattModItems.HEART.getRegistryName());


    }





    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if(playerIn.getHealth() < playerIn.getMaxHealth()){
            playerIn.heal(4.0F);
            playerIn.getHeldItem(handIn).shrink(1);




        }


        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}
