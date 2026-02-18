import java.util.*;

class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        if(nums.length<4)
        {
            return new ArrayList<>();
        }    



        Arrays.sort(nums);
        Set<List<Integer>> arr=new HashSet<>();

        for(int i=0;i<nums.length-3;i++)
        {
            for(int j = i + 1; j < nums.length - 2; j++)
            {
                int start = j + 1;
                int end = nums.length - 1;

                while(start < end)
                {
                    long sum = (long)nums[i] + nums[j] + nums[start] + nums[end];

                    if(sum == target)
                    {
                        arr.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;
                    }
                    else if(sum > target)
                    {
                        end--;
                    }
                    else
                    {
                        start++;
                    }
                }
            }
        }
        
        return new ArrayList<>(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        FourSum fs = new FourSum();
        List<List<Integer>> result = fs.fourSum(nums, target);

        System.out.println("Quadruplets with sum " + target + ":");
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}