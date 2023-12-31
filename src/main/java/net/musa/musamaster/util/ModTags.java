package net.musa.musamaster.util;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.musa.musamaster.MCCourseMod;

public class ModTags {
    public static class Blocks {
        public static final Tag.Identified<Block> DOWSING_ROD_DETECTABLE_BLOCKS =
                createTag("dowsing_rod_detectable_blocks");
        public static final Tag.Identified<Block> PEXEL_MINEABLE =
                createTag("mineable/paxel");
        public static final Tag.Identified<Block> GREEN_BLOCKS =
                createCommonTag("green_blocks");
        public static final Tag.Identified<Block> GREEN_ORES =
                createCommonTag("green_ores");


        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(MCCourseMod.MOD_ID, name));
        }
        private static Tag.Identified<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }

    }

    public static class Items {
        public static final Tag.Identified<Item> GREEN_INGOTS = createCommonTag("green_ingots");
        public static final Tag.Identified<Item> GREEN_NUGGETS = createCommonTag("green_nuggets");



        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(MCCourseMod.MOD_ID, name));
        }
        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }
}
