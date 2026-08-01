package com.gimicard.oresrenewed.datagen;

import com.gimicard.oresrenewed.OresRenewed;
import com.gimicard.oresrenewed.block.ModBlocks;
import com.gimicard.oresrenewed.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "OresRenewed Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        // --- SMELTABLES & BLASTING ---
        List<ItemLike> KILLIUM_SMELTABLES = List.of(ModItems.RAW_KILLIUM.get(), ModBlocks.KILLIUM_ORE_BLOCK.get(), ModBlocks.DEEPSLATE_KILLIUM_ORE_BLOCK.get());
        oreSmelting(KILLIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.KILLIUM_INGOT.get(), 0.25f, 200, "killium");
        oreBlasting(KILLIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.KILLIUM_INGOT.get(), 0.25f, 100, "killium");

        List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD.get(), ModBlocks.LEAD_ORE_BLOCK.get(), ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get());
        oreSmelting(LEAD_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LEAD_INGOT.get(), 0.25f, 200, "lead");
        oreBlasting(LEAD_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LEAD_INGOT.get(), 0.25f, 100, "lead");

        List<ItemLike> MAGNETIT_SMELTABLES = List.of(ModItems.RAW_MAGNETIT.get(), ModBlocks.MAGNETIT_ORE_BLOCK.get(), ModBlocks.DEEPSLATE_MAGNETIT_ORE_BLOCK.get());
        oreSmelting(MAGNETIT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.MAGNETIT_INGOT.get(), 0.25f, 200, "magnetit");
        oreBlasting(MAGNETIT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.MAGNETIT_INGOT.get(), 0.25f, 100, "magnetit");

        List<ItemLike> TITAN_SMELTABLES = List.of(ModItems.RAW_TITAN.get(), ModBlocks.TITAN_ORE_BLOCK.get(), ModBlocks.DEEPSLATE_TITAN_ORE_BLOCK.get());
        oreSmelting(TITAN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TITAN_INGOT.get(), 0.25f, 200, "titan");
        oreBlasting(TITAN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TITAN_INGOT.get(), 0.25f, 100, "titan");

        List<ItemLike> URAN_SMELTABLES = List.of(ModItems.RAW_URAN.get(), ModBlocks.URAN_ORE_BLOCK.get(), ModBlocks.DEEPSLATE_URAN_ORE_BLOCK.get());
        oreSmelting(URAN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.URAN_INGOT.get(), 0.25f, 200, "uran");
        oreBlasting(URAN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.URAN_INGOT.get(), 0.25f, 100, "uran");

        List<ItemLike> VULKANIT_SMELTABLES = List.of(ModItems.RAW_VULKANIT.get(), ModBlocks.VULKANIT_ORE_BLOCK.get(), ModBlocks.DEEPSLATE_VULKANIT_ORE_BLOCK.get());
        oreSmelting(VULKANIT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.VULKANIT_INGOT.get(), 0.25f, 200, "vulkanit");
        oreBlasting(VULKANIT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.VULKANIT_INGOT.get(), 0.25f, 100, "vulkanit");

        // --- NINE BLOCK STORAGE RECIPES ---
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.BLACKCRISTAL.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_BLACKCRISTAL.get());
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.KILLIUM_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_KILLIUM.get());
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_LEAD.get());
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.MAGNETIT_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_MAGNETIT.get());
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RUBY.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_RUBY.get());
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.TITAN_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_TITAN.get());
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.URAN_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_URAN.get());
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.VULKANIT_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_VULKANIT.get());

        // --- SHAPED RECIPES ---
        shaped(RecipeCategory.TOOLS, ModItems.MAGNET.get())
                .pattern("M M")
                .pattern(" T ")
                .pattern("   ")
                .define('M', ModItems.MAGNETIT_INGOT.get())
                .define('T', ModItems.TITAN_INGOT)
                .unlockedBy(getHasName(ModItems.MAGNETIT_INGOT.get()), has(ModItems.MAGNETIT_INGOT.get()))
                .group("magnet")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.URAN_FUEL_ROD.get())
                .pattern("U  ")
                .pattern(" U ")
                .pattern("  U")
                .define('U', ModItems.URAN_INGOT.get())
                .unlockedBy(getHasName(ModItems.URAN_INGOT.get()), has(ModItems.URAN_INGOT.get()))
                .group("uran")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.LEAD_PICKAXE.get())
                .pattern("LLL")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.LEAD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .group("lead")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.MAGNETIT_PICKAXE.get())
                .pattern("LLL")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.MAGNETIT_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.MAGNETIT_INGOT.get()), has(ModItems.MAGNETIT_INGOT.get()))
                .group("magnetit")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.KILLIUM_SWORD.get())
                .pattern(" L ")
                .pattern(" L ")
                .pattern(" S ")
                .define('L', ModItems.KILLIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.KILLIUM_INGOT.get()), has(ModItems.KILLIUM_INGOT.get()))
                .group("killium")
                .save(output);

        //-----ruby------

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_SWORD)
                .pattern(" L ")
                .pattern(" L ")
                .pattern(" S ")
                .define('L', ModItems.RUBY)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .group("ruby")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE)
                .pattern("LLL")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.RUBY)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .group("ruby")
                .define('S', Items.STICK)
                .save(output);


        shaped(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL)
                .pattern(" L ")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.RUBY)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .group("ruby")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.RUBY_AXE)
                .pattern(" LL")
                .pattern(" SL")
                .pattern(" S ")
                .define('L', ModItems.RUBY)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .group("ruby")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.RUBY_HOE)
                .pattern(" LL")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.RUBY)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .group("ruby")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.RUBY_SPEAR)
                .pattern("  L")
                .pattern(" S ")
                .pattern("S  ")
                .define('L', ModItems.RUBY)
                .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                .group("ruby")
                .define('S', Items.STICK)
                .save(output);

        //-----titan------

        shaped(RecipeCategory.COMBAT, ModItems.TITAN_SWORD)
                .pattern(" L ")
                .pattern(" L ")
                .pattern(" S ")
                .define('L', ModItems.TITAN_INGOT)
                .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                .group("titan")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.TITAN_PICKAXE)
                .pattern("LLL")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.TITAN_INGOT)
                .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                .group("titan")
                .define('S', Items.STICK)
                .save(output);


        shaped(RecipeCategory.TOOLS, ModItems.TITAN_SHOVEL)
                .pattern(" L ")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.TITAN_INGOT)
                .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                .group("titan")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.TITAN_AXE)
                .pattern(" LL")
                .pattern(" SL")
                .pattern(" S ")
                .define('L', ModItems.TITAN_INGOT)
                .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                .group("titan")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.TITAN_HOE)
                .pattern(" LL")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.TITAN_INGOT)
                .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                .group("titan")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.TITAN_SPEAR)
                .pattern("  L")
                .pattern(" S ")
                .pattern("S  ")
                .define('L', ModItems.TITAN_INGOT)
                .unlockedBy(getHasName(ModItems.TITAN_INGOT), has(ModItems.TITAN_INGOT))
                .group("titan")
                .define('S', Items.STICK)
                .save(output);

        //-----vulkanit------

        shaped(RecipeCategory.COMBAT, ModItems.VULKANIT_SWORD)
                .pattern(" L ")
                .pattern(" L ")
                .pattern(" S ")
                .define('L', ModItems.VULKANIT_INGOT)
                .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                .group("vulkanit")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.VULKANIT_PICKAXE)
                .pattern("LLL")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.VULKANIT_INGOT)
                .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                .group("vulkanit")
                .define('S', Items.STICK)
                .save(output);


        shaped(RecipeCategory.TOOLS, ModItems.VULKANIT_SHOVEL)
                .pattern(" L ")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.VULKANIT_INGOT)
                .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                .group("vulkanit")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.VULKANIT_AXE)
                .pattern(" LL")
                .pattern(" SL")
                .pattern(" S ")
                .define('L', ModItems.VULKANIT_INGOT)
                .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                .group("vulkanit")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.VULKANIT_HOE)
                .pattern(" LL")
                .pattern(" S ")
                .pattern(" S ")
                .define('L', ModItems.VULKANIT_INGOT)
                .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                .group("vulkanit")
                .define('S', Items.STICK)
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.VULKANIT_SPEAR)
                .pattern("  L")
                .pattern(" S ")
                .pattern("S  ")
                .define('L', ModItems.VULKANIT_INGOT)
                .unlockedBy(getHasName(ModItems.VULKANIT_INGOT), has(ModItems.VULKANIT_INGOT))
                .group("vulkanit")
                .define('S', Items.STICK)
                .save(output);
    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
                                                                RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result,
                                                                float experience, int cookingTime, String group, String fromDesc) {
        for(ItemLike itemlike : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(output, OresRenewed.MOD_ID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
        }
    }
}