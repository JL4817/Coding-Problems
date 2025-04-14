import java.util.HashSet;
import java.util.Scanner;

public class ID_368B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        // Precompute distinct counts for all possible suffixes
        int[] distinctCounts = new int[n + 1];
        HashSet<Integer> set = new HashSet<>();

        // Process from right to left to build distinct counts for each position
        for (int i = n - 1; i >= 0; i--) {
            set.add(a[i]);
            distinctCounts[i + 1] = set.size();
        }

        // Process queries
        for (int i = 0; i < m; i++) {
            int index = input.nextInt();
            System.out.println(distinctCounts[index]);
        }

        input.close();
    }
}