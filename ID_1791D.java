import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ID_1791D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            input.nextLine();
            String s = input.nextLine();
            HashMap<Character, Integer> totalFreq = new HashMap<>();
            for (char c : s.toCharArray()) {
                totalFreq.put(c, totalFreq.getOrDefault(c, 0) + 1);
            }

            // Set to keep track of distinct characters in left part
            HashSet<Character> leftDistinct = new HashSet<>();
            // HashMap to track remaining characters in right part
            HashMap<Character, Integer> rightFreq = new HashMap<>(totalFreq);

            int maxDistinct = 0;
            // Try each possible split position
            for (int i = 0; i < n - 1; i++) {
                char currentChar = s.charAt(i);
                // Add current character to left part
                leftDistinct.add(currentChar);
                // Reduce frequency in right part
                rightFreq.put(currentChar, rightFreq.get(currentChar) - 1);
                // If frequency becomes 0, remove from right part's distinct count
                if (rightFreq.get(currentChar) == 0) {
                    rightFreq.remove(currentChar);
                }
                int distinct = leftDistinct.size() + rightFreq.size();
                maxDistinct = Math.max(maxDistinct, distinct);
            }
            System.out.println(maxDistinct);
        }
        input.close();
    }
}