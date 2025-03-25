import java.util.Arrays;
import java.util.Scanner;

public class ID_1296A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int n = 0; n < nTest; n++) {
            int numElements = input.nextInt();
            int total = 0;
            int evenCount = 0;
            int oddCount = 0;

            for (int i = 0; i < numElements; i++) {
                int element = input.nextInt();
                if (element % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                total += element;
            }

            // If total is odd, we already have what we want
            if (total % 2 == 1) {
                System.out.println("YES");
            }
            // If we have both odd and even numbers, we can make sum odd
            else if (oddCount > 0 && evenCount > 0) {
                System.out.println("YES");
            }
            // If we only have odd numbers and their count is even, sum will always be even
            else if (oddCount > 0 && evenCount == 0 && oddCount % 2 == 0) {
                System.out.println("NO");
            }
            // If we only have even numbers, sum will always be even
            else {
                System.out.println("NO");
            }

        }
        input.close();
    }
}