package org.braatz.forge.mods.events;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class ExplodingMinecart {

    @SubscribeEvent
    public void explode(MinecartCollisionEvent event) {
        EntityMinecart minecart = event.getMinecart();

        minecart.getEntityWorld().createExplosion(
                minecart,
                minecart.posX,
                minecart.posY,
                minecart.posZ,
                10,
                false);


    }
}
