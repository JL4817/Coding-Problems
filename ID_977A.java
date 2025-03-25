import java.util.Scanner;

public class ID_977A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int amount = input.nextInt();

        int count = 0;

        while (number > 0 && count < amount) {

            if (number % 10 != 0) {
                number = number - 1;
            } else {
                number = number / 10;
            }

            count++;
        }

        System.out.println(number);

    }

}
