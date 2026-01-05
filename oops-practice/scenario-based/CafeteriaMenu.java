import java.util.*;

public class CafeteriaMenu{

    public static void  displayMenu(String[] menuItems){
        System.out.println("welcome to the cafeteria");
        for(int i=0;i<menuItems.length;i++){
            System.out.println((i+1) +" : "+menuItems[i]);
        }

    }


    public static String getItemByIndex(String[] menuItems,int index){
        if(index>=0 && index<menuItems.length){
            return menuItems[index];
        }else{
            return "invalid index"; 
        }
    }

    public static void main(String[] args){
        String[] menuItems={"veg sandwich",
                            "pasta",
                            "manchurian rice",
                            "noodles",
                            "omlet",
                            "pizza",
                            "burger",
                            "momos",
                            "veg roll",
                            "chicken roll"
        };

        Scanner sc=new Scanner(System.in);
        displayMenu(menuItems);
        
        System.out.println("enter item index");
        int choice=sc.nextInt();

        String selected=getItemByIndex(menuItems,choice);
        System.out.println("your order is "+selected);
    }
}