import java.util.Scanner;

public class ID_80A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int nextPrime = findNextPrime(n);

        if (nextPrime == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static int findNextPrime(int n) {
        int candidate = n + 1; // Start checking from the next number
        while (!nIsPrime(candidate)) {
            candidate++; // Increment until a prime is found
        }
        return candidate;
    }

    public static boolean nIsPrime(int n) {

        if (n <= 1) {
            return false; // Numbers less than 2 are not prime
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // Exclude other even numbers
        }

        // Check divisors up to the square root of the number
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // Not prime if divisible by i
            }
        }

        return true; // Number is prime

    }

}
