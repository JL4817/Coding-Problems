import java.util.Scanner;

public class ID_935A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numEmployee = input.nextInt();

        int count = 0;

        for (int i = 1; i < numEmployee; i++) {
            if (numEmployee % i == 0)
                count++;
        }
        System.out.println(count);

        input.close();
    }
}
