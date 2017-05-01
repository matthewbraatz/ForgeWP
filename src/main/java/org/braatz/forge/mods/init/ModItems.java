package org.braatz.forge.mods.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.braatz.forge.mods.items.*;

public class ModItems {


    public static Item.ToolMaterial ChickennessMaterial = EnumHelper.addToolMaterial("chickenness", 3, 1000, 12.0F, 15.0F, 10);
    public static Item.ToolMaterial SoulStealerMaterial = EnumHelper.addToolMaterial("soulstealer", 0, 1000, 12.0F, 15.0F, 10);

    public static final ItemObsidianingot obsidianingot = new ItemObsidianingot();
    public static final ItemRuby ruby = new ItemRuby();
    public static final ItemChickenpickaxe chickenpickaxe = new ItemChickenpickaxe(ChickennessMaterial);
    public static final ItemChickensword chickensword = new ItemChickensword(ChickennessMaterial);
    public static final ItemTomato tomato = new ItemTomato();
    public static final ItemHeart heart = new ItemHeart();
    public static final ItemSoulStealer soulstealer = new ItemSoulStealer();
    public static final ItemTomatoseeds tomatoseeds = new ItemTomatoseeds();


    public static final Item[] ITEMS = {
        obsidianingot,
        ruby,
        chickenpickaxe,
        chickensword,
            tomato,
            heart,
            soulstealer,
            tomatoseeds

};






    public static void createRecipies() {

        GameRegistry.addShapedRecipe(new ItemStack(chickensword, 1),
                        " F ",
                        " E ",
                        " S ",
                        'S', Items.STICK,
                        'F', Items.FEATHER,
                        'E', Items.EGG
        );

        GameRegistry.addShapedRecipe(new ItemStack(chickenpickaxe, 1),
                        "FFF",
                        " E ",
                        " S ",
                        'S', Items.STICK,
                        'F', Items.FEATHER,
                        'E', Items.EGG
        );

        GameRegistry.addShapedRecipe(new ItemStack(Items.SADDLE, 1),
                "   ",
                "SSS",
                "SSS",
                'S', Items.LEATHER

        );

        GameRegistry.addShapelessRecipe(new ItemStack(ruby), Items.DIAMOND, Items.REDSTONE);
        GameRegistry.addShapelessRecipe(new ItemStack(tomato), Items.WHEAT_SEEDS, Items.REDSTONE);
        GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(obsidianingot), 2.0F);


    }




}
