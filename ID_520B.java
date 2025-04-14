import java.util.Scanner;

public class ID_520B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println(minOperations(n, m));

        input.close();
    }

    public static int minOperations(int n, int m) {
        int count = 0;

        while (n < m) {
            if (n * 2 <= m) {
                n *= 2;
                count++;
            } else {
                n--;
                count++;
            }
        }

        // If n is larger than m, subtract 1 repeatedly (n-m) is how many times n needs to subtract from m.
        count += (n - m);

        return count;
    }
}