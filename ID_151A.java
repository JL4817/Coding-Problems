import java.util.Scanner;

public class ID_151A {

    public static void main(String args[]) {

        // n, k, l, c, d, p, nl, np,
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // nr of friends
        int k = input.nextInt(); // nr of soft drink
        int l = input.nextInt(); // liter of soft drink
        int c = input.nextInt(); // nr of limes
        int d = input.nextInt(); // nr of lime slices

        int totalSalt = input.nextInt(); // grams of salt

        int nl = input.nextInt(); // needed liter
        int np = input.nextInt(); // needed grams of salt

        int totalLimeSlice = c * d;
        int totalLitersSoftDrink = k * l;

        // Calculate maximum number of toasts possible from each resource
        int maxToastsFromDrink = totalLitersSoftDrink / nl;
        int maxToastsFromLimes = totalLimeSlice;
        int maxToastsFromSalt = totalSalt / np;

        int maxToastsPossible = Math.min(maxToastsFromDrink, Math.min(maxToastsFromLimes, maxToastsFromSalt));

        System.out.println(maxToastsPossible / n);

        // to toast, each nl liters, slice of lime, np grams of salt

    }

}
