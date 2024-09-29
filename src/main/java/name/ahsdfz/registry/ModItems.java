package name.ahsdfz.registry;

import name.ahsdfz.AHSDFZConstructionMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

//Contents below are for vanilla ItemGroups
/*
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
*/

public class ModItems {

    //Registered Items
    public static final Item TestificantItem = registerItems(
            "testificant_item",
            new Item(new FabricItemSettings())
    );
    public static final Item NormalItem = registerItems(
            "normal_item",
            new Item(new FabricItemSettings())
    );

    //AddToNormalItemGroups
/*
    public static void addTestificantItem(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(TestificantItem);
    }
    public static void addNormalItem(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(NormalItem);
    }
*/

    //Register Items
    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(AHSDFZConstructionMod.MOD_ID, name), item);
    }

    //Register Items to Groups
    public static void registerModItems() {

        //Contents for vanilla ItemGroups
/*
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(ModItems::addTestificantItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addNormalItem);
*/

    }

}
