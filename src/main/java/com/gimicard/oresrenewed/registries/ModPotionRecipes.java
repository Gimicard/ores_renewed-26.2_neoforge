package com.gimicard.oresrenewed.registries;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.item.ModItems;
import com.gimicard.oresrenewed.potion.ModPotions;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

@EventBusSubscriber(modid = OresRenewed.MOD_ID)
public class ModPotionRecipes {

    @SubscribeEvent
    public static void registerPotionRecipes(RegisterBrewingRecipesEvent event) {
        event.getBuilder().addMix(
                Potions.AWKWARD,
                ModItems.URAN_INGOT.get(),
                ModPotions.IRRADIANT_POTION
        );
    }
}