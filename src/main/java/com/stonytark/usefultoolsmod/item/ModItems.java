package com.stonytark.usefultoolsmod.item;

import com.stonytark.usefultoolsmod.UsefultoolsMod;
import com.stonytark.usefultoolsmod.entity.ModEntities;
import com.stonytark.usefultoolsmod.item.custom.*;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, UsefultoolsMod.MOD_ID);

    public static final DeferredHolder<Item, Item> RGOLD = ITEMS.register("rgold",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> RAW_RGOLD = ITEMS.register("raw_rgold",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> OBSHARD = ITEMS.register("obshard",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> SEM = ITEMS.register("sem",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> OBINGOT = ITEMS.register("obingot",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> GRENADE = ITEMS.register("grenade",
            () -> new Grenade(new Item.Properties().stacksTo(16)));

    public static final DeferredHolder<Item, Item> HRED = ITEMS.register("hred",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> HGLOW = ITEMS.register("hglow",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> RLAPIS = ITEMS.register("rlapis",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> DYNAMITE = ITEMS.register("dynamite",
                    () -> new Dynamite(new Item.Properties()
                            .stacksTo(16)
                            .fireResistant()  // optional
                    )
            );

    public static final DeferredHolder<Item, Item> REMERALD_SWORD = ITEMS.register("remerald_sword",
            () -> new SwordItem(ModToolTiers.REMERALD, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> REMERALD_PICKAXE = ITEMS.register("remerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REMERALD, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> REMERALD_SHOVEL = ITEMS.register("remerald_shovel",
            () -> new ShovelItem(ModToolTiers.REMERALD, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> REMERALD_AXE = ITEMS.register("remerald_axe",
            () -> new AxeItem(ModToolTiers.REMERALD, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> REMERALD_HOE = ITEMS.register("remerald_hoe",
            () -> new HoeItem(ModToolTiers.REMERALD, 0, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> PEMERALD_SWORD = ITEMS.register("pemerald_sword",
            () -> new SwordItem(ModToolTiers.PEMERALD, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PEMERALD_PICKAXE = ITEMS.register("pemerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PEMERALD, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PEMERALD_SHOVEL = ITEMS.register("pemerald_shovel",
            () -> new ShovelItem(ModToolTiers.PEMERALD, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PEMERALD_AXE = ITEMS.register("pemerald_axe",
            () -> new AxeItem(ModToolTiers.PEMERALD, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PEMERALD_HOE = ITEMS.register("pemerald_hoe",
            () -> new HoeItem(ModToolTiers.PEMERALD, 0, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> ROBSIDIAN_SWORD = ITEMS.register("robsidian_sword",
            () -> new SwordItem(ModToolTiers.ROBSIDIAN, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ROBSIDIAN_PICKAXE = ITEMS.register("robsidian_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ROBSIDIAN, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ROBSIDIAN_SHOVEL = ITEMS.register("robsidian_shovel",
            () -> new ShovelItem(ModToolTiers.ROBSIDIAN, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ROBSIDIAN_AXE = ITEMS.register("robsidian_axe",
            () -> new AxeItem(ModToolTiers.ROBSIDIAN, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ROBSIDIAN_HOE = ITEMS.register("robsidian_hoe",
            () -> new HoeItem(ModToolTiers.ROBSIDIAN, 0, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> POBSIDIAN_SWORD = ITEMS.register("pobsidian_sword",
            () -> new SwordItem(ModToolTiers.POBSIDIAN, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> POBSIDIAN_PICKAXE = ITEMS.register("pobsidian_pickaxe",
            () -> new PickaxeItem(ModToolTiers.POBSIDIAN, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> POBSIDIAN_SHOVEL = ITEMS.register("pobsidian_shovel",
            () -> new ShovelItem(ModToolTiers.POBSIDIAN, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> POBSIDIAN_AXE = ITEMS.register("pobsidian_axe",
            () -> new AxeItem(ModToolTiers.POBSIDIAN, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> POBSIDIAN_HOE = ITEMS.register("pobsidian_hoe",
            () -> new HoeItem(ModToolTiers.POBSIDIAN, 0, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> OVERPOWER_SWORD = ITEMS.register("overpower_sword",
            () -> new SwordItem(ModToolTiers.OVERPOWER, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> OVERPOWER_PICKAXE = ITEMS.register("overpower_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OVERPOWER, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> OVERPOWER_SHOVEL = ITEMS.register("overpower_shovel",
            () -> new ShovelItem(ModToolTiers.OVERPOWER, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> OVERPOWER_AXE = ITEMS.register("overpower_axe",
            () -> new AxeItem(ModToolTiers.OVERPOWER, 6, -3.2f, new Item.Properties()));


    public static final DeferredHolder<Item, Item> HREDSTONE_SWORD = ITEMS.register("hredstone_sword",
            () -> new SwordItem(ModToolTiers.HREDSTONE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HREDSTONE_PICKAXE = ITEMS.register("hredstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HREDSTONE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HREDSTONE_SHOVEL = ITEMS.register("hredstone_shovel",
            () -> new ShovelItem(ModToolTiers.HREDSTONE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HREDSTONE_AXE = ITEMS.register("hredstone_axe",
            () -> new AxeItem(ModToolTiers.HREDSTONE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HREDSTONE_HOE = ITEMS.register("hredstone_hoe",
            () -> new HoeItem(ModToolTiers.HREDSTONE, 0, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> HGLOWSTONE_SWORD = ITEMS.register("hglowstone_sword",
            () -> new SwordItem(ModToolTiers.HGLOWSTONE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HGLOWSTONE_PICKAXE = ITEMS.register("hglowstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HGLOWSTONE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HGLOWSTONE_SHOVEL = ITEMS.register("hglowstone_shovel",
            () -> new ShovelItem(ModToolTiers.HGLOWSTONE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HGLOWSTONE_AXE = ITEMS.register("hglowstone_axe",
            () -> new AxeItem(ModToolTiers.HGLOWSTONE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HGLOWSTONE_HOE = ITEMS.register("hglowstone_hoe",
            () -> new HoeItem(ModToolTiers.HGLOWSTONE, 0, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> RGOLD_SWORD = ITEMS.register("rgold_sword",
            () -> new SwordItem(ModToolTiers.RGOLD, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_PICKAXE = ITEMS.register("rgold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RGOLD, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_SHOVEL = ITEMS.register("rgold_shovel",
            () -> new ShovelItem(ModToolTiers.RGOLD, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_AXE = ITEMS.register("rgold_axe",
            () -> new AxeItem(ModToolTiers.RGOLD, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_HOE = ITEMS.register("rgold_hoe",
            () -> new HoeItem(ModToolTiers.RGOLD, 0, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> RLAPIS_SWORD = ITEMS.register("rlapis_sword",
            () -> new SwordItem(ModToolTiers.RLAPIS, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_PICKAXE = ITEMS.register("rlapis_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RLAPIS, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_SHOVEL = ITEMS.register("rlapis_shovel",
            () -> new ShovelItem(ModToolTiers.RLAPIS, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_AXE = ITEMS.register("rlapis_axe",
            () -> new AxeItem(ModToolTiers.RLAPIS, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_HOE = ITEMS.register("rlapis_hoe",
            () -> new HoeItem(ModToolTiers.RLAPIS, 0, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> HRED_HELMET = ITEMS.register("hred_helmet",
            () -> new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> HRED_CHESTPLATE = ITEMS.register("hred_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> HRED_LEGGINGS = ITEMS.register("hred_leggings",
            () -> new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> HRED_BOOTS = ITEMS.register("hred_boots",
            () -> new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> HGLOW_HELMET = ITEMS.register("hglow_helmet",
            () -> new ArmorItem(ModArmorMaterials.HGLOW, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> HGLOW_CHESTPLATE = ITEMS.register("hglow_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HGLOW, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> HGLOW_LEGGINGS = ITEMS.register("hglow_leggings",
            () -> new ArmorItem(ModArmorMaterials.HGLOW, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> HGLOW_BOOTS = ITEMS.register("hglow_boots",
            () -> new ArmorItem(ModArmorMaterials.HGLOW, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> RGOLD_HELMET = ITEMS.register("rgold_helmet",
            () -> new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_CHESTPLATE = ITEMS.register("rgold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_LEGGINGS = ITEMS.register("rgold_leggings",
            () -> new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_BOOTS = ITEMS.register("rgold_boots",
            () -> new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> RLAPIS_HELMET = ITEMS.register("rlapis_helmet",
            () -> new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_CHESTPLATE = ITEMS.register("rlapis_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_LEGGINGS = ITEMS.register("rlapis_leggings",
            () -> new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_BOOTS = ITEMS.register("rlapis_boots",
            () -> new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> OVERPOWER_HELMET = ITEMS.register("overpower_helmet",
            () -> new ModArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> OVERPOWER_CHESTPLATE = ITEMS.register("overpower_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> OVERPOWER_LEGGINGS = ITEMS.register("overpower_leggings",
            () -> new ArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> OVERPOWER_BOOTS = ITEMS.register("overpower_boots",
            () -> new ArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> GHOST_SPAWN_EGG = ITEMS.register("ghost_spawn_egg",
            () -> new DeferredSpawnEggItem(() -> ModEntities.GHOST.get(), 0xFFFFFF, 0x999999, new Item.Properties()));

    public static final DeferredHolder<Item, Item> ECTOPLASM = ITEMS.register("ectoplasm",
            () -> new Item(new Item.Properties().stacksTo(64)));

    // -------------------------------------------------------------------------
    // Rough Ectoplasm tools (raw ectoplasm, stone-tier equivalent)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> RECTO_SWORD = ITEMS.register("recto_sword",
            () -> new EctoSwordItem(ModToolTiers.RECTO, 3, -2.4f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> RECTO_PICKAXE = ITEMS.register("recto_pickaxe",
            () -> new EctoPickaxeItem(ModToolTiers.RECTO, 1, -2.8f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> RECTO_SHOVEL = ITEMS.register("recto_shovel",
            () -> new EctoShovelItem(ModToolTiers.RECTO, 1.5f, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> RECTO_AXE = ITEMS.register("recto_axe",
            () -> new EctoAxeItem(ModToolTiers.RECTO, 6, -3.2f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> RECTO_HOE = ITEMS.register("recto_hoe",
            () -> new EctoHoeItem(ModToolTiers.RECTO, 0, -3f, new Item.Properties()));

    // -------------------------------------------------------------------------
    // Refined Ectoplasm + Ectoplasm tools + armor
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> REFINED_ECTOPLASM = ITEMS.register("refined_ectoplasm",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> ECTO_SWORD = ITEMS.register("ecto_sword",
            () -> new EctoSwordItem(ModToolTiers.ECTOPLASM, 3, -2.4f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> ECTO_PICKAXE = ITEMS.register("ecto_pickaxe",
            () -> new EctoPickaxeItem(ModToolTiers.ECTOPLASM, 1, -2.8f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> ECTO_SHOVEL = ITEMS.register("ecto_shovel",
            () -> new EctoShovelItem(ModToolTiers.ECTOPLASM, 1.5f, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> ECTO_AXE = ITEMS.register("ecto_axe",
            () -> new EctoAxeItem(ModToolTiers.ECTOPLASM, 6, -3.1f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> ECTO_HOE = ITEMS.register("ecto_hoe",
            () -> new EctoHoeItem(ModToolTiers.ECTOPLASM, 0, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> ECTO_HELMET = ITEMS.register("ecto_helmet",
            () -> new ArmorItem(ModArmorMaterials.ECTO, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> ECTO_CHESTPLATE = ITEMS.register("ecto_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ECTO, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> ECTO_LEGGINGS = ITEMS.register("ecto_leggings",
            () -> new ArmorItem(ModArmorMaterials.ECTO, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> ECTO_BOOTS = ITEMS.register("ecto_boots",
            () -> new ArmorItem(ModArmorMaterials.ECTO, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // -------------------------------------------------------------------------
    // Coal material items
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> HARDENED_COAL = ITEMS.register("hardened_coal",
            () -> new Item(new Item.Properties().stacksTo(64)));

    // -------------------------------------------------------------------------
    // Coal tools  (wood mining level, durability ~120, flammable)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> COAL_SWORD = ITEMS.register("coal_sword",
            () -> new CoalSwordItem(ModToolTiers.COAL_TOOL, 2, -2.4f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> COAL_PICKAXE = ITEMS.register("coal_pickaxe",
            () -> new CoalPickaxeItem(ModToolTiers.COAL_TOOL, 1, -2.8f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> COAL_SHOVEL = ITEMS.register("coal_shovel",
            () -> new CoalShovelItem(ModToolTiers.COAL_TOOL, 1.5f, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> COAL_AXE = ITEMS.register("coal_axe",
            () -> new CoalAxeItem(ModToolTiers.COAL_TOOL, 5, -3.2f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> COAL_HOE = ITEMS.register("coal_hoe",
            () -> new CoalHoeItem(ModToolTiers.COAL_TOOL, 0, -3f, new Item.Properties()));

    // -------------------------------------------------------------------------
    // Coal armor  (between leather and chainmail, flammable)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> COAL_HELMET = ITEMS.register("coal_helmet",
            () -> new CoalArmorItem(ModArmorMaterials.COAL, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> COAL_CHESTPLATE = ITEMS.register("coal_chestplate",
            () -> new CoalArmorItem(ModArmorMaterials.COAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> COAL_LEGGINGS = ITEMS.register("coal_leggings",
            () -> new CoalArmorItem(ModArmorMaterials.COAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final DeferredHolder<Item, Item> COAL_BOOTS = ITEMS.register("coal_boots",
            () -> new CoalArmorItem(ModArmorMaterials.COAL, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    // -------------------------------------------------------------------------
    // Raw metal rough tool sets
    // -------------------------------------------------------------------------

    // Rough Raw Gold (wood mining level — fast, fragile)
    public static final DeferredHolder<Item, Item> RRAW_GOLD_SWORD = ITEMS.register("rraw_gold_sword",
            () -> new SwordItem(ModToolTiers.RRAW_GOLD, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_GOLD_PICKAXE = ITEMS.register("rraw_gold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RRAW_GOLD, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_GOLD_SHOVEL = ITEMS.register("rraw_gold_shovel",
            () -> new ShovelItem(ModToolTiers.RRAW_GOLD, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_GOLD_AXE = ITEMS.register("rraw_gold_axe",
            () -> new AxeItem(ModToolTiers.RRAW_GOLD, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_GOLD_HOE = ITEMS.register("rraw_gold_hoe",
            () -> new HoeItem(ModToolTiers.RRAW_GOLD, 0, -3f, new Item.Properties()));

    // Rough Raw Copper (stone mining level)
    public static final DeferredHolder<Item, Item> RRAW_COPPER_SWORD = ITEMS.register("rraw_copper_sword",
            () -> new SwordItem(ModToolTiers.RRAW_COPPER, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_COPPER_PICKAXE = ITEMS.register("rraw_copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RRAW_COPPER, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_COPPER_SHOVEL = ITEMS.register("rraw_copper_shovel",
            () -> new ShovelItem(ModToolTiers.RRAW_COPPER, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_COPPER_AXE = ITEMS.register("rraw_copper_axe",
            () -> new AxeItem(ModToolTiers.RRAW_COPPER, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_COPPER_HOE = ITEMS.register("rraw_copper_hoe",
            () -> new HoeItem(ModToolTiers.RRAW_COPPER, 0, -3f, new Item.Properties()));

    // Rough Raw Iron (iron mining level)
    public static final DeferredHolder<Item, Item> RRAW_IRON_SWORD = ITEMS.register("rraw_iron_sword",
            () -> new SwordItem(ModToolTiers.RRAW_IRON, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_IRON_PICKAXE = ITEMS.register("rraw_iron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RRAW_IRON, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_IRON_SHOVEL = ITEMS.register("rraw_iron_shovel",
            () -> new ShovelItem(ModToolTiers.RRAW_IRON, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_IRON_AXE = ITEMS.register("rraw_iron_axe",
            () -> new AxeItem(ModToolTiers.RRAW_IRON, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_IRON_HOE = ITEMS.register("rraw_iron_hoe",
            () -> new HoeItem(ModToolTiers.RRAW_IRON, 0, -3f, new Item.Properties()));

    // Rough Raw Ferrous Gold (iron mining level)
    public static final DeferredHolder<Item, Item> RRAW_RGOLD_SWORD = ITEMS.register("rraw_rgold_sword",
            () -> new SwordItem(ModToolTiers.RRAW_RGOLD, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_RGOLD_PICKAXE = ITEMS.register("rraw_rgold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RRAW_RGOLD, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_RGOLD_SHOVEL = ITEMS.register("rraw_rgold_shovel",
            () -> new ShovelItem(ModToolTiers.RRAW_RGOLD, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_RGOLD_AXE = ITEMS.register("rraw_rgold_axe",
            () -> new AxeItem(ModToolTiers.RRAW_RGOLD, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RRAW_RGOLD_HOE = ITEMS.register("rraw_rgold_hoe",
            () -> new HoeItem(ModToolTiers.RRAW_RGOLD, 0, -3f, new Item.Properties()));

    // Rough Netherite Scrap (diamond mining level)
    public static final DeferredHolder<Item, Item> RSCRAP_SWORD = ITEMS.register("rscrap_sword",
            () -> new SwordItem(ModToolTiers.RSCRAP, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RSCRAP_PICKAXE = ITEMS.register("rscrap_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RSCRAP, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RSCRAP_SHOVEL = ITEMS.register("rscrap_shovel",
            () -> new ShovelItem(ModToolTiers.RSCRAP, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RSCRAP_AXE = ITEMS.register("rscrap_axe",
            () -> new AxeItem(ModToolTiers.RSCRAP, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RSCRAP_HOE = ITEMS.register("rscrap_hoe",
            () -> new HoeItem(ModToolTiers.RSCRAP, 0, -3f, new Item.Properties()));

    // -------------------------------------------------------------------------
    // Crystal / element material items
    // -------------------------------------------------------------------------

    public static final DeferredHolder<Item, Item> CALCIFIED_AMETHYST = ITEMS.register("calcified_amethyst",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> GLACIAL_SHARD = ITEMS.register("glacial_shard",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> POLISHED_QUARTZ = ITEMS.register("polished_quartz",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> POLISHED_PRISMARINE = ITEMS.register("polished_prismarine",
            () -> new Item(new Item.Properties().stacksTo(64)));

    // -------------------------------------------------------------------------
    // Rough Amethyst tools (iron mining level)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> RAMETHYST_SWORD = ITEMS.register("ramethyst_sword",
            () -> new SwordItem(ModToolTiers.RAMETHYST, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RAMETHYST_PICKAXE = ITEMS.register("ramethyst_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RAMETHYST, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RAMETHYST_SHOVEL = ITEMS.register("ramethyst_shovel",
            () -> new ShovelItem(ModToolTiers.RAMETHYST, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RAMETHYST_AXE = ITEMS.register("ramethyst_axe",
            () -> new AxeItem(ModToolTiers.RAMETHYST, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RAMETHYST_HOE = ITEMS.register("ramethyst_hoe",
            () -> new HoeItem(ModToolTiers.RAMETHYST, 0, -3f, new Item.Properties()));

    // -------------------------------------------------------------------------
    // Snow tools (stone mining level)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> SNOW_SWORD = ITEMS.register("snow_sword",
            () -> new SwordItem(ModToolTiers.SNOW_TOOL, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SNOW_PICKAXE = ITEMS.register("snow_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SNOW_TOOL, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SNOW_SHOVEL = ITEMS.register("snow_shovel",
            () -> new ShovelItem(ModToolTiers.SNOW_TOOL, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SNOW_AXE = ITEMS.register("snow_axe",
            () -> new AxeItem(ModToolTiers.SNOW_TOOL, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SNOW_HOE = ITEMS.register("snow_hoe",
            () -> new HoeItem(ModToolTiers.SNOW_TOOL, 0, -3f, new Item.Properties()));

    // -------------------------------------------------------------------------
    // Rough Quartz tools (iron mining level)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> RQUARTZ_SWORD = ITEMS.register("rquartz_sword",
            () -> new SwordItem(ModToolTiers.RQUARTZ, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RQUARTZ_PICKAXE = ITEMS.register("rquartz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RQUARTZ, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RQUARTZ_SHOVEL = ITEMS.register("rquartz_shovel",
            () -> new ShovelItem(ModToolTiers.RQUARTZ, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RQUARTZ_AXE = ITEMS.register("rquartz_axe",
            () -> new AxeItem(ModToolTiers.RQUARTZ, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RQUARTZ_HOE = ITEMS.register("rquartz_hoe",
            () -> new HoeItem(ModToolTiers.RQUARTZ, 0, -3f, new Item.Properties()));

    // -------------------------------------------------------------------------
    // Rough Prismarine tools (iron mining level)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> RPRISM_SWORD = ITEMS.register("rprism_sword",
            () -> new SwordItem(ModToolTiers.RPRISM, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RPRISM_PICKAXE = ITEMS.register("rprism_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RPRISM, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RPRISM_SHOVEL = ITEMS.register("rprism_shovel",
            () -> new ShovelItem(ModToolTiers.RPRISM, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RPRISM_AXE = ITEMS.register("rprism_axe",
            () -> new AxeItem(ModToolTiers.RPRISM, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RPRISM_HOE = ITEMS.register("rprism_hoe",
            () -> new HoeItem(ModToolTiers.RPRISM, 0, -3f, new Item.Properties()));

    // -------------------------------------------------------------------------
    // Calcified Amethyst tools (iron mining level)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> CAMETHYST_SWORD = ITEMS.register("camethyst_sword",
            () -> new SwordItem(ModToolTiers.CAMETHYST, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CAMETHYST_PICKAXE = ITEMS.register("camethyst_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CAMETHYST, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CAMETHYST_SHOVEL = ITEMS.register("camethyst_shovel",
            () -> new ShovelItem(ModToolTiers.CAMETHYST, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CAMETHYST_AXE = ITEMS.register("camethyst_axe",
            () -> new AxeItem(ModToolTiers.CAMETHYST, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CAMETHYST_HOE = ITEMS.register("camethyst_hoe",
            () -> new HoeItem(ModToolTiers.CAMETHYST, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CAMETHYST_HELMET = ITEMS.register("camethyst_helmet",
            () -> new ArmorItem(ModArmorMaterials.CAMETHYST, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> CAMETHYST_CHESTPLATE = ITEMS.register("camethyst_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CAMETHYST, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> CAMETHYST_LEGGINGS = ITEMS.register("camethyst_leggings",
            () -> new ArmorItem(ModArmorMaterials.CAMETHYST, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> CAMETHYST_BOOTS = ITEMS.register("camethyst_boots",
            () -> new ArmorItem(ModArmorMaterials.CAMETHYST, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // -------------------------------------------------------------------------
    // Ice (Glacial) tools (diamond mining level)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> ICE_SWORD = ITEMS.register("ice_sword",
            () -> new SwordItem(ModToolTiers.ICE_TOOL, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ICE_PICKAXE = ITEMS.register("ice_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ICE_TOOL, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ICE_SHOVEL = ITEMS.register("ice_shovel",
            () -> new ShovelItem(ModToolTiers.ICE_TOOL, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ICE_AXE = ITEMS.register("ice_axe",
            () -> new AxeItem(ModToolTiers.ICE_TOOL, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ICE_HOE = ITEMS.register("ice_hoe",
            () -> new HoeItem(ModToolTiers.ICE_TOOL, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ICE_HELMET = ITEMS.register("ice_helmet",
            () -> new ArmorItem(ModArmorMaterials.ICE, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> ICE_CHESTPLATE = ITEMS.register("ice_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ICE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> ICE_LEGGINGS = ITEMS.register("ice_leggings",
            () -> new ArmorItem(ModArmorMaterials.ICE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> ICE_BOOTS = ITEMS.register("ice_boots",
            () -> new ArmorItem(ModArmorMaterials.ICE, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // -------------------------------------------------------------------------
    // Polished Quartz tools (diamond mining level)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> PQUARTZ_SWORD = ITEMS.register("pquartz_sword",
            () -> new SwordItem(ModToolTiers.PQUARTZ, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PQUARTZ_PICKAXE = ITEMS.register("pquartz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PQUARTZ, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PQUARTZ_SHOVEL = ITEMS.register("pquartz_shovel",
            () -> new ShovelItem(ModToolTiers.PQUARTZ, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PQUARTZ_AXE = ITEMS.register("pquartz_axe",
            () -> new AxeItem(ModToolTiers.PQUARTZ, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PQUARTZ_HOE = ITEMS.register("pquartz_hoe",
            () -> new HoeItem(ModToolTiers.PQUARTZ, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PQUARTZ_HELMET = ITEMS.register("pquartz_helmet",
            () -> new ArmorItem(ModArmorMaterials.PQUARTZ, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PQUARTZ_CHESTPLATE = ITEMS.register("pquartz_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PQUARTZ, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PQUARTZ_LEGGINGS = ITEMS.register("pquartz_leggings",
            () -> new ArmorItem(ModArmorMaterials.PQUARTZ, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PQUARTZ_BOOTS = ITEMS.register("pquartz_boots",
            () -> new ArmorItem(ModArmorMaterials.PQUARTZ, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // -------------------------------------------------------------------------
    // Polished Prismarine tools (diamond mining level)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> PPRISM_SWORD = ITEMS.register("pprism_sword",
            () -> new SwordItem(ModToolTiers.PPRISM, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PPRISM_PICKAXE = ITEMS.register("pprism_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PPRISM, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PPRISM_SHOVEL = ITEMS.register("pprism_shovel",
            () -> new ShovelItem(ModToolTiers.PPRISM, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PPRISM_AXE = ITEMS.register("pprism_axe",
            () -> new AxeItem(ModToolTiers.PPRISM, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PPRISM_HOE = ITEMS.register("pprism_hoe",
            () -> new HoeItem(ModToolTiers.PPRISM, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PPRISM_HELMET = ITEMS.register("pprism_helmet",
            () -> new ArmorItem(ModArmorMaterials.PPRISM, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PPRISM_CHESTPLATE = ITEMS.register("pprism_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PPRISM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PPRISM_LEGGINGS = ITEMS.register("pprism_leggings",
            () -> new ArmorItem(ModArmorMaterials.PPRISM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PPRISM_BOOTS = ITEMS.register("pprism_boots",
            () -> new ArmorItem(ModArmorMaterials.PPRISM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // -------------------------------------------------------------------------
    // Flint Tools (rough, stone level)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> RFLINT_SWORD = ITEMS.register("rflint_sword",
            () -> new SwordItem(ModToolTiers.RFLINT, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RFLINT_PICKAXE = ITEMS.register("rflint_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RFLINT, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RFLINT_SHOVEL = ITEMS.register("rflint_shovel",
            () -> new ShovelItem(ModToolTiers.RFLINT, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RFLINT_AXE = ITEMS.register("rflint_axe",
            () -> new AxeItem(ModToolTiers.RFLINT, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RFLINT_HOE = ITEMS.register("rflint_hoe",
            () -> new HoeItem(ModToolTiers.RFLINT, 0, -3f, new Item.Properties()));

    // -------------------------------------------------------------------------
    // Flint-Iron (FNI) Tools + Armor
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> FNI_SWORD = ITEMS.register("fni_sword",
            () -> new SwordItem(ModToolTiers.FNI_TOOLS, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> FNI_PICKAXE = ITEMS.register("fni_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FNI_TOOLS, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> FNI_SHOVEL = ITEMS.register("fni_shovel",
            () -> new ShovelItem(ModToolTiers.FNI_TOOLS, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> FNI_AXE = ITEMS.register("fni_axe",
            () -> new AxeItem(ModToolTiers.FNI_TOOLS, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> FNI_HOE = ITEMS.register("fni_hoe",
            () -> new HoeItem(ModToolTiers.FNI_TOOLS, 0, -3f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> FNI_HELMET = ITEMS.register("fni_helmet",
            () -> new ArmorItem(ModArmorMaterials.FNI, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> FNI_CHESTPLATE = ITEMS.register("fni_chestplate",
            () -> new ArmorItem(ModArmorMaterials.FNI, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> FNI_LEGGINGS = ITEMS.register("fni_leggings",
            () -> new ArmorItem(ModArmorMaterials.FNI, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> FNI_BOOTS = ITEMS.register("fni_boots",
            () -> new ArmorItem(ModArmorMaterials.FNI, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // -------------------------------------------------------------------------
    // Stone Rock Variant Tools (13 types × 5 tools, each with its own tier)
    // -------------------------------------------------------------------------

    // Andesite — vanilla stone baseline
    public static final DeferredHolder<Item, Item> ANDESITE_SWORD = ITEMS.register("andesite_sword",
            () -> new SwordItem(ModToolTiers.STONE_ANDESITE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ANDESITE_PICKAXE = ITEMS.register("andesite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_ANDESITE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ANDESITE_SHOVEL = ITEMS.register("andesite_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_ANDESITE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ANDESITE_AXE = ITEMS.register("andesite_axe",
            () -> new AxeItem(ModToolTiers.STONE_ANDESITE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ANDESITE_HOE = ITEMS.register("andesite_hoe",
            () -> new HoeItem(ModToolTiers.STONE_ANDESITE, 0, -3f, new Item.Properties()));

    // Basalt — dense, durable, slow: heavy swing, harder axe/shovel
    public static final DeferredHolder<Item, Item> BASALT_SWORD = ITEMS.register("basalt_sword",
            () -> new SwordItem(ModToolTiers.STONE_BASALT, 3, -2.5f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BASALT_PICKAXE = ITEMS.register("basalt_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_BASALT, 1, -2.9f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BASALT_SHOVEL = ITEMS.register("basalt_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_BASALT, 2.0f, -3.1f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BASALT_AXE = ITEMS.register("basalt_axe",
            () -> new AxeItem(ModToolTiers.STONE_BASALT, 7, -3.3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BASALT_HOE = ITEMS.register("basalt_hoe",
            () -> new HoeItem(ModToolTiers.STONE_BASALT, 0, -3.1f, new Item.Properties()));

    // Blackstone — toughest stone variant: heavy swing, hardest hits
    public static final DeferredHolder<Item, Item> BLACKSTONE_SWORD = ITEMS.register("blackstone_sword",
            () -> new SwordItem(ModToolTiers.STONE_BLACKSTONE, 4, -2.5f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLACKSTONE_PICKAXE = ITEMS.register("blackstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_BLACKSTONE, 1, -2.9f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLACKSTONE_SHOVEL = ITEMS.register("blackstone_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_BLACKSTONE, 2.0f, -3.1f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLACKSTONE_AXE = ITEMS.register("blackstone_axe",
            () -> new AxeItem(ModToolTiers.STONE_BLACKSTONE, 7, -3.35f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLACKSTONE_HOE = ITEMS.register("blackstone_hoe",
            () -> new HoeItem(ModToolTiers.STONE_BLACKSTONE, 0, -3.1f, new Item.Properties()));

    // Calcite — fragile, light, enchantable: fast swing, weaker hits
    public static final DeferredHolder<Item, Item> CALCITE_SWORD = ITEMS.register("calcite_sword",
            () -> new SwordItem(ModToolTiers.STONE_CALCITE, 2, -2.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CALCITE_PICKAXE = ITEMS.register("calcite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_CALCITE, 1, -2.6f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CALCITE_SHOVEL = ITEMS.register("calcite_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_CALCITE, 1.0f, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CALCITE_AXE = ITEMS.register("calcite_axe",
            () -> new AxeItem(ModToolTiers.STONE_CALCITE, 5, -3.0f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CALCITE_HOE = ITEMS.register("calcite_hoe",
            () -> new HoeItem(ModToolTiers.STONE_CALCITE, 0, -2.6f, new Item.Properties()));

    // Deepslate — most durable stone variant, sluggish: heaviest swing, big hits
    public static final DeferredHolder<Item, Item> DEEPSLATE_SWORD = ITEMS.register("deepslate_sword",
            () -> new SwordItem(ModToolTiers.STONE_DEEPSLATE, 4, -2.55f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DEEPSLATE_PICKAXE = ITEMS.register("deepslate_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_DEEPSLATE, 1, -2.95f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DEEPSLATE_SHOVEL = ITEMS.register("deepslate_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_DEEPSLATE, 2.0f, -3.15f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DEEPSLATE_AXE = ITEMS.register("deepslate_axe",
            () -> new AxeItem(ModToolTiers.STONE_DEEPSLATE, 7, -3.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DEEPSLATE_HOE = ITEMS.register("deepslate_hoe",
            () -> new HoeItem(ModToolTiers.STONE_DEEPSLATE, 0, -3.1f, new Item.Properties()));

    // Diorite — slightly better all-round than andesite: marginally faster hoe
    public static final DeferredHolder<Item, Item> DIORITE_SWORD = ITEMS.register("diorite_sword",
            () -> new SwordItem(ModToolTiers.STONE_DIORITE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DIORITE_PICKAXE = ITEMS.register("diorite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_DIORITE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DIORITE_SHOVEL = ITEMS.register("diorite_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_DIORITE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DIORITE_AXE = ITEMS.register("diorite_axe",
            () -> new AxeItem(ModToolTiers.STONE_DIORITE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DIORITE_HOE = ITEMS.register("diorite_hoe",
            () -> new HoeItem(ModToolTiers.STONE_DIORITE, 0, -2.9f, new Item.Properties()));

    // End Stone — hard alien material, highly enchantable: slightly faster across the board
    public static final DeferredHolder<Item, Item> END_STONE_SWORD = ITEMS.register("end_stone_sword",
            () -> new SwordItem(ModToolTiers.STONE_END_STONE, 3, -2.35f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> END_STONE_PICKAXE = ITEMS.register("end_stone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_END_STONE, 1, -2.75f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> END_STONE_SHOVEL = ITEMS.register("end_stone_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_END_STONE, 1.5f, -2.95f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> END_STONE_AXE = ITEMS.register("end_stone_axe",
            () -> new AxeItem(ModToolTiers.STONE_END_STONE, 6, -3.15f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> END_STONE_HOE = ITEMS.register("end_stone_hoe",
            () -> new HoeItem(ModToolTiers.STONE_END_STONE, 0, -2.8f, new Item.Properties()));

    // Granite — hard igneous, strong and heavy: heavy swing, harder axe/shovel
    public static final DeferredHolder<Item, Item> GRANITE_SWORD = ITEMS.register("granite_sword",
            () -> new SwordItem(ModToolTiers.STONE_GRANITE, 3, -2.5f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GRANITE_PICKAXE = ITEMS.register("granite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_GRANITE, 1, -2.9f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GRANITE_SHOVEL = ITEMS.register("granite_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_GRANITE, 2.0f, -3.1f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GRANITE_AXE = ITEMS.register("granite_axe",
            () -> new AxeItem(ModToolTiers.STONE_GRANITE, 7, -3.3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GRANITE_HOE = ITEMS.register("granite_hoe",
            () -> new HoeItem(ModToolTiers.STONE_GRANITE, 0, -3.1f, new Item.Properties()));

    // Netherrack — crumbly, barely functional, extremely fast: fastest swing, weakest hits
    public static final DeferredHolder<Item, Item> NETHERRACK_SWORD = ITEMS.register("netherrack_sword",
            () -> new SwordItem(ModToolTiers.STONE_NETHERRACK, 2, -2.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHERRACK_PICKAXE = ITEMS.register("netherrack_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_NETHERRACK, 1, -2.6f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHERRACK_SHOVEL = ITEMS.register("netherrack_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_NETHERRACK, 1.0f, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHERRACK_AXE = ITEMS.register("netherrack_axe",
            () -> new AxeItem(ModToolTiers.STONE_NETHERRACK, 5, -3.0f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHERRACK_HOE = ITEMS.register("netherrack_hoe",
            () -> new HoeItem(ModToolTiers.STONE_NETHERRACK, 0, -2.5f, new Item.Properties()));

    // Sandstone — soft sedimentary, brittle but quick: light swing, weaker hits
    public static final DeferredHolder<Item, Item> SANDSTONE_SWORD = ITEMS.register("sandstone_sword",
            () -> new SwordItem(ModToolTiers.STONE_SANDSTONE, 2, -2.3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SANDSTONE_PICKAXE = ITEMS.register("sandstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_SANDSTONE, 1, -2.7f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SANDSTONE_SHOVEL = ITEMS.register("sandstone_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_SANDSTONE, 1.0f, -2.9f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SANDSTONE_AXE = ITEMS.register("sandstone_axe",
            () -> new AxeItem(ModToolTiers.STONE_SANDSTONE, 5, -3.1f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SANDSTONE_HOE = ITEMS.register("sandstone_hoe",
            () -> new HoeItem(ModToolTiers.STONE_SANDSTONE, 0, -2.7f, new Item.Properties()));

    // Smooth Basalt — polished volcanic, balanced between basalt and andesite: slightly heavy
    public static final DeferredHolder<Item, Item> SMOOTH_BASALT_SWORD = ITEMS.register("smooth_basalt_sword",
            () -> new SwordItem(ModToolTiers.STONE_SMOOTH_BASALT, 3, -2.45f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SMOOTH_BASALT_PICKAXE = ITEMS.register("smooth_basalt_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_SMOOTH_BASALT, 1, -2.85f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SMOOTH_BASALT_SHOVEL = ITEMS.register("smooth_basalt_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_SMOOTH_BASALT, 1.5f, -3.05f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SMOOTH_BASALT_AXE = ITEMS.register("smooth_basalt_axe",
            () -> new AxeItem(ModToolTiers.STONE_SMOOTH_BASALT, 6, -3.25f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SMOOTH_BASALT_HOE = ITEMS.register("smooth_basalt_hoe",
            () -> new HoeItem(ModToolTiers.STONE_SMOOTH_BASALT, 0, -3.0f, new Item.Properties()));

    // Terracotta — baked clay, moderate with better enchantability: slightly faster, lighter
    public static final DeferredHolder<Item, Item> TERRACOTTA_SWORD = ITEMS.register("terracotta_sword",
            () -> new SwordItem(ModToolTiers.STONE_TERRACOTTA, 3, -2.35f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> TERRACOTTA_PICKAXE = ITEMS.register("terracotta_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_TERRACOTTA, 1, -2.75f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> TERRACOTTA_SHOVEL = ITEMS.register("terracotta_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_TERRACOTTA, 1.5f, -2.95f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> TERRACOTTA_AXE = ITEMS.register("terracotta_axe",
            () -> new AxeItem(ModToolTiers.STONE_TERRACOTTA, 6, -3.15f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> TERRACOTTA_HOE = ITEMS.register("terracotta_hoe",
            () -> new HoeItem(ModToolTiers.STONE_TERRACOTTA, 0, -2.8f, new Item.Properties()));

    // Tuff — compressed volcanic ash, below-average overall: slightly faster, slightly weaker
    public static final DeferredHolder<Item, Item> TUFF_SWORD = ITEMS.register("tuff_sword",
            () -> new SwordItem(ModToolTiers.STONE_TUFF, 2, -2.35f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> TUFF_PICKAXE = ITEMS.register("tuff_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE_TUFF, 1, -2.75f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> TUFF_SHOVEL = ITEMS.register("tuff_shovel",
            () -> new ShovelItem(ModToolTiers.STONE_TUFF, 1.5f, -2.95f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> TUFF_AXE = ITEMS.register("tuff_axe",
            () -> new AxeItem(ModToolTiers.STONE_TUFF, 5, -3.15f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> TUFF_HOE = ITEMS.register("tuff_hoe",
            () -> new HoeItem(ModToolTiers.STONE_TUFF, 0, -2.8f, new Item.Properties()));

    // -------------------------------------------------------------------------
    // Wood Variant Tools (11 types × 5 tools, each with its own tier)
    // -------------------------------------------------------------------------

    // Oak — vanilla baseline
    public static final DeferredHolder<Item, Item> OAK_SWORD = ITEMS.register("oak_sword",
            () -> new SwordItem(ModToolTiers.WOOD_OAK, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> OAK_PICKAXE = ITEMS.register("oak_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_OAK, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> OAK_SHOVEL = ITEMS.register("oak_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_OAK, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> OAK_AXE = ITEMS.register("oak_axe",
            () -> new AxeItem(ModToolTiers.WOOD_OAK, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> OAK_HOE = ITEMS.register("oak_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_OAK, 0, -3f, new Item.Properties()));

    // Spruce — sturdy conifer
    public static final DeferredHolder<Item, Item> SPRUCE_SWORD = ITEMS.register("spruce_sword",
            () -> new SwordItem(ModToolTiers.WOOD_SPRUCE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SPRUCE_PICKAXE = ITEMS.register("spruce_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_SPRUCE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SPRUCE_SHOVEL = ITEMS.register("spruce_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_SPRUCE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SPRUCE_AXE = ITEMS.register("spruce_axe",
            () -> new AxeItem(ModToolTiers.WOOD_SPRUCE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SPRUCE_HOE = ITEMS.register("spruce_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_SPRUCE, 0, -3f, new Item.Properties()));

    // Birch — light, fast, enchantable
    public static final DeferredHolder<Item, Item> BIRCH_SWORD = ITEMS.register("birch_sword",
            () -> new SwordItem(ModToolTiers.WOOD_BIRCH, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BIRCH_PICKAXE = ITEMS.register("birch_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_BIRCH, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BIRCH_SHOVEL = ITEMS.register("birch_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_BIRCH, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BIRCH_AXE = ITEMS.register("birch_axe",
            () -> new AxeItem(ModToolTiers.WOOD_BIRCH, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BIRCH_HOE = ITEMS.register("birch_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_BIRCH, 0, -3f, new Item.Properties()));

    // Jungle — dense tropical
    public static final DeferredHolder<Item, Item> JUNGLE_SWORD = ITEMS.register("jungle_sword",
            () -> new SwordItem(ModToolTiers.WOOD_JUNGLE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JUNGLE_PICKAXE = ITEMS.register("jungle_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_JUNGLE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JUNGLE_SHOVEL = ITEMS.register("jungle_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_JUNGLE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JUNGLE_AXE = ITEMS.register("jungle_axe",
            () -> new AxeItem(ModToolTiers.WOOD_JUNGLE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JUNGLE_HOE = ITEMS.register("jungle_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_JUNGLE, 0, -3f, new Item.Properties()));

    // Acacia — hard African wood
    public static final DeferredHolder<Item, Item> ACACIA_SWORD = ITEMS.register("acacia_sword",
            () -> new SwordItem(ModToolTiers.WOOD_ACACIA, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ACACIA_PICKAXE = ITEMS.register("acacia_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_ACACIA, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ACACIA_SHOVEL = ITEMS.register("acacia_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_ACACIA, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ACACIA_AXE = ITEMS.register("acacia_axe",
            () -> new AxeItem(ModToolTiers.WOOD_ACACIA, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ACACIA_HOE = ITEMS.register("acacia_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_ACACIA, 0, -3f, new Item.Properties()));

    // Dark Oak — dense, durable, slow
    public static final DeferredHolder<Item, Item> DARK_OAK_SWORD = ITEMS.register("dark_oak_sword",
            () -> new SwordItem(ModToolTiers.WOOD_DARK_OAK, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DARK_OAK_PICKAXE = ITEMS.register("dark_oak_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_DARK_OAK, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DARK_OAK_SHOVEL = ITEMS.register("dark_oak_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_DARK_OAK, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DARK_OAK_AXE = ITEMS.register("dark_oak_axe",
            () -> new AxeItem(ModToolTiers.WOOD_DARK_OAK, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DARK_OAK_HOE = ITEMS.register("dark_oak_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_DARK_OAK, 0, -3f, new Item.Properties()));

    // Mangrove — tough tropical
    public static final DeferredHolder<Item, Item> MANGROVE_SWORD = ITEMS.register("mangrove_sword",
            () -> new SwordItem(ModToolTiers.WOOD_MANGROVE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> MANGROVE_PICKAXE = ITEMS.register("mangrove_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_MANGROVE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> MANGROVE_SHOVEL = ITEMS.register("mangrove_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_MANGROVE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> MANGROVE_AXE = ITEMS.register("mangrove_axe",
            () -> new AxeItem(ModToolTiers.WOOD_MANGROVE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> MANGROVE_HOE = ITEMS.register("mangrove_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_MANGROVE, 0, -3f, new Item.Properties()));

    // Cherry — beautiful, very enchantable
    public static final DeferredHolder<Item, Item> CHERRY_SWORD = ITEMS.register("cherry_sword",
            () -> new SwordItem(ModToolTiers.WOOD_CHERRY, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CHERRY_PICKAXE = ITEMS.register("cherry_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_CHERRY, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CHERRY_SHOVEL = ITEMS.register("cherry_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_CHERRY, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CHERRY_AXE = ITEMS.register("cherry_axe",
            () -> new AxeItem(ModToolTiers.WOOD_CHERRY, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CHERRY_HOE = ITEMS.register("cherry_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_CHERRY, 0, -3f, new Item.Properties()));

    // Bamboo — fastest, most fragile
    public static final DeferredHolder<Item, Item> BAMBOO_SWORD = ITEMS.register("bamboo_sword",
            () -> new SwordItem(ModToolTiers.WOOD_BAMBOO, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BAMBOO_PICKAXE = ITEMS.register("bamboo_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_BAMBOO, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BAMBOO_SHOVEL = ITEMS.register("bamboo_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_BAMBOO, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BAMBOO_AXE = ITEMS.register("bamboo_axe",
            () -> new AxeItem(ModToolTiers.WOOD_BAMBOO, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BAMBOO_HOE = ITEMS.register("bamboo_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_BAMBOO, 0, -3f, new Item.Properties()));

    // Crimson — tough nether fungus
    public static final DeferredHolder<Item, Item> CRIMSON_SWORD = ITEMS.register("crimson_sword",
            () -> new SwordItem(ModToolTiers.WOOD_CRIMSON, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CRIMSON_PICKAXE = ITEMS.register("crimson_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_CRIMSON, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CRIMSON_SHOVEL = ITEMS.register("crimson_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_CRIMSON, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CRIMSON_AXE = ITEMS.register("crimson_axe",
            () -> new AxeItem(ModToolTiers.WOOD_CRIMSON, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CRIMSON_HOE = ITEMS.register("crimson_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_CRIMSON, 0, -3f, new Item.Properties()));

    // Warped — resilient, enchantable
    public static final DeferredHolder<Item, Item> WARPED_SWORD = ITEMS.register("warped_sword",
            () -> new SwordItem(ModToolTiers.WOOD_WARPED, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WARPED_PICKAXE = ITEMS.register("warped_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD_WARPED, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WARPED_SHOVEL = ITEMS.register("warped_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD_WARPED, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WARPED_AXE = ITEMS.register("warped_axe",
            () -> new AxeItem(ModToolTiers.WOOD_WARPED, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> WARPED_HOE = ITEMS.register("warped_hoe",
            () -> new HoeItem(ModToolTiers.WOOD_WARPED, 0, -3f, new Item.Properties()));

    // -------------------------------------------------------------------------
    // Leather tools (very weak, worse than wood)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> LEATHER_SWORD = ITEMS.register("leather_sword",
            () -> new SwordItem(ModToolTiers.LEATHER, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> LEATHER_PICKAXE = ITEMS.register("leather_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LEATHER, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> LEATHER_SHOVEL = ITEMS.register("leather_shovel",
            () -> new ShovelItem(ModToolTiers.LEATHER, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> LEATHER_AXE = ITEMS.register("leather_axe",
            () -> new AxeItem(ModToolTiers.LEATHER, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> LEATHER_HOE = ITEMS.register("leather_hoe",
            () -> new HoeItem(ModToolTiers.LEATHER, 0, -3f, new Item.Properties()));

    // =========================================================================
    // Vanilla Material Sets (25 sets, ordered by power tier)
    // =========================================================================

    // ── Paper (tools only, ultra-weak) ──────────────────────────────────────
    public static final DeferredHolder<Item, Item> PAPER_SWORD = ITEMS.register("paper_sword",
            () -> new SwordItem(ModToolTiers.PAPER, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PAPER_PICKAXE = ITEMS.register("paper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PAPER, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PAPER_SHOVEL = ITEMS.register("paper_shovel",
            () -> new ShovelItem(ModToolTiers.PAPER, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PAPER_AXE = ITEMS.register("paper_axe",
            () -> new AxeItem(ModToolTiers.PAPER, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PAPER_HOE = ITEMS.register("paper_hoe",
            () -> new HoeItem(ModToolTiers.PAPER, 0, -3f, new Item.Properties()));

    // ── Feather (tools only, ultra-weak) ────────────────────────────────────
    public static final DeferredHolder<Item, Item> FEATHER_SWORD = ITEMS.register("feather_sword",
            () -> new SwordItem(ModToolTiers.FEATHER, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> FEATHER_PICKAXE = ITEMS.register("feather_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FEATHER, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> FEATHER_SHOVEL = ITEMS.register("feather_shovel",
            () -> new ShovelItem(ModToolTiers.FEATHER, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> FEATHER_AXE = ITEMS.register("feather_axe",
            () -> new AxeItem(ModToolTiers.FEATHER, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> FEATHER_HOE = ITEMS.register("feather_hoe",
            () -> new HoeItem(ModToolTiers.FEATHER, 0, -3f, new Item.Properties()));

    // ── Glass (tools only, fragile but sharp) ───────────────────────────────
    public static final DeferredHolder<Item, Item> GLASS_SWORD = ITEMS.register("glass_sword",
            () -> new SwordItem(ModToolTiers.GLASS, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GLASS_PICKAXE = ITEMS.register("glass_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GLASS, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GLASS_SHOVEL = ITEMS.register("glass_shovel",
            () -> new ShovelItem(ModToolTiers.GLASS, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GLASS_AXE = ITEMS.register("glass_axe",
            () -> new AxeItem(ModToolTiers.GLASS, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GLASS_HOE = ITEMS.register("glass_hoe",
            () -> new HoeItem(ModToolTiers.GLASS, 0, -3f, new Item.Properties()));

    // ── Rabbit Hide (armor only) ────────────────────────────────────────────
    public static final DeferredHolder<Item, Item> RABBIT_HIDE_HELMET = ITEMS.register("rabbit_hide_helmet",
            () -> new ArmorItem(ModArmorMaterials.RABBIT_HIDE, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> RABBIT_HIDE_CHESTPLATE = ITEMS.register("rabbit_hide_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RABBIT_HIDE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> RABBIT_HIDE_LEGGINGS = ITEMS.register("rabbit_hide_leggings",
            () -> new ArmorItem(ModArmorMaterials.RABBIT_HIDE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> RABBIT_HIDE_BOOTS = ITEMS.register("rabbit_hide_boots",
            () -> new ArmorItem(ModArmorMaterials.RABBIT_HIDE, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Cactus (tools + armor) ──────────────────────────────────────────────
    public static final DeferredHolder<Item, Item> CACTUS_SWORD = ITEMS.register("cactus_sword",
            () -> new SwordItem(ModToolTiers.CACTUS, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CACTUS_PICKAXE = ITEMS.register("cactus_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CACTUS, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CACTUS_SHOVEL = ITEMS.register("cactus_shovel",
            () -> new ShovelItem(ModToolTiers.CACTUS, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CACTUS_AXE = ITEMS.register("cactus_axe",
            () -> new AxeItem(ModToolTiers.CACTUS, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CACTUS_HOE = ITEMS.register("cactus_hoe",
            () -> new HoeItem(ModToolTiers.CACTUS, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CACTUS_HELMET = ITEMS.register("cactus_helmet",
            () -> new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> CACTUS_CHESTPLATE = ITEMS.register("cactus_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> CACTUS_LEGGINGS = ITEMS.register("cactus_leggings",
            () -> new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> CACTUS_BOOTS = ITEMS.register("cactus_boots",
            () -> new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Sponge (tools only) ─────────────────────────────────────────────────
    public static final DeferredHolder<Item, Item> SPONGE_SWORD = ITEMS.register("sponge_sword",
            () -> new SwordItem(ModToolTiers.SPONGE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SPONGE_PICKAXE = ITEMS.register("sponge_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPONGE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SPONGE_SHOVEL = ITEMS.register("sponge_shovel",
            () -> new ShovelItem(ModToolTiers.SPONGE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SPONGE_AXE = ITEMS.register("sponge_axe",
            () -> new AxeItem(ModToolTiers.SPONGE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SPONGE_HOE = ITEMS.register("sponge_hoe",
            () -> new HoeItem(ModToolTiers.SPONGE, 0, -3f, new Item.Properties()));

    // ── Bone (tools + armor) ────────────────────────────────────────────────
    public static final DeferredHolder<Item, Item> BONE_SWORD = ITEMS.register("bone_sword",
            () -> new SwordItem(ModToolTiers.BONE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BONE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BONE_SHOVEL = ITEMS.register("bone_shovel",
            () -> new ShovelItem(ModToolTiers.BONE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BONE_AXE = ITEMS.register("bone_axe",
            () -> new AxeItem(ModToolTiers.BONE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BONE_HOE = ITEMS.register("bone_hoe",
            () -> new HoeItem(ModToolTiers.BONE, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BONE_HELMET = ITEMS.register("bone_helmet",
            () -> new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> BONE_CHESTPLATE = ITEMS.register("bone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> BONE_LEGGINGS = ITEMS.register("bone_leggings",
            () -> new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> BONE_BOOTS = ITEMS.register("bone_boots",
            () -> new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Clay (tools + armor) ────────────────────────────────────────────────
    public static final DeferredHolder<Item, Item> CLAY_SWORD = ITEMS.register("clay_sword",
            () -> new SwordItem(ModToolTiers.CLAY, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CLAY_PICKAXE = ITEMS.register("clay_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CLAY, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CLAY_SHOVEL = ITEMS.register("clay_shovel",
            () -> new ShovelItem(ModToolTiers.CLAY, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CLAY_AXE = ITEMS.register("clay_axe",
            () -> new AxeItem(ModToolTiers.CLAY, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CLAY_HOE = ITEMS.register("clay_hoe",
            () -> new HoeItem(ModToolTiers.CLAY, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> CLAY_HELMET = ITEMS.register("clay_helmet",
            () -> new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> CLAY_CHESTPLATE = ITEMS.register("clay_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> CLAY_LEGGINGS = ITEMS.register("clay_leggings",
            () -> new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> CLAY_BOOTS = ITEMS.register("clay_boots",
            () -> new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Nether Wart (tools only) ────────────────────────────────────────────
    public static final DeferredHolder<Item, Item> NETHER_WART_SWORD = ITEMS.register("nether_wart_sword",
            () -> new SwordItem(ModToolTiers.NETHER_WART, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_WART_PICKAXE = ITEMS.register("nether_wart_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NETHER_WART, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_WART_SHOVEL = ITEMS.register("nether_wart_shovel",
            () -> new ShovelItem(ModToolTiers.NETHER_WART, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_WART_AXE = ITEMS.register("nether_wart_axe",
            () -> new AxeItem(ModToolTiers.NETHER_WART, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_WART_HOE = ITEMS.register("nether_wart_hoe",
            () -> new HoeItem(ModToolTiers.NETHER_WART, 0, -3f, new Item.Properties()));

    // ── Brick (tools + armor) ───────────────────────────────────────────────
    public static final DeferredHolder<Item, Item> BRICK_SWORD = ITEMS.register("brick_sword",
            () -> new SwordItem(ModToolTiers.BRICK, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRICK_PICKAXE = ITEMS.register("brick_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRICK, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRICK_SHOVEL = ITEMS.register("brick_shovel",
            () -> new ShovelItem(ModToolTiers.BRICK, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRICK_AXE = ITEMS.register("brick_axe",
            () -> new AxeItem(ModToolTiers.BRICK, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRICK_HOE = ITEMS.register("brick_hoe",
            () -> new HoeItem(ModToolTiers.BRICK, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRICK_HELMET = ITEMS.register("brick_helmet",
            () -> new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRICK_CHESTPLATE = ITEMS.register("brick_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRICK_LEGGINGS = ITEMS.register("brick_leggings",
            () -> new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRICK_BOOTS = ITEMS.register("brick_boots",
            () -> new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Nether Brick (tools + armor) ────────────────────────────────────────
    public static final DeferredHolder<Item, Item> NETHER_BRICK_SWORD = ITEMS.register("nether_brick_sword",
            () -> new SwordItem(ModToolTiers.NETHER_BRICK, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_BRICK_PICKAXE = ITEMS.register("nether_brick_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NETHER_BRICK, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_BRICK_SHOVEL = ITEMS.register("nether_brick_shovel",
            () -> new ShovelItem(ModToolTiers.NETHER_BRICK, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_BRICK_AXE = ITEMS.register("nether_brick_axe",
            () -> new AxeItem(ModToolTiers.NETHER_BRICK, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_BRICK_HOE = ITEMS.register("nether_brick_hoe",
            () -> new HoeItem(ModToolTiers.NETHER_BRICK, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_BRICK_HELMET = ITEMS.register("nether_brick_helmet",
            () -> new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_BRICK_CHESTPLATE = ITEMS.register("nether_brick_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_BRICK_LEGGINGS = ITEMS.register("nether_brick_leggings",
            () -> new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> NETHER_BRICK_BOOTS = ITEMS.register("nether_brick_boots",
            () -> new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Pointed Dripstone (tools only) ──────────────────────────────────────
    public static final DeferredHolder<Item, Item> POINTED_DRIPSTONE_SWORD = ITEMS.register("pointed_dripstone_sword",
            () -> new SwordItem(ModToolTiers.POINTED_DRIPSTONE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> POINTED_DRIPSTONE_PICKAXE = ITEMS.register("pointed_dripstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.POINTED_DRIPSTONE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> POINTED_DRIPSTONE_SHOVEL = ITEMS.register("pointed_dripstone_shovel",
            () -> new ShovelItem(ModToolTiers.POINTED_DRIPSTONE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> POINTED_DRIPSTONE_AXE = ITEMS.register("pointed_dripstone_axe",
            () -> new AxeItem(ModToolTiers.POINTED_DRIPSTONE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> POINTED_DRIPSTONE_HOE = ITEMS.register("pointed_dripstone_hoe",
            () -> new HoeItem(ModToolTiers.POINTED_DRIPSTONE, 0, -3f, new Item.Properties()));

    // ── Copper (tools + armor) ──────────────────────────────────────────────
    public static final DeferredHolder<Item, Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Phantom Membrane (tools + armor) ────────────────────────────────────
    public static final DeferredHolder<Item, Item> PHANTOM_SWORD = ITEMS.register("phantom_sword",
            () -> new SwordItem(ModToolTiers.PHANTOM_MEMBRANE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PHANTOM_PICKAXE = ITEMS.register("phantom_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PHANTOM_MEMBRANE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PHANTOM_SHOVEL = ITEMS.register("phantom_shovel",
            () -> new ShovelItem(ModToolTiers.PHANTOM_MEMBRANE, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PHANTOM_AXE = ITEMS.register("phantom_axe",
            () -> new AxeItem(ModToolTiers.PHANTOM_MEMBRANE, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PHANTOM_HOE = ITEMS.register("phantom_hoe",
            () -> new HoeItem(ModToolTiers.PHANTOM_MEMBRANE, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PHANTOM_HELMET = ITEMS.register("phantom_helmet",
            () -> new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PHANTOM_CHESTPLATE = ITEMS.register("phantom_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PHANTOM_LEGGINGS = ITEMS.register("phantom_leggings",
            () -> new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PHANTOM_BOOTS = ITEMS.register("phantom_boots",
            () -> new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Magma Cream (tools + armor) ─────────────────────────────────────────
    public static final DeferredHolder<Item, Item> MAGMA_CREAM_SWORD = ITEMS.register("magma_cream_sword",
            () -> new SwordItem(ModToolTiers.MAGMA_CREAM, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> MAGMA_CREAM_PICKAXE = ITEMS.register("magma_cream_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MAGMA_CREAM, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> MAGMA_CREAM_SHOVEL = ITEMS.register("magma_cream_shovel",
            () -> new ShovelItem(ModToolTiers.MAGMA_CREAM, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> MAGMA_CREAM_AXE = ITEMS.register("magma_cream_axe",
            () -> new AxeItem(ModToolTiers.MAGMA_CREAM, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> MAGMA_CREAM_HOE = ITEMS.register("magma_cream_hoe",
            () -> new HoeItem(ModToolTiers.MAGMA_CREAM, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> MAGMA_CREAM_HELMET = ITEMS.register("magma_cream_helmet",
            () -> new ArmorItem(ModArmorMaterials.MAGMA_CREAM, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> MAGMA_CREAM_CHESTPLATE = ITEMS.register("magma_cream_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MAGMA_CREAM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> MAGMA_CREAM_LEGGINGS = ITEMS.register("magma_cream_leggings",
            () -> new ArmorItem(ModArmorMaterials.MAGMA_CREAM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> MAGMA_CREAM_BOOTS = ITEMS.register("magma_cream_boots",
            () -> new ArmorItem(ModArmorMaterials.MAGMA_CREAM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Slime (tools + armor) ───────────────────────────────────────────────
    public static final DeferredHolder<Item, Item> SLIME_SWORD = ITEMS.register("slime_sword",
            () -> new SwordItem(ModToolTiers.SLIME, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SLIME_PICKAXE = ITEMS.register("slime_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SLIME, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SLIME_SHOVEL = ITEMS.register("slime_shovel",
            () -> new ShovelItem(ModToolTiers.SLIME, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SLIME_AXE = ITEMS.register("slime_axe",
            () -> new AxeItem(ModToolTiers.SLIME, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SLIME_HOE = ITEMS.register("slime_hoe",
            () -> new HoeItem(ModToolTiers.SLIME, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SLIME_HELMET = ITEMS.register("slime_helmet",
            () -> new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> SLIME_CHESTPLATE = ITEMS.register("slime_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> SLIME_LEGGINGS = ITEMS.register("slime_leggings",
            () -> new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> SLIME_BOOTS = ITEMS.register("slime_boots",
            () -> new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Blaze Rod (tools + armor) ───────────────────────────────────────────
    public static final DeferredHolder<Item, Item> BLAZE_SWORD = ITEMS.register("blaze_sword",
            () -> new SwordItem(ModToolTiers.BLAZE_ROD, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLAZE_PICKAXE = ITEMS.register("blaze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BLAZE_ROD, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLAZE_SHOVEL = ITEMS.register("blaze_shovel",
            () -> new ShovelItem(ModToolTiers.BLAZE_ROD, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLAZE_AXE = ITEMS.register("blaze_axe",
            () -> new AxeItem(ModToolTiers.BLAZE_ROD, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLAZE_HOE = ITEMS.register("blaze_hoe",
            () -> new HoeItem(ModToolTiers.BLAZE_ROD, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLAZE_HELMET = ITEMS.register("blaze_helmet",
            () -> new ArmorItem(ModArmorMaterials.BLAZE, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLAZE_CHESTPLATE = ITEMS.register("blaze_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BLAZE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLAZE_LEGGINGS = ITEMS.register("blaze_leggings",
            () -> new ArmorItem(ModArmorMaterials.BLAZE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLAZE_BOOTS = ITEMS.register("blaze_boots",
            () -> new ArmorItem(ModArmorMaterials.BLAZE, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Nautilus Shell (tools + armor) ──────────────────────────────────────
    public static final DeferredHolder<Item, Item> NAUTILUS_SWORD = ITEMS.register("nautilus_sword",
            () -> new SwordItem(ModToolTiers.NAUTILUS_SHELL, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NAUTILUS_PICKAXE = ITEMS.register("nautilus_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NAUTILUS_SHELL, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NAUTILUS_SHOVEL = ITEMS.register("nautilus_shovel",
            () -> new ShovelItem(ModToolTiers.NAUTILUS_SHELL, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NAUTILUS_AXE = ITEMS.register("nautilus_axe",
            () -> new AxeItem(ModToolTiers.NAUTILUS_SHELL, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NAUTILUS_HOE = ITEMS.register("nautilus_hoe",
            () -> new HoeItem(ModToolTiers.NAUTILUS_SHELL, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> NAUTILUS_HELMET = ITEMS.register("nautilus_helmet",
            () -> new ArmorItem(ModArmorMaterials.NAUTILUS, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> NAUTILUS_CHESTPLATE = ITEMS.register("nautilus_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NAUTILUS, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> NAUTILUS_LEGGINGS = ITEMS.register("nautilus_leggings",
            () -> new ArmorItem(ModArmorMaterials.NAUTILUS, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> NAUTILUS_BOOTS = ITEMS.register("nautilus_boots",
            () -> new ArmorItem(ModArmorMaterials.NAUTILUS, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Purpur (tools + armor) ──────────────────────────────────────────────
    public static final DeferredHolder<Item, Item> PURPUR_SWORD = ITEMS.register("purpur_sword",
            () -> new SwordItem(ModToolTiers.PURPUR, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PURPUR_PICKAXE = ITEMS.register("purpur_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PURPUR, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PURPUR_SHOVEL = ITEMS.register("purpur_shovel",
            () -> new ShovelItem(ModToolTiers.PURPUR, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PURPUR_AXE = ITEMS.register("purpur_axe",
            () -> new AxeItem(ModToolTiers.PURPUR, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PURPUR_HOE = ITEMS.register("purpur_hoe",
            () -> new HoeItem(ModToolTiers.PURPUR, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> PURPUR_HELMET = ITEMS.register("purpur_helmet",
            () -> new ArmorItem(ModArmorMaterials.PURPUR, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PURPUR_CHESTPLATE = ITEMS.register("purpur_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PURPUR, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PURPUR_LEGGINGS = ITEMS.register("purpur_leggings",
            () -> new ArmorItem(ModArmorMaterials.PURPUR, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> PURPUR_BOOTS = ITEMS.register("purpur_boots",
            () -> new ArmorItem(ModArmorMaterials.PURPUR, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Ghast Tear (tools + armor) ──────────────────────────────────────────
    public static final DeferredHolder<Item, Item> GHAST_TEAR_SWORD = ITEMS.register("ghast_tear_sword",
            () -> new SwordItem(ModToolTiers.GHAST_TEAR, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GHAST_TEAR_PICKAXE = ITEMS.register("ghast_tear_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GHAST_TEAR, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GHAST_TEAR_SHOVEL = ITEMS.register("ghast_tear_shovel",
            () -> new ShovelItem(ModToolTiers.GHAST_TEAR, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GHAST_TEAR_AXE = ITEMS.register("ghast_tear_axe",
            () -> new AxeItem(ModToolTiers.GHAST_TEAR, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GHAST_TEAR_HOE = ITEMS.register("ghast_tear_hoe",
            () -> new HoeItem(ModToolTiers.GHAST_TEAR, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> GHAST_TEAR_HELMET = ITEMS.register("ghast_tear_helmet",
            () -> new ArmorItem(ModArmorMaterials.GHAST_TEAR, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> GHAST_TEAR_CHESTPLATE = ITEMS.register("ghast_tear_chestplate",
            () -> new ArmorItem(ModArmorMaterials.GHAST_TEAR, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> GHAST_TEAR_LEGGINGS = ITEMS.register("ghast_tear_leggings",
            () -> new ArmorItem(ModArmorMaterials.GHAST_TEAR, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> GHAST_TEAR_BOOTS = ITEMS.register("ghast_tear_boots",
            () -> new ArmorItem(ModArmorMaterials.GHAST_TEAR, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Eye of Ender (tools + armor) ────────────────────────────────────────
    public static final DeferredHolder<Item, Item> EYE_OF_ENDER_SWORD = ITEMS.register("eye_of_ender_sword",
            () -> new SwordItem(ModToolTiers.EYE_OF_ENDER, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> EYE_OF_ENDER_PICKAXE = ITEMS.register("eye_of_ender_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EYE_OF_ENDER, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> EYE_OF_ENDER_SHOVEL = ITEMS.register("eye_of_ender_shovel",
            () -> new ShovelItem(ModToolTiers.EYE_OF_ENDER, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> EYE_OF_ENDER_AXE = ITEMS.register("eye_of_ender_axe",
            () -> new AxeItem(ModToolTiers.EYE_OF_ENDER, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> EYE_OF_ENDER_HOE = ITEMS.register("eye_of_ender_hoe",
            () -> new HoeItem(ModToolTiers.EYE_OF_ENDER, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> EYE_OF_ENDER_HELMET = ITEMS.register("eye_of_ender_helmet",
            () -> new ArmorItem(ModArmorMaterials.EYE_OF_ENDER, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> EYE_OF_ENDER_CHESTPLATE = ITEMS.register("eye_of_ender_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EYE_OF_ENDER, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> EYE_OF_ENDER_LEGGINGS = ITEMS.register("eye_of_ender_leggings",
            () -> new ArmorItem(ModArmorMaterials.EYE_OF_ENDER, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> EYE_OF_ENDER_BOOTS = ITEMS.register("eye_of_ender_boots",
            () -> new ArmorItem(ModArmorMaterials.EYE_OF_ENDER, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Shulker Shell (tools + armor) ───────────────────────────────────────
    public static final DeferredHolder<Item, Item> SHULKER_SWORD = ITEMS.register("shulker_sword",
            () -> new SwordItem(ModToolTiers.SHULKER_SHELL, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SHULKER_PICKAXE = ITEMS.register("shulker_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SHULKER_SHELL, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SHULKER_SHOVEL = ITEMS.register("shulker_shovel",
            () -> new ShovelItem(ModToolTiers.SHULKER_SHELL, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SHULKER_AXE = ITEMS.register("shulker_axe",
            () -> new AxeItem(ModToolTiers.SHULKER_SHELL, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SHULKER_HOE = ITEMS.register("shulker_hoe",
            () -> new HoeItem(ModToolTiers.SHULKER_SHELL, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SHULKER_HELMET = ITEMS.register("shulker_helmet",
            () -> new ArmorItem(ModArmorMaterials.SHULKER, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> SHULKER_CHESTPLATE = ITEMS.register("shulker_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SHULKER, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> SHULKER_LEGGINGS = ITEMS.register("shulker_leggings",
            () -> new ArmorItem(ModArmorMaterials.SHULKER, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> SHULKER_BOOTS = ITEMS.register("shulker_boots",
            () -> new ArmorItem(ModArmorMaterials.SHULKER, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Turtle Scute (armor only) ───────────────────────────────────────────
    public static final DeferredHolder<Item, Item> TURTLE_SCUTE_HELMET = ITEMS.register("turtle_scute_helmet",
            () -> new ArmorItem(ModArmorMaterials.TURTLE_SCUTE, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> TURTLE_SCUTE_CHESTPLATE = ITEMS.register("turtle_scute_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TURTLE_SCUTE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> TURTLE_SCUTE_LEGGINGS = ITEMS.register("turtle_scute_leggings",
            () -> new ArmorItem(ModArmorMaterials.TURTLE_SCUTE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> TURTLE_SCUTE_BOOTS = ITEMS.register("turtle_scute_boots",
            () -> new ArmorItem(ModArmorMaterials.TURTLE_SCUTE, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Echo Shard (tools + armor) ──────────────────────────────────────────
    public static final DeferredHolder<Item, Item> ECHO_SHARD_SWORD = ITEMS.register("echo_shard_sword",
            () -> new SwordItem(ModToolTiers.ECHO_SHARD, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ECHO_SHARD_PICKAXE = ITEMS.register("echo_shard_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ECHO_SHARD, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ECHO_SHARD_SHOVEL = ITEMS.register("echo_shard_shovel",
            () -> new ShovelItem(ModToolTiers.ECHO_SHARD, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ECHO_SHARD_AXE = ITEMS.register("echo_shard_axe",
            () -> new AxeItem(ModToolTiers.ECHO_SHARD, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ECHO_SHARD_HOE = ITEMS.register("echo_shard_hoe",
            () -> new HoeItem(ModToolTiers.ECHO_SHARD, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> ECHO_SHARD_HELMET = ITEMS.register("echo_shard_helmet",
            () -> new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> ECHO_SHARD_CHESTPLATE = ITEMS.register("echo_shard_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> ECHO_SHARD_LEGGINGS = ITEMS.register("echo_shard_leggings",
            () -> new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> ECHO_SHARD_BOOTS = ITEMS.register("echo_shard_boots",
            () -> new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // ── Dragon's Breath (tools + armor) ─────────────────────────────────────
    public static final DeferredHolder<Item, Item> DRAGON_BREATH_SWORD = ITEMS.register("dragon_breath_sword",
            () -> new SwordItem(ModToolTiers.DRAGON_BREATH, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DRAGON_BREATH_PICKAXE = ITEMS.register("dragon_breath_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DRAGON_BREATH, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DRAGON_BREATH_SHOVEL = ITEMS.register("dragon_breath_shovel",
            () -> new ShovelItem(ModToolTiers.DRAGON_BREATH, 1.5f, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DRAGON_BREATH_AXE = ITEMS.register("dragon_breath_axe",
            () -> new AxeItem(ModToolTiers.DRAGON_BREATH, 6, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DRAGON_BREATH_HOE = ITEMS.register("dragon_breath_hoe",
            () -> new HoeItem(ModToolTiers.DRAGON_BREATH, 0, -3f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> DRAGON_BREATH_HELMET = ITEMS.register("dragon_breath_helmet",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_BREATH, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> DRAGON_BREATH_CHESTPLATE = ITEMS.register("dragon_breath_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_BREATH, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> DRAGON_BREATH_LEGGINGS = ITEMS.register("dragon_breath_leggings",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_BREATH, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final DeferredHolder<Item, Item> DRAGON_BREATH_BOOTS = ITEMS.register("dragon_breath_boots",
            () -> new ArmorItem(ModArmorMaterials.DRAGON_BREATH, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // -------------------------------------------------------------------------
    // Cake tools  (below wood tier, edible — it's cake!)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> CAKE_SWORD = ITEMS.register("cake_sword",
            () -> new EdibleSwordItem(ModToolTiers.CAKE, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));

    public static final DeferredHolder<Item, Item> CAKE_PICKAXE = ITEMS.register("cake_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.CAKE, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));

    public static final DeferredHolder<Item, Item> CAKE_SHOVEL = ITEMS.register("cake_shovel",
            () -> new EdibleShovelItem(ModToolTiers.CAKE, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));

    public static final DeferredHolder<Item, Item> CAKE_AXE = ITEMS.register("cake_axe",
            () -> new EdibleAxeItem(ModToolTiers.CAKE, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));

    public static final DeferredHolder<Item, Item> CAKE_HOE = ITEMS.register("cake_hoe",
            () -> new EdibleHoeItem(ModToolTiers.CAKE, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));

    // -------------------------------------------------------------------------
    // Cake armor  (below leather, edible)
    // -------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> CAKE_HELMET = ITEMS.register("cake_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.CAKE, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));

    public static final DeferredHolder<Item, Item> CAKE_CHESTPLATE = ITEMS.register("cake_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.CAKE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));

    public static final DeferredHolder<Item, Item> CAKE_LEGGINGS = ITEMS.register("cake_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.CAKE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));

    public static final DeferredHolder<Item, Item> CAKE_BOOTS = ITEMS.register("cake_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.CAKE, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Bread tools + armor (below wood tier, edible)
    // =========================================================================
    public static final DeferredHolder<Item, Item> BREAD_SWORD = ITEMS.register("bread_sword",
            () -> new EdibleSwordItem(ModToolTiers.BREAD, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> BREAD_PICKAXE = ITEMS.register("bread_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.BREAD, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> BREAD_SHOVEL = ITEMS.register("bread_shovel",
            () -> new EdibleShovelItem(ModToolTiers.BREAD, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> BREAD_AXE = ITEMS.register("bread_axe",
            () -> new EdibleAxeItem(ModToolTiers.BREAD, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> BREAD_HOE = ITEMS.register("bread_hoe",
            () -> new EdibleHoeItem(ModToolTiers.BREAD, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> BREAD_HELMET = ITEMS.register("bread_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.BREAD, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> BREAD_CHESTPLATE = ITEMS.register("bread_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.BREAD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> BREAD_LEGGINGS = ITEMS.register("bread_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.BREAD, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> BREAD_BOOTS = ITEMS.register("bread_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.BREAD, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Dried Kelp tools + armor
    // =========================================================================
    public static final DeferredHolder<Item, Item> DRIED_KELP_SWORD = ITEMS.register("dried_kelp_sword",
            () -> new EdibleSwordItem(ModToolTiers.DRIED_KELP, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> DRIED_KELP_PICKAXE = ITEMS.register("dried_kelp_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.DRIED_KELP, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> DRIED_KELP_SHOVEL = ITEMS.register("dried_kelp_shovel",
            () -> new EdibleShovelItem(ModToolTiers.DRIED_KELP, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> DRIED_KELP_AXE = ITEMS.register("dried_kelp_axe",
            () -> new EdibleAxeItem(ModToolTiers.DRIED_KELP, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> DRIED_KELP_HOE = ITEMS.register("dried_kelp_hoe",
            () -> new EdibleHoeItem(ModToolTiers.DRIED_KELP, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> DRIED_KELP_HELMET = ITEMS.register("dried_kelp_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.DRIED_KELP, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> DRIED_KELP_CHESTPLATE = ITEMS.register("dried_kelp_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.DRIED_KELP, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> DRIED_KELP_LEGGINGS = ITEMS.register("dried_kelp_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.DRIED_KELP, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> DRIED_KELP_BOOTS = ITEMS.register("dried_kelp_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.DRIED_KELP, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Rotten Flesh tools + armor
    // =========================================================================
    public static final DeferredHolder<Item, Item> ROTTEN_FLESH_SWORD = ITEMS.register("rotten_flesh_sword",
            () -> new EdibleSwordItem(ModToolTiers.ROTTEN_FLESH, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> ROTTEN_FLESH_PICKAXE = ITEMS.register("rotten_flesh_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.ROTTEN_FLESH, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> ROTTEN_FLESH_SHOVEL = ITEMS.register("rotten_flesh_shovel",
            () -> new EdibleShovelItem(ModToolTiers.ROTTEN_FLESH, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> ROTTEN_FLESH_AXE = ITEMS.register("rotten_flesh_axe",
            () -> new EdibleAxeItem(ModToolTiers.ROTTEN_FLESH, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> ROTTEN_FLESH_HOE = ITEMS.register("rotten_flesh_hoe",
            () -> new EdibleHoeItem(ModToolTiers.ROTTEN_FLESH, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> ROTTEN_FLESH_HELMET = ITEMS.register("rotten_flesh_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.ROTTEN_FLESH, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> ROTTEN_FLESH_CHESTPLATE = ITEMS.register("rotten_flesh_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.ROTTEN_FLESH, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> ROTTEN_FLESH_LEGGINGS = ITEMS.register("rotten_flesh_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.ROTTEN_FLESH, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> ROTTEN_FLESH_BOOTS = ITEMS.register("rotten_flesh_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.ROTTEN_FLESH, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Melon tools + armor (wood-equivalent)
    // =========================================================================
    public static final DeferredHolder<Item, Item> MELON_SWORD = ITEMS.register("melon_sword",
            () -> new EdibleSwordItem(ModToolTiers.MELON, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MELON_PICKAXE = ITEMS.register("melon_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.MELON, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MELON_SHOVEL = ITEMS.register("melon_shovel",
            () -> new EdibleShovelItem(ModToolTiers.MELON, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MELON_AXE = ITEMS.register("melon_axe",
            () -> new EdibleAxeItem(ModToolTiers.MELON, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MELON_HOE = ITEMS.register("melon_hoe",
            () -> new EdibleHoeItem(ModToolTiers.MELON, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MELON_HELMET = ITEMS.register("melon_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.MELON, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MELON_CHESTPLATE = ITEMS.register("melon_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.MELON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MELON_LEGGINGS = ITEMS.register("melon_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.MELON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MELON_BOOTS = ITEMS.register("melon_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.MELON, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Sweet Berries tools + armor (wood-equivalent)
    // =========================================================================
    public static final DeferredHolder<Item, Item> SWEET_BERRY_SWORD = ITEMS.register("sweet_berry_sword",
            () -> new EdibleSwordItem(ModToolTiers.SWEET_BERRIES, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> SWEET_BERRY_PICKAXE = ITEMS.register("sweet_berry_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.SWEET_BERRIES, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> SWEET_BERRY_SHOVEL = ITEMS.register("sweet_berry_shovel",
            () -> new EdibleShovelItem(ModToolTiers.SWEET_BERRIES, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> SWEET_BERRY_AXE = ITEMS.register("sweet_berry_axe",
            () -> new EdibleAxeItem(ModToolTiers.SWEET_BERRIES, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> SWEET_BERRY_HOE = ITEMS.register("sweet_berry_hoe",
            () -> new EdibleHoeItem(ModToolTiers.SWEET_BERRIES, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> SWEET_BERRY_HELMET = ITEMS.register("sweet_berry_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.SWEET_BERRY, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> SWEET_BERRY_CHESTPLATE = ITEMS.register("sweet_berry_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.SWEET_BERRY, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> SWEET_BERRY_LEGGINGS = ITEMS.register("sweet_berry_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.SWEET_BERRY, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> SWEET_BERRY_BOOTS = ITEMS.register("sweet_berry_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.SWEET_BERRY, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Pumpkin Pie tools + armor (wood-equivalent)
    // =========================================================================
    public static final DeferredHolder<Item, Item> PUMPKIN_PIE_SWORD = ITEMS.register("pumpkin_pie_sword",
            () -> new EdibleSwordItem(ModToolTiers.PUMPKIN_PIE, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUMPKIN_PIE_PICKAXE = ITEMS.register("pumpkin_pie_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.PUMPKIN_PIE, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUMPKIN_PIE_SHOVEL = ITEMS.register("pumpkin_pie_shovel",
            () -> new EdibleShovelItem(ModToolTiers.PUMPKIN_PIE, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUMPKIN_PIE_AXE = ITEMS.register("pumpkin_pie_axe",
            () -> new EdibleAxeItem(ModToolTiers.PUMPKIN_PIE, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUMPKIN_PIE_HOE = ITEMS.register("pumpkin_pie_hoe",
            () -> new EdibleHoeItem(ModToolTiers.PUMPKIN_PIE, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUMPKIN_PIE_HELMET = ITEMS.register("pumpkin_pie_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.PUMPKIN_PIE, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUMPKIN_PIE_CHESTPLATE = ITEMS.register("pumpkin_pie_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.PUMPKIN_PIE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUMPKIN_PIE_LEGGINGS = ITEMS.register("pumpkin_pie_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.PUMPKIN_PIE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUMPKIN_PIE_BOOTS = ITEMS.register("pumpkin_pie_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.PUMPKIN_PIE, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Mushroom tools + armor (stone-equivalent)
    // =========================================================================
    public static final DeferredHolder<Item, Item> MUSHROOM_SWORD = ITEMS.register("mushroom_sword",
            () -> new EdibleSwordItem(ModToolTiers.MUSHROOM, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MUSHROOM_PICKAXE = ITEMS.register("mushroom_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.MUSHROOM, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MUSHROOM_SHOVEL = ITEMS.register("mushroom_shovel",
            () -> new EdibleShovelItem(ModToolTiers.MUSHROOM, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MUSHROOM_AXE = ITEMS.register("mushroom_axe",
            () -> new EdibleAxeItem(ModToolTiers.MUSHROOM, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MUSHROOM_HOE = ITEMS.register("mushroom_hoe",
            () -> new EdibleHoeItem(ModToolTiers.MUSHROOM, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MUSHROOM_HELMET = ITEMS.register("mushroom_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.MUSHROOM, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MUSHROOM_CHESTPLATE = ITEMS.register("mushroom_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.MUSHROOM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MUSHROOM_LEGGINGS = ITEMS.register("mushroom_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.MUSHROOM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> MUSHROOM_BOOTS = ITEMS.register("mushroom_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.MUSHROOM, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Pufferfish tools + armor (stone-equivalent)
    // =========================================================================
    public static final DeferredHolder<Item, Item> PUFFERFISH_SWORD = ITEMS.register("pufferfish_sword",
            () -> new EdibleSwordItem(ModToolTiers.PUFFERFISH, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUFFERFISH_PICKAXE = ITEMS.register("pufferfish_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.PUFFERFISH, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUFFERFISH_SHOVEL = ITEMS.register("pufferfish_shovel",
            () -> new EdibleShovelItem(ModToolTiers.PUFFERFISH, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUFFERFISH_AXE = ITEMS.register("pufferfish_axe",
            () -> new EdibleAxeItem(ModToolTiers.PUFFERFISH, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUFFERFISH_HOE = ITEMS.register("pufferfish_hoe",
            () -> new EdibleHoeItem(ModToolTiers.PUFFERFISH, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUFFERFISH_HELMET = ITEMS.register("pufferfish_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.PUFFERFISH, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUFFERFISH_CHESTPLATE = ITEMS.register("pufferfish_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.PUFFERFISH, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUFFERFISH_LEGGINGS = ITEMS.register("pufferfish_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.PUFFERFISH, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> PUFFERFISH_BOOTS = ITEMS.register("pufferfish_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.PUFFERFISH, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Honey tools + armor (stone-equivalent)
    // =========================================================================
    public static final DeferredHolder<Item, Item> HONEY_SWORD = ITEMS.register("honey_sword",
            () -> new EdibleSwordItem(ModToolTiers.HONEY, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> HONEY_PICKAXE = ITEMS.register("honey_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.HONEY, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> HONEY_SHOVEL = ITEMS.register("honey_shovel",
            () -> new EdibleShovelItem(ModToolTiers.HONEY, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> HONEY_AXE = ITEMS.register("honey_axe",
            () -> new EdibleAxeItem(ModToolTiers.HONEY, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> HONEY_HOE = ITEMS.register("honey_hoe",
            () -> new EdibleHoeItem(ModToolTiers.HONEY, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> HONEY_HELMET = ITEMS.register("honey_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> HONEY_CHESTPLATE = ITEMS.register("honey_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> HONEY_LEGGINGS = ITEMS.register("honey_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> HONEY_BOOTS = ITEMS.register("honey_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Chorus Fruit tools + armor (iron-equivalent)
    // =========================================================================
    public static final DeferredHolder<Item, Item> CHORUS_FRUIT_SWORD = ITEMS.register("chorus_fruit_sword",
            () -> new EdibleSwordItem(ModToolTiers.CHORUS_FRUIT, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> CHORUS_FRUIT_PICKAXE = ITEMS.register("chorus_fruit_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.CHORUS_FRUIT, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> CHORUS_FRUIT_SHOVEL = ITEMS.register("chorus_fruit_shovel",
            () -> new EdibleShovelItem(ModToolTiers.CHORUS_FRUIT, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> CHORUS_FRUIT_AXE = ITEMS.register("chorus_fruit_axe",
            () -> new EdibleAxeItem(ModToolTiers.CHORUS_FRUIT, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> CHORUS_FRUIT_HOE = ITEMS.register("chorus_fruit_hoe",
            () -> new EdibleHoeItem(ModToolTiers.CHORUS_FRUIT, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> CHORUS_FRUIT_HELMET = ITEMS.register("chorus_fruit_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.CHORUS_FRUIT, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> CHORUS_FRUIT_CHESTPLATE = ITEMS.register("chorus_fruit_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.CHORUS_FRUIT, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> CHORUS_FRUIT_LEGGINGS = ITEMS.register("chorus_fruit_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.CHORUS_FRUIT, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> CHORUS_FRUIT_BOOTS = ITEMS.register("chorus_fruit_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.CHORUS_FRUIT, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    // =========================================================================
    // Golden Apple tools + armor (iron-equivalent, luxury)
    // =========================================================================
    public static final DeferredHolder<Item, Item> GOLDEN_APPLE_SWORD = ITEMS.register("golden_apple_sword",
            () -> new EdibleSwordItem(ModToolTiers.GOLDEN_APPLE, 3, -2.4f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> GOLDEN_APPLE_PICKAXE = ITEMS.register("golden_apple_pickaxe",
            () -> new EdiblePickaxeItem(ModToolTiers.GOLDEN_APPLE, 1, -2.8f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> GOLDEN_APPLE_SHOVEL = ITEMS.register("golden_apple_shovel",
            () -> new EdibleShovelItem(ModToolTiers.GOLDEN_APPLE, 1.5f, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> GOLDEN_APPLE_AXE = ITEMS.register("golden_apple_axe",
            () -> new EdibleAxeItem(ModToolTiers.GOLDEN_APPLE, 6, -3.2f, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> GOLDEN_APPLE_HOE = ITEMS.register("golden_apple_hoe",
            () -> new EdibleHoeItem(ModToolTiers.GOLDEN_APPLE, 0, -3f, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> GOLDEN_APPLE_HELMET = ITEMS.register("golden_apple_helmet",
            () -> new EdibleArmorItem(ModArmorMaterials.GOLDEN_APPLE, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> GOLDEN_APPLE_CHESTPLATE = ITEMS.register("golden_apple_chestplate",
            () -> new EdibleArmorItem(ModArmorMaterials.GOLDEN_APPLE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> GOLDEN_APPLE_LEGGINGS = ITEMS.register("golden_apple_leggings",
            () -> new EdibleArmorItem(ModArmorMaterials.GOLDEN_APPLE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(14).saturationMod(0.1f).build())));
    public static final DeferredHolder<Item, Item> GOLDEN_APPLE_BOOTS = ITEMS.register("golden_apple_boots",
            () -> new EdibleArmorItem(ModArmorMaterials.GOLDEN_APPLE, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.1f).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
