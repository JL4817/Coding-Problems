import java.util.Scanner;

public class ID_1607A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());

        while (t-- > 0) {
            String keyboard = input.nextLine();
            String word = input.nextLine();

            int[] positions = new int[26];
            for (int i = 0; i < 26; i++) {
                char letter = keyboard.charAt(i);
                positions[letter - 'a'] = i;
            }

            int total = 0;
            for (int i = 1; i < word.length(); i++) {
                char currentLetter = word.charAt(i);
                char previousLetter = word.charAt(i - 1);

                int currentPosition = positions[currentLetter - 'a'];
                int previousPosition = positions[previousLetter - 'a'];

                total += Math.abs(currentPosition - previousPosition);
            }

            System.out.println(total);
        }

        input.close();
    }
}
/*
 * 
 * The corrected solution:
 * 
 * Reads the keyboard as a single string without splitting
 * Creates a mapping array where positions[letter - 'a'] gives the position of
 * each letter on the keyboard
 * Starts from the second letter of the word (index 1) since no time is spent
 * placing your hand on the first letter
 * For each letter, calculates the distance from the previous letter using the
 * position mapping
 * Adds up these distances to get the total time
 * 
 * This solution correctly handles all the test cases according to the problem
 * description. For example, with "hello" on the standard alphabet keyboard, it
 * will calculate |5-8| + |12-5| + |12-12| + |15-12| = 13 as shown in the
 * example.
 */