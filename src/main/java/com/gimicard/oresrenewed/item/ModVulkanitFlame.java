package com.gimicard.oresrenewed.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModVulkanitFlame extends Item {

    int fire_sec = 5;

    public ModVulkanitFlame(Properties properties) {
        super(properties);
    }

    @Override
    public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.igniteForSeconds(fire_sec);

        super.hurtEnemy(stack, target, attacker);
    }
}