import java.util.Scanner;

public class ID_707A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        input.nextLine();
        boolean isColor = false;

        for (int i = 0; i < row; i++) {
            String[] arr = input.nextLine().split(" ");
            for (String pixle : arr) {
                if (pixle.equals("C") || pixle.equals("M") || pixle.equals("Y")) {
                    isColor = true;
                    break;
                }
            }
            if (isColor) {
                break; // Exit outer loop if a color pixel is found
            }
        }
        System.out.println(isColor ? "#Color" : "#Black&White");
    }
}
