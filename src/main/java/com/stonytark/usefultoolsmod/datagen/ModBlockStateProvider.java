package com.stonytark.usefultoolsmod.datagen;

import com.stonytark.usefultoolsmod.UsefultoolsMod;
import com.stonytark.usefultoolsmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, UsefultoolsMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RGOLDBLOCK);
        blockWithItem(ModBlocks.HRBLOCK);
        blockWithItem(ModBlocks.RGOLDORE);
        blockWithItem(ModBlocks.SEMBLOCK);
        blockWithItem(ModBlocks.SOBLOCK);
        blockWithItem(ModBlocks.LBLOCK);
        blockWithItem(ModBlocks.RGOLD_NETHER_ORE);
        blockWithItem(ModBlocks.RGOLD_END_ORE);
        blockWithItem(ModBlocks.RGOLD_DEEPSLATE_ORE);
    }

    private void blockWithItem(DeferredHolder<Block, Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(DeferredHolder<Block, ? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("tutorialmod:block/" +
                BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(DeferredHolder<Block, ? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("tutorialmod:block/" +
                BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
