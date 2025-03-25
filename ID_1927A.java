import java.util.Scanner;

public class ID_1927A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            int n = input.nextInt();
            input.nextLine();
            String[] arr = input.nextLine().split("");
            int lastPosition = -1;
            int firstPosition = -1;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("B")) {

                    if (firstPosition == -1) {
                        firstPosition = j;
                    }
                    lastPosition = j;
                }
            }
            System.out.println((lastPosition - firstPosition) + 1);
        }
        input.close();
    }
}
