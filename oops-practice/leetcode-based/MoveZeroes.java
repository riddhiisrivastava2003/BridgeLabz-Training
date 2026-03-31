
import java.util.Arrays;
public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes obj = new MoveZeroes();
        int[] nums = {0, 1, 0, 4, 12, 0, 0, 3, 12};
        obj.moveZeroes(nums);
        System.out.println("After moving zeroes: " + Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[p];
                nums[p] = nums[i];
                nums[i] = temp;
                p++;
            }
        }
    }
}