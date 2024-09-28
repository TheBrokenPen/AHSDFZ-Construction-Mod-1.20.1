package name.ahsdfz.registry;

import name.ahsdfz.AHSDFZConstructionMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup AHSDFZ_CONSTRUCTION_MOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AHSDFZConstructionMod.MOD_ID, "ahsdfz_blocks_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ahsdfz-construction-mod.BuildingBlocks"))
                    .icon(() -> new ItemStack(ModItems.TestificantItem)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.TestificantItem);
                        entries.add(ModItems.NormalItem);
                    })).build());
    public static void registerModItemGroup() {

    }
}

