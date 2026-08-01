package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, OresRenewed.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        /* ITEMS */
        itemModels.generateFlatItem(ModItems.MAGNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.URAN_FUEL_ROD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_URAN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_TITAN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_VULKANIT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_MAGNETIT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_KILLIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_LEAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.URAN_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TITAN_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.VULKANIT_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MAGNETIT_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.KILLIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.LEAD_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BLACKCRISTAL.get(), ModelTemplates.FLAT_ITEM);

        /* TOOLS */
        itemModels.generateFlatItem(ModItems.VULKANIT_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.VULKANIT_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.VULKANIT_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.VULKANIT_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.VULKANIT_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.RUBY_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.TITAN_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TITAN_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TITAN_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TITAN_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.TITAN_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.LEAD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.MAGNETIT_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.KILLIUM_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateSpear(ModItems.VULKANIT_SPEAR.get());
        itemModels.generateSpear(ModItems.RUBY_SPEAR.get());
        itemModels.generateSpear(ModItems.TITAN_SPEAR.get());


        /* BLOCKS */
        blockModels.createTrivialCube(ModBlocks.BLACKCRISTAL_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.VULKANIT_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.MAGNETIT_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.KILLIUM_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.LEAD_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RUBY_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.URAN_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TITAN_ORE_BLOCK.get());

        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK.get());

        blockModels.createTrivialCube(ModBlocks.BLOCK_OF_BLACKCRISTAL.get());
        blockModels.createTrivialCube(ModBlocks.BLOCK_OF_VULKANIT.get());
        blockModels.createTrivialCube(ModBlocks.BLOCK_OF_MAGNETIT.get());
        blockModels.createTrivialCube(ModBlocks.BLOCK_OF_KILLIUM.get());
        blockModels.createTrivialCube(ModBlocks.BLOCK_OF_LEAD.get());
        blockModels.createTrivialCube(ModBlocks.BLOCK_OF_RUBY.get());
        blockModels.createTrivialCube(ModBlocks.BLOCK_OF_URAN.get());
        blockModels.createTrivialCube(ModBlocks.BLOCK_OF_TITAN.get());
    }
}