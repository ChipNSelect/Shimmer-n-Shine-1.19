package net.chipselect.shimmer.item;

import net.chipselect.shimmer.Shimmer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final  Item RAW_CRYSTALINE = registerItem("raw_crystaline",
            new Item(new FabricItemSettings().group(ModItemGroup.SPYGLASS_WONDERS)));
    public static final Item CRYSTALINE_LENS = registerItem("crystaline_lens",
            new Item(new FabricItemSettings().group(ModItemGroup.SPYGLASS_WONDERS)));
    public static final Item CRACKED_CRYSTALINE_LENS = registerItem("cracked_crystaline_lens",
            new Item(new FabricItemSettings().group(ModItemGroup.SPYGLASS_WONDERS)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Shimmer.MOD_ID, name), item);
    }


    public static void registerModItems(){
        Shimmer.LOGGER.debug("Registering mod items for " + Shimmer.MOD_ID);
    }


}

