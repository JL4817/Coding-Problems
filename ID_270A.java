import java.util.Scanner;

public class ID_270A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int a = input.nextInt();

            // Check if 360 is divisible by (180 - a)
            if (360 % (180 - a) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
