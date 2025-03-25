import java.util.Scanner;

public class ID_1676A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfTest = input.nextInt();
        input.nextLine();

        for (int i = 0; i < nrOfTest; i++) {
            String arr[] = input.nextLine().split("");

            int a = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]);
            int b = Integer.parseInt(arr[3]) + Integer.parseInt(arr[4]) + Integer.parseInt(arr[5]);

            if (a == b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
