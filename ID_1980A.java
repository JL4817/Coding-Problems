import java.util.Scanner;

public class ID_1980A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();

            String a = scanner.nextLine();

            int[] count = new int[7]; // to count occurrences of 'A' to 'G'

            for (char c : a.toCharArray()) {
                if (c >= 'A' && c <= 'G') {
                    count[c - 'A']++;
                }
            }

            int additionalProblemsNeeded = 0;

            for (int i = 0; i < 7; i++) {
                if (count[i] < m) {
                    additionalProblemsNeeded += m - count[i];
                }
            }

            System.out.println(additionalProblemsNeeded);
        }

        scanner.close();
    }
}
