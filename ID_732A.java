import java.util.Scanner;

public class ID_732A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int priceOfShovel = input.nextInt();
        int extraCoin = input.nextInt();

        // int priceOfShovel = 117;
        // int extraCoin = 3;

        // boolean itWorks = false;
        // int count = 0;
        int totalPriceOfShovel = 0;

        for (int count = 1; count <= 10; count++) {

            totalPriceOfShovel = count * priceOfShovel;

            if (totalPriceOfShovel % 10 == extraCoin || totalPriceOfShovel % 10 == 0) {
                System.out.println(count);
                // itWorks = true;
                break;
            }

        }

        input.close();

    }
}
