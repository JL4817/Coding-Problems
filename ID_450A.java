import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;

public class ID_450A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        Map<Integer, Integer> order = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            order.put(i, input.nextInt());
        }
        System.out.println(recursiveSolveOrder(m, order));
        input.close();
    }

    private static int recursiveSolveOrder(int m, Map<Integer, Integer> order) {
        if (order.size() == 1) {
            return order.keySet().iterator().next();
        }

        Map<Integer, Integer> updatedOrder = new LinkedHashMap<>();
        int lastProcessedId = -1;

        for (Map.Entry<Integer, Integer> entry : order.entrySet()) {
            int id = entry.getKey();
            int value = entry.getValue();

            value -= m;
            if (value > 0) {
                updatedOrder.put(id, value);
            }
            lastProcessedId = id;
        }

        // If all values were processed and none remain, return the last ID
        if (updatedOrder.isEmpty()) {
            return lastProcessedId;
        }

        return recursiveSolveOrder(m, updatedOrder);
    }
}