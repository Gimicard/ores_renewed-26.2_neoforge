package com.gimicard.oresrenewed.worldgen;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_TITAN_ORE = createKey("add_titan_ore");
    public static final ResourceKey<BiomeModifier> ADD_URAN_ORE = createKey("add_uran_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLACKCRISTAL_ORE = createKey("add_blackcristal_ore");
    public static final ResourceKey<BiomeModifier> ADD_KILLIUM_ORE = createKey("add_killium_ore");
    public static final ResourceKey<BiomeModifier> ADD_LEAD_ORE = createKey("add_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_MAGNETIT_ORE = createKey("add_magnetit_ore");
    public static final ResourceKey<BiomeModifier> ADD_VULKANIT_ORE = createKey("add_vulkanit_ore");
    public static final ResourceKey<BiomeModifier> ADD_RUBY_ORE = createKey("add_ruby_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var biomes = context.lookup(Registries.BIOME);
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        var overworldBiomes = biomes.getOrThrow(BiomeTags.IS_OVERWORLD);

        // Titan
        context.register(ADD_TITAN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworldBiomes,
                HolderSet.direct(
                        placedFeatures.getOrThrow(ModPlacedFeatures.TITAN_ORE_PLACED_KEY),
                        placedFeatures.getOrThrow(ModPlacedFeatures.TITAN_ORE_DEEPSLATE_PLACED_KEY)
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        // Uran
        context.register(ADD_URAN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworldBiomes,
                HolderSet.direct(
                        placedFeatures.getOrThrow(ModPlacedFeatures.URAN_ORE_PLACED_KEY),
                        placedFeatures.getOrThrow(ModPlacedFeatures.URAN_ORE_DEEPSLATE_PLACED_KEY)
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        // Blackcristal
        context.register(ADD_BLACKCRISTAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworldBiomes,
                HolderSet.direct(
                        placedFeatures.getOrThrow(ModPlacedFeatures.BLACKCRISTAL_ORE_PLACED_KEY),
                        placedFeatures.getOrThrow(ModPlacedFeatures.BLACKCRISTAL_ORE_DEEPSLATE_PLACED_KEY)
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        // Killium
        context.register(ADD_KILLIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworldBiomes,
                HolderSet.direct(
                        placedFeatures.getOrThrow(ModPlacedFeatures.KILLIUM_ORE_PLACED_KEY),
                        placedFeatures.getOrThrow(ModPlacedFeatures.KILLIUM_ORE_DEEPSLATE_PLACED_KEY)
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        // Lead
        context.register(ADD_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworldBiomes,
                HolderSet.direct(
                        placedFeatures.getOrThrow(ModPlacedFeatures.LEAD_ORE_PLACED_KEY),
                        placedFeatures.getOrThrow(ModPlacedFeatures.LEAD_ORE_DEEPSLATE_PLACED_KEY)
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        // Magnetit
        context.register(ADD_MAGNETIT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworldBiomes,
                HolderSet.direct(
                        placedFeatures.getOrThrow(ModPlacedFeatures.MAGNETIT_ORE_PLACED_KEY),
                        placedFeatures.getOrThrow(ModPlacedFeatures.MAGNETIT_ORE_DEEPSLATE_PLACED_KEY)
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        // Vulkanit
        context.register(ADD_VULKANIT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworldBiomes,
                HolderSet.direct(
                        placedFeatures.getOrThrow(ModPlacedFeatures.VULKANIT_ORE_PLACED_KEY),
                        placedFeatures.getOrThrow(ModPlacedFeatures.VULKANIT_ORE_DEEPSLATE_PLACED_KEY)
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        // Ruby
        context.register(ADD_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworldBiomes,
                HolderSet.direct(
                        placedFeatures.getOrThrow(ModPlacedFeatures.RUBY_ORE_PLACED_KEY),
                        placedFeatures.getOrThrow(ModPlacedFeatures.RUBY_ORE_DEEPSLATE_PLACED_KEY)
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }

    private static ResourceKey<BiomeModifier> createKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, Identifier.fromNamespaceAndPath(OresRenewed.MOD_ID, name));
    }
}