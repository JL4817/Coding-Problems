import java.util.Scanner;

public class ID_964B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int T = input.nextInt();

        // Consume the rest of the line after the last integer
        input.nextLine();
        int time = 0;
        int bank = 0;
        int cost = A;

        String line[] = input.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            time = time + i;

            if (T >= cost) {

            } else {

            }
        }

    }
}
