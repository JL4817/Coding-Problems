import java.util.Scanner;

public class ID_1772A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTestCase = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numTestCase; i++) {
            String[] arr = input.nextLine().split("");
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]));
        }
    }
}
