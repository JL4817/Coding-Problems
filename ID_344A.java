import java.util.Scanner;

public class ID_344A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // nr of magnets
        String current = "";
        String previous = "";
        int count = 0;

        for (int i = 0; i < n; i++) {
            current = input.next();
            if (current.equals("10") && !current.equals(previous)) {
                count++;
                previous = "10";
            }

            if (current.equals("01") && !current.equals(previous)) {
                count++;
                previous = "01";
            }

        }

        System.out.println(count);
    }
}