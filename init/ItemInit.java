package guardian.test_mod.init;


import guardian.test_mod.objects.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();


    //test materials nothing final
    public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
    public static final Item INGOT_BRASS = new ItemBase("ingot_brass");

    private static void registerRender(Item item){

    }
}
