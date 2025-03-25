import java.util.Scanner;

public class ID_1955A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            int n = input.nextInt();
            int onePrice = input.nextInt();
            int twoPrice = input.nextInt();

            int cost = 0;

            if (2 * onePrice <= twoPrice) {
                cost = n * onePrice;
            } else {
                cost = (n / 2) * twoPrice;

                if (n % 2 != 0) {
                    cost += onePrice; // for remaning add 1
                } // lets say 7, 7/2 = 3, 1 left over
            }
            System.out.println(cost);
        }
        input.close();
    }
}
