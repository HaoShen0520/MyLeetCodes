public class ThousandSeperator {
    public String thousandSeparator(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder input = new StringBuilder(String.valueOf(n));
        input.reverse();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            count++;
            if (count == 4) {
                count = 1;
                stringBuilder.append('.');
                stringBuilder.append(input.charAt(i));
            } else {
                stringBuilder.append(input.charAt(i));
            }
        }

        return stringBuilder.reverse().toString();
    }
}
