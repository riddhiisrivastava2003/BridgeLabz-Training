import java.util.*;
public class FindingSubsets {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("enter size of set 1: ");
        int s1= sc.nextInt();

        System.out.println("enter elements of set 1: ");
        for(int i = 0; i<s1; i++){
            set1.add(sc.nextInt());
        }


        System.out.println("enter size of set 2: ");
        int s2 = sc.nextInt();


        System.out.println("enter element of set 2: ");
        for(int i = 0 ; i<s2; i++){
            set2.add(sc.nextInt());

        }

    
        System.out.println("subsets of set1 in set2:");

        if(set2.containsAll(set1)){
            System.out.println("set1 is a subset of set2");
        }
        else{
            System.out.println("set1 is not a subset of set2");
        }

        
    }
    
}