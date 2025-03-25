import java.util.Scanner;

public class ID_200B {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int nr = input.nextInt();
        input.nextLine();
        double total = 0.0;

        for (int i = 0; i < nr; i++) {
            double result = (double) input.nextInt() / 100.0;
            total = total + result;
        }

        System.out.println((total / nr) * 100);

    }

}
