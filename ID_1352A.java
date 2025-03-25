import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ID_1352A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nrOfTestCase = input.nextInt();

        for (int p = 0; p < nrOfTestCase; p++) {

            int inputNum = input.nextInt();
            List<Integer> roundNumbers = new ArrayList<>(); // List to store round numbers
            int factor = 1; // To represent the place value (1, 10, 100, ...)

            while (inputNum > 0) {
                int digit = inputNum % 10; // Get the last digit
                if (digit != 0) {
                    roundNumbers.add(digit * factor); // Create round number and added to list
                }
                inputNum /= 10; // Remove the last digit
                factor *= 10; // Move to the next place value
            }

            // Output the results
            System.out.println(roundNumbers.size()); // Number of round numbers
            for (int i = roundNumbers.size() - 1; i >= 0; i--) { // Printed in reverse order
                System.out.print(roundNumbers.get(i));
                if (i > 0) {
                    System.out.print(" "); // Print space between numbers
                }
            }
            System.out.println(); // New line after each test case

        }

        input.close();

        // https://chatgpt.com/c/67276680-289c-8012-8a89-1492ebf73f34

    }

}
