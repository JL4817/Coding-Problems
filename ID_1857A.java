import java.util.Scanner;

public class ID_1857A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt();

        for (int i = 0; i < numTests; i++) {
            int nElements = input.nextInt();
            int totalSum = 0;

            // Read array elements and calculate total sum
            int[] arr = new int[nElements];
            for (int j = 0; j < nElements; j++) {
                arr[j] = input.nextInt();
                totalSum += arr[j];
            }

            // Check if it's possible to color the array
            if (nElements < 2) {
                System.out.println("NO");
            } else {
                boolean possible = false;
                for (int k = 0; k < arr.length; k++) {
                    // go through each array
                    int sum1 = arr[k];
                    int sum2 = totalSum - arr[k];

                    // If both sums have same parity
                    if (sum1 % 2 == sum2 % 2) {
                        possible = true;
                        break;
                    }
                }
                System.out.println(possible ? "YES" : "NO");
            }
        }
        input.close();
    }
}