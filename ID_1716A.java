import java.util.Scanner;

public class ID_1716A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        int[] results = new int[t]; // To store results for each test case

        for (int i = 0; i < t; i++) {
            int n = Math.abs(scanner.nextInt()); // Read the target position (absolute value)

            // Calculate the minimum moves
            if (n % 5 == 0) {
                results[i] = n / 5; // If divisible by 5, we can directly reach
            } else {
                results[i] = (n / 5) + 1; // Otherwise, add one extra step
            }
        }

        // Output results
        for (int res : results) {
            System.out.println(res);
        }

        scanner.close();
    }
}
