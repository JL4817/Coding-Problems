import java.util.Scanner;

public class ID_214A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if ((i * i + j == n) && (i + j * j == m)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        input.close();
    }

}
