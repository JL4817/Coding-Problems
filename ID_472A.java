import java.util.Scanner;

public class ID_472A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num % 2 == 0) {
            // int p1 = num/2;
            // int p2 = num/2;
            System.out.println(4 + " " + (num - 4));
        } else if (num % 2 != 0) {
            System.out.println(9 + " " + (num - 9));
        }
    }
}
