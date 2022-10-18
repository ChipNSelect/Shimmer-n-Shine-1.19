package net.chipselect.tutorialmod;

import net.chipselect.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//very important comment

public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "Tutorial Mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
