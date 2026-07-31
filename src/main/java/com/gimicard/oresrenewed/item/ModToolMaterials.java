package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.tags.ModTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public  static final ToolMaterial LEAD = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_LEAD_TOOL,
            200, 5f, 2.0f,12, ModTags.Items.LEAD_REPAIR);

    public  static final ToolMaterial VULKANIT = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_VULKANIT_TOOL,
            1000, 2.5f, 2.0f,5, ModTags.Items.VULKANIT_REPAIR);

    public  static final ToolMaterial TITAN = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_TITAN_TOOL,
            500, 10f, 2.0f,14, ModTags.Items.TITAN_REPAIR);

    public  static final ToolMaterial RUBY = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL,
            2500, 12.0F, 2.0F, 22, ModTags.Items.RUBY_REPAIR);

    public  static final ToolMaterial MAGNETIT = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_MAGNETIT_TOOL,
            700, 5.0F, 1.0F, 13, ModTags.Items.MAGNETIT_REPAIR);

    public  static final ToolMaterial KILLIUM = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_KILLIUM_TOOL,
            250, 5.0F, 5.0F, 13, ModTags.Items.KILLIUM_REPAIR);
}

