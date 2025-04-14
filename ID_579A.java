import java.util.Scanner;

public class ID_579A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
            int count = Integer.bitCount(n);
            System.out.println(count);
        input.close();
    }
}
