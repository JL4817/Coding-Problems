import java.util.Scanner;

public class ID_1593A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int n = 0; n < nTest; n++) {
            long a = input.nextLong();
            long b = input.nextLong();
            long c = input.nextLong();

            long max = Math.max(Math.max(a, b), c);

            // Calculate votes needed for each candidate to win
            long votesForA = (a == max) ? 0 : (max - a + 1);
            long votesForB = (b == max) ? 0 : (max - b + 1);
            long votesForC = (c == max) ? 0 : (max - c + 1);

            // If all three are equal
            if (a == b && b == c) {
                votesForA = votesForB = votesForC = 1;
            }
            // If exactly two are tied for maximum
            else if (a == b && a == max) {
                votesForA = votesForB = 1;
            } else if (b == c && b == max) {
                votesForB = votesForC = 1;
            } else if (a == c && a == max) {
                votesForA = votesForC = 1;
            }

            System.out.println(votesForA + " " + votesForB + " " + votesForC);
        }
        input.close();
    }
}