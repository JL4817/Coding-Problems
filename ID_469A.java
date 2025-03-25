import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ID_469A {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int maxLevel = input.nextInt();

        int count = 0;

        // Read levels Little X can pass
        int xLevelsCount = input.nextInt();
        HashSet<Integer> xLevels = new HashSet<>();
        for (int i = 0; i < xLevelsCount; i++) {
            xLevels.add(input.nextInt());
        }

        // Read levels Little Y can pass
        int yLevelsCount = input.nextInt();
        HashSet<Integer> yLevels = new HashSet<>();
        for (int i = 0; i < yLevelsCount; i++) {
            yLevels.add(input.nextInt());
        }

        for (int i = 1; i <= maxLevel; i++) {

            if (xLevels.contains(i) || yLevels.contains(i)) {
                count++;
            }

        }

        if (maxLevel == count) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

    }

}