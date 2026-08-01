package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.item.ModItems;
import com.gimicard.oresrenewed.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, OresRenewed.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ItemTags.SWORDS).add(ModItems.VULKANIT_SWORD.getKey(), ModItems.TITAN_SWORD.getKey(), ModItems.RUBY_SWORD.getKey(), ModItems.KILLIUM_SWORD.getKey());
        tag(ItemTags.PICKAXES).add(ModItems.VULKANIT_PICKAXE.getKey(), ModItems.TITAN_PICKAXE.getKey(), ModItems.RUBY_PICKAXE.getKey(), ModItems.LEAD_PICKAXE.getKey(), ModItems.MAGNETIT_PICKAXE.getKey());
        tag(ItemTags.SHOVELS).add(ModItems.VULKANIT_SHOVEL.getKey(), ModItems.TITAN_SHOVEL.getKey(), ModItems.RUBY_SHOVEL.getKey());
        tag(ItemTags.AXES).add(ModItems.VULKANIT_AXE.getKey(), ModItems.TITAN_AXE.getKey(), ModItems.RUBY_AXE.getKey());
        tag(ItemTags.HOES).add(ModItems.VULKANIT_HOE.getKey(), ModItems.TITAN_HOE.getKey(), ModItems.RUBY_HOE.getKey());
        tag(ItemTags.SPEARS).add(ModItems.VULKANIT_SPEAR.getKey(), ModItems.TITAN_SPEAR.getKey(), ModItems.RUBY_SPEAR.getKey());

        tag(ModTags.Items.LEAD_REPAIR).add(ModItems.LEAD_INGOT.getKey());
        tag(ModTags.Items.VULKANIT_REPAIR).add(ModItems.VULKANIT_INGOT.getKey());
        tag(ModTags.Items.RUBY_REPAIR).add(ModItems.RUBY.getKey());
        tag(ModTags.Items.MAGNETIT_REPAIR).add(ModItems.MAGNETIT_INGOT.getKey());
        tag(ModTags.Items.KILLIUM_REPAIR).add(ModItems.KILLIUM_INGOT.getKey());
    }
}