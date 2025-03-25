import java.util.Scanner;

public class ID_208A {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder(scanner.nextLine());

        String sb[] = scanner.nextLine().split("WUB");
        String ans = "";

        for (int i = 0; i < sb.length; i++) {
            if (sb[i] != "WUB") {
                ans = ans + sb[i] + " ";
            }
        }

        System.out.println(ans);

    }

}
