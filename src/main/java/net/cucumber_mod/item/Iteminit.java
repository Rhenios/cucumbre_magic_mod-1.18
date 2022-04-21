package net.cucumber_mod.item;

import net.cucumber_mod.main;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Iteminit {



    private static Item registerItem(String name , Item item ){
        return Registry.register(Registry.ITEM,new Identifier(main.MODID, name), item);
    }
    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + main.MODID);
    }

}
