package com.chippiheppu.jasperium;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.*;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, Jasperium.MOD_ID);
	
	public static final RegistryObject<Item> RAW_JASPERIUM = ITEMS.register("raw_jasperium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	public static final RegistryObject<Item> JASPERIUM_NUGGET = ITEMS.register("jasperium_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	public static final RegistryObject<Item> JASPERIUM_INGOT = ITEMS.register("jasperium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
}
