package org.braatz.forge.mods.items;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityWeatherEffect;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.math.BlockPos;
import org.braatz.forge.mods.Reference;
import org.braatz.forge.mods.init.ModItems;

import java.sql.Ref;
import java.util.Set;

import static org.braatz.forge.mods.init.ModItems.SoulStealerMaterial;

/**
 * Created by matthewbraatz on 4/24/17.
 */
public class ItemSoulStealer extends ItemTool {


    private static final Set<Block> EFFECTIVE_BLOCKS = Sets.newHashSet(new Block [] {});



    public ItemSoulStealer() {
        super(SoulStealerMaterial, EFFECTIVE_BLOCKS);
        setUnlocalizedName(Reference.MattModItems.SOULSTEALER.getunlocalizedName());
        setRegistryName(Reference.MattModItems.SOULSTEALER.getRegistryName());

    }


    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

        BlockPos pos = target.getPosition();
        EntityItem item = new EntityItem(target.getEntityWorld(), pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.heart));
        target.getEntityWorld().spawnEntity(item);





        return super.hitEntity(stack, target, attacker);
    }
}
