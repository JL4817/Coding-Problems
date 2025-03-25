import java.util.Scanner;

public class ID_598A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTestCase = input.nextInt();

        while (nTestCase-- > 0) {
            long reihe = input.nextLong();
            // positv sum caluclation
            long totalSum = reihe * (reihe + 1) / 2;

            // subtract negativ sum with power
            long powerOfTwo = 1;
            while (powerOfTwo <= reihe) {
                totalSum -= 2 * powerOfTwo;
                powerOfTwo *= 2;
            }

            System.out.println(totalSum);
        }

        input.close();
    }
}
