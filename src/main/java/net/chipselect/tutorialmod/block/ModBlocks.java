package net.chipselect.tutorialmod.block;

import net.chipselect.tutorialmod.TutorialMod;
import net.chipselect.tutorialmod.item.ModItemGroup;
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
    public static final Block VENT = registerBlock("amongus_vent",
            new Block(FabricBlockSettings.of(Material.METAL).collidable(true).strength(4f).requiresTool()), ModItemGroup.AMONGUS);

    public static final Block HEALTHCARE_BLOCK = registerBlock("amongus_healthcare_block",
            new Block(FabricBlockSettings.of(Material.LAVA).strength(4f).jumpVelocityMultiplier(100f).slipperiness(100f).luminance(15)), ModItemGroup.AMONGUS);


    public static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);

    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM,new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks(){
        TutorialMod.LOGGER.debug("Registering mod blocks for " + TutorialMod.MOD_ID);
    }

}
