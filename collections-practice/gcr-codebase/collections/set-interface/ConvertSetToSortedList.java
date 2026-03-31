import java.util.*;
public class ConvertSetToSortedList
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set =  new HashSet<>();


        System.out.println("enter number of elements in the set:");
        int n = sc.nextInt();

        System.out.println("enter elements of the set:");
        for(int i = 0; i < n; i++){

            set.add(sc.nextInt());
        }
      
        List<Integer> list = new ArrayList<>(set);
  

        
        Collections.sort(list);
        System.out.println("sorted List: " + list);

    }
    
}