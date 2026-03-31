import java.util.*;


public class InvertedMap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> originalMap = new HashMap<>();


        System.out.print("enter number of entries : ");

        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("enter key : ");
            String key = sc.nextLine();

            System.out.print("enter value : ") ;
            int value = sc.nextInt();
            sc.nextLine();

            originalMap.put(key, value);
        }

        Map<Integer, String> invertedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()){

            invertedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("inverted map: "+invertedMap);
    }}