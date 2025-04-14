import java.util.Scanner;

public class ID_75A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a + b;

        int noZerosA = removeZero(a);
        int noZerosB = removeZero(b);
        int noZerosC = removeZero(c);

        if (noZerosA + noZerosB == noZerosC) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        input.close();
    }

    private static int removeZero(int num) {
        String a1 = String.valueOf(num).replaceAll("0", "");
        int r1 = Integer.parseInt(a1);
        return r1;
    }

}
