package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.effect.ModEffect;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Inventory;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

@EventBusSubscriber(modid = OresRenewed.MOD_ID)
public class ModUranRadiation {

    private static final int AMP = 1;
    private static final int R_AMP = AMP - 1;

    public static final int REFRESH = 5;
    private static final int EFFECT_REFRESH_DURATION = 20 * REFRESH;

    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Post event) {
        for (ServerPlayer player : event.getServer().getPlayerList().getPlayers()) {
            if (hasUranItem(player.getInventory())) {
                // WICHTIG: .get() hier aufrufen, damit es erst im Spiel-Tick geladen wird!
                player.addEffect(new MobEffectInstance(ModEffect.IRRADIATED, EFFECT_REFRESH_DURATION, R_AMP));
            }
        }
    }

    private static boolean hasUranItem(Inventory inventory) {
        for (int i = 0; i < inventory.getContainerSize(); i++) {
            var item = inventory.getItem(i).getItem();

            if (item == ModItems.RAW_URAN.get() ||
                    item == ModItems.URAN_INGOT.get() ||
                    item == ModItems.URAN_FUEL_ROD.get() ||
                    item == ModBlocks.URAN_ORE_BLOCK.get().asItem() ||
                    item == ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get().asItem() ||
                    item == ModBlocks.BLOCK_OF_URAN.get().asItem()) {
                return true;
            }
        }
        return false;
    }
}