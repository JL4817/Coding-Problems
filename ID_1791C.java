import java.util.Scanner;

public class ID_1791C {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTestCase = input.nextInt();

        for (int i = 0; i < numTestCase; i++) {
            int elementLength = input.nextInt();
            input.nextLine();
            String line = input.nextLine();
            StringBuilder sb = new StringBuilder(line);

            while (sb.length() > 1 && sb.charAt(0) != sb.charAt(sb.length() - 1)) {
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length() - 1);
            }
            System.out.println(sb.length());
        }
        input.close();
    }
}
