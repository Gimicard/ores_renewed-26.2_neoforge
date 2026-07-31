package com.gimicard.oresrenewed.effect;

import com.gimicard.oresrenewed.OresRenewed;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffect {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, OresRenewed.MOD_ID);

    public static final DeferredHolder<MobEffect, MobEffect> IRRADIATED =
            MOB_EFFECTS.register("irradiated",
                    () -> new irradiated(MobEffectCategory.HARMFUL, 0x4CAF1E));

    public static void registerEffects() {
        OresRenewed.LOGGER.info("Registering ModEffects for " + OresRenewed.MOD_ID);
    }
}