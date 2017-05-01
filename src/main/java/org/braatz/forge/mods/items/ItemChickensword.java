package org.braatz.forge.mods.items;

import net.minecraft.item.ItemSword;
import org.braatz.forge.mods.Reference;

public class ItemChickensword extends ItemSword {

    public ItemChickensword(ToolMaterial material) {

        super(material);
        setUnlocalizedName(Reference.MattModItems.CHICKENSWORD.getunlocalizedName());
        setRegistryName(Reference.MattModItems.CHICKENSWORD.getRegistryName());

    }

}
