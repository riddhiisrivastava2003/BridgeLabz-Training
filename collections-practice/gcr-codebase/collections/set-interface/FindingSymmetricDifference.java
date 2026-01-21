import java.util.*;
public class FindingSymmetricDifference{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
   


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("enter number of elements in first set:");
        int n1=sc.nextInt() ;
        System.out.println("enter elements of first set:"); 

        for(int i=0;i<n1;i++){
            set1.add(sc.nextInt());
        }


        System.out.println("enter number of elements in second set:");
        int n2 = sc.nextInt();
        System.out.println("enter elements of second set:");
        for(int i=0; i<n2;i++){

            set2.add(sc.nextInt());
        }
      
        Set<Integer> symDiffSet = new HashSet<>(set1);
        symDiffSet.addAll(set2);


        
        Set<Integer> tempSet = new HashSet<>(set1) ;

        tempSet.retainAll(set2);
        
        symDiffSet.removeAll(tempSet);
        
        System.out.println("symmetric difference of the two sets: " + symDiffSet);
    }
    
}