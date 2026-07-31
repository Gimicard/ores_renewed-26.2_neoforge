package com.gimicard.oresrenewed.potion;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.effect.ModEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(Registries.POTION, OresRenewed.MOD_ID);

    public static final DeferredHolder<Potion, Potion> IRRADIANT_POTION =
            POTIONS.register("irradiant_potion",
                    () -> new Potion("irradiant_potion",
                            new MobEffectInstance(ModEffect.IRRADIATED, 1200, 0)));

    public static void registerPotions() {
        OresRenewed.LOGGER.info("Registering Potions for " + OresRenewed.MOD_ID);
    }
}