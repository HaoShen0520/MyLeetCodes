public class Fib {
    public int fib(int n) {
        int[] F = new int[n + 1];
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        F[0] = 0;
        F[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }

        return F[n];
    }
}
