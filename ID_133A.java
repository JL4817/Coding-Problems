import java.util.Scanner;

public class ID_133A {
    public static void main(String args[]) {
        // "H" prints "Hello, World!",
        // "Q" prints the source code of the program itself,
        // "9" prints the lyrics of "99 Bottles of Beer" song,
        // "+" increments the value stored in the internal accumulator.
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String result = "";

        if (str.contains("H") || str.contains("Q") || str.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
