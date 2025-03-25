import java.util.Scanner;

public class ID_1370A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfTest = input.nextInt();

        // from 1 to n
        for (int i = 0; i < nrOfTest; i++) {
            // if b=n, a=n/2, than gcd(a,b) = n/2
            int num = input.nextInt();

            System.out.println(num / 2);
        }

    }
}
