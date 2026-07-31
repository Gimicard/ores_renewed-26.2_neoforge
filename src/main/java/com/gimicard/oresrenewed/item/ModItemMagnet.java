package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

import java.util.List;

@EventBusSubscriber(modid = OresRenewed.MOD_ID)
public class ModItemMagnet {

    private static final double RADIUS = 8.0;
    private static final double PULL_SPEED = 0.3;

    // Server-Tick Event für NeoForge
    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Post event) {
        for (ServerPlayer player : event.getServer().getPlayerList().getPlayers()) {

            // Prüfen, ob der Magnet oder die Magnetit-Spitzhacke in der Haupt- oder Nebenhand gehalten wird
            boolean hasMagnetItem = player.getMainHandItem().is(ModItems.MAGNETIT_PICKAXE.get())
                    || player.getMainHandItem().is(ModItems.MAGNET.get())
                    || player.getOffhandItem().is(ModItems.MAGNETIT_PICKAXE.get())
                    || player.getOffhandItem().is(ModItems.MAGNET.get());

            if (!hasMagnetItem) {
                continue;
            }

            // Umgebende Items suchen und anziehen
            AABB searchBox = player.getBoundingBox().inflate(RADIUS);
            List<ItemEntity> nearbyItems = player.level().getEntitiesOfClass(ItemEntity.class, searchBox);

            for (ItemEntity itemEntity : nearbyItems) {
                Vec3 direction = player.position().subtract(itemEntity.position()).normalize();
                itemEntity.setDeltaMovement(itemEntity.getDeltaMovement().add(direction.scale(PULL_SPEED)));
            }
        }
    }
}