import java.util.Scanner;

public class ID_1829A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfTestCase = input.nextInt();
        input.nextLine();
        String right[] = "codeforces".split("");

        for (int i = 0; i < numOfTestCase; i++) {
            int count = 0;
            String strArr[] = input.nextLine().split("");

            for (int j = 0; j < right.length; j++) {
                if (!strArr[j].equals(right[j])) {
                    count++;
                }
            }

            System.out.println(count);
        }

        input.close();
    }
}
