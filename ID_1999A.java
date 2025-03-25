import java.util.Scanner;

public class ID_1999A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrofTest = input.nextInt();

        input.nextLine();
        for (int i = 0; i < nrofTest; i++) {
            String total[] = input.nextLine().split("");

            int digit1 = Integer.parseInt(total[0]);
            int digit2 = Integer.parseInt(total[1]);

            System.out.println(digit1 + digit2);
        }
    }
}
