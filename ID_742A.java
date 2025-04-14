import java.util.Scanner;

public class ID_742A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();

        if (n == 0) {
            System.out.println("1");
            input.close();
            return;
        }

        int[] array = {8, 4, 2, 6};
        long index = (n - 1) % 4;
        System.out.println(array[(int) index]);

        input.close();
    }
}
//the digits repeat
// 1378^1 = 1378 (last digit: 8)
//1378^2 = 1898884 (last digit: 4)
//1378^3 = 2616682552 (last digit: 2)
//1378^4 = 3607788557056 (last digit: 6)
//1378^5 = 4971532551363728 (last digit: 8)