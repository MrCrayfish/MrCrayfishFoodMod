package com.mrcrayfish.food;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.mrcrayfish.furniture.api.IRecipeRegistry;
import com.mrcrayfish.furniture.api.RecipeType;
import com.mrcrayfish.furniture.api.RecipeVariables;

public class RecipeHook {
	
	public static void register(IRecipeRegistry registry) {
		registry.registerRecipe(RecipeType.CHOPPING_BOARD, new RecipeVariables().setInput(new ItemStack(Items.apple)).setOutput(new ItemStack(FoodItems.apple_slice, 6)));
		registry.registerRecipe(RecipeType.CHOPPING_BOARD, new RecipeVariables().setInput(new ItemStack(Items.potato)).setOutput(new ItemStack(FoodItems.chip_uncooked, 10)));
	}
}
