import java.util.*;

public class PairWithGivenSumQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter array size: ");


        int n = sc.nextInt();
        int[] arr =new int[n];
      
        System.out.println("enter elements: ");

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("enter the target sum: ");
        int target = sc.nextInt();


        findingPairsWithGivenSum(arr,target);

    }

    public static void findingPairsWithGivenSum(int[] arr,int target){

        HashSet<Integer> set = new HashSet<>();

        System.out.println("\n pairs with sum " + target + " are: ");

        for(int num: arr){
            int comp = target - num;

            if(set.contains(comp)){
                System.out.println("[" + comp + ", " + num + "]");
            }
            set.add(num);
        }
    }
    
}
