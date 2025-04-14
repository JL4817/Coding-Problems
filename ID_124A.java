import java.io.*;
import java.util.*;

public class ID_124A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // Using the formula: n - max(a + 1, n - b) + 1
        int minValidPosition = Math.max(a + 1, n - b);
        int possiblePositions = n - minValidPosition + 1;

        System.out.println(possiblePositions);
    }
}