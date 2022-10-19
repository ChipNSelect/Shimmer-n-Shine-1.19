package net.chipselect.tutorialmod.item;

import net.chipselect.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item AMONGUS_IMPOSTOR = registerItem("amongus_impostor",
            new Item(new FabricItemSettings().group(ModItemGroup.AMONGUS)));
    public static final Item AMONGUS_KNIFE = registerItem("amongus_knife",
            new Item(new FabricItemSettings().group(ModItemGroup.AMONGUS2)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }


    public static void registerModItems(){
        TutorialMod.LOGGER.debug("Registering mod items for " + TutorialMod.MOD_ID);
    }


}

