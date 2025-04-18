import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ID_1791E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] arr = new long[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }

            long sum = 0;
            int negCount = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    negCount++;
                }
                sum += Math.abs(arr[i]);
            }

            if (negCount % 2 == 0) {
                System.out.println(sum);
            } else {
                long minAbs = Long.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    minAbs = Math.min(minAbs, Math.abs(arr[i]));
                }
                System.out.println(sum - 2 * minAbs);
            }
        }
        br.close();
    }
}