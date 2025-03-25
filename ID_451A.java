import java.util.Scanner;

public class ID_451A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int min = Math.min(n, m);

        System.out.println(min % 2 == 0 ? "Malvika" : "Akshat");
    }
}
/*
 * A -> M -> A, B verlierst
 * A -> M, A verlierst
 */
