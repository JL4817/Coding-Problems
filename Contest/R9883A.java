package Contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class R9883A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nrTest = input.nextInt();

        input.nextLine();

        for (int i = 0; i < nrTest; i++) {
            int sizeOfArr = input.nextInt();

            input.nextLine();

            int count = 0;

            int[] numbers = new int[sizeOfArr];

            for (int j = 0; j < sizeOfArr; j++) {
                numbers[j] = input.nextInt(); // Read array elements
            }

            // int[] numbers = { 1, 2, 3, 1, 2, 3 };

            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : numbers) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            int totalPair = 0;
            for (int freq : frequencyMap.values()) {

                totalPair += freq * (freq - 1) / 2;

            }

            System.out.println(totalPair);

        }

        input.close();

    }

}
