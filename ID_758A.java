import java.util.Arrays;
import java.util.Scanner;

public class ID_758A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numCitizen = input.nextInt();
        int count = 0;
        input.nextLine();
        String sArr[] = input.nextLine().split(" ");

        int iArr[] = Arrays.stream(sArr).mapToInt(Integer::parseInt).toArray();
        // int iArr[] = { 1, 3, 1 };

        int max = Arrays.stream(iArr).max().getAsInt();

        int totalCount = 0;
        for (int i = 0; i < numCitizen; i++) {
            if (iArr[i] != max) {
                totalCount += (max - iArr[i]);
            }
        }

        System.out.println(totalCount);
    }
}
