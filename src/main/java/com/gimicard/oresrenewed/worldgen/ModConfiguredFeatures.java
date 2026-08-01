package com.gimicard.oresrenewed.worldgen;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    // --- Titan ---
    public static final ResourceKey<ConfiguredFeature<?, ?>> TITAN_ORE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "titan_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> TITAN_ORE_DEEPSLATE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "titan_ore_deepslate"));

    // --- Uran ---
    public static final ResourceKey<ConfiguredFeature<?, ?>> URAN_ORE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "uran_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> URAN_ORE_DEEPSLATE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "uran_ore_deepslate"));

    // --- Blackcristal ---
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKCRISTAL_ORE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "blackcristal_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKCRISTAL_ORE_DEEPSLATE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "blackcristal_ore_deepslate"));

    // --- Killium ---
    public static final ResourceKey<ConfiguredFeature<?, ?>> KILLIUM_ORE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "killium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> KILLIUM_ORE_DEEPSLATE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "killium_ore_deepslate"));

    // --- Lead ---
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "lead_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE_DEEPSLATE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "lead_ore_deepslate"));

    // --- Magnetit ---
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGNETIT_ORE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "magnetit_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGNETIT_ORE_DEEPSLATE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "magnetit_ore_deepslate"));

    // --- Vulkanit ---
    public static final ResourceKey<ConfiguredFeature<?, ?>> VULKANIT_ORE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "vulkanit_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> VULKANIT_ORE_DEEPSLATE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "vulkanit_ore_deepslate"));

    // --- Ruby ---
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "ruby_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE_DEEPSLATE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "ruby_ore_deepslate"));


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        // --- Titan ---
        context.register(TITAN_ORE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.TITAN_ORE_BLOCK.get().defaultBlockState())
        ), 9)));
        context.register(TITAN_ORE_DEEPSLATE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK.get().defaultBlockState())
        ), 9)));

        // --- Uran ---
        context.register(URAN_ORE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.URAN_ORE_BLOCK.get().defaultBlockState())
        ), 3)));
        context.register(URAN_ORE_DEEPSLATE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get().defaultBlockState())
        ), 3)));

        // --- Blackcristal ---
        context.register(BLACKCRISTAL_ORE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.BLACKCRISTAL_ORE_BLOCK.get().defaultBlockState())
        ), 10)));
        context.register(BLACKCRISTAL_ORE_DEEPSLATE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK.get().defaultBlockState())
        ), 10)));

        // --- Killium ---
        context.register(KILLIUM_ORE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.KILLIUM_ORE_BLOCK.get().defaultBlockState())
        ), 15)));
        context.register(KILLIUM_ORE_DEEPSLATE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK.get().defaultBlockState())
        ), 15)));

        // --- Lead ---
        context.register(LEAD_ORE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.LEAD_ORE_BLOCK.get().defaultBlockState())
        ), 3)));
        context.register(LEAD_ORE_DEEPSLATE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get().defaultBlockState())
        ), 3)));

        // --- Magnetit ---
        context.register(MAGNETIT_ORE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.MAGNETIT_ORE_BLOCK.get().defaultBlockState())
        ), 6)));
        context.register(MAGNETIT_ORE_DEEPSLATE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK.get().defaultBlockState())
        ), 6)));

        // --- Vulkanit ---
        context.register(VULKANIT_ORE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.VULKANIT_ORE_BLOCK.get().defaultBlockState())
        ), 3)));
        context.register(VULKANIT_ORE_DEEPSLATE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK.get().defaultBlockState())
        ), 3)));

        // --- Ruby ---
        context.register(RUBY_ORE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.RUBY_ORE_BLOCK.get().defaultBlockState())
        ), 3)));
        context.register(RUBY_ORE_DEEPSLATE_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get().defaultBlockState())
        ), 3)));
    }
}