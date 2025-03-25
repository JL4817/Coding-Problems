import java.util.Scanner;

public class ID_2044A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        for (int t = 0; t < nTest; t++) {
            int n = input.nextInt();
            System.out.println(n - 1);
        }
    }
}
/*
 * n=4
 * a = n - b
 * b = 1, a = 4 - 1 = 3
 * (3,1)
 * b = 2, a = 4 - 2 = 2
 * (2,2)
 * b = 3, a = 4 - 3 = 1
 * (1,3)
 */