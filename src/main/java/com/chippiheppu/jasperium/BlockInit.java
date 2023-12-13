package com.chippiheppu.jasperium;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Jasperium.MOD_ID);
	
	public static final RegistryObject<Block> JASPERIUM_ORE = BLOCKS.register("jasperium_ore",
            () -> new Block(Block.Properties
            		.of(Material.STONE)
            		.strength(4f, 1200f)
            		.requiresCorrectToolForDrops()
            				));
	
	public static final RegistryObject<Block> DEEPSLATE_JASPERIUM_ORE = BLOCKS.register("deepslate_jasperium_ore",
            () -> new Block(Block.Properties
            		.of(Material.STONE)
            		.strength(4f, 1200f)
            		.requiresCorrectToolForDrops()
            				));
	
	public static final RegistryObject<Block> JASPERIUM_BLOCK = BLOCKS.register("jasperium_block",
            () -> new Block(Block.Properties
            		.of(Material.METAL)
            		.strength(4f, 1200f)
            		.requiresCorrectToolForDrops()
            				));
	
	public static final RegistryObject<Block> RAW_JASPERIUM_BLOCK = BLOCKS.register("raw_jasperium_block",
            () -> new Block(Block.Properties
            		.of(Material.METAL)
            		.strength(4f, 1200f)
            		.requiresCorrectToolForDrops()
            				));
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
	    final IForgeRegistry<Item> registry = event.getRegistry();

	    BLOCKS.getEntries().stream().map(RegistryObject::get).forEach( (block) -> {
	        final Item.Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS);
	        final BlockItem blockItem = new BlockItem(block, properties);
	        blockItem.setRegistryName(block.getRegistryName());
	        registry.register(blockItem);
	    });
	    
	    //final BlockItem bowl = new BlockItem(JASPERIUM_BLOCK,);
	}
}
