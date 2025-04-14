import java.util.Scanner;

public class ID_584A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //the length of number
        int t = input.nextInt(); //divisible by  (2-10)

        if (n == 1 && t == 10) {
            System.out.println("-1");
        } else if (t == 10) {
            // For t=10, we need a number ending with 0
            System.out.print("1");
            for (int i = 0; i < n-2; i++) {
                System.out.print("0");
            }
            System.out.println("0");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(t);
            }
            System.out.println();
        }

        input.close();
    }
}