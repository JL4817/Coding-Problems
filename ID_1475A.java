import java.util.Scanner;

public class ID_1475A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nrTest = input.nextInt();

        for (int i = 0; i < nrTest; i++) {
            double num = input.nextDouble();

            double log2 = Math.log10(num) / Math.log10(2);

            // checking if something is an integer
            if (Math.floor(log2) == log2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
