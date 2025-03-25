import java.util.Scanner;

public class ID_1367A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nrOfTestCase = input.nextInt();
        input.nextLine();

        for (int i = 0; i < nrOfTestCase; i++) {
            String total = "";
            String str = input.nextLine();
            // String str = "bccddaaf";

            for (int j = 1; j <= str.length(); j++) {
                total = total + str.substring(j, j + 1);
                j++;
            }
            System.out.print(str.charAt(0));
            System.out.print(total);
            System.out.println();

        }
    }
}
