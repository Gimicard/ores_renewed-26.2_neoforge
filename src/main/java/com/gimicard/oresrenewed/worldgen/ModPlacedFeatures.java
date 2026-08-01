package com.gimicard.oresrenewed.worldgen;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    // --- Titan ---
    public static final ResourceKey<PlacedFeature> TITAN_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "titan_ore_placed"));
    public static final ResourceKey<PlacedFeature> TITAN_ORE_DEEPSLATE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "titan_ore_deepslate_placed"));

    // --- Uran ---
    public static final ResourceKey<PlacedFeature> URAN_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "uran_ore_placed"));
    public static final ResourceKey<PlacedFeature> URAN_ORE_DEEPSLATE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "uran_ore_deepslate_placed"));

    // --- Blackcristal ---
    public static final ResourceKey<PlacedFeature> BLACKCRISTAL_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "blackcristal_ore_placed"));
    public static final ResourceKey<PlacedFeature> BLACKCRISTAL_ORE_DEEPSLATE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "blackcristal_ore_deepslate_placed"));

    // --- Killium ---
    public static final ResourceKey<PlacedFeature> KILLIUM_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "killium_ore_placed"));
    public static final ResourceKey<PlacedFeature> KILLIUM_ORE_DEEPSLATE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "killium_ore_deepslate_placed"));

    // --- Lead ---
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "lead_ore_placed"));
    public static final ResourceKey<PlacedFeature> LEAD_ORE_DEEPSLATE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "lead_ore_deepslate_placed"));

    // --- Magnetit ---
    public static final ResourceKey<PlacedFeature> MAGNETIT_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "magnetit_ore_placed"));
    public static final ResourceKey<PlacedFeature> MAGNETIT_ORE_DEEPSLATE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "magnetit_ore_deepslate_placed"));

    // --- Vulkanit ---
    public static final ResourceKey<PlacedFeature> VULKANIT_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "vulkanit_ore_placed"));
    public static final ResourceKey<PlacedFeature> VULKANIT_ORE_DEEPSLATE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "vulkanit_ore_deepslate_placed"));

    // --- Ruby ---
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "ruby_ore_placed"));
    public static final ResourceKey<PlacedFeature> RUBY_ORE_DEEPSLATE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, "ruby_ore_deepslate_placed"));


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // --- Titan ---
        register(context, TITAN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TITAN_ORE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
        register(context, TITAN_ORE_DEEPSLATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TITAN_ORE_DEEPSLATE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0)), BiomeFilter.biome()));

        // --- Uran ---
        register(context, URAN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.URAN_ORE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
        register(context, URAN_ORE_DEEPSLATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.URAN_ORE_DEEPSLATE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0)), BiomeFilter.biome()));

        // --- Blackcristal ---
        register(context, BLACKCRISTAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACKCRISTAL_ORE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
        register(context, BLACKCRISTAL_ORE_DEEPSLATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACKCRISTAL_ORE_DEEPSLATE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0)), BiomeFilter.biome()));

        // --- Killium ---
        register(context, KILLIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.KILLIUM_ORE_KEY),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
        register(context, KILLIUM_ORE_DEEPSLATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.KILLIUM_ORE_DEEPSLATE_KEY),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0)), BiomeFilter.biome()));

        // --- Lead ---
        register(context, LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAD_ORE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
        register(context, LEAD_ORE_DEEPSLATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAD_ORE_DEEPSLATE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0)), BiomeFilter.biome()));

        // --- Magnetit ---
        register(context, MAGNETIT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGNETIT_ORE_KEY),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
        register(context, MAGNETIT_ORE_DEEPSLATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGNETIT_ORE_DEEPSLATE_KEY),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0)), BiomeFilter.biome()));

        // --- Vulkanit ---
        register(context, VULKANIT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VULKANIT_ORE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
        register(context, VULKANIT_ORE_DEEPSLATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VULKANIT_ORE_DEEPSLATE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0)), BiomeFilter.biome()));

        // --- Ruby ---
        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
        register(context, RUBY_ORE_DEEPSLATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE_DEEPSLATE_KEY),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0)), BiomeFilter.biome()));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}