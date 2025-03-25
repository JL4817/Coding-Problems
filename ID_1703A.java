import java.util.Scanner;

public class ID_1703A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nr = in.nextInt();

        // Consume the remaining newline character
        in.nextLine();

        for (int i = 0; i < nr; i++) {
            String arr[] = in.nextLine().split("");

            if (arr[0].equalsIgnoreCase("Y") && arr[1].equalsIgnoreCase("E") && arr[2].equalsIgnoreCase("S")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
