import java.util.Arrays;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int index = binarySearch(nums, target, 0, nums.length - 1);

        if (index != -1) {
            return index;
        }

        int[] temp = Arrays.copyOf(nums, nums.length + 1);

        temp[temp.length - 1] = target;

        for (int i = temp.length - 1; i >= 1; i--) {
            if (temp[i] < temp[i - 1]) {
                int swap = temp[i];
                temp[i] = temp[i - 1];
                temp[i - 1] = swap;
            } else {
                return i;
            }
        }
        return 0;
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right);
            } else {
                return binarySearch(nums, target, left, mid - 1);
            }
        } else {
            return -1;
        }
    }
}
