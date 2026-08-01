package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.item.ModItems;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Collections;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BLOCK_OF_BLACKCRISTAL.get());
        dropSelf(ModBlocks.BLOCK_OF_KILLIUM.get());
        dropSelf(ModBlocks.BLOCK_OF_LEAD.get());
        dropSelf(ModBlocks.BLOCK_OF_MAGNETIT.get());
        dropSelf(ModBlocks.BLOCK_OF_RUBY.get());
        dropSelf(ModBlocks.BLOCK_OF_TITAN.get());
        dropSelf(ModBlocks.BLOCK_OF_URAN.get());
        dropSelf(ModBlocks.BLOCK_OF_VULKANIT.get());

        add(ModBlocks.BLACKCRISTAL_ORE_BLOCK.get(), createMultipleOreDrops(ModBlocks.BLACKCRISTAL_ORE_BLOCK.get(), ModItems.BLACKCRISTAL.get(), 2, 6));
        add(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK.get(), createMultipleOreDrops(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK.get(), ModItems.BLACKCRISTAL.get(), 1, 7));

        add(ModBlocks.RUBY_ORE_BLOCK.get(), createOreDrop(ModBlocks.RUBY_ORE_BLOCK.get(), ModItems.RUBY.get()));
        add(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get(), createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get(), ModItems.RUBY.get()));

        add(ModBlocks.KILLIUM_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.KILLIUM_ORE_BLOCK.get(), ModItems.RAW_KILLIUM.get()));
        add(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK.get(), ModItems.RAW_KILLIUM.get()));

        add(ModBlocks.LEAD_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.LEAD_ORE_BLOCK.get(), ModItems.RAW_LEAD.get()));
        add(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get(), ModItems.RAW_LEAD.get()));

        add(ModBlocks.MAGNETIT_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.MAGNETIT_ORE_BLOCK.get(), ModItems.RAW_MAGNETIT.get()));
        add(ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK.get(), ModItems.RAW_MAGNETIT.get()));

        add(ModBlocks.TITAN_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.TITAN_ORE_BLOCK.get(), ModItems.RAW_TITAN.get()));
        add(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK.get(), ModItems.RAW_TITAN.get()));

        add(ModBlocks.URAN_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.URAN_ORE_BLOCK.get(), ModItems.RAW_URAN.get()));
        add(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get(), ModItems.RAW_URAN.get()));

        add(ModBlocks.VULKANIT_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.VULKANIT_ORE_BLOCK.get(), ModItems.RAW_VULKANIT.get()));
        add(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK.get(), createAutoSmeltOreDrop(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK.get(), ModItems.RAW_VULKANIT.get()));

        /*add(Blocks.IRON_ORE, createAutoSmeltOreDrop(Blocks.IRON_ORE, Items.RAW_IRON));
        add(Blocks.DEEPSLATE_IRON_ORE, createAutoSmeltOreDrop(Blocks.DEEPSLATE_IRON_ORE, Items.RAW_IRON));

        add(Blocks.GOLD_ORE, createAutoSmeltOreDrop(Blocks.GOLD_ORE, Items.RAW_GOLD));
        add(Blocks.DEEPSLATE_GOLD_ORE, createAutoSmeltOreDrop(Blocks.DEEPSLATE_GOLD_ORE, Items.RAW_GOLD));
        add(Blocks.NETHER_GOLD_ORE, createOreDrop(Blocks.NETHER_GOLD_ORE, Items.GOLD_NUGGET));

        add(Blocks.COPPER_ORE, createAutoSmeltOreDrop(Blocks.COPPER_ORE, Items.RAW_COPPER));
        add(Blocks.DEEPSLATE_COPPER_ORE, createAutoSmeltOreDrop(Blocks.DEEPSLATE_COPPER_ORE, Items.RAW_COPPER));*/
    }

    public LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(
                block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
        ));
    }

    private LootTable.Builder createAutoSmeltOreDrop(Block block, Item rawDrop) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block, LootItem.lootTableItem(rawDrop)
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                        .apply(SmeltItemFunction.smelted()
                                .when(MatchTool.toolMatches(
                                        ItemPredicate.Builder.item().of(this.registries.lookupOrThrow(Registries.ITEM), ModItems.VULKANIT_PICKAXE.get())
                                ))
                        )
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(holder -> (Block) holder.get())::iterator;
    }
}