import java.util.Scanner;

public class ID_96A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        if (str.contains("1111111") || str.contains("0000000")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();
    }
}
