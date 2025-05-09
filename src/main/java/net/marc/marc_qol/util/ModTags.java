package net.marc.marc_qol.util;

import net.marc.marc_qol.Marc_QoL;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items{

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Marc_QoL.MOD_ID, name));
        }
        private static TagKey<Item> forgetag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
    }

    public static class Blocks{
        public static class Items{

            private static TagKey<Item> tag(String name) {
                return BlockTags.create(new ResourceLocation(Marc_QoL.MOD_ID, name));
            }
            private static TagKey<Item> forgetag(String name) {
                return BlockTags.create(new ResourceLocation("forge", name));
            }
    }
}
