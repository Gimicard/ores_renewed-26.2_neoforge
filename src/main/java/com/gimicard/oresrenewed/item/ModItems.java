package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModItems {

    // Erstellt das DeferredRegister für Items bei NeoForge
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OresRenewed.MOD_ID);

    // --- NORMAL ITEMS ---
    public static final DeferredItem<Item> MAGNET = registerItem("magnet", Item::new);
    public static final DeferredItem<Item> URAN_FUEL_ROD = registerItem("uran_fuel_rod", Item::new);

    public static final DeferredItem<Item> RAW_URAN = registerItem("raw_uran", Item::new);
    public static final DeferredItem<Item> RAW_TITAN = registerItem("raw_titan", Item::new);
    public static final DeferredItem<Item> RAW_VULKANIT = registerItem("raw_vulkanit", Item::new);
    public static final DeferredItem<Item> RAW_MAGNETIT = registerItem("raw_magnetit", Item::new);
    public static final DeferredItem<Item> RAW_KILLIUM = registerItem("raw_killium", Item::new);
    public static final DeferredItem<Item> RAW_LEAD = registerItem("raw_lead", Item::new);

    public static final DeferredItem<Item> URAN_INGOT = registerItem("uran_ingot", Item::new);
    public static final DeferredItem<Item> TITAN_INGOT = registerItem("titan_ingot", Item::new);
    public static final DeferredItem<Item> VULKANIT_INGOT = registerItem("vulkanit_ingot", Item::new);
    public static final DeferredItem<Item> MAGNETIT_INGOT = registerItem("magnetit_ingot", Item::new);
    public static final DeferredItem<Item> KILLIUM_INGOT = registerItem("killium_ingot", Item::new);
    public static final DeferredItem<Item> LEAD_INGOT = registerItem("lead_ingot", Item::new);

    public static final DeferredItem<Item> RUBY = registerItem("ruby", Item::new);
    public static final DeferredItem<Item> BLACKCRISTAL = registerItem("blackcristal", Item::new);

    // --- VULKANIT TOOLS ---
    public static final DeferredItem<Item> VULKANIT_SWORD = registerItem("vulkanit_sword", props -> new ModVulkanitFlame(props.sword(ModToolMaterials.VULKANIT, 3, -2.4f)));
    public static final DeferredItem<Item> VULKANIT_PICKAXE = registerItem("vulkanit_pickaxe", props -> new Item(props.pickaxe(ModToolMaterials.VULKANIT, 1, -2.8f)));
    public static final DeferredItem<Item> VULKANIT_SHOVEL = registerItem("vulkanit_shovel", props -> new ShovelItem(ModToolMaterials.VULKANIT, 1.5f, -3f, props));
    public static final DeferredItem<Item> VULKANIT_AXE = registerItem("vulkanit_axe", props -> new AxeItem(ModToolMaterials.VULKANIT, 6f, -3.2f, props));
    public static final DeferredItem<Item> VULKANIT_HOE = registerItem("vulkanit_hoe", props -> new HoeItem(ModToolMaterials.VULKANIT, 0f, -3f, props));
    public static final DeferredItem<Item> VULKANIT_SPEAR = registerItem("vulkanit_spear", props -> new Item(props.spear(ModToolMaterials.VULKANIT, 1.05F, 1.075F, 0.5F, 3.0F, 10.0F, 6.5F, 5.1F, 10.0F, 4.6F)));

    // --- LEAD TOOLS ---
    public static final DeferredItem<Item> LEAD_PICKAXE = registerItem("lead_pickaxe", props -> new Item(props.pickaxe(ModToolMaterials.LEAD, 1, -2.8f)));

    // --- TITAN TOOLS ---
    public static final DeferredItem<Item> TITAN_SWORD = registerItem("titan_sword", props -> new Item(props.sword(ModToolMaterials.TITAN, 3.0F, -2.9F)));
    public static final DeferredItem<Item> TITAN_PICKAXE = registerItem("titan_pickaxe", props -> new Item(props.pickaxe(ModToolMaterials.TITAN, 1, -2.9f)));
    public static final DeferredItem<Item> TITAN_SHOVEL = registerItem("titan_shovel", props -> new ShovelItem(ModToolMaterials.TITAN, 1.5f, -3f, props));
    public static final DeferredItem<Item> TITAN_AXE = registerItem("titan_axe", props -> new AxeItem(ModToolMaterials.TITAN, 6f, -3.2f, props));
    public static final DeferredItem<Item> TITAN_HOE = registerItem("titan_hoe", props -> new HoeItem(ModToolMaterials.TITAN, 0f, -3f, props));
    public static final DeferredItem<Item> TITAN_SPEAR = registerItem("titan_spear", props -> new Item(props.spear(ModToolMaterials.TITAN, 0.95F, 0.95F, 0.6F, 2.5F, 11.0F, 6.75F, 5.1F, 11.25F, 4.6F)));

    // --- RUBY TOOLS ---
    public static final DeferredItem<Item> RUBY_SWORD = registerItem("ruby_sword", props -> new Item(props.sword(ModToolMaterials.RUBY, 3.0F, -2.4F)));
    public static final DeferredItem<Item> RUBY_PICKAXE = registerItem("ruby_pickaxe", props -> new Item(props.pickaxe(ModToolMaterials.RUBY, 1.0F, -2.8F)));
    public static final DeferredItem<Item> RUBY_SHOVEL = registerItem("ruby_shovel", props -> new ShovelItem(ModToolMaterials.RUBY, 1.5F, -3.0F, props));
    public static final DeferredItem<Item> RUBY_AXE = registerItem("ruby_axe", props -> new AxeItem(ModToolMaterials.RUBY, 6.0F, -3.0F, props));
    public static final DeferredItem<Item> RUBY_HOE = registerItem("ruby_hoe", props -> new HoeItem(ModToolMaterials.RUBY, 0.0F, -3.0F, props));
    public static final DeferredItem<Item> RUBY_SPEAR = registerItem("ruby_spear", props -> new Item(props.spear(ModToolMaterials.RUBY, 0.95F, 0.7F, 0.7F, 3.5F, 13.0F, 8.5F, 5.1F, 13.75F, 4.6F)));

    // --- MAGNETIT & KILLIUM TOOLS ---
    public static final DeferredItem<Item> MAGNETIT_PICKAXE = registerItem("magnetit_pickaxe", props -> new Item(props.pickaxe(ModToolMaterials.MAGNETIT, 1, -2.8f)));
    public static final DeferredItem<Item> KILLIUM_SWORD = registerItem("killium_sword", props -> new Item(props.sword(ModToolMaterials.KILLIUM, 10.0F, -2.4F)));


    private static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, T> function) {
        return ITEMS.registerItem(name, function);
    }


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}