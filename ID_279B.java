import java.util.Scanner;

public class ID_279B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();

        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            books[i] = input.nextInt();
        }

        // Sliding window approach
        int maxBooks = 0;
        int timeSpent = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            timeSpent += books[right];

            while (timeSpent > t) {
                timeSpent -= books[left];
                left++;
            }

            maxBooks = Math.max(maxBooks, right - left + 1);
        }
        System.out.println(maxBooks);
        input.close();
    }
}