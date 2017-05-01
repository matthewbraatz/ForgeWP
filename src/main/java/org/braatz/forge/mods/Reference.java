package org.braatz.forge.mods;

import net.minecraft.init.Items;

public class Reference {


    public static final String MOD_ID = "mattmod";
    public static final String NAME = "Matt Mod for Minecraft";
    public static final String VERSION = "0.1";
    public static final String ACCEPTED_VERSIONS = "[1.11.2]";


    public static final String CLIENT_PROXY_CLASS = "org.braatz.forge.mods.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "org.braatz.forge.mods.proxy.ServerProxy";

    public static enum MattModItems {
        OBSIDIANINGOT("obsidianingot", "ItemObsidianingot"),
        RUBY("ruby", "ItemRuby"),
        CHICKENSWORD("chickensword", "ItemChickensword"),
        CHICKENPICKAXE("chickenpickaxe", "ItemChickenpickaxe"),
        TOMATO("tomato", "ItemTomato"),
        HEART("heart", "ItemHeart"),
        SOULSTEALER("soulstealer", "ItemSoulstealer"),
        TOMATOSEEDS("tomatoseeds", "ItemTomatoseeds");


        private String unlocalizedName;
        private String registryName;


        MattModItems(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;


        }

        public String getunlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }

     }


    public static enum MattModBlocks {
        RUBYBLOCK("rubyblock", "BlockRuby"),
        TOMATOPLANT("tomatoplant", "BlockTomatoPlant");

        private String unlocalizedName;
        private String registryName;


        MattModBlocks(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;


        }

        public String getunlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }

    }

}
