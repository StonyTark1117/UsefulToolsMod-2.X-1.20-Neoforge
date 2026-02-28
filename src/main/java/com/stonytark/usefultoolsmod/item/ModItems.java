package com.stonytark.usefultoolsmod.item;

import com.stonytark.usefultoolsmod.UsefultoolsMod;
import com.stonytark.usefultoolsmod.entity.ModEntities;
import com.stonytark.usefultoolsmod.item.custom.Dynamite;
import com.stonytark.usefultoolsmod.item.custom.Grenade;
import com.stonytark.usefultoolsmod.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, UsefultoolsMod.MOD_ID);

    public static final DeferredHolder<Item, Item> RGOLD = ITEMS.register("rgold",
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

    public static final DeferredHolder<Item, Item> RLAPIS = ITEMS.register("rlapis",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredHolder<Item, Item> DYNAMITE = ITEMS.register("dynamite",
            () -> new Dynamite(new Item.Properties()
                    .stacksTo(16)
                    .fireResistant()
            )
    );

    // In 1.20.2, tool constructors do NOT use .attributes().
    // SwordItem(Tier, int baseDamage, float attackSpeed, Properties)
    // PickaxeItem(Tier, int attackDamage, float attackSpeed, Properties)
    // ShovelItem(Tier, float attackDamage, float attackSpeed, Properties)
    // AxeItem(Tier, float attackDamage, float attackSpeed, Properties)
    // HoeItem(Tier, int attackDamage, float attackSpeed, Properties)

    public static final DeferredHolder<Item, Item> JEMERALD_SWORD = ITEMS.register("jemerald_sword",
            () -> new SwordItem(ModToolTiers.JEMERALD, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JEMERALD_PICKAXE = ITEMS.register("jemerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JEMERALD, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JEMERALD_SHOVEL = ITEMS.register("jemerald_shovel",
            () -> new ShovelItem(ModToolTiers.JEMERALD, 1.5f, -3.0f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JEMERALD_AXE = ITEMS.register("jemerald_axe",
            () -> new AxeItem(ModToolTiers.JEMERALD, 6.0f, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JEMERALD_HOE = ITEMS.register("jemerald_hoe",
            () -> new HoeItem(ModToolTiers.JEMERALD, 0, -3.0f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> SEMERALD_SWORD = ITEMS.register("semerald_sword",
            () -> new SwordItem(ModToolTiers.SEMERALD, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SEMERALD_PICKAXE = ITEMS.register("semerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SEMERALD, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SEMERALD_SHOVEL = ITEMS.register("semerald_shovel",
            () -> new ShovelItem(ModToolTiers.SEMERALD, 1.5f, -3.0f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SEMERALD_AXE = ITEMS.register("semerald_axe",
            () -> new AxeItem(ModToolTiers.SEMERALD, 6.0f, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SEMERALD_HOE = ITEMS.register("semerald_hoe",
            () -> new HoeItem(ModToolTiers.SEMERALD, 0, -3.0f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> JOBSIDIAN_SWORD = ITEMS.register("jobsidian_sword",
            () -> new SwordItem(ModToolTiers.JOBSIDIAN, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JOBSIDIAN_PICKAXE = ITEMS.register("jobsidian_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JOBSIDIAN, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JOBSIDIAN_SHOVEL = ITEMS.register("jobsidian_shovel",
            () -> new ShovelItem(ModToolTiers.JOBSIDIAN, 1.5f, -3.0f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JOBSIDIAN_AXE = ITEMS.register("jobsidian_axe",
            () -> new AxeItem(ModToolTiers.JOBSIDIAN, 6.0f, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> JOBSIDIAN_HOE = ITEMS.register("jobsidian_hoe",
            () -> new HoeItem(ModToolTiers.JOBSIDIAN, 0, -3.0f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> SOBSIDIAN_SWORD = ITEMS.register("sobsidian_sword",
            () -> new SwordItem(ModToolTiers.SOBSIDIAN, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SOBSIDIAN_PICKAXE = ITEMS.register("sobsidian_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SOBSIDIAN, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SOBSIDIAN_SHOVEL = ITEMS.register("sobsidian_shovel",
            () -> new ShovelItem(ModToolTiers.SOBSIDIAN, 1.5f, -3.0f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SOBSIDIAN_AXE = ITEMS.register("sobsidian_axe",
            () -> new AxeItem(ModToolTiers.SOBSIDIAN, 6.0f, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> SOBSIDIAN_HOE = ITEMS.register("sobsidian_hoe",
            () -> new HoeItem(ModToolTiers.SOBSIDIAN, 0, -3.0f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> OVERPOWER_SWORD = ITEMS.register("overpower_sword",
            () -> new SwordItem(ModToolTiers.OVERPOWER, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> OVERPOWER_PICKAXE = ITEMS.register("overpower_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OVERPOWER, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> OVERPOWER_SHOVEL = ITEMS.register("overpower_shovel",
            () -> new ShovelItem(ModToolTiers.OVERPOWER, 1.5f, -3.0f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> OVERPOWER_AXE = ITEMS.register("overpower_axe",
            () -> new AxeItem(ModToolTiers.OVERPOWER, 6.0f, -3.2f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> HREDSTONE_SWORD = ITEMS.register("hredstone_sword",
            () -> new SwordItem(ModToolTiers.HREDSTONE, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HREDSTONE_PICKAXE = ITEMS.register("hredstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HREDSTONE, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HREDSTONE_SHOVEL = ITEMS.register("hredstone_shovel",
            () -> new ShovelItem(ModToolTiers.HREDSTONE, 1.5f, -3.0f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HREDSTONE_AXE = ITEMS.register("hredstone_axe",
            () -> new AxeItem(ModToolTiers.HREDSTONE, 6.0f, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> HREDSTONE_HOE = ITEMS.register("hredstone_hoe",
            () -> new HoeItem(ModToolTiers.HREDSTONE, 0, -3.0f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> RGOLD_SWORD = ITEMS.register("rgold_sword",
            () -> new SwordItem(ModToolTiers.RGOLD, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_PICKAXE = ITEMS.register("rgold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RGOLD, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_SHOVEL = ITEMS.register("rgold_shovel",
            () -> new ShovelItem(ModToolTiers.RGOLD, 1.5f, -3.0f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_AXE = ITEMS.register("rgold_axe",
            () -> new AxeItem(ModToolTiers.RGOLD, 6.0f, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RGOLD_HOE = ITEMS.register("rgold_hoe",
            () -> new HoeItem(ModToolTiers.RGOLD, 0, -3.0f, new Item.Properties()));

    public static final DeferredHolder<Item, Item> RLAPIS_SWORD = ITEMS.register("rlapis_sword",
            () -> new SwordItem(ModToolTiers.RLAPIS, 3, -2.4f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_PICKAXE = ITEMS.register("rlapis_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RLAPIS, 1, -2.8f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_SHOVEL = ITEMS.register("rlapis_shovel",
            () -> new ShovelItem(ModToolTiers.RLAPIS, 1.5f, -3.0f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_AXE = ITEMS.register("rlapis_axe",
            () -> new AxeItem(ModToolTiers.RLAPIS, 6.0f, -3.2f, new Item.Properties()));
    public static final DeferredHolder<Item, Item> RLAPIS_HOE = ITEMS.register("rlapis_hoe",
            () -> new HoeItem(ModToolTiers.RLAPIS, 0, -3.0f, new Item.Properties()));

    // Armor items: in 1.20.2, ArmorMaterial is still an interface implemented by an enum
    public static final DeferredHolder<Item, Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ModArmorMaterials.EMERALD.getDurabilityForType(ArmorItem.Type.HELMET))));
    public static final DeferredHolder<Item, Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ModArmorMaterials.EMERALD.getDurabilityForType(ArmorItem.Type.CHESTPLATE))));
    public static final DeferredHolder<Item, Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ModArmorMaterials.EMERALD.getDurabilityForType(ArmorItem.Type.LEGGINGS))));
    public static final DeferredHolder<Item, Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ModArmorMaterials.EMERALD.getDurabilityForType(ArmorItem.Type.BOOTS))));

    public static final DeferredHolder<Item, Item> HRED_HELMET = ITEMS.register("hred_helmet",
            () -> new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ModArmorMaterials.HRED.getDurabilityForType(ArmorItem.Type.HELMET))));
    public static final DeferredHolder<Item, Item> HRED_CHESTPLATE = ITEMS.register("hred_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ModArmorMaterials.HRED.getDurabilityForType(ArmorItem.Type.CHESTPLATE))));
    public static final DeferredHolder<Item, Item> HRED_LEGGINGS = ITEMS.register("hred_leggings",
            () -> new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ModArmorMaterials.HRED.getDurabilityForType(ArmorItem.Type.LEGGINGS))));
    public static final DeferredHolder<Item, Item> HRED_BOOTS = ITEMS.register("hred_boots",
            () -> new ArmorItem(ModArmorMaterials.HRED, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ModArmorMaterials.HRED.getDurabilityForType(ArmorItem.Type.BOOTS))));

    public static final DeferredHolder<Item, Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ModArmorMaterials.OBSIDIAN.getDurabilityForType(ArmorItem.Type.HELMET))));
    public static final DeferredHolder<Item, Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ModArmorMaterials.OBSIDIAN.getDurabilityForType(ArmorItem.Type.CHESTPLATE))));
    public static final DeferredHolder<Item, Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ModArmorMaterials.OBSIDIAN.getDurabilityForType(ArmorItem.Type.LEGGINGS))));
    public static final DeferredHolder<Item, Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ModArmorMaterials.OBSIDIAN.getDurabilityForType(ArmorItem.Type.BOOTS))));

    public static final DeferredHolder<Item, Item> RGOLD_HELMET = ITEMS.register("rgold_helmet",
            () -> new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ModArmorMaterials.RGOLD.getDurabilityForType(ArmorItem.Type.HELMET))));
    public static final DeferredHolder<Item, Item> RGOLD_CHESTPLATE = ITEMS.register("rgold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ModArmorMaterials.RGOLD.getDurabilityForType(ArmorItem.Type.CHESTPLATE))));
    public static final DeferredHolder<Item, Item> RGOLD_LEGGINGS = ITEMS.register("rgold_leggings",
            () -> new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ModArmorMaterials.RGOLD.getDurabilityForType(ArmorItem.Type.LEGGINGS))));
    public static final DeferredHolder<Item, Item> RGOLD_BOOTS = ITEMS.register("rgold_boots",
            () -> new ArmorItem(ModArmorMaterials.RGOLD, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ModArmorMaterials.RGOLD.getDurabilityForType(ArmorItem.Type.BOOTS))));

    public static final DeferredHolder<Item, Item> RLAPIS_HELMET = ITEMS.register("rlapis_helmet",
            () -> new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ModArmorMaterials.RLAPIS.getDurabilityForType(ArmorItem.Type.HELMET))));
    public static final DeferredHolder<Item, Item> RLAPIS_CHESTPLATE = ITEMS.register("rlapis_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ModArmorMaterials.RLAPIS.getDurabilityForType(ArmorItem.Type.CHESTPLATE))));
    public static final DeferredHolder<Item, Item> RLAPIS_LEGGINGS = ITEMS.register("rlapis_leggings",
            () -> new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ModArmorMaterials.RLAPIS.getDurabilityForType(ArmorItem.Type.LEGGINGS))));
    public static final DeferredHolder<Item, Item> RLAPIS_BOOTS = ITEMS.register("rlapis_boots",
            () -> new ArmorItem(ModArmorMaterials.RLAPIS, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ModArmorMaterials.RLAPIS.getDurabilityForType(ArmorItem.Type.BOOTS))));

    public static final DeferredHolder<Item, Item> OVERPOWER_HELMET = ITEMS.register("overpower_helmet",
            () -> new ModArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ModArmorMaterials.OVERPOWER.getDurabilityForType(ArmorItem.Type.HELMET))));
    public static final DeferredHolder<Item, Item> OVERPOWER_CHESTPLATE = ITEMS.register("overpower_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ModArmorMaterials.OVERPOWER.getDurabilityForType(ArmorItem.Type.CHESTPLATE))));
    public static final DeferredHolder<Item, Item> OVERPOWER_LEGGINGS = ITEMS.register("overpower_leggings",
            () -> new ModArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ModArmorMaterials.OVERPOWER.getDurabilityForType(ArmorItem.Type.LEGGINGS))));
    public static final DeferredHolder<Item, Item> OVERPOWER_BOOTS = ITEMS.register("overpower_boots",
            () -> new ModArmorItem(ModArmorMaterials.OVERPOWER, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ModArmorMaterials.OVERPOWER.getDurabilityForType(ArmorItem.Type.BOOTS))));

    public static final DeferredHolder<Item, Item> GHOST_SPAWN_EGG = ITEMS.register("ghost_spawn_egg",
            () -> new DeferredSpawnEggItem(() -> ModEntities.GHOST.get(), 0xFFFFFF, 0x999999, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
