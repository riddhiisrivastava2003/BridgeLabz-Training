import java.util.*;

public class WareHouse{

    public static void displayAll(List<? extends WareHouseItem> items){
        if(items.isEmpty()){
            System.out.println("no items in warehouse");
            return;
        }

        System.out.println("warehouse item");
        for(WareHouseItem item: items){
            System.out.println(item.getName()+" ( "+item.getItemType()+" )");
        }
    
        }
    }
