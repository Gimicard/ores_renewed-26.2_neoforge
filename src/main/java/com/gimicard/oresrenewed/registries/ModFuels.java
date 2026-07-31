package com.gimicard.oresrenewed.registries;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.item.ModItems;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;

@EventBusSubscriber(modid = OresRenewed.MOD_ID)
public class ModFuels {

    @SubscribeEvent
    public static void onFurnaceFuelBurnTime(FurnaceFuelBurnTimeEvent event) {
        if (event.getItemStack().is(ModItems.URAN_FUEL_ROD.get())) {
            event.setBurnTime(200 * 64 * 2);
        }
    }
}