import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ID_1760A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrCase = input.nextInt();

        for (int i = 0; i < nrCase; i++) {

            int lengthOfString = input.nextInt();
            input.nextLine();
            String n = input.nextLine();

            int maxPosition = 0;

            for (int j = 0; j < lengthOfString; j++) {
                int current = n.charAt(j) - 'a' + 1;

                if (current > maxPosition) {
                    maxPosition = current;
                }
            }

            System.out.println(maxPosition);
        }
        input.close();
    }
}
