import java.util.ArrayList;
import java.util.Scanner;

public class ID_490A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        ArrayList<Integer> comp = new ArrayList<>();
        ArrayList<Integer> math = new ArrayList<>();
        ArrayList<Integer> pe = new ArrayList<>();

        // int num = 7;
        // int arr[] = { 1, 3, 1, 3, 2, 1, 2 };

        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 1; i <= num; i++) {
            int value = input.nextInt();
            // int value = arr[i];
            if (value == 1) {
                comp.add(i);
                count1++;
            } else if (value == 2) {
                math.add(i);
                count2++;
            } else if (value == 3) {
                pe.add(i);
                count3++;
            }

        }

        int totalPossible = Math.min(Math.min(count2, count3), count1);
        System.out.println(totalPossible);

        for (int j = 0; j < totalPossible; j++) {
            System.out.println(comp.get(j) + " " + math.get(j) + " " + pe.get(j));
        }

    }
}
