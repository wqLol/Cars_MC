package net.aarav.Cars.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.aarav.Cars.Cars;
import net.aarav.Cars.entity.custom.CarEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class CarRenderer extends MobRenderer<CarEntity, CarModel<CarEntity>>{
    public CarRenderer(EntityRendererProvider.Context pContext){
        super(pContext, new CarModel<>(pContext.bakeLayer(ModModelLayers.CAR_LAYER)), 2f);
    }
    @Override
    public ResourceLocation getTextureLocation(CarEntity pEntity) {
        return new ResourceLocation(Cars.MOD_ID, "textures/entity/carentity.png");
    }

    @Override
    public void render(CarEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {

        pPoseStack.scale(2f,2f,2f);

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
