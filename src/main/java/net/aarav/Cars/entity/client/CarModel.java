package net.aarav.Cars.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class CarModel<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "carentity"), "main");
    private final ModelPart Car;
    private final ModelPart BottomBrace;
    private final ModelPart Wheels;
    private final ModelPart frontright;
    private final ModelPart backright;
    private final ModelPart backleft;
    private final ModelPart frontleft;

    public CarModel(ModelPart root) {
        this.Car = root.getChild("Car");
        this.BottomBrace = root.getChild("Car").getChild("BottomBrace");
        this.Wheels = root.getChild("Car").getChild("Wheels");
        this.frontright = root.getChild("Car").getChild("Wheels").getChild("frontright");
        this.backright = root.getChild("Car").getChild("Wheels").getChild("backright");
        this.backleft = root.getChild("Car").getChild("Wheels").getChild("backleft");
        this.frontleft = root.getChild("Car").getChild("Wheels").getChild("frontleft");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();


        PartDefinition Car = partdefinition.addOrReplaceChild("Car", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, 6.0F));

        PartDefinition BottomBrace = Car.addOrReplaceChild("BottomBrace", CubeListBuilder.create().texOffs(0, 28).addBox(-27.0F, 1.0F, -1.0F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(22, 41).addBox(-40.0F, -1.0F, -11.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(8, 97).addBox(-9.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(77, 96).addBox(2.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 77).addBox(-5.0F, -5.5F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 121).addBox(-19.0F, -12.0F, -2.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 121).addBox(-19.0F, -12.0F, -11.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(94, 31).addBox(-40.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(77, 47).addBox(-36.0F, -5.5F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(40, 95).addBox(-29.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(76, 91).addBox(-9.0F, -2.0F, -13.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(77, 39).addBox(-5.0F, -5.5F, -13.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(92, 23).addBox(2.0F, -2.0F, -13.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(92, 91).addBox(-29.0F, -2.0F, -13.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(77, 43).addBox(-36.0F, -5.5F, -13.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(94, 12).addBox(-40.0F, -2.0F, -13.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 20).addBox(-38.0F, -6.0F, -11.0F, 45.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(56, 97).addBox(7.0F, -4.0F, -11.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 97).addBox(7.0F, -4.0F, -2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-44.0F, -4.0F, -11.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 40).addBox(-44.0F, -4.0F, -2.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-45.0F, 1.0F, -11.0F, 46.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, -5.0F, 0.0F));

        PartDefinition cube_r1 = BottomBrace.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 7).addBox(-6.0F, -4.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.0F, -8.0F, -1.0F, 3.1416F, 0.0F, -1.5708F));

        PartDefinition cube_r2 = BottomBrace.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 78).addBox(-7.0F, -4.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.0F, -6.0F, -1.0F, 3.1416F, 0.0F, -1.5708F));

        PartDefinition cube_r3 = BottomBrace.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 68).addBox(-6.0F, -4.0F, -1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.0F, -5.0F, -1.0F, 3.1416F, 0.0F, -1.5708F));

        PartDefinition cube_r4 = BottomBrace.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 78).addBox(-7.0F, -4.0F, 0.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0F, -6.0F, -12.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition cube_r5 = BottomBrace.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(62, 35).addBox(-6.0F, -4.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0F, -8.0F, -12.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition cube_r6 = BottomBrace.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 86).addBox(-6.0F, -4.0F, 0.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.0F, -5.0F, -12.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition cube_r7 = BottomBrace.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 40).addBox(-5.0F, -1.0F, -1.0F, 10.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.75F, -7.75F, -0.5F, -1.5708F, 0.0F, -0.6545F));

        PartDefinition cube_r8 = BottomBrace.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 64).addBox(2.0F, -1.0F, -1.0F, 3.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.75F, -9.75F, -0.5F, -1.5708F, 0.0F, -0.2182F));

        PartDefinition cube_r9 = BottomBrace.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 65).addBox(2.0F, -1.0F, -1.0F, 3.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.75F, -10.75F, -0.5F, -1.5708F, 0.0F, -0.2182F));

        PartDefinition cube_r10 = BottomBrace.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 65).addBox(-5.0F, 2.0F, -4.0F, 0.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.25F, 0.25F, -0.5F, -1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r11 = BottomBrace.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 64).addBox(-5.0F, 0.0F, -4.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.5F, 0.25F, -0.5F, -1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r12 = BottomBrace.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(41, 61).addBox(-6.0F, 1.0F, -1.0F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.65F, -11.75F, -8.35F, -1.5708F, -0.2182F, 0.0F));

        PartDefinition cube_r13 = BottomBrace.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 28).addBox(-5.0F, 1.0F, -1.0F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.75F, -11.75F, 0.5F, -1.5708F, 0.2182F, 0.0F));

        PartDefinition cube_r14 = BottomBrace.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 28).addBox(-5.0F, 1.0F, -1.0F, 10.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.75F, -11.75F, -0.5F, -1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r15 = BottomBrace.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(61, 37).addBox(-5.0F, 9.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.75F, -17.75F, -6.0F, 0.0F, -1.5708F, -0.8727F));

        PartDefinition cube_r16 = BottomBrace.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(62, 31).addBox(-5.0F, 9.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.75F, -8.75F, 8.0F, -1.5708F, 0.0F, 0.6981F));

        PartDefinition cube_r17 = BottomBrace.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(62, 33).addBox(-5.0F, 9.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.75F, -8.75F, -1.0F, -1.5708F, 0.0F, 0.6981F));

        PartDefinition cube_r18 = BottomBrace.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 65).addBox(1.0F, -1.0F, -1.0F, 4.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-44.75F, -0.25F, -0.5F, -1.5708F, 0.0F, -0.7418F));

        PartDefinition cube_r19 = BottomBrace.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 54).addBox(-2.0F, -1.0F, -1.0F, 7.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.75F, -3.75F, -0.5F, -1.5708F, 0.0F, -0.2618F));

        PartDefinition cube_r20 = BottomBrace.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 64).addBox(0.0F, -1.0F, -1.0F, 5.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-35.75F, -5.0F, -0.5F, -1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r21 = BottomBrace.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(61, 61).addBox(4.0F, -1.0F, -4.0F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-48.75F, 2.0F, -0.5F, -1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r22 = BottomBrace.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(65, 39).addBox(0.0F, 0.0F, -1.0F, 5.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.45F, -5.725F, -0.5F, -1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r23 = BottomBrace.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(39, 39).addBox(-5.0F, 0.0F, -1.0F, 12.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -4.75F, -0.5F, -1.5708F, 0.0F, 0.2182F));

        PartDefinition cube_r24 = BottomBrace.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(21, 53).addBox(-1.0F, 0.0F, -1.0F, 9.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0F, -0.5F, -1.5708F, 0.0F, -0.0873F));

        PartDefinition cube_r25 = BottomBrace.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 12).addBox(-16.0F, 0.0F, -1.0F, 46.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -6.0F, -2.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r26 = BottomBrace.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(93, 67).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(94, 58).addBox(-1.0F, -1.0F, 11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-38.0F, -2.5F, -12.0F, 0.0F, 0.0F, 0.6981F));

        PartDefinition cube_r27 = BottomBrace.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(16, 93).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(32, 95).addBox(-1.0F, 0.0F, 11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-35.0F, -4.5F, -12.0F, 0.0F, 0.0F, 1.0036F));

        PartDefinition cube_r28 = BottomBrace.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(63, 92).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(69, 95).addBox(-1.0F, -1.0F, 11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.0F, -2.5F, -12.0F, 0.0F, 0.0F, -0.6981F));

        PartDefinition cube_r29 = BottomBrace.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(55, 92).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(95, 72).addBox(-1.0F, 0.0F, 11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.0F, -4.5F, -12.0F, 0.0F, 0.0F, -1.0036F));

        PartDefinition cube_r30 = BottomBrace.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(92, 53).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 96).addBox(-1.0F, 0.0F, 11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.5F, -12.0F, 0.0F, 0.0F, -1.0036F));

        PartDefinition cube_r31 = BottomBrace.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(26, 92).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(48, 96).addBox(-1.0F, -1.0F, 11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.5F, -12.0F, 0.0F, 0.0F, -0.6981F));

        PartDefinition cube_r32 = BottomBrace.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(92, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(85, 96).addBox(-1.0F, 0.0F, 11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.5F, -12.0F, 0.0F, 0.0F, 1.0036F));

        PartDefinition cube_r33 = BottomBrace.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(84, 91).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(93, 96).addBox(-1.0F, -1.0F, 11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -2.5F, -12.0F, 0.0F, 0.0F, 0.6981F));

        PartDefinition cube_r34 = BottomBrace.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 32).addBox(-9.0F, -2.0F, -1.0F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.0F, 2.0F, -11.0F, 1.5708F, 0.0F, 0.0F));

        PartDefinition Wheels = Car.addOrReplaceChild("Wheels", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -6.0F));

        PartDefinition frontright = Wheels.addOrReplaceChild("frontright", CubeListBuilder.create().texOffs(90, 81).addBox(-7.5F, -6.4F, -0.9F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(89, 45).addBox(-7.5F, 0.6F, -0.9F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(71, 72).addBox(-8.5F, -4.4F, -1.9F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(85, 74).addBox(-7.5F, -3.4F, -0.9F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 91).addBox(-10.5F, -4.4F, -0.9F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(47, 90).addBox(-3.5F, -4.4F, -0.9F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(15.5F, -2.6F, 6.9F));

        PartDefinition cube_r35 = frontright.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(83, 70).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -4.4F, 0.1F, 0.0F, 0.0F, -2.5307F));

        PartDefinition cube_r36 = frontright.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(68, 83).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 0.6F, 0.1F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r37 = frontright.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(80, 83).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5F, -4.4F, 0.1F, 0.0F, 0.0F, 2.5307F));

        PartDefinition cube_r38 = frontright.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(84, 29).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5F, 0.6F, 0.1F, 0.0F, 0.0F, 0.7854F));

        PartDefinition backright = Wheels.addOrReplaceChild("backright", CubeListBuilder.create().texOffs(89, 41).addBox(9.0F, -9.0F, 19.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(89, 37).addBox(9.0F, -2.0F, 19.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(71, 65).addBox(8.0F, -7.0F, 18.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(85, 64).addBox(9.0F, -6.0F, 19.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 90).addBox(6.0F, -7.0F, 19.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(39, 89).addBox(13.0F, -7.0F, 19.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-32.0F, 0.0F, -13.0F));

        PartDefinition cube_r39 = backright.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(82, 51).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, -7.0F, 20.0F, 0.0F, 0.0F, -2.5307F));

        PartDefinition cube_r40 = backright.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(82, 60).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, -2.0F, 20.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r41 = backright.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(22, 83).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -2.0F, 20.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r42 = backright.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(10, 83).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -7.0F, 20.0F, 0.0F, 0.0F, 2.5307F));

        PartDefinition backleft = Wheels.addOrReplaceChild("backleft", CubeListBuilder.create().texOffs(88, 87).addBox(9.0F, -9.0F, -21.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(78, 87).addBox(9.0F, -2.0F, -21.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(68, 58).addBox(8.0F, -7.0F, -20.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 85).addBox(9.0F, -6.0F, -21.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 87).addBox(6.0F, -7.0F, -21.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(20, 87).addBox(13.0F, -7.0F, -21.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-32.0F, 0.0F, 13.0F));

        PartDefinition cube_r43 = backleft.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(80, 79).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, -7.0F, -20.0F, 0.0F, 0.0F, -2.5307F));

        PartDefinition cube_r44 = backleft.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 81).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, -2.0F, -20.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r45 = backleft.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(82, 33).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -7.0F, -20.0F, 0.0F, 0.0F, 2.5307F));

        PartDefinition cube_r46 = backleft.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(34, 82).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -2.0F, -20.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition frontleft = Wheels.addOrReplaceChild("frontleft", CubeListBuilder.create().texOffs(10, 87).addBox(-7.5F, -6.4F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(22, 47).addBox(-7.5F, 0.6F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(68, 51).addBox(-8.5F, -4.4F, -0.1F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 84).addBox(-7.5F, -3.4F, -1.1F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(62, 86).addBox(-10.5F, -4.4F, -1.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(54, 86).addBox(-3.5F, -4.4F, -1.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(15.5F, -2.6F, -6.9F));

        PartDefinition cube_r47 = frontleft.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(12, 79).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -4.4F, -0.1F, 0.0F, 0.0F, -2.5307F));

        PartDefinition cube_r48 = frontleft.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(24, 79).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 0.6F, -0.1F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r49 = frontleft.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(68, 79).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5F, -4.4F, -0.1F, 0.0F, 0.0F, 2.5307F));

        PartDefinition cube_r50 = frontleft.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(80, 56).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5F, 0.6F, -0.1F, 0.0F, 0.0F, 0.7854F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }



    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Car.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return null;
    }

    @Override
    public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {

    }

}