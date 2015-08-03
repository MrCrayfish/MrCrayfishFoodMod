package com.mrcrayfish.food.proxy;

import com.mrcrayfish.food.FoodItems;

public class ClientProxy implements ProxyInterface {

	@Override
	public void init() {
		FoodItems.registerRenders();
	}
}
