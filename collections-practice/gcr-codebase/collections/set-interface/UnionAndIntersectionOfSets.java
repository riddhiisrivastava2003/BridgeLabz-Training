import java.util.*;
public class UnionAndIntersectionOfSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("enter number of elements in first set:");
        int n1 = sc.nextInt() ;

        System.out.println("enter elements of first set :"); 

        for(int i = 0; i < n1; i++){
            set1.add(sc.nextInt());
        }
        System.out.println("enter number of elements in second set :");
        int n2 = sc.nextInt();
        System.out.println("enter elements of second set :");
        for(int i = 0; i < n2; i++){
            set2.add(sc.nextInt());
        }

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("union of the two sets : " + unionSet);

        Set<Integer> intersectionSet = new HashSet<>(set1); 
        intersectionSet.retainAll(set2);

        
        System.out.println("intersection of the two sets: " + intersectionSet);
        
    }
    
}