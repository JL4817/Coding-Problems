import java.util.Scanner;

public class ID_233A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n == 1 || n % 2 == 1) {
            System.out.println(-1);
            return;
        }

        int[] permuation = new int[n];
        for (int i = 0; i < n; i += 2) {
            permuation[i] = i + 2;
            permuation[i + 1] = i + 1;
        }

        for (int j = 0; j < n; j++) {
            System.out.print(permuation[j] + " ");
        }

        input.close();

    }
}
