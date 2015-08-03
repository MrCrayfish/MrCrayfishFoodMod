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
		registry.registerRecipe(RecipeType.CHOPPING_BOARD, new RecipeVariables().setInput(new ItemStack(FoodItems.pizza_cheese_cooked)).setOutput(new ItemStack(FoodItems.pizza_cheese_slice, 6)));
		registry.registerRecipe(RecipeType.CHOPPING_BOARD, new RecipeVariables().setInput(new ItemStack(FoodItems.pizza_meat_cooked)).setOutput(new ItemStack(FoodItems.pizza_meat_slice, 6)));
		registry.registerRecipe(RecipeType.CHOPPING_BOARD, new RecipeVariables().setInput(new ItemStack(FoodItems.pizza_veg_cooked)).setOutput(new ItemStack(FoodItems.pizza_veg_slice, 6)));
		registry.registerRecipe(RecipeType.CHOPPING_BOARD, new RecipeVariables().setInput(new ItemStack(FoodItems.pie_apple_cooked)).setOutput(new ItemStack(FoodItems.pie_apple_slice, 4)));
		registry.registerRecipe(RecipeType.CHOPPING_BOARD, new RecipeVariables().setInput(new ItemStack(FoodItems.pie_meat_cooked)).setOutput(new ItemStack(FoodItems.pie_meat_slice, 4)));
		registry.registerRecipe(RecipeType.CHOPPING_BOARD, new RecipeVariables().setInput(new ItemStack(FoodItems.pie_potato_cooked)).setOutput(new ItemStack(FoodItems.pie_potato_slice, 4)));
		
		registry.registerRecipe(RecipeType.OVEN, new RecipeVariables().setInput(new ItemStack(FoodItems.chip_uncooked)).setOutput(new ItemStack(FoodItems.chip_cooked)));
		registry.registerRecipe(RecipeType.OVEN, new RecipeVariables().setInput(new ItemStack(FoodItems.pizza_cheese_uncooked)).setOutput(new ItemStack(FoodItems.pizza_cheese_cooked)));
		registry.registerRecipe(RecipeType.OVEN, new RecipeVariables().setInput(new ItemStack(FoodItems.pizza_veg_uncooked)).setOutput(new ItemStack(FoodItems.pizza_veg_cooked)));
		registry.registerRecipe(RecipeType.OVEN, new RecipeVariables().setInput(new ItemStack(FoodItems.pizza_meat_uncooked)).setOutput(new ItemStack(FoodItems.pizza_meat_cooked)));
		registry.registerRecipe(RecipeType.OVEN, new RecipeVariables().setInput(new ItemStack(FoodItems.pie_apple_uncooked)).setOutput(new ItemStack(FoodItems.pie_apple_cooked)));
		registry.registerRecipe(RecipeType.OVEN, new RecipeVariables().setInput(new ItemStack(FoodItems.pie_meat_uncooked)).setOutput(new ItemStack(FoodItems.pie_meat_cooked)));
		registry.registerRecipe(RecipeType.OVEN, new RecipeVariables().setInput(new ItemStack(FoodItems.pie_potato_uncooked)).setOutput(new ItemStack(FoodItems.pie_potato_cooked)));
		
		registry.registerRecipe(RecipeType.TOASTER, new RecipeVariables().setInput(new ItemStack(FoodItems.sandwich_cheese)).setOutput(new ItemStack(FoodItems.sandwich_cheese_toastie)));
	
		registry.registerRecipe(RecipeType.FREEZER, new RecipeVariables().setInput(new ItemStack(Items.milk_bucket)).setOutput(new ItemStack(FoodItems.cheese)));
		
		//registry.registerRecipe(RecipeType.BLENDER, new RecipeVariables().setOutput(new ItemStack(FoodItems.dough)).setIngredients(new ItemStack(FoodItems.flour), new ItemStack(Items.water_bucket)));
	}
}
