package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@EventBusSubscriber(modid = OresRenewed.MOD_ID)
public class ModKilliumSwordOffhand {

    public static int death_sec = 2;
    private static final int DEATH_TICKS = death_sec * 20;

    private static final Map<UUID, Integer> OFFHAND_TICKS = new HashMap<>();

    // Server-Tick Event für NeoForge
    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Post event) {
        for (ServerPlayer player : event.getServer().getPlayerList().getPlayers()) {
            UUID id = player.getUUID();

            boolean hasKilliumSwordInHand = player.getMainHandItem().is(ModItems.KILLIUM_SWORD.get()) ||
                    player.getOffhandItem().is(ModItems.KILLIUM_SWORD.get());

            if (hasKilliumSwordInHand) {
                int ticks = OFFHAND_TICKS.merge(id, 1, Integer::sum);

                if (ticks >= DEATH_TICKS) {
                    player.hurtServer((ServerLevel) player.level(), player.damageSources().magic(), Float.MAX_VALUE);
                    OFFHAND_TICKS.remove(id);
                }
            } else {
                OFFHAND_TICKS.remove(id);
            }
        }
    }
}