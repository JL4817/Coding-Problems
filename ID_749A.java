import java.util.Scanner;

public class ID_749A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 2 == 0) {
            int countE = number / 2;
            System.out.println(countE);
            for (int i = 0; i < countE; i++) {
                System.out.print("2 ");
            }
        } else {
            int countPrint = ((number + 1) / 2) - 1;
            System.out.println(countPrint);
            for (int i = 0; i < countPrint - 1; i++) {
                System.out.print("2 ");
            }
            System.out.print("3");
        }
    }
}
