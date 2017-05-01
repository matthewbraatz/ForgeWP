package org.braatz.forge.mods.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.braatz.forge.mods.init.ModItems;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;

/**
 * Created by matthewbraatz on 4/22/17.
 */

@Mod.EventBusSubscriber
public class RegistrationHandler {


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ModItems.ITEMS);

        for (Block block : ModBlocks.BLOCKS)
        {
            event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }


    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(ModBlocks.BLOCKS);

    }


    @SubscribeEvent
    @SideOnly(CLIENT)
    public static void registerModels(ModelRegistryEvent event) throws Exception
    {


        for (Item item: ModItems.ITEMS)
        {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }

        for (Block block: ModBlocks.BLOCKS)
        {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        }
    }





}
