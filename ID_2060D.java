import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ID_2060D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] arr = new long[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Long.parseLong(st.nextToken());
            }
            System.out.println(ascendingPossible(arr) ? "YES" : "NO");
        }
        br.close();
    }

    private static boolean ascendingPossible(long[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            long min = Math.min(arr[i], arr[i + 1]);
            arr[i] -= min;
            arr[i + 1] -= min;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}