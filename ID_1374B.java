import java.util.Scanner;

public class ID_1374B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTestCase = input.nextInt();
        for (int n = 0; n < nTestCase; n++) {
            int number = input.nextInt();
            int count = 0;

            while (number != 1) {
                if (number % 6 == 0) {
                    number /= 6;
                } else if (number % 3 == 0) { // multiplying by 2 makes in divisible for next step
                    number *= 2;
                } else {
                    count = -1;
                    break;
                }
                count++;
            }
            System.out.println(count);
        }
        input.close();
    }
}
