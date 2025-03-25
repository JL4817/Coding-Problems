import java.util.Scanner;

public class ID_1352C {
    public static void main(String[] args) {
        // 3 7, not divisble by 3, 7th index, shifted by 3
        // 10
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        for (int i = 0; i < nTest; i++) {
            int n = input.nextInt(); // not divisible
            int k = input.nextInt(); // ith

            System.out.println(k + (k - 1) / (n - 1));

        }
        input.close();
    }
}
