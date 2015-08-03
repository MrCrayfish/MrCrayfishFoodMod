package com.mrcrayfish.food;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodItems {
	
	public static Item dough;
	public static Item cheese;
	public static Item flour;
	
	public static Item apple_slice;
	public static Item pie_base;
	public static Item bread_crumbs;
	
	public static Item chip_uncooked;
	public static Item chip_cooked;
	
	public static Item pizza_base;
	public static Item pizza_cheese_uncooked;
	public static Item pizza_cheese_cooked;
	public static Item pizza_cheese_slice;
	public static Item pizza_veg_uncooked;
	public static Item pizza_veg_cooked;
	public static Item pizza_veg_slice;
	public static Item pizza_meat_uncooked;
	public static Item pizza_meat_cooked;
	public static Item pizza_meat_slice;
	
	public static Item bread_toast_cheese;
	
	public static Item sandwich_cheese;
	public static Item sandwich_cheese_toastie;
	public static Item sandwich_chip;
	
	public static Item pie_apple_uncooked;
	public static Item pie_apple_cooked;
	public static Item pie_apple_slice;
	public static Item pie_meat_uncooked;
	public static Item pie_meat_cooked;
	public static Item pie_meat_slice;
	public static Item pie_potato_uncooked;
	public static Item pie_potato_cooked;
	public static Item pie_potato_slice;
	
	public static void init()
	{
		dough                       = new Item().setUnlocalizedName("dough").setCreativeTab(MrCrayfishFoodMod.tabFood);
		cheese                      = new ItemFood(2, 1.0F, false).setUnlocalizedName("cheese").setCreativeTab(MrCrayfishFoodMod.tabFood);
		flour                       = new Item().setUnlocalizedName("flour").setCreativeTab(MrCrayfishFoodMod.tabFood);
		apple_slice                 = new ItemFood(2, 1.0F, false).setUnlocalizedName("apple_slice").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pie_base                    = new Item().setUnlocalizedName("pie_base").setCreativeTab(MrCrayfishFoodMod.tabFood);
		bread_crumbs                      = new Item().setUnlocalizedName("batter").setCreativeTab(MrCrayfishFoodMod.tabFood);
		chip_uncooked               = new ItemFood(2, 1.0F, false).setUnlocalizedName("chip_uncooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		chip_cooked                 = new ItemFood(2, 1.0F, false).setUnlocalizedName("chip_cooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pizza_base                  = new ItemFood(2, 1.0F, false).setUnlocalizedName("pizza_base").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pizza_cheese_uncooked       = new ItemFood(2, 1.0F, false).setUnlocalizedName("pizza_cheese_uncooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pizza_cheese_cooked         = new ItemFood(2, 1.0F, false).setUnlocalizedName("pizza_cheese_cooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pizza_cheese_slice          = new ItemFood(2, 1.0F, false).setUnlocalizedName("pizza_cheese_slice").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pizza_veg_uncooked          = new ItemFood(2, 1.0F, false).setUnlocalizedName("pizza_veg_uncooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pizza_veg_cooked            = new ItemFood(2, 1.0F, false).setUnlocalizedName("pizza_veg_cooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pizza_veg_slice             = new ItemFood(2, 1.0F, false).setUnlocalizedName("pizza_veg_slice ").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pizza_meat_uncooked         = new ItemFood(2, 1.0F, false).setUnlocalizedName("pizza_meat_uncooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pizza_meat_cooked           = new ItemFood(2, 1.0F, false).setUnlocalizedName("pizza_meat_cooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pizza_meat_slice            = new ItemFood(2, 1.0F, false).setUnlocalizedName("pizza_meat_slice").setCreativeTab(MrCrayfishFoodMod.tabFood);
		bread_toast_cheese          = new ItemFood(2, 1.0F, false).setUnlocalizedName("bread_toast_cheese").setCreativeTab(MrCrayfishFoodMod.tabFood);
		sandwich_cheese             = new ItemFood(2, 1.0F, false).setUnlocalizedName("sandwich_cheese").setCreativeTab(MrCrayfishFoodMod.tabFood);
		sandwich_cheese_toastie     = new ItemFood(2, 1.0F, false).setUnlocalizedName("sandwich_cheese_toastie").setCreativeTab(MrCrayfishFoodMod.tabFood);
		sandwich_chip               = new ItemFood(2, 1.0F, false).setUnlocalizedName("sandwich_chip").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pie_apple_uncooked          = new ItemFood(2, 1.0F, false).setUnlocalizedName("pie_apple_uncooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pie_apple_cooked            = new ItemFood(2, 1.0F, false).setUnlocalizedName("pie_apple_cooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pie_apple_slice             = new ItemFood(2, 1.0F, false).setUnlocalizedName("pie_apple_slice").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pie_meat_uncooked           = new ItemFood(2, 1.0F, false).setUnlocalizedName("pie_meat_uncooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pie_meat_cooked             = new ItemFood(2, 1.0F, false).setUnlocalizedName("pie_meat_cooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pie_meat_slice              = new ItemFood(2, 1.0F, false).setUnlocalizedName("pie_meat_slice").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pie_potato_uncooked         = new ItemFood(2, 1.0F, false).setUnlocalizedName("pie_potato_uncooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pie_potato_cooked           = new ItemFood(2, 1.0F, false).setUnlocalizedName("pie_potato_cooked").setCreativeTab(MrCrayfishFoodMod.tabFood);
		pie_potato_slice            = new ItemFood(2, 1.0F, false).setUnlocalizedName("pie_potato_slice").setCreativeTab(MrCrayfishFoodMod.tabFood);
	}
	
	public static void registerItems()
	{
		GameRegistry.registerItem(dough, dough.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cheese, cheese.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flour, flour.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apple_slice, apple_slice.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pie_base, pie_base.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bread_crumbs, bread_crumbs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chip_uncooked,chip_uncooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chip_cooked,chip_cooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pizza_base,pizza_base.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pizza_cheese_uncooked,pizza_cheese_uncooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pizza_cheese_cooked,pizza_cheese_cooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pizza_cheese_slice,pizza_cheese_slice.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pizza_veg_uncooked,pizza_veg_uncooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pizza_veg_cooked,pizza_veg_cooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pizza_veg_slice,pizza_veg_slice.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pizza_meat_uncooked,pizza_meat_uncooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pizza_meat_cooked,pizza_meat_cooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pizza_meat_slice,pizza_meat_slice.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bread_toast_cheese,bread_toast_cheese.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sandwich_cheese,sandwich_cheese.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sandwich_cheese_toastie,sandwich_cheese_toastie.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sandwich_chip,sandwich_chip.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pie_apple_uncooked,pie_apple_uncooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pie_apple_cooked,pie_apple_cooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pie_apple_slice,pie_apple_slice.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pie_meat_uncooked,pie_meat_uncooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pie_meat_cooked,pie_meat_cooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pie_meat_slice,pie_meat_slice.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pie_potato_uncooked,pie_potato_uncooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pie_potato_cooked,pie_potato_cooked.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pie_potato_slice,pie_potato_slice.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(dough);
		registerRender(cheese);
		registerRender(flour);
		registerRender(apple_slice);
		registerRender(pie_base);
		registerRender(bread_crumbs);
		registerRender(chip_uncooked);
		registerRender(chip_cooked);
		registerRender(pizza_base);
		registerRender(pizza_cheese_uncooked);
		registerRender(pizza_cheese_cooked);
		registerRender(pizza_cheese_slice);
		registerRender(pizza_veg_uncooked);
		registerRender(pizza_veg_cooked);
		registerRender(pizza_veg_slice);
		registerRender(pizza_meat_uncooked);
		registerRender(pizza_meat_cooked);
		registerRender(pizza_meat_slice);
		registerRender(bread_toast_cheese);
		registerRender(sandwich_cheese);
		registerRender(sandwich_cheese_toastie);
		registerRender(sandwich_chip);
		registerRender(pie_apple_uncooked);
		registerRender(pie_apple_cooked);
		registerRender(pie_apple_slice);
		registerRender(pie_meat_uncooked);
		registerRender(pie_meat_cooked);
		registerRender(pie_meat_slice);
		registerRender(pie_potato_uncooked);
		registerRender(pie_potato_cooked);
		registerRender(pie_potato_slice);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
