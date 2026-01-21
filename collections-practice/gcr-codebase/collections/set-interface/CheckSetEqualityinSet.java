import java.util.*;
public class CheckSetEqualityinSet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of elements in first set:");
        int n1 = sc.nextInt() ;


        Set<Integer> set1 = new HashSet<>();
        System.out.println("enter elements of first set:");
        for(int i = 0; i < n1; i++){
            set1.add(sc.nextInt());
        }
    
        System.out.println("enter number of elements in second set:");
        int n2 = sc.nextInt();

        Set<Integer> set2 = new HashSet<>();
        System.out.println("enter elements of second set :");
        for(int i = 0; i < n2; i++){
            set2.add(sc.nextInt());
        }
       
        if(set1.equals(set2)) {
            System.out.println("the two sets are equal");
        } else {
            System.out.println("the two sets are not equal");
        }
    }

}