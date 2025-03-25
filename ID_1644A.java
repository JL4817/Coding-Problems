import java.util.Scanner;

public class ID_1644A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String line = input.nextLine();
            boolean r = false, g = false, b = false;
            boolean no = false;
            for (char c : line.toCharArray()) {
                if (c == 'r') {
                    r = true;
                } else if (c == 'g') {
                    g = true;
                } else if (c == 'b') {
                    b = true;
                } else if (c == 'R' && r == false) {
                    no = true;
                } else if (c == 'G' && g == false) {
                    no = true;
                } else if (c == 'B' && b == false) {
                    no = true;
                }
            }
            if (no) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        input.close();
    }
}
