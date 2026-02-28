package com.stonytark.usefultoolsmod.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

// In 1.20.2, ArmorMaterial is still an interface. Custom armor materials are implemented as enums.
public enum ModArmorMaterials implements ArmorMaterial {

    // name, durabilityMultiplier, protection[boots,leggings,chestplate,helmet],
    // enchantability, equipSound, toughness, knockbackResistance, repairIngredient
    RGOLD("usefultoolsmod:rgold", 18,
            new int[]{3, 5, 5, 3}, 25,
            SoundEvents.ARMOR_EQUIP_GENERIC, 2f, 0.1f,
            () -> Ingredient.of(ModItems.RGOLD.get())),

    OBSIDIAN("usefultoolsmod:obsidian", 45,
            new int[]{6, 7, 9, 6}, 10,
            SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0.4f,
            () -> Ingredient.of(ModItems.OBINGOT.get())),

    EMERALD("usefultoolsmod:emerald", 33,
            new int[]{4, 6, 8, 4}, 30,
            SoundEvents.ARMOR_EQUIP_GENERIC, 2f, 0.15f,
            () -> Ingredient.of(ModItems.SEM.get())),

    OVERPOWER("usefultoolsmod:overpower", 100,
            new int[]{15, 15, 15, 15}, 50,
            SoundEvents.ARMOR_EQUIP_GENERIC, 8f, 1f,
            () -> Ingredient.of(ModItems.OBINGOT.get())),

    HRED("usefultoolsmod:hred", 20,
            new int[]{2, 4, 4, 3}, 23,
            SoundEvents.ARMOR_EQUIP_GENERIC, 1.1f, 0.08f,
            () -> Ingredient.of(ModItems.HRED.get())),

    RLAPIS("usefultoolsmod:rlapis", 17,
            new int[]{3, 6, 4, 4}, 32,
            SoundEvents.ARMOR_EQUIP_GENERIC, 1.6f, 0.15f,
            () -> Ingredient.of(ModItems.RLAPIS.get()));

    // Base durability values (same as vanilla: boots, leggings, chestplate, helmet)
    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts; // boots, leggings, chestplate, helmet
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier,
                      int[] protectionAmounts, int enchantability,
                      SoundEvent equipSound, float toughness,
                      float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.getSlot().getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
