package net.chipselect.shimmer.block;

import net.chipselect.shimmer.Shimmer;
import net.chipselect.shimmer.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block REFINERY_TABLE = registerBlock("refinery_table",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(10f)), ModItemGroup.SPYGLASS_WONDERS);
    public static final Block BLOCK_OF_CRYSTALINE = registerBlock("block_of_crystaline",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(15f)),ModItemGroup.SPYGLASS_WONDERS);
    //ADD THE CRYSTALINE ORE BOZO




    public static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Shimmer.MOD_ID, name), block);

    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM,new Identifier(Shimmer.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks(){
        Shimmer.LOGGER.debug("Registering mod blocks for " + Shimmer.MOD_ID);
    }

}
