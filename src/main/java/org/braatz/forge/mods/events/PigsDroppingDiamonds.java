package org.braatz.forge.mods.events;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class PigsDroppingDiamonds {
    @SubscribeEvent
    public void dropDiamonds(LivingDeathEvent event) {
        if (!(event.getEntity() instanceof EntityPig)) {
            return;
        }

        Random random = new Random();
        Integer numToDrop = random.nextInt(3);

        if (!(event.getSource().getEntity() instanceof EntityPlayer)) {
            return;
        }

        TextComponentString msg = new TextComponentString("You received " + numToDrop + " Diamonds");


        event.getSource().getEntity().sendMessage(msg);
        if (!event.getEntity().getEntityWorld().isRemote) {
            event.getEntity().dropItem(Items.DIAMOND, numToDrop);

        }
    }
}
