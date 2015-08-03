package com.mrcrayfish.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FoodTab extends CreativeTabs {

	public FoodTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return FoodItems.pie_apple_cooked;
	}

}
