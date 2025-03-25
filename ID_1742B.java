import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ID_1742B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {
            int numElements = input.nextInt();
            HashSet<Integer> arr = new HashSet<>();

            boolean hasDuplicate = false;

            for (int j = 0; j < numElements; j++) {
                int element = input.nextInt();
                if (arr.contains(element)) {
                    hasDuplicate = true;
                } else {
                    arr.add(element);
                }
            }
            if (hasDuplicate) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        input.close();
    }
}
