import java.util.Scanner;

public class ID_1342A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            long x = input.nextLong();
            long y = input.nextLong();
            long cost1 = input.nextLong();
            long cost2 = input.nextLong();

            // First make x and y equal, then reduce both together
            long minCost = 0;
            if (2 * cost1 <= cost2) {
                // If using operation 1 twice is cheaper than operation 2 once
                minCost = (x + y) * cost1;
            } else {
                // Use operation 2 as much as possible (for the min(x,y) part)
                // Then use operation 1 for the remaining difference
                long min = Math.min(x, y);
                long diff = Math.abs(x - y);
                minCost = min * cost2 + diff * cost1;
            }
            System.out.println(minCost);
        }

        input.close();
    }
}