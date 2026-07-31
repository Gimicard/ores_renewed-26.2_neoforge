package com.gimicard.oresrenewed.tags;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_LEAD_TOOL = createTag("needs_lead_tool");
        public static final TagKey<Block> INCORRECT_FOR_LEAD_TOOL = createTag("incorrect_for_lead_tool");

        public static final TagKey<Block> NEEDS_VULKANIT_TOOL = createTag("needs_vulkanite_tool");
        public static final TagKey<Block> INCORRECT_FOR_VULKANIT_TOOL = createTag("incorrect_for_lead_tool");

        public static final TagKey<Block> NEEDS_TITAN_TOOL = createTag("needs_titan_tool");
        public static final TagKey<Block> INCORRECT_FOR_TITAN_TOOL = createTag("incorrect_for_titan_tool");

        public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");

        public static final TagKey<Block> NEEDS_MAGNETIT_TOOL = createTag("needs_magnetit_tool");
        public static final TagKey<Block> INCORRECT_FOR_MAGNETIT_TOOL = createTag("incorrect_for_magnetit_tool");

        public static final TagKey<Block> NEEDS_KILLIUM_TOOL = createTag("needs_killium_tool");
        public static final TagKey<Block> INCORRECT_FOR_KILLIUM_TOOL = createTag("incorrect_for_killium_tool");

        private static TagKey<Block> createTag(String name){
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> LEAD_REPAIR = createTag("lead_repair");
        public static final TagKey<Item> VULKANIT_REPAIR = createTag("vulkanite_repair");
        public static final TagKey<Item> TITAN_REPAIR = createTag("titan_repair");
        public static final TagKey<Item> RUBY_REPAIR = createTag("ruby_repair");
        public static final TagKey<Item> MAGNETIT_REPAIR = createTag("magnetit_repair");
        public static final TagKey<Item> KILLIUM_REPAIR = createTag("killium_repair");


        private static TagKey<Item> createTag(String name){
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name));
        }
    }
}
