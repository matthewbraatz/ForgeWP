
package org.braatz.forge.mods.events;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class BlockBreakMessage {

    @SubscribeEvent
    public void sendMessage(BreakEvent event) {
        event.getPlayer().sendMessage(new TextComponentString("Dado broke another block, Popeye!!!!"));
    }

}


