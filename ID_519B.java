import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ID_519B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] a2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] a3 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(a1);
        Arrays.sort(a2);
        Arrays.sort(a3);

        int firstError = findMissingNumber(a1, a2);
        int secondError = findMissingNumber(a2, a3);

        System.out.println(firstError);
        System.out.println(secondError);

        br.close();
    }

    private static int findMissingNumber(int[] larger, int[] smaller) {
        for (int i = 0; i < larger.length; i++) {
            if (i >= smaller.length || larger[i] != smaller[i]) {
                return larger[i];
            }
        }
        return -1;
    }
}