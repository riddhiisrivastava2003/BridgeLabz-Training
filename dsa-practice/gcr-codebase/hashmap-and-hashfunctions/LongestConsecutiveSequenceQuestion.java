import java.util.*;

public class LongestConsecutiveSequenceQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
      
        System.out.println("enter array elements: ");
        for (int i=0;i<n;i++) {

            arr[i]= sc.nextInt();

        }
        int result = longest(arr);

        System.out.println("length of longest consecutive sequence: " + result);
        
    }

    public static int longest(int[] arr){
        if(arr.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num: arr){


            set.add(num);
        }

        int longestStreak = 0;

        for(int num : arr){
            if(!set.contains(num - 1)){

                int current = num;

                int currentStreak = 1;

                while(set.contains(current+1)){
                    current += 1;

                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak,currentStreak);
            }
        }

        return longestStreak;

    }
    
}
