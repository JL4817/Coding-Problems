import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ID_427A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrCase = input.nextInt();
        // int nrCase = 8;
        input.nextLine();
        String arr[] = input.nextLine().split(" ");
        // String arr[] = { "1", "-1", "1", "-1", "-1", "1", "1", "1" };
        int missed = 0;
        int count = 0;

        for (int i = 0; i < nrCase; i++) {

            missed = missed + Integer.parseInt(arr[i]);

            // System.out.println(missed);

            if (missed < 0) {
                count++;
                missed = 0;
            }
        }

        System.out.println(count);

    }

}
