import java.util.Scanner;

public class ID_1335B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();

            String result = constructString(n, a, b);
            System.out.println(result);
        }

        input.close();
    }

    public static String constructString(int n, int a, int b) {
        // If b is greater than the substring length, it's impossible
        if (b > a) {
            return "";
        }

        // Create the string using a cycling pattern of b distinct letters
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            result[i] = (char)('a' + (i % b));
        }
        return new String(result);
    }
}