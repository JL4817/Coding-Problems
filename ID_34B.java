import java.util.Arrays;
import java.util.Scanner;

public class ID_34B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int count = 0;
        int money = 0;
        input.nextLine();
        int[] price = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(price);

        for (int i = 0; i < n; i++) {
            if (price[i] < 0 && count < m) {
                money += price[i];
                count++;
            }
        }
        System.out.println(Math.abs(money));
        input.close();
    }
}
/*
 * Postiv Preis is how much Bob has to pay to buy it
 * So negativ is important
 * 
 * TestCase:
 * 5 3
 * -2 -2 -2 -2 -2
 * 
 * count = 0;
 * 0 < 3, count = 1
 * 1 < 3, count = 2
 * 2 < 3, count = 3
 * count <= 3, count = 4
 * Some negative prices are bigger than others
 */