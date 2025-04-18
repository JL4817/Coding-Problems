import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ID_1948B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(canMakeSorted(arr) ? "YES" : "NO");
        }
        br.close();
    }

    private static boolean canMakeSorted(int[] arr) {
        // List to store the processed elements (in reversed order)
        ArrayList<Integer> processed = new ArrayList<>();

        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];

            // Check if we need to split the current element
            if (!processed.isEmpty() && current > processed.get(processed.size() - 1)) {
                // Split the current element into digits
                ArrayList<Integer> digits = getDigits(current);

                // Add digits to the processed list
                for (int digit : digits) {
                    processed.add(digit);
                }
            } else {
                // No need to split, just add the current element
                processed.add(current);
            }
        }

        // Check if the resulting array is sorted (in reversed order, so it should be non-increasing)
        for (int i = 1; i < processed.size(); i++) {
            if (processed.get(i - 1) < processed.get(i)) {
                return false;
            }
        }

        return true;
    }

    // Helper method to split a number into its digits
    private static ArrayList<Integer> getDigits(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        String numStr = String.valueOf(num);

        for (int i = numStr.length() - 1; i >= 0; i--) {
            digits.add(numStr.charAt(i) - '0');
        }

        return digits;
    }
}