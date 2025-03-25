import java.util.Scanner;

public class ID_1811A {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int nrOfCase = scanner.nextInt();

        for (int i = 0; i < nrOfCase; i++) {
            int lengthofNum = scanner.nextInt();
            int extraNum = scanner.nextInt();
            String numStr = scanner.nextLine();

            StringBuilder sb = new StringBuilder(numStr);

            int pos = lengthofNum;
            for (int k = 0; k < lengthofNum; k++) {
                if (extraNum > (numStr.charAt(k)) - '0') {
                    pos = k;
                    break;
                }
            }

            sb.insert(pos, extraNum);
            System.out.println(sb.toString());

        }

        scanner.close();

    }
}
