package net.aarav.Cars.entity.custom;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import org.slf4j.Logger;

import static java.lang.Math.abs;
import static java.lang.Math.round;
import static net.minecraft.util.Mth.cos;
import static net.minecraft.util.Mth.sin;

public class CarEntity extends Animal {


    public CarEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {

        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));


    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 200)
                .add(Attributes.FOLLOW_RANGE, 240);


    }

    @Override
    protected boolean canRide(Entity pVehicle) {
        return true;
    }

    @Override
    public boolean canRiderInteract() {
        return true;
    }

    @Override
    public InteractionResult mobInteract(Player pPlayer, InteractionHand pHand) {
        if (!pPlayer.isSecondaryUseActive()) {
            if (!this.level().isClientSide) {
                pPlayer.startRiding(this);
            }


        }
        return InteractionResult.sidedSuccess(this.level().isClientSide);
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return false;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return null;
    }


    @Override
    public void tick() {
//        if (Minecraft.getInstance().player!=null) {
//            Minecraft.getInstance().player.sendSystemMessage(Component.literal("hi"));
//        }
//        if (abs(this.getYRot()-(Minecraft.getInstance().player.getYRot() + 90.0f)) > 30) {
//            this.setYRot(Minecraft.getInstance().player.getYRot() + 90.0f);
//        }
//        this.setDeltaMovement(this.getDeltaMovement().add(0.0001d,0d,0.000001d));
        if (this.isVehicle() && Minecraft.getInstance().options.keyRight.isDown()) {

            this.setYRot(this.getYRot()+5f);
            this.setDeltaMovement(this.getDeltaMovement().add(0.0001d,0d,0.000001d));

        }
        if (this.isVehicle() && Minecraft.getInstance().options.keyLeft.isDown()) {

            this.setYRot(this.getYRot()-5f);
            this.setDeltaMovement(this.getDeltaMovement().add(0.0001d,0d,0.000001d));

        }


        if (this.isVehicle() && Minecraft.getInstance().options.keyUp.isDown()) {

            double radians = Math.toRadians(round(this.getYRot()));
            this.setDeltaMovement(this.getDeltaMovement().add(1d * Math.cos(radians), 0d, 1d * Math.sin(radians)));
        }
        if (this.isVehicle() && Minecraft.getInstance().options.keyDown.isDown()) {

            double radians = Math.toRadians(round(this.getYRot()));
            this.setDeltaMovement(this.getDeltaMovement().add(-1d * Math.cos(radians), 0d, -1d * Math.sin(radians)));
        }



        super.tick();
    }
}
