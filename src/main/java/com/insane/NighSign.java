package com.insane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.event.Event;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class NighSign extends Item {

    public static final Logger LOGGER = LoggerFactory.getLogger(InsaneMod.MOD_ID);

    public NighSign(Settings settings) {
        super(settings);
    }
    
    
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // Ensure we don't spawn the lightning only on the client.
        // This is to prevent desync.
        if (world.isClient) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }

        //BlockPos frontOfPlayer = user.getBlockPos().offset(user.getHorizontalFacing(), 10);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 200, 1));
        // Spawn the lightning bolt.
        //LightningEntity lightningBolt = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
        //lightningBolt.setPosition(user.getBlockPos().toCenterPos());

        new Thread(() -> {
            //code here
            LOGGER.info("Yo Wassup");
            try {
                Thread.sleep(4000);
                for (int i = 0; i <= 10; i++)
                {
                    LightningEntity lightningBolt = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
                    lightningBolt.setPosition(user.getBlockPos().toCenterPos());
                    world.spawnEntity(lightningBolt); 
                    user.kill();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        return TypedActionResult.success(user.getStackInHand(hand));
    }

}
