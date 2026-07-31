package com.gimicard.oresrenewed;

import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.creativemodetab.ModCreativeModeTabs;
import com.gimicard.oresrenewed.effect.ModEffect;
import com.gimicard.oresrenewed.item.ModItems;
import com.gimicard.oresrenewed.item.ModToolMaterials;
import com.gimicard.oresrenewed.potion.ModPotions;
import com.gimicard.oresrenewed.tags.ModTags;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(OresRenewed.MOD_ID)
public class OresRenewed {

    public static final String MOD_ID = "ores_renewed";

    public static final Logger LOGGER = LogUtils.getLogger();



    public OresRenewed(IEventBus modEventBus, ModContainer modContainer) {

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);

        ModEffect.registerEffects();
        ModPotions.registerPotions();

        ModPotions.POTIONS.register(modEventBus);
        ModEffect.MOB_EFFECTS.register(modEventBus);

        ModCreativeModeTabs.register(modEventBus);



        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);


        modEventBus.addListener(this::addCreative);


        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
