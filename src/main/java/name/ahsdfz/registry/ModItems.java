package name.ahsdfz.registry;

import name.ahsdfz.AHSDFZConstructionMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item registerItem(String name, Item item, ItemGroup...itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(AHSDFZConstructionMod.MOD_ID, name), item);
        for (ItemGroup itemGroup: itemGroups) {
            ItemGroupEvents.modifyEntriesEvent()
        }
    }
}
