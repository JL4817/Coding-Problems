import java.util.Scanner;

public class ID_320A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();

        System.out.println(isMagicNumber(number) ? "YES" : "NO");

        input.close();
    }

    public static boolean isMagicNumber(String number) {
        // Base condition: empty string is not a magic number
        if (number.isEmpty()) {
            return false;
        }

        return canDecompose(number);
    }

    private static boolean canDecompose(String number) {
        // Base case: if the number is empty, we've successfully decomposed it
        if (number.isEmpty()) {
            return true;
        }

        // Check if the number starts with 1, 14, or 144
        if (number.startsWith("144")) {
            return canDecompose(number.substring(3));
        }
        if (number.startsWith("14")) {
            return canDecompose(number.substring(2));
        }
        if (number.startsWith("1")) {
            return canDecompose(number.substring(1)); //if n = "1234" n.substring(1) = "234"
        }
        return false;
    }
}