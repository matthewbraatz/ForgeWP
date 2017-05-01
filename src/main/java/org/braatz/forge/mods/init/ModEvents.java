package org.braatz.forge.mods.init;

import net.minecraftforge.common.MinecraftForge;
import org.braatz.forge.mods.events.*;

/**
 * Created by matthewbraatz on 4/21/17.
 */
public class ModEvents {

    public static void init(){


       // MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
        MinecraftForge.EVENT_BUS.register(new ExplodingMinecart());
        MinecraftForge.EVENT_BUS.register(new DiamondOreTrap());
        MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosion());
        MinecraftForge.EVENT_BUS.register(new PigsDroppingDiamonds());

    }

}
