import java.util.Scanner;

public class ID_82A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

        long r = 1;
        while (5 * r < n) {
            n -= 5 * r;
            r *= 2;
        }
        int personIndex = (int)((n - 1) / r);
        System.out.println(names[personIndex]);
        input.close();
    }
}