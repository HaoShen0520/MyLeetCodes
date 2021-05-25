import java.util.Arrays;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        Integer[] converted_nums = new Integer[n];

        for (int i = 0; i < n; i++) {
            converted_nums[i] = nums[i];
        }

        Arrays.sort(converted_nums, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) {
                sx *= 10;
            }
            while (sy <= y) {
                sy *= 10;
            }
            return (int) (-sy * x - y + sx * y + x);
        });

        if (converted_nums[0] == 0) {
            return "0";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int num : converted_nums) {
            stringBuilder.append(num);
        }

        return stringBuilder.toString();
    }
}