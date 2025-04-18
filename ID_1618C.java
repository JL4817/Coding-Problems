import java.util.Arrays;

public class ID_1618C {
    public static void main(String[] args) {
        int[] arr = {9, 8, 2, 6, 6, 2, 8, 6, 5, 4};
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i] - arr[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
