import java.util.Scanner;

public class ID_1985A {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        for (int i = 0; i < num; i++) {

            String phrase[] = scanner.nextLine().split(" ");
            String a = phrase[0];
            String b = phrase[1];

            String p1 = Character.toString(a.charAt(0));
            String p2 = Character.toString(b.charAt(0));

            // Create new strings with the first characters swapped
            String newA = p2 + a.substring(1);
            String newB = p1 + b.substring(1);

            System.out.println(newA + " " + newB);

        }
        scanner.close();

    }
}
