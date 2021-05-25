public class MaxArea {
    public int maxArea(int[] height) {
        int L = 0;
        int R = height.length - 1;
        int ans = 0;
        int curArea, width;

        while (L <= R) {
            width = R - L;
            curArea = width * Math.min(height[L], height[R]);
            ans = Math.max(ans, curArea);

            if (height[L] <= height[R]) {
                L++;
            } else {
                R--;
            }
        }

        return ans;
    }
}
