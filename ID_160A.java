import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ID_160A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfCoins = input.nextInt();

        int countNrCoins = 0;
        // int totalSum = 0;
        int mySum = 0;

        ArrayList<Integer> arrCoins = new ArrayList<>();

        for (int i = 0; i < nrOfCoins; i++) {
            int nextNum = input.nextInt();
            arrCoins.add(nextNum);
            // totalSum += nextNum;

        }

        int totalSum = 0;
        for (int coin : arrCoins) {
            totalSum += coin;
        }

        Collections.sort(arrCoins, Collections.reverseOrder());

        while (mySum <= totalSum / 2) {
            mySum += arrCoins.get(countNrCoins);
            countNrCoins++;
        }

        System.out.println(countNrCoins);

    }

}
