package com.gimicard.oresrenewed.creativemodetab;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.item.ModItems;
import com.gimicard.oresrenewed.potion.ModPotions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {

    // DeferredRegister für Creative Mode Tabs erstellen
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OresRenewed.MOD_ID);

    // Der Tab "Ores"
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ORES_TAB = CREATIVE_MODE_TABS.register("ores_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.URAN_ORE_BLOCK.get()))
                    .title(Component.translatable("creativemodetab.oresrenewed.Ores"))
                    .displayItems((parameters, output) -> {
                        // --- ITEMS ---
                        output.accept(ModItems.MAGNET.get());
                        output.accept(ModItems.URAN_FUEL_ROD.get());

                        output.accept(ModItems.RAW_URAN.get());
                        output.accept(ModItems.RAW_TITAN.get());
                        output.accept(ModItems.RAW_VULKANIT.get());
                        output.accept(ModItems.RAW_MAGNETIT.get());
                        output.accept(ModItems.RAW_KILLIUM.get());
                        output.accept(ModItems.RAW_LEAD.get());

                        output.accept(ModItems.URAN_INGOT.get());
                        output.accept(ModItems.TITAN_INGOT.get());
                        output.accept(ModItems.VULKANIT_INGOT.get());
                        output.accept(ModItems.MAGNETIT_INGOT.get());
                        output.accept(ModItems.KILLIUM_INGOT.get());
                        output.accept(ModItems.LEAD_INGOT.get());

                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.BLACKCRISTAL.get());

                        // --- WERKZEUGE & WAFFEN ---
                        output.accept(ModItems.VULKANIT_SWORD.get());
                        output.accept(ModItems.VULKANIT_PICKAXE.get());
                        output.accept(ModItems.VULKANIT_SHOVEL.get());
                        output.accept(ModItems.VULKANIT_AXE.get());
                        output.accept(ModItems.VULKANIT_HOE.get());
                        output.accept(ModItems.VULKANIT_SPEAR.get());

                        output.accept(ModItems.TITAN_SWORD.get());
                        output.accept(ModItems.TITAN_PICKAXE.get());
                        output.accept(ModItems.TITAN_SHOVEL.get());
                        output.accept(ModItems.TITAN_AXE.get());
                        output.accept(ModItems.TITAN_HOE.get());
                        output.accept(ModItems.TITAN_SPEAR.get());

                        output.accept(ModItems.RUBY_SWORD.get());
                        output.accept(ModItems.RUBY_PICKAXE.get());
                        output.accept(ModItems.RUBY_SHOVEL.get());
                        output.accept(ModItems.RUBY_AXE.get());
                        output.accept(ModItems.RUBY_HOE.get());
                        output.accept(ModItems.RUBY_SPEAR.get());

                        output.accept(ModItems.LEAD_PICKAXE.get());
                        output.accept(ModItems.MAGNETIT_PICKAXE.get());
                        output.accept(ModItems.KILLIUM_SWORD.get());

                        // --- ERZE ---
                        output.accept(ModBlocks.TITAN_ORE_BLOCK.get());
                        output.accept(ModBlocks.BLACKCRISTAL_ORE_BLOCK.get());
                        output.accept(ModBlocks.VULKANIT_ORE_BLOCK.get());
                        output.accept(ModBlocks.MAGNETIT_ORE_BLOCK.get());
                        output.accept(ModBlocks.KILLIUM_ORE_BLOCK.get());
                        output.accept(ModBlocks.LEAD_ORE_BLOCK.get());
                        output.accept(ModBlocks.RUBY_ORE_BLOCK.get());
                        output.accept(ModBlocks.URAN_ORE_BLOCK.get());

                        // --- DEEPSLATE ERZE ---
                        output.accept(ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_BLACKCRISTAL_ORE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get());

                        // --- ERZBLÖCKE ---
                        output.accept(ModBlocks.BLOCK_OF_TITAN.get());
                        output.accept(ModBlocks.BLOCK_OF_BLACKCRISTAL.get());
                        output.accept(ModBlocks.BLOCK_OF_VULKANIT.get());
                        output.accept(ModBlocks.BLOCK_OF_MAGNETIT.get());
                        output.accept(ModBlocks.BLOCK_OF_KILLIUM.get());
                        output.accept(ModBlocks.BLOCK_OF_LEAD.get());
                        output.accept(ModBlocks.BLOCK_OF_RUBY.get());
                        output.accept(ModBlocks.BLOCK_OF_URAN.get());

                        // --- TRÄNKE & PFEILE ---
                        // Hinweis: ModPotions muss ebenfalls als DeferredHolder/Holder vorliegen
                        if (ModPotions.IRRADIANT_POTION != null) {
                            output.accept(PotionContents.createItemStack(Items.POTION, ModPotions.IRRADIANT_POTION));
                            output.accept(PotionContents.createItemStack(Items.SPLASH_POTION, ModPotions.IRRADIANT_POTION));
                            output.accept(PotionContents.createItemStack(Items.LINGERING_POTION, ModPotions.IRRADIANT_POTION));
                            output.accept(PotionContents.createItemStack(Items.TIPPED_ARROW, ModPotions.IRRADIANT_POTION));
                        }
                    })
                    .build()
    );

    // Registrierungsmethode für das Event-System in der Hauptklasse
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}