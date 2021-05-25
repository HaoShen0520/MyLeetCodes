import java.util.Arrays;

public class MinInRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}
