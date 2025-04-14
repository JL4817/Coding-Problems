import java.util.Scanner;

public class ID_339B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Total houses
        int m = sc.nextInt(); // Number of tasks

        int[] tasks = new int[m];
        for (int i = 0; i < m; i++) {
            tasks[i] = sc.nextInt();
        }

        // Calculate total time
        long totalTime = 0;
        int currentPos = 1; // start at house 1

        for (int task : tasks) {
            // Calculate time to move to the next task
            if (task >= currentPos) {
                // Move clockwise
                totalTime += task - currentPos;
            } else {
                // Need to go around the ring
                totalTime += n - currentPos + task;
            }
            currentPos = task;
        }

        // Print total time
        System.out.println(totalTime);

        sc.close();
    }
}