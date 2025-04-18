import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ID_1490C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            long x = Long.parseLong(br.readLine());
            boolean possible = false;

            // Upper limit for cube root of x
            long limit = (long) Math.cbrt(x) + 1;

            for (long a = 1; a <= limit; a++) {
                long aCubed = a * a * a;
                if (aCubed >= x) break;  // a^3 must be less than x

                long remainder = x - aCubed;
                long b = Math.round(Math.cbrt(remainder));

                // Check if b^3 equals remainder exactly and b is positive
                if (b > 0 && b * b * b == remainder) {
                    possible = true;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
        br.close();
    }
}