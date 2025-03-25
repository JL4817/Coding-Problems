import java.util.Scanner;

public class ID_1328A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int howMany = input.nextInt();

        input.nextLine();
        int arr[] = new int[howMany];

        for (int i = 0; i < howMany; i++) {

            int count = 0;

            int a = input.nextInt();
            int b = input.nextInt();

            /*
             * while (a % b != 0) { // think about when the loop has to stop, it has to stop
             * when its 0.
             * a++; // Increase a to make it divisible by b
             * count++;
             * }
             * 
             * arr[i] = count; // Store the count for this test case
             * 
             */

            int movesNeeded = (b - (a % b)) % b;
            arr[i] = movesNeeded;

        }

        for (int j = 0; j < howMany; j++) {
            System.out.println(arr[j]);
        }
    }

}
