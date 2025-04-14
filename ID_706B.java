import java.util.Arrays;
import java.util.Scanner;

public class ID_706B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] priceEachShop = new int[n];
        for (int i = 0; i < n; i++) {
            priceEachShop[i] = input.nextInt();
        }

        Arrays.sort(priceEachShop);

        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            int coins = input.nextInt();
            System.out.println(countAffordableShops(coins, priceEachShop));
        }
        input.close();
    }

    public static int countAffordableShops(int coins, int[] prices) {
        int left = 0;
        int right = prices.length - 1;
        int position = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (prices[mid] <= coins) {
                position = mid;
                left = mid + 1; // Continue searching on the right
            } else {
                right = mid - 1; // Search on the left
            }
        }
        // If position is -1, no shop is affordable
        // Otherwise, position + 1 gives the count (as positions are 0-indexed)
        return position == -1 ? 0 : position + 1;
    }
}