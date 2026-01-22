import java.util.*;
public class MaxValueFinderUsingMap {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>() ;

        System.out.print("enter number of entries: ") ;
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("enter key: ");
            String key = sc.nextLine();

            System.out.print("enter value: ");
            int value = sc.nextInt();
            sc.nextLine(); 

            map.put(key, value);
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue()>maxValue) {
                maxValue=entry.getValue();
                maxKey=entry.getKey();
            }
        }

        System.out.println("key with maximum value: " + maxKey) ;
    }
}