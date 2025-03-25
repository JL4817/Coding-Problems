import java.util.Scanner;

public class ID_1974B {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // int nrOfCase = scanner.nextInt();
        int nrOfCase = 5;

        for (int i = 0; i < nrOfCase; i++) {
            // int strLength = scanner.nextInt();
            int strLength = 10;

            // char str[] = scanner.toString().toCharArray();
            char str[] = "serofedsoc".toString().toCharArray();
            // StringBuilder sb = new StringBuilder(str);

            int stopPoint = strLength / 2;

            for (int j = 0; j < strLength; j++) {

                if (strLength % 2 == 0 && j != stopPoint) {

                    char temp = str[j];
                    str[j] = str[str.length + 1];
                    str[str.length + 1] = temp;

                } else {

                }
            }

            System.out.println(str);

        }
    }

}
