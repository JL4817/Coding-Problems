import java.util.Scanner;

public class ID_25a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nElemnts = input.nextInt();
        int countOdd = 0;
        int countEven = 0;
        int[] arr = new int[nElemnts];

        for (int n = 0; n < nElemnts; n++) {
            int num = input.nextInt();
            arr[n] = num;
            if (num % 2 == 0)
                countEven++;
            else
                countOdd++;
        }

        if (countEven > countOdd) {
            for (int i = 0; i < nElemnts; i++) {
                if (arr[i] % 2 == 1)
                    System.out.println(i + 1);
            }
        } else {
            for (int j = 0; j < nElemnts; j++) {
                if (arr[j] % 2 == 0)
                    System.out.println(j + 1);
            }
        }
        input.close();
    }
}