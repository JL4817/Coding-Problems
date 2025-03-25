import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ID_1367B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testNum = input.nextInt();

        for (int i = 0; i < testNum; i++) {
            int numElements = input.nextInt();
            int[] arr = new int[numElements];

            for (int k = 0; k < numElements; k++) {
                arr[k] = input.nextInt();
            }

            int countO = 0;
            int countE = 0;

            // check if even index has odd and odd index has even
            // when yes ++
            // check if the count both are same, otherwise -1

            for (int j = 0; j < numElements; j++) {
                if (j % 2 == 0 && arr[j] % 2 != 0) {
                    countE++;
                } else if (j % 2 != 0 && arr[j] % 2 != 1) {
                    countO++;
                }

            }

            if (countE != countO) {
                System.out.println(-1);
            } else {
                System.out.println(countE);
            }
        }
        input.close();
    }
}
