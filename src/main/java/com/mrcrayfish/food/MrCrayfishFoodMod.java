package com.mrcrayfish.food;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class MrCrayfishFoodMod {
	
	@Instance(Reference.MOD_ID)
	public static MrCrayfishFoodMod instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		FoodItems.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		FMLInterModComms.sendMessage(Reference.FURNITURE_MOD_ID, Reference.FURNITURE_RECIPE, Reference.RECIPE_HOOK);
	}
}
