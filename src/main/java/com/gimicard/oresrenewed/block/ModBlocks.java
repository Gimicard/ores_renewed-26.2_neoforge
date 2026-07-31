package com.gimicard.oresrenewed.block;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {

    // Registries für Blöcke und Items erstellen
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(OresRenewed.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OresRenewed.MOD_ID);

    // --- NORMAL ORES ---
    public static final DeferredBlock<Block> URAN_ORE_BLOCK = registerBlock("uran_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> TITAN_ORE_BLOCK = registerBlock("titan_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> RUBY_ORE_BLOCK = registerBlock("ruby_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> LEAD_ORE_BLOCK = registerBlock("lead_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> KILLIUM_ORE_BLOCK = registerBlock("killium_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MAGNETIT_ORE_BLOCK = registerBlock("magnetit_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> VULKANIT_ORE_BLOCK = registerBlock("vulkanit_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> BLACKCRISTAL_ORE_BLOCK = registerBlock("blackcristal_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    // --- DEEPSLATE ORES ---
    public static final DeferredBlock<Block> DEEPSLATE_URAN_ORE_BLOCK = registerBlock("deepslate_uran_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_TITAN_ORE_BLOCK = registerBlock("deepslate_titan_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE_BLOCK = registerBlock("deepslate_ruby_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE_BLOCK = registerBlock("deepslate_lead_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_KILLIUM_ORE_BLOCK = registerBlock("deepslate_killium_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_MAGNETIT_ORE_BLOCK = registerBlock("deepslate_magnetite_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_VULKANIT_ORE_BLOCK = registerBlock("deepslate_vulkanit_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_BLACKCRISTAL_ORE_BLOCK = registerBlock("deepslate_blackcristal_ore_block",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    // --- BLOCKS OF NORMAL---
    public static final DeferredBlock<Block> BLOCK_OF_BLACKCRISTAL = registerBlock("block_of_blackcristal",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> BLOCK_OF_KILLIUM = registerBlock("block_of_killium",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.IRON)));

    public static final DeferredBlock<Block> BLOCK_OF_LEAD = registerBlock("block_of_lead",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.IRON)));

    public static final DeferredBlock<Block> BLOCK_OF_MAGNETIT = registerBlock("block_of_magnetit",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.IRON)));

    public static final DeferredBlock<Block> BLOCK_OF_RUBY = registerBlock("block_of_ruby",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> BLOCK_OF_TITAN = registerBlock("block_of_titan",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.IRON)));

    public static final DeferredBlock<Block> BLOCK_OF_URAN = registerBlock("block_of_uran",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.IRON)));

    public static final DeferredBlock<Block> BLOCK_OF_VULKANIT = registerBlock("block_of_vulkanit",
            props -> new Block(props.strength(4F).requiresCorrectToolForDrops().sound(SoundType.IRON)));


    // Helper-Methode zum Registrieren von Block UND BlockItem
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> blockFactory) {
        // 1. Block registrieren
        DeferredBlock<T> block = BLOCKS.registerBlock(name, blockFactory);

        // 2. Automatisch das passende BlockItem registrieren
        ITEMS.registerSimpleBlockItem(block);

        return block;
    }

    // Registrierungsmethode für das Event-System in der Hauptklasse
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}