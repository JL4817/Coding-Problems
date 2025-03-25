import java.util.Scanner;

public class ID_1520B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            int num = input.nextInt();
            int count = 0;

            for (int digit = 1; digit <= 9; digit++) {
                long ordinary = digit;
                while (ordinary <= num) {
                    count++;
                    ordinary = ordinary * 10 + digit;
                    // start with single digit number d, and then append d to itself
                    // z.B. 1->11->111
                    //
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}
