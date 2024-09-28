package name.ahsdfz.registry;

import name.ahsdfz.AHSDFZConstructionMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY_1 = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(AHSDFZConstructionMod.MOD_ID, "ahsdfz_item_group_1"));
    public static final ItemGroup ItemGroup1 = FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.ahsdfz-construction-mod.BuildingBlocks"))
            .icon(() -> new ItemStack(ModItems.TestificantItem))
            .build();

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY_2 = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(AHSDFZConstructionMod.MOD_ID, "ahsdfz_item_group_2"));
    public static final ItemGroup ItemGroup2 = FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.ahsdfz-construction-mod.Items"))
            .icon(() -> new ItemStack(ModItems.NormalItem))
            .build();

//    public static final TestGroup = FabricItemGroup.builder()
//    new Identifier(AHSDFZConstructionMod.MOD_ID, "test_itemgroup"

    public static void registerModItemGroup() {
        AHSDFZConstructionMod.LOGGER.debug("Registering mod item group for" + AHSDFZConstructionMod.MOD_ID);
    }
}

