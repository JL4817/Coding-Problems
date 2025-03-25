import java.util.Scanner;

public class ID_479A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int result1 = a + b + c;
        int result2 = a * b * c;
        int result3 = a + (b * c);
        int result4 = (a + b) * c;
        int result5 = a * (b + c);

        // Print the maximum value
        int max = Math.max(Math.max(result1, result2), Math.max(result3, Math.max(result4, result5)));
        System.out.println(max);
        input.close();
    }
}
