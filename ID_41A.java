import java.util.Scanner;

public class ID_41A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String original = input.nextLine();
        String equalTo = input.nextLine();

        String originalReversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            originalReversed = originalReversed + original.charAt(i);
        }

        if (originalReversed.equals(equalTo)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
