package com.gimicard.oresrenewed.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class irradiated extends MobEffect {


    private static final int DAMAGE_INTERVAL_TICKS = 20;
    private static final int NAUGA_TIME = 5;
    private static final float damage = 2.0f;

    public irradiated(MobEffectCategory category, int color) {
        super(category, color);
    }


    @Override
    public boolean applyEffectTick(ServerLevel serverLevel, LivingEntity mob, int amplification) {

        mob.hurtServer(serverLevel, mob.damageSources().magic(), damage + amplification);


        mob.addEffect(new MobEffectInstance(MobEffects.NAUSEA, 20 * NAUGA_TIME, 1));

        return true;
    }


    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return duration % DAMAGE_INTERVAL_TICKS == 0;
    }
}