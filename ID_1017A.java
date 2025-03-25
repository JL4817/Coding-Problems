import java.util.Arrays;
import java.util.Scanner;

public class ID_1017A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[][] scores = new int[n][5];
        for (int i = 0; i < n; i++) {
            scores[i][0] = input.nextInt();
            scores[i][1] = input.nextInt();
            scores[i][2] = input.nextInt();
            scores[i][3] = input.nextInt();
            scores[i][4] = i + 1;
        }

        // Calculate total scores and sort by total score descending, id ascending
        Arrays.sort(scores, (a, b) -> {
            int sumA = a[0] + a[1] + a[2] + a[3];
            int sumB = b[0] + b[1] + b[2] + b[3];
            if (sumA != sumB) {
                return Integer.compare(sumB, sumA); // Sort by total score descending
            } else {
                return Integer.compare(a[4], b[4]); // If scores are tied, sort by id ascending
            }
        });

        // Find Thomas's rank
        int thomasId = 1; // Thomas's id is always 1
        for (int rank = 0; rank < n; rank++) {
            if (scores[rank][4] == thomasId) {
                System.out.println(rank + 1); // Output rank (1-based index)
                break;
            }
        }

        input.close();
    }
}
