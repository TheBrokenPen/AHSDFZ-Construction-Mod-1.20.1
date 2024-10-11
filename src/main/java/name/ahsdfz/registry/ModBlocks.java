package name.ahsdfz.registry;

import name.ahsdfz.AHSDFZConstructionMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //Registered Blocks
    public static final Block TestificantBlock = registerBlock(
            "testificant_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS))
    );
    public static final Block NormalBlock = registerBlock(
            "normal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE))
    );

    public static final Block BrickBlock = registerBlock(
            "brick_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS))
    );

    public static final Block DarkBrickBlock = registerBlock(
            "dark_brick_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS))
    );


    //Powerpipe Blocks
    public static final Block PowerpipeClassBearing = registerBlock(
            "powerpipe_class_bearing",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))
    );

    public static final Block PowerpipeClassCorner = registerBlock(
            "powerpipe_class_corner",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))
    );

    public static final Block PowerpipeClassJunction = registerBlock(
            "powerpipe_class_junction",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))
    );

    public static final Block PowerpipeClassTriphase = registerBlock(
            "powerpipe_class_triphase",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))
    );

    public static final Block PowerpipeClassVertical = registerBlock(
            "powerpipe_class_vertical",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))
    );

    public static final Block PowerpipeClassVerticalJunction = registerBlock(
            "powerpipe_class_vertical_junction",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))
    );


    //Register Blocks
    public static Block registerBlock(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AHSDFZConstructionMod.MOD_ID, name), block);
    }

    //Register Block Items
    private static Item registerBlockItems(String name, Block block) {
        return Registry.register(Registries.ITEM,new Identifier(AHSDFZConstructionMod.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
    }

    //Register Blocks
    public static void registerModBlocks() {

    }
}
