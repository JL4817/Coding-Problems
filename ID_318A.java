import java.util.Scanner;

public class ID_318A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long k = input.nextLong();

        // nr of odd numbers: (n+1)/2
        long nrOfOddNumbers = (n + 1) / 2;
        if (k <= nrOfOddNumbers) { // then its odd
            // if the number is within this odd, then formula is simply:
            System.out.println((2 * k - 1));

            // 2k+1 if sequence starts from 2, it skips 1, (3, 5, 7...)
            // 2k-1 if sequence starts from 1, (1,3,5,7...)

        } else { // then its even
            // the k-th number is even
            // since we went through all the odd numbers, so k - nrOfOddNumbers is the
            // postion
            System.out.println(2 * (k - nrOfOddNumbers));

        }
    }
}
