import java.util.*;

public class TwoSumQuestion {


    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length; i++){

            int comp = target-nums[i];

            if(map.containsKey(comp)){

                return new int[] {map.get(comp), i};
            }

            map.put(nums[i],i);
        }

        return new int[] {-1,-1 }; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");

        int n=sc.nextInt();
        int[] arr=new int[n];


        System.out.println("enter array elements: ");
        for (int i=0;i<n;i++) {

            arr[i]=sc.nextInt();

        }
        System.out.println("enter the target sum: ");

        int targetSum =sc.nextInt();

        int[] result =twoSum(arr,targetSum);

        if(result[0]!=-1){

            System.out.println("indices of the two numbers adding up to " + targetSum + " are: " + result[0] + " and " + result[1]);
        } else {

            System.out.println("no two numbers add up to the target sum") ;
        }
    }
    
}
