package com.gimicard.oresrenewed;

import com.gimicard.oresrenewed.datagen.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = OresRenewed.MOD_ID)
public class OresRenewedDataGen {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent.Client event) {
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		var lookupProvider = event.getLookupProvider();

		generator.addProvider(true, new ModModelProvider(packOutput));
		generator.addProvider(true, new ModBlockTagsProvider(packOutput, lookupProvider));
		generator.addProvider(true, new ModLootTableProvider(packOutput, lookupProvider));
		generator.addProvider(true, new ModRecipeProvider.Runner(packOutput, lookupProvider));
		generator.addProvider(true, new ModItemTagsProvider(packOutput, lookupProvider));
	}
}