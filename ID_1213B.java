import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ID_1213B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] prices = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            int minRight = Integer.MAX_VALUE;

            for (int i = n - 1; i >= 0; i--) {
                if (prices[i] > minRight) {
                    count++;
                }
                minRight = Math.min(minRight, prices[i]);
            }

            System.out.println(count);
        }
        br.close();
    }
}
//https://claude.ai/chat/82d721be-43f4-4952-a4d2-6fe463a7d92c