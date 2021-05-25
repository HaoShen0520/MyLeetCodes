public class ReverseInteger {
    public int reverse(int x) {
        String s = String.valueOf(x);
        long temp = 0;
        StringBuilder stringbuilder = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        boolean sign_flag = false;

        for (int i = stringbuilder.length() - 1; i >= 0; i--) {
            if (stringbuilder.charAt(i) == '-') {
                sign_flag = true;
            }
        }

        if (sign_flag) {
            result.append('-');
        }

        for (int i = stringbuilder.length() - 1; i >= 0; i--) {
            if (stringbuilder.charAt(i) == '-') {
                continue;
            }
            result.append(stringbuilder.charAt(i));
        }

        if (!sign_flag) {
            while (result.charAt(0) == '0' && result.length() > 1) {
                result.deleteCharAt(0);
            }
        } else {
            while (result.charAt(1) == '0') {
                result.deleteCharAt(1);
            }
        }


        temp = Long.parseLong(String.valueOf(result));
        if (temp < Math.pow(-2, 31) || temp > Math.pow(2, 31) - 1) {
            return 0;
        } else {
            return Integer.parseInt(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        ReverseInteger re = new ReverseInteger();
        System.out.println(re.reverse(123));
    }
}
