package com.insane;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class Food {

	public static final FoodComponent CANNED_APPLE_COMPONENT;
	public static final FoodComponent CANNED_BAKED_POTATO_COMPONENT;
	public static final FoodComponent CANNED_BEEF_COMPONENT;
	public static final FoodComponent CANNED_BEETROOT_COMPONENT;
	public static final FoodComponent CANNED_BEETROOT_SOUP_COMPONENT;
	public static final FoodComponent CANNED_BREAD_COMPONENT;
	public static final FoodComponent CANNED_CARROT_COMPONENT;
	public static final FoodComponent CANNED_CHICKEN_COMPONENT;
	public static final FoodComponent CANNED_CHORUS_FRUIT_COMPONENT;
	public static final FoodComponent CANNED_COD_COMPONENT;
	public static final FoodComponent CANNED_COOKED_BEEF_COMPONENT;
	public static final FoodComponent CANNED_COOKED_CHICKEN_COMPONENT;
	public static final FoodComponent CANNED_COOKED_COD_COMPONENT;
	public static final FoodComponent CANNED_COOKED_MUTTON_COMPONENT;
	public static final FoodComponent CANNED_COOKED_PORKCHOP_COMPONENT;
	public static final FoodComponent CANNED_COOKED_RABBIT_COMPONENT;
	public static final FoodComponent CANNED_COOKED_SALMON_COMPONENT;
	public static final FoodComponent CANNED_COOKIE_COMPONENT;
	public static final FoodComponent CANNED_DRIED_KELP_COMPONENT;
	public static final FoodComponent CANNED_ENCHANTED_GOLDEN_APPLE_COMPONENT;
	public static final FoodComponent CANNED_GOLDEN_APPLE_COMPONENT;
	public static final FoodComponent CANNED_GOLDEN_CARROT_COMPONENT;
	public static final FoodComponent CANNED_HONEY_BOTTLE_COMPONENT;
	public static final FoodComponent CANNED_MELON_SLICE_COMPONENT;
	public static final FoodComponent CANNED_MUSHROOM_STEW_COMPONENT;
	public static final FoodComponent CANNED_MUTTON_COMPONENT;
	public static final FoodComponent CANNED_POISONOUS_POTATO_COMPONENT;
	public static final FoodComponent CANNED_PORKCHOP_COMPONENT;
	public static final FoodComponent CANNED_POTATO_COMPONENT;
	public static final FoodComponent CANNED_PUFFERFISH_COMPONENT;
	public static final FoodComponent CANNED_PUMPKIN_PIE_COMPONENT;
	public static final FoodComponent CANNED_RABBIT_COMPONENT;
	public static final FoodComponent CANNED_RABBIT_STEW_COMPONENT;
	public static final FoodComponent CANNED_ROTTEN_FLESH_COMPONENT;
	public static final FoodComponent CANNED_SALMON_COMPONENT;
	public static final FoodComponent CANNED_SPIDER_EYE_COMPONENT;
	public static final FoodComponent CANNED_SUSPICIOUS_STEW_COMPONENT;
	public static final FoodComponent CANNED_SWEET_BERRIES_COMPONENT;
	public static final FoodComponent CANNED_GLOW_BERRIES_COMPONENT;
	public static final FoodComponent CANNED_TROPICAL_FISH_COMPONENT;

	//Variable of custom food Entries
	public static final FoodComponent CANNED_CAKE_COMPONENT;

	public Food() {
	}

	static {
		CANNED_APPLE_COMPONENT = (new FoodComponent.Builder()).usingConvertsTo(ModItems.CAN).nutrition(4).saturationModifier(0.3F).build();
		CANNED_BAKED_POTATO_COMPONENT = (new FoodComponent.Builder()).nutrition(5).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_BEEF_COMPONENT = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.3F).usingConvertsTo(ModItems.CAN).build();
		CANNED_BEETROOT_COMPONENT = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_BEETROOT_SOUP_COMPONENT = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_BREAD_COMPONENT = (new FoodComponent.Builder()).nutrition(5).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_CARROT_COMPONENT = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_CHICKEN_COMPONENT = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.3F).usingConvertsTo(ModItems.CAN).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F).build();
		CANNED_CHORUS_FRUIT_COMPONENT = (new FoodComponent.Builder()).nutrition(4).saturationModifier(0.3F).usingConvertsTo(ModItems.CAN).alwaysEdible().build();
		CANNED_COD_COMPONENT = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).usingConvertsTo(ModItems.CAN).build();
		CANNED_COOKED_BEEF_COMPONENT = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.8F).usingConvertsTo(ModItems.CAN).build();
		CANNED_COOKED_CHICKEN_COMPONENT = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_COOKED_COD_COMPONENT = (new FoodComponent.Builder()).nutrition(5).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_COOKED_MUTTON_COMPONENT = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.8F).usingConvertsTo(ModItems.CAN).build();
		CANNED_COOKED_PORKCHOP_COMPONENT = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.8F).usingConvertsTo(ModItems.CAN).build();
		CANNED_COOKED_RABBIT_COMPONENT = (new FoodComponent.Builder()).nutrition(5).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_COOKED_SALMON_COMPONENT = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.8F).usingConvertsTo(ModItems.CAN).build();
		CANNED_COOKIE_COMPONENT = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).usingConvertsTo(ModItems.CAN).build();
		CANNED_DRIED_KELP_COMPONENT = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.3F).snack().usingConvertsTo(ModItems.CAN).build();
		CANNED_ENCHANTED_GOLDEN_APPLE_COMPONENT = (new FoodComponent.Builder()).nutrition(4).saturationModifier(1.2F).usingConvertsTo(ModItems.CAN).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0F).alwaysEdible().build();
		CANNED_GOLDEN_APPLE_COMPONENT = (new FoodComponent.Builder()).nutrition(4).saturationModifier(1.2F).usingConvertsTo(ModItems.CAN).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F).alwaysEdible().build();
		CANNED_GOLDEN_CARROT_COMPONENT = (new FoodComponent.Builder()).nutrition(6).saturationModifier(1.2F).usingConvertsTo(ModItems.CAN).build();
		CANNED_HONEY_BOTTLE_COMPONENT = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.1F).usingConvertsTo(ModItems.CAN).build();
		CANNED_MELON_SLICE_COMPONENT = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.3F).usingConvertsTo(ModItems.CAN).build();
		CANNED_MUSHROOM_STEW_COMPONENT = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_MUTTON_COMPONENT = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.3F).usingConvertsTo(ModItems.CAN).build();
		CANNED_POISONOUS_POTATO_COMPONENT = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.3F).usingConvertsTo(ModItems.CAN).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), 0.6F).build();
		CANNED_PORKCHOP_COMPONENT = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.3F).usingConvertsTo(ModItems.CAN).build();
		CANNED_POTATO_COMPONENT = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.3F).usingConvertsTo(ModItems.CAN).build();
		CANNED_PUFFERFISH_COMPONENT = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.1F).usingConvertsTo(ModItems.CAN).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 1.0F).build();
		CANNED_PUMPKIN_PIE_COMPONENT = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.3F).usingConvertsTo(ModItems.CAN).build();
		CANNED_RABBIT_COMPONENT = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.3F).usingConvertsTo(ModItems.CAN).build();
		CANNED_RABBIT_STEW_COMPONENT = new FoodComponent.Builder().nutrition(10).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_ROTTEN_FLESH_COMPONENT = (new FoodComponent.Builder()).nutrition(4).saturationModifier(0.1F).usingConvertsTo(ModItems.CAN).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.8F).build();
		CANNED_SALMON_COMPONENT = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).usingConvertsTo(ModItems.CAN).build();
		CANNED_SPIDER_EYE_COMPONENT = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.8F).usingConvertsTo(ModItems.CAN).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), 1.0F).build();
		CANNED_SUSPICIOUS_STEW_COMPONENT = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6F).usingConvertsTo(ModItems.CAN).build();
		CANNED_SWEET_BERRIES_COMPONENT = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).usingConvertsTo(ModItems.CAN).build();
		CANNED_GLOW_BERRIES_COMPONENT = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).usingConvertsTo(ModItems.CAN).build();
		CANNED_TROPICAL_FISH_COMPONENT = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.1F).usingConvertsTo(ModItems.CAN).build();
	
		//Custom Food Entries
		CANNED_CAKE_COMPONENT = (new FoodComponent.Builder()).nutrition(14).usingConvertsTo(ModItems.CAN).saturationModifier(0.1F).build();
	}
}
