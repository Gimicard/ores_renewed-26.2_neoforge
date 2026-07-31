package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.block.ModBlocks;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@EventBusSubscriber(modid = OresRenewed.MOD_ID)
public class ModKilliumRadiation {

    private static final int DEATH_SECONDS = 5; // Sekunden bis zum Tod
    private static final int DEATH_TICKS = 20 * DEATH_SECONDS;

    private static final Map<UUID, Integer> EXPOSURE_TICKS = new HashMap<>();

    // Server-Tick Event für NeoForge
    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Post event) {
        for (ServerPlayer player : event.getServer().getPlayerList().getPlayers()) {
            UUID id = player.getUUID();

            if (hasRadioactiveItem(player.getInventory())) {
                int ticks = EXPOSURE_TICKS.merge(id, 1, Integer::sum);

                if (ticks >= DEATH_TICKS) {
                    player.hurtServer((ServerLevel) player.level(), player.damageSources().magic(), Float.MAX_VALUE);
                    EXPOSURE_TICKS.remove(id);
                }
            } else {
                EXPOSURE_TICKS.remove(id);
            }
        }
    }

    private static boolean hasRadioactiveItem(Inventory inventory) {
        for (int i = 0; i < inventory.getContainerSize(); i++) {
            var item = inventory.getItem(i).getItem();

            // Direktes Prüfen gegen die registrierten Items/Blöcke via .get()
            if (item == ModItems.RAW_KILLIUM.get() ||
                    item == ModItems.KILLIUM_INGOT.get() ||
                    item == ModBlocks.KILLIUM_ORE_BLOCK.get().asItem() ||
                    item == ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK.get().asItem() ||
                    item == ModBlocks.BLOCK_OF_KILLIUM.get().asItem()) {
                return true;
            }
        }
        return false;
    }
}