package com.stonytark.usefultoolsmod.item;

import com.stonytark.usefultoolsmod.block.ModBlocks;
import com.stonytark.usefultoolsmod.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

// In 1.20.2 NeoForge, ForgeTier constructor: (level, uses, speed, attackDamageBonus, enchantmentValue, tag, repairIngredient)
// No 'incorrectForDrops' tag — that was added in 1.21.
public class ModToolTiers {
    public static final Tier JEMERALD = new SimpleTier(3, 1361, 6.0f, 4.5f, 22,
            ModTags.Blocks.NEEDS_JEM_TOOL, () -> Ingredient.of(Items.EMERALD));

    public static final Tier SEMERALD = new SimpleTier(3, 1561, 7.0f, 3.2f, 30,
            ModTags.Blocks.NEEDS_SEM_TOOL, () -> Ingredient.of(ModItems.SEM.get()));

    public static final Tier JOBSIDIAN = new SimpleTier(4, 1650, 9.0f, 6.0f, 15,
            ModTags.Blocks.NEEDS_JOB_TOOL, () -> Ingredient.of(ModItems.OBSHARD.get()));

    public static final Tier SOBSIDIAN = new SimpleTier(4, 2031, 10.0f, 5.0f, 18,
            ModTags.Blocks.NEEDS_SOB_TOOL, () -> Ingredient.of(ModItems.OBINGOT.get()));

    public static final Tier OVERPOWER = new SimpleTier(5, 9999, 25.0f, 30.0f, 35,
            ModTags.Blocks.NEEDS_OP_TOOL, () -> Ingredient.of(ModBlocks.SOBLOCK.get()));

    public static final Tier HREDSTONE = new SimpleTier(2, 600, 8.0f, 3.0f, 20,
            ModTags.Blocks.NEEDS_HRED_TOOL, () -> Ingredient.of(ModItems.HRED.get()));

    public static final Tier RGOLD = new SimpleTier(3, 1200, 8.0f, 3.5f, 16,
            ModTags.Blocks.NEEDS_RGOLD_TOOL, () -> Ingredient.of(ModItems.RGOLD.get()));

    public static final Tier RLAPIS = new SimpleTier(3, 1100, 9.0f, 3.2f, 32,
            ModTags.Blocks.NEEDS_RLAPIS_TOOL, () -> Ingredient.of(ModItems.RGOLD.get()));
}
