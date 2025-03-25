import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ID_1669B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            int arrLength = input.nextInt();
            input.nextLine();
            int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            HashMap<Integer, Integer> freqHashMap = new HashMap<>();
            boolean found = false;

            for (int num : arr) {
                freqHashMap.put(num, freqHashMap.getOrDefault(num, 0) + 1);
                if (freqHashMap.get(num) == 3) {
                    System.out.println(num);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("-1");
            }
        }
        input.close();
    }
}
