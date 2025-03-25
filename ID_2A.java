import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.RowFilter.Entry;

public class ID_2A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCase = in.nextInt();
        in.nextLine();

        String nameArr[] = new String[numCase];
        int scoreArr[] = new int[numCase];

        HashMap<String, Integer> hash = new HashMap<>(); // key = name, data = score

        // have a second hashmap that does the same but adds 1 by 1 step, check if its
        // equal to the maximum
        // if yes, then that name is the winne,r the key

        for (int i = 0; i < numCase; i++) {

            String line[] = in.nextLine().split(" ");
            // String name = line[0];
            // int score = Integer.parseInt(line[1]);

            nameArr[i] = line[0];
            scoreArr[i] = Integer.parseInt(line[1]);

            // Update total points for the player
            if (hash.containsKey(nameArr[i])) {
                hash.put(nameArr[i], hash.get(nameArr[i]) + scoreArr[i]);
            } else {
                hash.put(nameArr[i], scoreArr[i]);
            }

        }

        // int maximumV = Collections.max(hash.values()); this does not get updated when
        // value is added everytime

        String ans = "";
        int max = Integer.MIN_VALUE;

        for (java.util.Map.Entry<String, Integer> e : hash.entrySet()) {
            max = Math.max(e.getValue(), max); // calculating maximum from all the map
            // between 2 values
        }

        // HashSet<String> set = new HashSet<>();
        HashSet<String> set = new LinkedHashSet<>();

        for (java.util.Map.Entry<String, Integer> e : hash.entrySet()) {
            if (e.getValue() == max) {
                set.add(e.getKey()); // everytime there is a max, the key is added to the set
                                     // therefore can keep track of which one was added first as max scored
            }
        }

        HashMap<String, Integer> hash2 = new HashMap<>(); // going through the hash map again with the values

        for (int i = 0; i < numCase; i++) {

            if (set.contains(nameArr[i]) == false) {
                continue;
            }

            if (hash2.containsKey(nameArr[i])) {
                hash2.put(nameArr[i], hash2.get(nameArr[i]) + scoreArr[i]);
            } else {
                hash2.put(nameArr[i], scoreArr[i]);
            }

            // the max is found for the first time
            if (hash2.get(nameArr[i]) >= max) {
                ans = nameArr[i];
                break;
            }

        }
        System.out.println(ans);

    }
}
