public class Demo1 {
    public static String dashInsert(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char nextChar = (i < str.length() - 1) ? str.charAt(i + 1) : '\0';

            result.append(currentChar);

            if (isOdd(currentChar) && isOdd(nextChar)) {
                result.append('-');
            } else if (isEven(currentChar) && isEven(nextChar)) {
                result.append('*');
            }
        }

        return result.toString();
    }

    public static boolean isOdd(char c) {
        return c != '0' && (c - '0') % 2 != 0;
    }

    public static boolean isEven(char c) {
        return c != '0' && (c - '0') % 2 == 0;
    }

    public static void main(String[] args) {
        String input = "454679363";
        String output = dashInsert(input);
        System.out.println(output); // Output: 454*67-9-3
    }
}
