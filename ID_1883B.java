import java.util.HashMap;
import java.util.Scanner;

public class ID_1883B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTestCase = input.nextInt();

        while (nTestCase-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            input.nextLine();
            String line = input.nextLine();

            HashMap<Character, Integer> freqMap = new HashMap<>();
            for (char c : line.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            int oddCount = 0;
            for (int count : freqMap.values()) {
                if (count % 2 != 0) {
                    oddCount++;
                }
            }

            if (oddCount <= k + 1) { // + 1 because in palindrom 1 character can be in the middle
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        input.close();
    }
}
/*
 * Here's why this works:
 * 
 * If we have k removals, we can handle up to k+1 characters with odd
 * frequencies
 * We don't need to check if (k - oddCount) % 2 == 0 because:
 * 
 * Extra removals can always be used in pairs to remove matching characters
 * We don't necessarily need to use all k removals
 */