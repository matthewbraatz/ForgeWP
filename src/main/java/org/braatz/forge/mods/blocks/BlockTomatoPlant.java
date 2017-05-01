package org.braatz.forge.mods.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import org.braatz.forge.mods.Reference;
import org.braatz.forge.mods.init.ModItems;

import java.sql.Ref;

/**
 * Created by matthewbraatz on 4/24/17.
 */
public class BlockTomatoPlant extends BlockCrops {

    public BlockTomatoPlant() {

        setUnlocalizedName(Reference.MattModBlocks.TOMATOPLANT.getunlocalizedName());
        setRegistryName(Reference.MattModBlocks.TOMATOPLANT.getRegistryName());


    }


    @Override
    protected Item getSeed() {
        return ModItems.tomatoseeds;
    }


    @Override
    protected Item getCrop() {
        return ModItems.tomato;

    }
}
