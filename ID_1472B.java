import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ID_1472B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {
            int count1 = 0, count2 = 0;
            int numElements = input.nextInt();
            ArrayList<Integer> arrInt = new ArrayList<>();

            for (int j = 0; j < numElements; j++) {
                int element = input.nextInt();
                if (element == 1) {
                    count1++;
                } else if (element == 2) {
                    count2++;
                }
            }

            int totalWeight = count1 + 2 * count2;

            if (totalWeight % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            if ((totalWeight / 2) % 2 == 0 || count1 > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
