package name.ahsdfz.registry;

import name.ahsdfz.AHSDFZConstructionMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    //BUILDING BLOCKS ITEMGROUP
    public static final ItemGroup BUILDING_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AHSDFZConstructionMod.MOD_ID, "ahsdfz_blocks_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ahsdfz-construction-mod.BuildingBlocks"))
                    .icon(() -> new ItemStack(ModItems.TestificantItem)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.TestificantItem);
                        entries.add(ModItems.NormalItem);
                    })).build());

    //USEFUL MISCS ITEMGROUP
    public static final ItemGroup USEFUL_MISCS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AHSDFZConstructionMod.MOD_ID, "ahsdfz_items_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ahsdfz-construction-mod.UsefulMiscs"))
                    .icon(() -> new ItemStack(ModItems.NormalItem)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.NormalItem);
                        entries.add(Items.BEACON);
                    })).build());

    //Register ItemGroups
    public static void registerModItemGroup() {

    }
}

