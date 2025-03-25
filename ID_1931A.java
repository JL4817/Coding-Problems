import java.util.Scanner;

public class ID_1931A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int sum = scanner.nextInt();
            String result = findSmallestWord(sum);
            System.out.println(result);
        }
        scanner.close();
    }

    private static String findSmallestWord(int sum) {
        for (int i = 1; i <= 26; i++) {
            for (int j = 1; j <= 26; j++) {
                for (int k = 1; k <= 26; k++) {
                    if (i + j + k == sum) {
                        char first = (char) ('a' + i - 1); // 1 == a 2== b usw
                        char second = (char) ('a' + j - 1);
                        char third = (char) ('a' + k - 1);
                        return "" + first + second + third;
                    }
                }
            }
        }
        return "";
    }
}