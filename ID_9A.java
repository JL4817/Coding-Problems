import java.util.Scanner;

public class ID_9A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // Find the maximum of num1 and num2
        int p = 6 - Math.max(num1, num2) + 1;

        // Find the greatest common divisor (GCD) of p and 6
        int gcd = gcd(p, 6);

        // Simplify the fraction
        int numerator = p / gcd;
        int denominator = 6 / gcd;

        // Output the simplified fraction
        System.out.println(numerator + "/" + denominator);
    }

    // Function to calculate the greatest common divisor (GCD)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
