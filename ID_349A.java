import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ID_349A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count25 = 0;
        int count50 = 0;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int payment = Integer.parseInt(st.nextToken());

            if (payment == 25) {
                count25++;
            } else if (payment == 50) {
                if (count25 > 0) {
                    count25--;
                    count50++;
                } else {
                    possible = false;
                    break;
                }
            } else if (payment == 100) {
                if (count50 > 0 && count25 > 0) {
                    count50--;
                    count25--;
                } else if (count25 >= 3) {
                    count25 -= 3;
                } else {
                    possible = false;
                    break;
                }
            }
        }

        System.out.println(possible ? "YES" : "NO");
        br.close();
    }
}