public class UglyNumberII {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;

        int pointer_one = 0;
        int pointer_two = 0;
        int pointer_three = 0;

        for (int i = 1; i < n; i++) {
            int pointer_one_val = ugly[pointer_one] * 2;
            int pointer_two_val = ugly[pointer_two] * 3;
            int pointer_three_val = ugly[pointer_three] * 5;

            ugly[i] = Math.min(Math.min(pointer_one_val, pointer_two_val), pointer_three_val);

            if (ugly[i] == pointer_one_val) {
                pointer_one++;
            }
            if (ugly[i] == pointer_two_val) {
                pointer_two++;
            }
            if (ugly[i] == pointer_three_val) {
                pointer_three++;
            }
        }

        return ugly[n - 1];
    }
}
