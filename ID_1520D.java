import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ID_1520D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int n = 0; n < nTest; n++) {
            int numElements = input.nextInt();
            input.nextLine();
            int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            HashMap<Integer, Long> freqMap = new HashMap<>();
            long count = 0;

            for (int i = 0; i < numElements; i++) {
                int key = arr[i] - i;

                // instead of adding 2 and 1 separately, you're adding all the previous
                // occurrences of key = 1 at once
                if (freqMap.containsKey(key)) {
                    count += freqMap.get(key);
                }

                freqMap.put(key, freqMap.getOrDefault(key, 0L) + 1);
                // keeping track of how many same there are, adding +1 where there is 0 by
                // default (first time adding)
            }
            System.out.println(count);
        }
        input.close();
    }
}
/*
 * i < j, i comes before j
 * (i,j), such that i<j and aj - ai = j-i
 * aj - j = ai - i
 * therefore the two has to be same => then just count how mnay a[i]-i is in the
 * array
 * use hashmap, and go through, if the value has been seen before, count;
 *
 */
