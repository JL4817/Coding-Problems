import java.util.Scanner;

public class ID_1560A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nrOfTest = input.nextInt();
        int arrNum[] = new int[1000];
        int count = 0;
        int current = 1;

        while (count < 1000) {
            if (current % 3 != 0 && current % 10 != 3) {
                arrNum[count] = current;
                count++;
            }
            current++;
        }

        // input.nextLine();
        for (int i = 0; i < nrOfTest; i++) {
            int num = input.nextInt();
            System.out.println(arrNum[num - 1]);
        }
    }
}