package com.mrcrayfish.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.mrcrayfish.food.proxy.ProxyInterface;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:cfm@[3.4.8,)")
public class MrCrayfishFoodMod {
	
	@Instance(Reference.MOD_ID)
	public static MrCrayfishFoodMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static ProxyInterface proxy;
	
	public static CreativeTabs tabFood = new FoodTab("tabFood");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		/** Item Registering */
		FoodItems.init();
		FoodItems.registerItems();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		/** Initialize Proxies */
		proxy.init();
		
		/** RecipeAPI */
		FMLInterModComms.sendMessage(Reference.FURNITURE_MOD_ID, Reference.FURNITURE_RECIPE, Reference.RECIPE_HOOK);
	}
}
