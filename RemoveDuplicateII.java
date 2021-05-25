public class RemoveDuplicateII {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (count < 2) {
                    count++;
                    nums[index] = nums[i];
                    index++;
                } else {
                    count++;
                    continue;
                }
            }
            if (nums[i] != nums[i - 1]) {
                count = 1;
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
