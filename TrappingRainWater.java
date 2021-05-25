import java.util.LinkedList;
import java.util.Stack;

public class TrappingRainWater {
    public int trap_pointer(int[] height) {
        int rain = 0;
        int left = 0;
        int right = height.length - 1;
        int left_h = 0;
        int right_h = 0;
        while (left < right) {
            left_h = Math.max(left_h, height[left]);
            right_h = Math.max(right_h, height[right]);

            if (height[left] < height[right]) {
                rain += left_h - height[left];
                left++;
            } else {
                rain += right_h - height[right];
                right--;
            }
        }
        return rain;
    }

    public int trap_stack(int[] height) {
        int rain = 0;
        Stack<Integer> stack = new Stack<>();
        int n = height.length;

        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                int currWidth = i - left - 1;
                int currHeight = Math.min(height[left], height[i]) - height[top];
                rain += currWidth * currHeight;
            }
            stack.push(i);
        }

        return rain;
    }
}
