import java.util.ArrayList;
import java.util.Scanner;

public class ID_381A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLength = input.nextInt();

        int first = 0; // even
        int second = 0; // uneven
        boolean fTurn = true;

        ArrayList<Integer> list = new ArrayList<>(numLength);
        for (int i = 0; i < numLength; i++) {
            int num = input.nextInt();
            list.add(num);
        }

        while (!list.isEmpty()) {

            int left = list.get(0);
            int right = list.get(list.size() - 1);
            int choosen = 0;

            if (right >= left) {
                choosen = list.remove(list.size() - 1);

            } else if (left >= right) {
                choosen = list.remove(0);

            }

            if (fTurn) {
                first += choosen;
            } else {
                second += choosen;
            }

            fTurn = !fTurn;

        }

        System.out.println(first + " " + second);

    }

}
