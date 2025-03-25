import java.util.Scanner;

public class ID_1343A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            for (int k = 2; k <= 31; k++) { // this is basically calculating 2^k until k=31 > 10^9
                int sum = (int) Math.pow(2, k) - 1;
                if (n % sum == 0) {
                    System.out.println(n / sum);
                    break;
                }
            }
        }
    }
}
/*
 * The loop only needs to go up to 31 because:
 * 
 * Input n is guaranteed ≤ 10^9
 * 2^31 is already > 10^9
 * 
 */