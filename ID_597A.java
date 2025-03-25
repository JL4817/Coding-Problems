import java.util.Scanner;

public class ID_597A {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String number = input.nextLine();

        String arr[] = number.split(" ");
        int k = Integer.parseInt(arr[0]);
        int a = Integer.parseInt(arr[1]);
        int b = Integer.parseInt(arr[2]);

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                count++;
            }
        }

        System.out.println(count);

    }

}
