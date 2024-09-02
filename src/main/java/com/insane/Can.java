package com.insane;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;

public class Can extends Item {

    public Can(Settings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()) {

            context.getWorld().playSound(null, context.getBlockPos(),
                    SoundEvents.BLOCK_COPPER_PLACE, SoundCategory.PLAYERS,
                    1f, 1f);
        }

        return super.useOnBlock(context);
    }
}