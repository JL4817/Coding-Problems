import java.util.Scanner;

public class ID_1873A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseNr = input.nextInt();
        input.nextLine();

        for (int i = 0; i < caseNr; i++) {
            String str = input.nextLine();

            if (str.equals("abc") || str.equals("acb") || str.equals("cba") || str.equals("bac")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
