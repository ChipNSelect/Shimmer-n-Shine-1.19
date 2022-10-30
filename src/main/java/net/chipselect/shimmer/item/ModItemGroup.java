package net.chipselect.shimmer.item;

import net.chipselect.shimmer.Shimmer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SPYGLASS_WONDERS = FabricItemGroupBuilder.build(
            new Identifier(Shimmer.MOD_ID, "shimmer_item_group"),()->new ItemStack(ModItems.RAW_CRYSTALINE));


}
