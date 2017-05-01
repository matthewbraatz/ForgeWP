package org.braatz.forge.mods.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.braatz.forge.mods.Reference;
import org.braatz.forge.mods.blocks.BlockRuby;
import org.braatz.forge.mods.blocks.BlockTomatoPlant;

/**
 * Created by matthewbraatz on 4/21/17.
 */
public class ModBlocks {

public static Block rubyblock = new BlockRuby();
public static BlockCrops tomatoplant = new BlockTomatoPlant();



    public static final Block[] BLOCKS = {

            rubyblock,
            tomatoplant
    };



public static void createRecipies(){


    GameRegistry.addShapedRecipe(new ItemStack(rubyblock, 1),
                    "RRR",
                             "RRR",
                             "RRR",
                    'R', ModItems.ruby);

}


}
