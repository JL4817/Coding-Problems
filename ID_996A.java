import java.util.Scanner;

public class ID_996A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();

        int count = 0;

        // Using the largest denominations first
        count += money / 100; // Number of 100-dollar bills
        money %= 100; // Remaining amount

        count += money / 20; // Number of 20-dollar bills
        money %= 20; // Remaining amount

        count += money / 10; // Number of 10-dollar bills
        money %= 10; // Remaining amount

        count += money / 5; // Number of 5-dollar bills
        money %= 5; // Remaining amount

        count += money; // Number of 1-dollar bills

        System.out.println(count);

    }

}
