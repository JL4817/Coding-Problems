import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ID_271A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int nextyear = number + 1;

        while (!(hasDistinctYear(nextyear))) {
            nextyear++;
        }

        System.out.println(nextyear);

    }

    private static boolean hasDistinctYear(int nextyear) {

        String arr[] = Integer.toString(nextyear).split("");

        ArrayList<String> str = new ArrayList<String>();

        // this adds if there is the value already not htere,

        for (int i = 0; i < 4; i++) {

            if (!(str.contains(arr[i]))) {
                str.add(arr[i]);
            }

        }

        if (str.size() < 4) {
            return false; // all distinct
        }

        return true;

    }
}