import java.util.Scanner;

public class ID_1986A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();

        for (int i = 0; i < test; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int[] points = { a, b, c };
            java.util.Arrays.sort(points);

            int median = points[1];

            int totalDistance = Math.abs(median - a) + Math.abs(median - b) + Math.abs(median - c);
            System.out.println(totalDistance);
        }

        input.close();
    }
}
