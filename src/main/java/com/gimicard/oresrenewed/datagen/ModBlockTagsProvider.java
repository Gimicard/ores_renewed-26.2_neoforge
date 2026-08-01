package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, OresRenewed.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.BLACKCRISTAL_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.KILLIUM_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.LEAD_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.MAGNETIT_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.RUBY_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.TITAN_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.URAN_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.VULKANIT_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_BLACKCRISTAL.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_KILLIUM.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_LEAD.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_MAGNETIT.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_RUBY.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_TITAN.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_URAN.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_VULKANIT.get()));

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.getRK(ModBlocks.RUBY_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.TITAN_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.VULKANIT_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_RUBY.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_TITAN.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_VULKANIT.get()));

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.BLACKCRISTAL_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.MAGNETIT_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_BLACKCRISTAL.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_MAGNETIT.get()));

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.getRK(ModBlocks.KILLIUM_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.LEAD_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_KILLIUM.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOCK_OF_LEAD.get()));

        tag(ModTags.Blocks.NEEDS_LEAD_TOOL)
                .add(ModBlocks.getRK(ModBlocks.URAN_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get()))
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_LEAD_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.URAN_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get()));

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .add(ModBlocks.getRK(ModBlocks.URAN_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get()));

        tag(ModTags.Blocks.NEEDS_TITAN_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_TITAN_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL)
                .add(ModBlocks.getRK(ModBlocks.URAN_ORE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get()));

        tag(ModTags.Blocks.NEEDS_MAGNETIT_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_MAGNETIT_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.NEEDS_VULKANIT_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
    }
}