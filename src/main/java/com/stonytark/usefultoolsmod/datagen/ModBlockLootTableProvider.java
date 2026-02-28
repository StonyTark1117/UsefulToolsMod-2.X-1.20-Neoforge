package com.stonytark.usefultoolsmod.datagen;

import com.stonytark.usefultoolsmod.block.ModBlocks;
import com.stonytark.usefultoolsmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import java.util.Set;

// In 1.20.2 NeoForge, BlockLootSubProvider(Set<Item>, FeatureFlagSet) — no pRegistries parameter.
public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.RGOLDBLOCK.get());
        dropSelf(ModBlocks.HRBLOCK.get());
        dropSelf(ModBlocks.SEMBLOCK.get());
        dropSelf(ModBlocks.SOBLOCK.get());
        dropSelf(ModBlocks.LBLOCK.get());

        this.add(ModBlocks.RGOLDORE.get(),
                block -> createOreDrop(ModBlocks.RGOLDORE.get(), ModItems.RGOLD.get()));
        this.add(ModBlocks.RGOLD_NETHER_ORE.get(),
                block -> createOreDrop(ModBlocks.RGOLD_NETHER_ORE.get(), ModItems.RGOLD.get()));
        this.add(ModBlocks.RGOLD_END_ORE.get(),
                block -> createOreDrop(ModBlocks.RGOLD_END_ORE.get(), ModItems.RGOLD.get()));
        this.add(ModBlocks.RGOLD_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.RGOLD_END_ORE.get(), ModItems.RGOLD.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(e -> (Block) e.get())::iterator;
    }
}
