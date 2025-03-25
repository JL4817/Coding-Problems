import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ID_141A {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        // String s1 = "SANTACLAUS";
        String s2 = input.nextLine();
        // String s2 = "DEDMOROZ";
        String combinedName = s1 + s2;
        String pile = input.nextLine();
        // String pile = "SANTAMOROZDEDCLAUS";

        // Count character frequencies for combined names
        HashMap<Character, Integer> nameCounts = new HashMap<>();
        for (char c : combinedName.toCharArray()) {
            nameCounts.put(c, nameCounts.getOrDefault(c, 0) + 1);
        }

        // Count freq. for pile
        HashMap<Character, Integer> pileCounts = new HashMap<>();
        for (char c : pile.toCharArray()) {
            pileCounts.put(c, pileCounts.getOrDefault(c, 0) + 1);
        }

        if (nameCounts.equals(pileCounts)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();

    }
}
