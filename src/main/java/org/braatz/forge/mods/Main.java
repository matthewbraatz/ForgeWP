package org.braatz.forge.mods;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


import org.braatz.forge.mods.init.ModBlocks;
import org.braatz.forge.mods.init.ModEvents;
import org.braatz.forge.mods.init.ModItems;
import org.braatz.forge.mods.proxy.CommonProxy;


@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main {

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }


    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init();
        ModEvents.init();
        ModItems.createRecipies();
        ModBlocks.createRecipies();



    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


}