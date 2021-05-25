import java.util.*;

public class ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target) {
        int out = 0;
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
}
