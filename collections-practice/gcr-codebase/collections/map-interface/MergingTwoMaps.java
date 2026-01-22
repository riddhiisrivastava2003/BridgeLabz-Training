import java.util.*;
public class MergingTwoMaps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Map<String,Integer> map1 =new HashMap<>();
        Map<String,Integer> map2 =new HashMap<>() ;

        System.out.print("enter number of entries for map 1: ");
        int n1 = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n1; i++) {
            System.out.print("enter key for map 1 : ");
            String key = sc.nextLine();


            System.out.print("enter value for map 1 : ");
            int value = sc.nextInt();
            sc.nextLine(); 
            map1.put(key, value);
        }


        System.out.print("enter number of entries for map 2 : ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n2; i++) {
            System.out.print("enter key for map 2 : ");
            String key = sc.nextLine();


            System.out.print("enter value for map 2 : ");
            int value = sc.nextInt();
            sc.nextLine(); 

            map2.put(key, value);
        }

 
        Map<String, Integer> mergedMap =new HashMap<>(map1) ;
        for (Map.Entry<String,Integer> entry:map2.entrySet()) {
            mergedMap.put(entry.getKey(),mergedMap.getOrDefault(entry.getKey(),0) + entry.getValue());
        }

        System.out.println("merged map: "+mergedMap);
    }
    
}