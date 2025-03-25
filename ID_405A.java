import java.util.Arrays;
import java.util.Scanner;

public class ID_405A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int elements = input.nextInt();
        int[] arr = new int[elements];
        for (int i = 0; i < elements; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        input.close();
    }
}
