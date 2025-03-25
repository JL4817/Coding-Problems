import java.util.Scanner;

public class ID_1619A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrTest = input.nextInt();
        input.nextLine();

        for (int i = 0; i < nrTest; i++) {
            String str = input.nextLine();

            if (str.length() % 2 != 0) {
                System.out.println("NO");
            } else {
                String str1 = str.substring(0, str.length() / 2);
                String str2 = str.substring(str.length() / 2);
                if (str1.equals(str2)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        input.close();
    }
}