package net.chipselect.shimmer;

import net.chipselect.shimmer.block.ModBlocks;
import net.chipselect.shimmer.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Shimmer implements ModInitializer {

	public static final String MOD_ID = "net";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
