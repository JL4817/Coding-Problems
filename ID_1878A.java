import java.util.Scanner;

public class ID_1878A {
    public static void main(String args[]) {
        // Initialize Scanner to read input
        Scanner input = new Scanner(System.in);

        // First line contains number of test cases
        // Example: if input is "2", we'll process 2 test cases
        int numTest = input.nextInt();

        // StringBuilder for efficient output handling
        // Instead of printing each result immediately, we collect all results
        // and print them at once at the end
        StringBuilder output = new StringBuilder();

        // Process each test case one by one
        // If numTest = 2, this loop runs twice
        for (int i = 0; i < numTest; i++) {
            // For each test case, first read:
            // 1. numElements: size of the array
            // 2. target: the number k we're looking for
            // Example: if input is "5 4", then numElements = 5, target = 4
            int numElements = input.nextInt();
            int target = input.nextInt();

            // found will be true if we find target (k) anywhere in the array
            boolean found = false;

            // Read each number in the array and check if it equals target
            // Example: if array is [1, 4, 3, 4, 1], we check each number
            for (int j = 0; j < numElements; j++) {
                int num = input.nextInt();
                // If we find target anywhere, set found to true
                // Example: when num is 4, and target is 4, found becomes true
                if (num == target) {
                    found = true;
                }
            }

            // If we found target, append "YES" to output
            // If we didn't find target, append "NO" to output
            // The \n adds a newline after each result
            output.append(found ? "YES\n" : "NO\n");
        }

        // After processing all test cases, print all results at once
        System.out.print(output);

        // Close the Scanner
        input.close();
    }
}