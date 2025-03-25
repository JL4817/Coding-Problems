import java.util.Scanner;

public class ID_630A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();

        // double power = Math.pow(5, num);
        // int converted = (int) power;

        // System.out.println(converted % 100);

        if (num >= 2) {
            System.out.println(25);
        } else {
            System.out.println(5);
        }

    }

}
