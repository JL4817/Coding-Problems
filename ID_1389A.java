import java.util.Scanner;

public class ID_1389A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();

        for (int n = 0; n < test; n++) {
            int l = input.nextInt();
            int r = input.nextInt();

            if (2 * l > r) {
                System.out.println("-1 -1");
            } else {
                System.out.println(l + " " + (2 * l));
            }
        }
        input.close();
    }
}