import java.util.Arrays;
import java.util.Scanner;

public class ID_492B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLantern = input.nextInt();
        int lengthStreet = input.nextInt();
        input.nextLine();
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        double maxGap = 0;
        for (int i = 1; i < numLantern; i++) {
            maxGap = Math.max(maxGap, Math.abs(arr[i] - arr[i - 1]));
        }

        double leftEdge = arr[0] - 0; // street start to first lantern
        double rightEdge = lengthStreet - arr[numLantern - 1]; // last lantern to end of street
        double minRadius = Math.max(maxGap / 2, Math.max(leftEdge, rightEdge));

        System.out.printf("%.10f\n", minRadius); // print to 10 decmal places

        input.close();
    }
}
