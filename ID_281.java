import java.util.Scanner;

public class ID_281 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String arr[] = input.nextLine().split("");
        arr[0] = arr[0].toUpperCase();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

}
