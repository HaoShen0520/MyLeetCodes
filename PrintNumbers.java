public class PrintNumbers {
    public int[] printNumbers(int n) {
        int max = (int) Math.pow(10, n);
        int[] output = new int[max - 1];

        for (int i = 1; i < max ; i++) {
            output[i - 1] = i;
        }

        return output;
    }
}
