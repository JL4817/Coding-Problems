import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ID_1512A {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int nrCase = input.nextInt();

        for (int i = 0; i < nrCase; i++) {

            int length = input.nextInt();

            HashMap<Integer, Integer> frequHashMap = new HashMap<>();
            int[] numbers = new int[length];

            for (int j = 0; j < length; j++) {

                numbers[j] = input.nextInt();
                frequHashMap.put(numbers[j], frequHashMap.getOrDefault(numbers[j], 0) + 1);

            }

            // store number from array that only appears once
            int oddElement = -1;
            for (int num : frequHashMap.keySet()) {
                if (frequHashMap.get(num) == 1) {
                    oddElement = num;
                }
            }

            for (int m = 0; m < length; m++) {
                if (numbers[m] == oddElement) {
                    System.out.println(m + 1);
                }

            }

        }

        input.close();

    }

}
