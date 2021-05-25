import java.util.*;

public class ThreeSum {
    // hash is slower
    public List<List<Integer>> threeSum_hash(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                Integer temp = -nums[i] - nums[j];
                if (set.contains(temp)) {
                    out.add(Arrays.asList(nums[i], temp, nums[j]));
                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                        ++j;
                    }
                } else {
                    set.add(nums[j]);
                }
            }
            set.clear();
        }

        return out;
    }

    public List<List<Integer>> threeSum_pointer(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    out.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    while (left < right && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return out;
    }
}
