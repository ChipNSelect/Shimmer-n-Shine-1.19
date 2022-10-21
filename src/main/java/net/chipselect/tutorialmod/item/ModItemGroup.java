package net.chipselect.tutorialmod.item;

import net.chipselect.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup AMONGUS = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "amongus"),()->new ItemStack(ModItems.AMONGUS_IMPOSTOR));


}
