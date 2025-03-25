import java.util.Scanner;

public class ID_1426A {
    public static void main(String args[]) {

        // Test Case: n = 7, x = 3
        // Apartment n = 7, x = 3.
        // First floor has apartments 1 and 2.
        // Remaining apartments: n - 2 = 5.
        // Floors beyond the first floor:
        // (5 + 3 - 1) / 3 = 7 / 3 = 2.
        // Total floor = 1 (first floor) + 2 = 3.

        // Test Case: n = 1, x = 5
        // Apartment n = 1 is on the first floor, so the output is 1.

        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for (int i = 0; i < testCase; i++) {
            int n = input.nextInt();
            int x = input.nextInt();

            if (n <= 2) {
                System.out.println(1);
            } else {
                int floor = 1 + (n - 2 + x - 1) / x;
                System.out.println(floor);
            }
        }
        input.close();
    }
}
