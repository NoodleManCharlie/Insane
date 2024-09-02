package com.insane;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SuspiciousStewItem;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
	public static Item register(Item item, String id) {
		// Create the identifier for the item.
		Identifier itemID = Identifier.of(InsaneMod.MOD_ID, id);

		// Register the item.
		Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

		// Return the registered item!
		return registeredItem;
	}

	//
	public static final RegistryKey<ItemGroup> InsaneGroupKey = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(InsaneMod.MOD_ID, "item_group"));
		public static final ItemGroup InsaneGroup = FabricItemGroup.builder()
				.icon(() -> new ItemStack(ModItems.CAN))
				.displayName(Text.translatable("Insane"))
				.build();

	public static void initialize() {
		//Register the Items
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.SUSPICIOUS_SUBSTANCE));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CAN));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.SALT));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.NIGH_SIGN));

		//Register Foods
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedApple));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedBakedPotatoe));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedBeef));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedBeetroot));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedBeetrootSoup));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedBottleOfHoney));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedBread));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCake));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCarrot));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedChicken));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedChorusFruit));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCod));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCookedBeef));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCookedChicken));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCookedCod));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCookedMutton));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCookedPorkChop));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCookedRabbit));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCookedSalmon));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedCookie));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedDriedKelp));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedEnchantedGoldenApple));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedGlowBerry));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedGoldenApple));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedGoldenCarrot));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedMelonSlice));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedMilk));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedMushroomStew));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedMutton));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedPoisonousPotatoe));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedPorkChop));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedPotatoe));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedPufferfish));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedPumpkinPie));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedRabbit));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedRabbitStew));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedRottenFlesh));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedSalmon));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedSpiderEye));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedSuspiciousStew));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedSweetBerries));
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> itemGroup.add(ModItems.CannedTropicalFish));

		//Register the BlockItems
		ItemGroupEvents.modifyEntriesEvent(InsaneGroupKey).register((itemGroup) -> { itemGroup.add(ModBlocks.SALT_MAKER.asItem());});
		
		// Register the group.
		Registry.register(Registries.ITEM_GROUP, InsaneGroupKey, InsaneGroup);
	}

	public static final Item SUSPICIOUS_SUBSTANCE = register(
		new Item(new Item.Settings()),
		"suspicious_substance"
	);

	public static final Item CAN = register(
		new Can(new Item.Settings()),
		"tin_can"
	);

	public static final Item SALT = register(
		new Item(new Item.Settings()),
		"salt"
	);

	public static final Item NIGH_SIGN = register(
		new NighSign(new Item.Settings()),
		"nighsign"
	); //"rotation": {"angle": 45, "axis": "x", "origin": [-14, -8, 0]},



	//All 8 million canned food items
	public static final Item CannedApple = register(
		new Item(new Item.Settings().food(Food.CANNED_APPLE_COMPONENT)),
		"capple"
	);
	public static final Item CannedBakedPotatoe = register(
		new Item(new Item.Settings().food(Food.CANNED_BAKED_POTATO_COMPONENT)),
		"cbakedpotatoe"
	);
	public static final Item CannedBeef = register(
		new Item(new Item.Settings().food(Food.CANNED_BEEF_COMPONENT)),
		"cbeef"
	);
	public static final Item CannedBeetroot = register(
		new Item(new Item.Settings().food(Food.CANNED_BEETROOT_COMPONENT)),
		"cbeetroot"
	);
	public static final Item CannedBeetrootSoup = register(
		new Item(new Item.Settings().food(Food.CANNED_BEETROOT_SOUP_COMPONENT)),
		"cbeetrootsoup"
	);
	public static final Item CannedBottleOfHoney = register(
		new Item(new Item.Settings().food(Food.CANNED_HONEY_BOTTLE_COMPONENT)),
		"cbottleofhoney"
	);
	public static final Item CannedBread = register(
		new Item(new Item.Settings().food(Food.CANNED_BREAD_COMPONENT)),
		"cbread"
	);
	public static final Item CannedCake = register(
		new Item(new Item.Settings().food(Food.CANNED_CAKE_COMPONENT)),
		"ccake"
	);
	public static final Item CannedCarrot = register(
		new Item(new Item.Settings().food(Food.CANNED_CARROT_COMPONENT)),
		"ccarrot"
	);
	public static final Item CannedChicken = register(
		new Item(new Item.Settings().food(Food.CANNED_CHICKEN_COMPONENT)),
		"cchicken"
	);
	public static final Item CannedChorusFruit = register(
		new CannedChorusFruit(new Item.Settings().food(Food.CANNED_CHORUS_FRUIT_COMPONENT)),
		"cchorusfruit"
	);
	public static final Item CannedCod = register(
		new Item(new Item.Settings().food(Food.CANNED_COD_COMPONENT)),
		"ccod"
	);
	public static final Item CannedCookedBeef = register(
		new Item(new Item.Settings().food(Food.CANNED_COOKED_BEEF_COMPONENT)),
		"ccookedbeef"
	);
	public static final Item CannedCookedChicken = register(
		new Item(new Item.Settings().food(Food.CANNED_COOKED_CHICKEN_COMPONENT)),
		"ccookedchicken"
	);
	public static final Item CannedCookedCod = register(
		new Item(new Item.Settings().food(Food.CANNED_COOKED_COD_COMPONENT)),
		"ccookedcod"
	);
	public static final Item CannedCookedMutton = register(
		new Item(new Item.Settings().food(Food.CANNED_COOKED_MUTTON_COMPONENT)),
		"ccookedmutton"
	);
	public static final Item CannedCookedPorkChop = register(
		new Item(new Item.Settings().food(Food.CANNED_COOKED_PORKCHOP_COMPONENT)),
		"ccookedporkchop"
	);
	public static final Item CannedCookedRabbit = register(
		new Item(new Item.Settings().food(Food.CANNED_COOKED_RABBIT_COMPONENT)),
		"ccookedrabbit"
	);
	public static final Item CannedCookedSalmon = register(
		new Item(new Item.Settings().food(Food.CANNED_COOKED_SALMON_COMPONENT)),
		"ccookedsalmon"
	);
	public static final Item CannedCookie = register(
		new Item(new Item.Settings().food(Food.CANNED_COOKIE_COMPONENT)),
		"ccookie"
	);
	public static final Item CannedDriedKelp = register(
		new Item(new Item.Settings().food(Food.CANNED_DRIED_KELP_COMPONENT)),
		"cdriedkelp"
	);
	public static final Item CannedEnchantedGoldenApple = register(
		new Item(new Item.Settings().food(Food.CANNED_ENCHANTED_GOLDEN_APPLE_COMPONENT)),
		"cenchantedgoldenapple"
	);
	public static final Item CannedGlowBerry = register(
		new Item(new Item.Settings().food(Food.CANNED_GLOW_BERRIES_COMPONENT)),
		"cglowberry"
	);
	public static final Item CannedGoldenApple = register(
		new Item(new Item.Settings().food(Food.CANNED_GOLDEN_APPLE_COMPONENT)),
		"cgoldenapple"
	);
	public static final Item CannedGoldenCarrot = register(
		new Item(new Item.Settings().food(Food.CANNED_GOLDEN_CARROT_COMPONENT)),
		"cgoldencarrot"
	);
	public static final Item CannedMelonSlice = register(
		new Item(new Item.Settings().food(Food.CANNED_MELON_SLICE_COMPONENT)),
		"cmelonslice"
	);
	public static final Item CannedMilk = register(
		new CannedMilk(new Item.Settings()),
		"cmilk"
	);
	public static final Item CannedMushroomStew = register(
		new Item(new Item.Settings().food(Food.CANNED_MUSHROOM_STEW_COMPONENT)),
		"cmushroomstew"
	);
	public static final Item CannedMutton = register(
		new Item(new Item.Settings().food(Food.CANNED_MUTTON_COMPONENT)),
		"cmutton"
	);
	public static final Item CannedPoisonousPotatoe = register(
		new Item(new Item.Settings().food(Food.CANNED_POISONOUS_POTATO_COMPONENT)),
		"cpoisonouspotatoe"
	);
	public static final Item CannedPorkChop = register(
		new Item(new Item.Settings().food(Food.CANNED_PORKCHOP_COMPONENT)),
		"cporkchop"
	);
	public static final Item CannedPotatoe = register(
		new Item(new Item.Settings().food(Food.CANNED_POTATO_COMPONENT)),
		"cpotatoe"
	);
	public static final Item CannedPufferfish = register(
		new Item(new Item.Settings().food(Food.CANNED_PUFFERFISH_COMPONENT)),
		"cpufferfish"
	);
	public static final Item CannedPumpkinPie = register(
		new Item(new Item.Settings().food(Food.CANNED_PUMPKIN_PIE_COMPONENT)),
		"cpumpkinpie"
	);
	public static final Item CannedRabbit = register(
		new Item(new Item.Settings().food(Food.CANNED_RABBIT_COMPONENT)),
		"crabbit"
	);
	public static final Item CannedRabbitStew = register(
		new Item(new Item.Settings().food(Food.CANNED_RABBIT_STEW_COMPONENT)),
		"crabbitstew"
	);
	public static final Item CannedRottenFlesh = register(
		new Item(new Item.Settings().food(Food.CANNED_ROTTEN_FLESH_COMPONENT)),
		"crottenflesh"
	);
	public static final Item CannedSalmon = register(
		new Item(new Item.Settings().food(Food.CANNED_SALMON_COMPONENT)),
		"csalmon"
	);
	public static final Item CannedSpiderEye = register(
		new Item(new Item.Settings().food(Food.CANNED_SPIDER_EYE_COMPONENT)),
		"cspidereye"
	);
	//TODO Fix Suspicious Stew
	public static final Item CannedSuspiciousStew = register(
		new SuspiciousStewItem(new Item.Settings().food(Food.CANNED_SUSPICIOUS_STEW_COMPONENT)),
		"csuspiciousstew"
	);
	public static final Item CannedSweetBerries = register(
		new Item(new Item.Settings().food(Food.CANNED_SWEET_BERRIES_COMPONENT)),
		"csweetberries"
	);
	public static final Item CannedTropicalFish = register(
		new Item(new Item.Settings().food(Food.CANNED_TROPICAL_FISH_COMPONENT)),
		"ctropicalfish"
	);
}