package com.insane;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsaneMod implements ModInitializer {
	public static final String MOD_ID = "insaneid";

	public static final TextRenderer renderer = MinecraftClient.getInstance().textRenderer;
	public static final DrawContext context = null;
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.initialize();
		ModBlocks.initialize();

		LOGGER.info("Hello Fabric world!");

		AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
			BlockState state = world.getBlockState(pos);

			if( state.getBlock() == ModBlocks.SALT_MAKER && !player.isSpectator() && player.getMainHandStack().getItem() == Items.COBBLESTONE)
			{
				int count = player.getMainHandStack().getCount();
				player.getMainHandStack().decrement(count);
				int slot = player.getInventory().selectedSlot;
				player.getInventory().setStack(slot, new ItemStack (ModItems.SALT, count));

				world.playSound(null, pos, SoundEvents.BLOCK_BREWING_STAND_BREW, SoundCategory.PLAYERS, 1f, 1f);
			}

			return ActionResult.PASS;
		});

		//HudRenderCallback.EVENT.register(new Textss());
	
	}
}