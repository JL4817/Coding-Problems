import java.util.HashMap;
import java.util.Scanner;

public class ID_23A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String arr[] = input.nextLine().split("");
        int distance = 0;

        // a b c d a ans: 5
        ////
        for (int i = 0; i < arr.length - 1; i++) {

            String currentValue = arr[i];

            distance++;

            if (currentValue.equals(arr[i + 1])) {
                distance++;
            }

        }

    }
}
