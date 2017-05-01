package org.braatz.forge.mods.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import org.braatz.forge.mods.Reference;

/**
 * Created by matthewbraatz on 4/24/17.
 */
public class ItemTomato extends ItemFood {

    public ItemTomato(){
        super(10, 0.8F, true);
        setUnlocalizedName(Reference.MattModItems.TOMATO.getunlocalizedName());
        setRegistryName(Reference.MattModItems.TOMATO.getRegistryName());
        setCreativeTab(CreativeTabs.FOOD);


    }

}
