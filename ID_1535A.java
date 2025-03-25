import java.util.Scanner;

public class ID_1535A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();

            int race1 = Math.max(a, b);
            int race2 = Math.max(c, d);

            int[] skills = { a, b, c, d };
            int max1 = -1;
            int max2 = -1;

            for (int skill : skills) {
                if (skill > max1) {
                    max2 = max1;
                    max1 = skill;
                } else if (skill > max2) {
                    max2 = skill;
                }
            }
            if ((max1 == race1 && max2 == race2) || (max2 == race1 && max1 == race2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
