import java.util.*;
public class ZeroSumSubarraysQuestion{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    
        System.out.println("enter size of array: ");

        int n = sc.nextInt();
        int[] arr =new int[n];


        System.out.println("enter array elements : ");
        for(int i = 0; i< n; i++){

            arr[i] = sc.nextInt();

        }

        findingZeroSumSubarray(arr);
    }


    public static void findingZeroSumSubarray(int[] arr){


        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        map.put(0, new ArrayList<>( Arrays.asList(-1)));


        System.out.println("zero sum subarrays: ");

        for(int i = 0; i< arr.length; i++){

            sum += arr[i];

            if (map.containsKey(sum)) {

                List<Integer> list = map.get(sum);

                for (int startIndex  : list) {
 
                    printSubarray(arr, startIndex + 1, i);
                }
            }
            map.putIfAbsent( sum , new ArrayList<>());
            map.get(sum).add(i);




        }


    }

    public static void printSubarray(int[] arr, int start, int end){
        System.out.print("[ ");

        for(int i  = start; i<= end; i++){

            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }

}