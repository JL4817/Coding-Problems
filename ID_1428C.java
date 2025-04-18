import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ID_1428C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (!stack.isEmpty() && c == 'B') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            System.out.println(stack.size());
        }

        br.close();
    }
}