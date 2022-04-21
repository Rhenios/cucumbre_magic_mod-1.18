package net.cucumber_mod.block;

import net.cucumber_mod.main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blockinit {






    //normal Block register
    public static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name,block,group);
        return Registry.register(Registry.BLOCK,new Identifier("kappa_mod", name),block);
    }
    public static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM,new Identifier(main.MODID, name),new BlockItem(block,new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        System.out.println("Registering Mod Block for " + main.MODID);
    }
}
